# Exercise 4 — Fix Sargability and N+1

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 69–78) |
| **Deliverable** | `notes/lab38-antipatterns.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Rewrite non-sargable predicates and replace an N+1 loop with a single query.

### Enterprise context

A cache in front of an N+1 hides the problem on warm runs and still collapses on a cold start.

### Predict

Rendering 200 customers issues 201 queries. What did the code do per row?

### Debug

`where date(created_at) = ?` ignores the index on `created_at`. What is the rewrite?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Function wraps the column | Rewrite as a half-open range |
| N+1 fixed with a cache | Fetch in one query instead |
| SELECT * kept | It blocks index-only scans and breaks on schema change |

**Module 38** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-antipatterns.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Fix Sargability and N+1

## Sargable Rewrite

where created_at >= '2026-01-01' and created_at < '2026-01-02' — the column stays bare, so the index applies.

## N+1 Shape

One query lists customers, then one query per customer fetches accounts: 1 + N queries for N rows.

## N+1 Fix

Replace the loop with a join or a single IN query; a cache still issues N queries cold and adds invalidation.

## SELECT * Cost

It transfers unneeded columns, prevents index-only scans, and breaks silently when a column is added or reordered.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-antipatterns.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Fix Sargability and N+1

## Sargable Rewrite

_____

## N+1 Shape

_____

## N+1 Fix

_____

## SELECT * Cost

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A sargable rewrite, the N+1 shape and its one-query fix, and the SELECT * cost in `notes/lab38-antipatterns.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-antipatterns.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-antipatterns.md`
- [ ] Non-sargable predicate rewritten
- [ ] N+1 query count stated
- [ ] Single-query fix given
- [ ] SELECT * cost beyond bytes named
