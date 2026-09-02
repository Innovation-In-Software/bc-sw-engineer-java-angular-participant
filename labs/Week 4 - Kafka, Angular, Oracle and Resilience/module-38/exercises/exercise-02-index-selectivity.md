# Exercise 2 — Reason About Index Selectivity

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 36–48) |
| **Deliverable** | `notes/lab38-index-selectivity.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Judge when an index helps, order composite columns for filter-then-sort, and use partial and expression indexes.

### Enterprise context

Indexing a low-selectivity column adds write cost and gets ignored by the planner anyway.

### Predict

You index `is_active` on a table where half the rows are active. Does the planner use it?

### Debug

`where lower(email) = ?` ignores your index on `email`. Why?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Boolean column indexed | Low selectivity; the planner will scan |
| Sort column leads the composite | Filter column first, then the sort |
| Plain index for a function predicate | Index the expression itself |

**Module 38** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-index-selectivity.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Reason About Index Selectivity

## Selectivity

A boolean splits the table roughly in half, so the index eliminates too little to be worth the extra lookup.

## Column Order

account(customer_id, opened_at desc) — the equality filter leads, the sort follows so it comes out ordered.

## Partial Index

A partial index where status = 'ACTIVE' is smaller and faster when nearly every query filters on active customers.

## Expression Index

create index on customer (lower(email)) so the predicate and the index use the same expression.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-index-selectivity.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Reason About Index Selectivity

## Selectivity

_____

## Column Order

_____

## Partial Index

_____

## Expression Index

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A selectivity rule, a justified composite order, a partial index case, and an expression index in `notes/lab38-index-selectivity.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-index-selectivity.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-index-selectivity.md`
- [ ] Selectivity explained
- [ ] Composite order justified
- [ ] Partial index case given
- [ ] Expression index matches its predicate
