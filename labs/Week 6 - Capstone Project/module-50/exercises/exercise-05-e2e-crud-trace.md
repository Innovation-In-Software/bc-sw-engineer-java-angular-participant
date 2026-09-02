# Exercise 5 — Trace One CRUD Path

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 51–57) |
| **Deliverable** | `notes/lab50-e2e-crud-trace.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Trace one full update through all five layers, including where the transaction commits and what proves it.

### Enterprise context

Teams that cannot name the transaction boundary cannot explain why the UI showed success and the database has no row.

### Predict

The service method throws after the repository save but before returning — is the row committed?

### Debug

The UI shows 'Saved' but a SELECT returns the old value. Which hop do you check first?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Fewer than five hops named | Component, service, controller, service, repository |
| Toast used as proof | Proof is a SELECT or a repository-level assertion |
| Transaction placed on the controller | It opens on the @Transactional service method |

**Module 50** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-e2e-crud-trace.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Trace One CRUD Path

## Five Hops

CustomerFormComponent → CustomerService.update() → PUT /api/customers/CUS-1001 → CustomerController → CustomerService → CustomerRepository.save().

## Transaction Edge

The transaction opens when the @Transactional service method is entered and commits when that method returns normally.

## Proof of Success

Proof is a SELECT against PostgreSQL showing the new value — a 200 and a toast only prove the call returned.

## Failure Path

On a stale-version conflict the API returns 409, the form stays open with its values, and a conflict message asks the user to reload.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-e2e-crud-trace.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Trace One CRUD Path

## Five Hops

_____

## Transaction Edge

_____

## Proof of Success

_____

## Failure Path

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A five-hop trace, an explicit transaction boundary, real proof-of-write, and a failure path in `notes/lab50-e2e-crud-trace.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-e2e-crud-trace.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-e2e-crud-trace.md`
- [ ] Five hops named with classes or files
- [ ] Transaction open and commit points stated
- [ ] Proof is a database read, not a UI toast
- [ ] Conflict path traced
