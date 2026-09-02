# Exercise 3 — Read an Execution Plan

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 50–64) |
| **Deliverable** | `notes/lab38-read-plan.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Read a PostgreSQL execution plan, interpret scan types, and recognise stale statistics.

### Enterprise context

Tuning without reading the plan is guessing; the plan says exactly what the database decided and why.

### Predict

You run `EXPLAIN ANALYZE` on a DELETE. What happens to the rows?

### Debug

The plan estimates 10 rows and actually returns 120,000. What do you run before touching indexes?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| EXPLAIN used where timing is needed | ANALYZE gives actual rows and time |
| Sequential scan assumed to be a bug | On a small table it is the right choice |
| Plan read top-down | Start at the innermost node |

**Module 38** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-read-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Read an Execution Plan

## EXPLAIN vs ANALYZE

EXPLAIN shows the plan and estimates without running it; EXPLAIN ANALYZE runs the query and reports actual rows and timing.

## Scan Types

A sequential scan reads the whole table — right for small tables or low selectivity; an index scan means the planner found the index worthwhile.

## Estimate Gap

A large gap means the statistics are stale, so run ANALYZE before concluding an index is missing.

## Read Order

Read the innermost, most-indented node first — that is where execution starts and the cost accumulates outward.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-read-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Read an Execution Plan

## EXPLAIN vs ANALYZE

_____

## Scan Types

_____

## Estimate Gap

_____

## Read Order

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The EXPLAIN distinction, scan-type meanings, the estimate-gap diagnosis, and the read order in `notes/lab38-read-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-read-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-read-plan.md`
- [ ] EXPLAIN vs ANALYZE distinguished
- [ ] Scan types interpreted
- [ ] Estimate gap diagnosed as statistics
- [ ] Read order stated
