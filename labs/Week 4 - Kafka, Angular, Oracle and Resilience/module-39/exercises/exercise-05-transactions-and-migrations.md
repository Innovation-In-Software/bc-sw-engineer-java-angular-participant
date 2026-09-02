# Exercise 5 — Plan Transactions and Migrations

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 71–84) |
| **Deliverable** | `notes/lab39-transactions-migrations.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Place the transaction boundary on the service and treat applied migrations as immutable.

### Enterprise context

Editing an applied migration breaks startup in every environment that already ran it, including production.

### Predict

Two repository saves run without a service-level transaction and the second fails. What is in the database?

### Debug

Startup fails with a checksum mismatch on V1. What did someone do?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| @Transactional on the repository | The service owns the business operation |
| Constraint violation leaks as 500 | Translate it to 409 Conflict |
| Applied migration edited | Add a new version instead |

**Module 39** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-transactions-migrations.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Plan Transactions and Migrations

## Boundary

The service method carries @Transactional, so one business operation commits or rolls back as a unit.

## Constraint Violation

A duplicate email raises DataIntegrityViolationException, which the global handler maps to 409 Conflict.

## Migration Naming

V1__crm_schema.sql, followed by V2__ and V3__ for later changes.

## Never Edit

Flyway detects a checksum mismatch and refuses to start in every environment that already applied it.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-transactions-migrations.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Plan Transactions and Migrations

## Boundary

_____

## Constraint Violation

_____

## Migration Naming

_____

## Never Edit

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The transaction boundary, a constraint-violation mapping, migration naming, and the immutability rule in `notes/lab39-transactions-migrations.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-transactions-migrations.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-transactions-migrations.md`
- [ ] Boundary on the service, justified
- [ ] Violation mapped to a status
- [ ] Flyway naming written
- [ ] Edit-after-apply consequence stated
