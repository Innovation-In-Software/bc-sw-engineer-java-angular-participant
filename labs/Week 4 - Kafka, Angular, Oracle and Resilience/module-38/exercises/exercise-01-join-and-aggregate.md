# Exercise 1 — Write the Reporting Queries

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–32) |
| **Deliverable** | `notes/lab38-queries.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Write correct joins, aggregates, and CTEs against the CRM schema, and distinguish WHERE from HAVING.

### Enterprise context

An inner join in a report silently drops the rows with no match, producing totals nobody can reconcile.

### Predict

Your 'all customers and their account counts' report uses an inner join. Who is missing?

### Debug

`WHERE count(a.id) > 1` fails. Which clause does that condition belong in?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Inner join used for a full report | LEFT JOIN keeps customers without accounts |
| Aggregate placed in WHERE | Filter groups with HAVING |
| No CTE version | Name the readability gain |

**Module 38** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-queries.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Write the Reporting Queries

## Inner vs Left

Inner: from customer c join account a on a.customer_id = c.id. Left: the same with left join, so account columns are null.

## Aggregate

select c.id, count(a.id) from customer c left join account a on a.customer_id = c.id group by c.id.

## HAVING

Add having count(a.id) > 1 — HAVING filters the groups, WHERE would filter rows before grouping.

## CTE

A CTE names the aggregate step, so the outer query reads as one idea and the step can be reused.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-queries.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Write the Reporting Queries

## Inner vs Left

_____

## Aggregate

_____

## HAVING

_____

## CTE

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Both join forms, a GROUP BY aggregate, a HAVING filter, and a CTE rewrite in `notes/lab38-queries.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-queries.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-queries.md`
- [ ] Inner and left joins both written
- [ ] Aggregate with GROUP BY
- [ ] HAVING used correctly
- [ ] CTE version with its rationale
