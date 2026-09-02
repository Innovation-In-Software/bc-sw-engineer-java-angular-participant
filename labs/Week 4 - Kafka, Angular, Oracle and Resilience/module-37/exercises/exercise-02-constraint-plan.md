# Exercise 2 — Plan Keys and Constraints

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 34–50) |
| **Deliverable** | `notes/lab37-constraints.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Specify primary keys, uniqueness, nullability, checks, and a foreign key with deliberate delete behaviour.

### Enterprise context

Validation that lives only in Java stops protecting the data the moment anything else writes to the table.

### Predict

Status validation exists only in the service. What happens when a migration script inserts rows?

### Debug

Deleting a customer removes all their accounts silently. Which FK clause caused that?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No check constraint | Constrain status to its allowed values |
| Delete behaviour left implicit | State RESTRICT or CASCADE deliberately |
| Rules only in Java | The database is the last line of defence |

**Module 37** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-constraints.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Plan Keys and Constraints

## Key Choice

customer.id and account.id as primary keys — stable, never reused, and not derived from business data.

## Constraint List

unique(email); not null on name and status; check (status in ('ACTIVE','PROSPECT')).

## Foreign Key

account.customer_id references customer(id) on delete restrict, so a customer with accounts cannot be removed.

## Why in the Database

Constraints hold for every writer — the app, a migration, or a support engineer at a psql prompt.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-constraints.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Plan Keys and Constraints

## Key Choice

_____

## Constraint List

_____

## Foreign Key

_____

## Why in the Database

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Keys, three constraint types, a foreign key with delete behaviour, and the database-enforcement rationale in `notes/lab37-constraints.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-constraints.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-constraints.md`
- [ ] Primary keys named with reasons
- [ ] Unique, not-null, and check each given
- [ ] Foreign key with explicit delete behaviour
- [ ] Database-enforcement argument written
