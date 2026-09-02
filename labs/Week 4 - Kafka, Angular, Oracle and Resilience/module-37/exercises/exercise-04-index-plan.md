# Exercise 4 — Plan Indexes for Real Queries

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 60–66) |
| **Deliverable** | `notes/lab37-indexes.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Derive indexes from real queries, order composite columns correctly, and account for write cost.

### Enterprise context

Indexes added speculatively slow every write for queries that may never run.

### Predict

You index `(customer_id, opened_at)` and then filter only on `opened_at`. Is the index used?

### Debug

Writes have become slower after a tuning session. What was probably added?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Index without a query | Write the query first |
| Composite order arbitrary | Lead with the column you filter on |
| Write cost ignored | Every index adds work to every write |

**Module 37** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-indexes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Plan Indexes for Real Queries

## Query First

q1: find a customer by email during login. q2: list one customer's accounts, newest first.

## Index Per Query

q1: unique index on customer(email). q2: index on account(customer_id, opened_at desc).

## Column Order

The leading column is the entry point, so (customer_id, opened_at) serves customer_id alone but not opened_at alone.

## Cost

Every index adds work to each insert, update, and delete, plus storage — so each one needs a query to justify it.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-indexes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Plan Indexes for Real Queries

## Query First

_____

## Index Per Query

_____

## Column Order

_____

## Cost

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two real queries, an index for each, the column-order rule, and the write cost in `notes/lab37-indexes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-indexes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-indexes.md`
- [ ] Queries written before indexes
- [ ] An index per query
- [ ] Composite column order explained
- [ ] Write cost acknowledged
