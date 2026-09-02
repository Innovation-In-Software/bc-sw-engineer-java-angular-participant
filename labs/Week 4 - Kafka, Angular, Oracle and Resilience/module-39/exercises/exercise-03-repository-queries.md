# Exercise 3 — Design the Repository Queries

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 38–52) |
| **Deliverable** | `notes/lab39-repository.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Write derived query methods, know when to switch to JPQL, and justify any drop to native SQL.

### Enterprise context

A derived method name with five criteria is harder to read than the query it replaces.

### Predict

Your method is named `findByStatusAndNameContainingIgnoreCaseAndCreatedAtAfter`. What should it be instead?

### Debug

A native query works and the tests fail on a different database. What did native SQL cost you?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Everything native | Derived and JPQL first; native for real gaps |
| Unreadable method names | Past two or three criteria, use @Query |
| No SQL shown | State what each method generates |

**Module 39** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-repository.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Design the Repository Queries

## Derived Methods

findByEmail generates where email = ?; findByStatus generates where status = ?.

## Multiple Criteria

findByStatusAndNameContainingIgnoreCase(String status, String fragment).

## When JPQL

Past two or three criteria the name stops being readable — switch to @Query with JPQL.

## When Native

PostgreSQL JSONB operators or window functions, which JPQL cannot express at all.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-repository.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Design the Repository Queries

## Derived Methods

_____

## Multiple Criteria

_____

## When JPQL

_____

## When Native

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two derived methods with their SQL, a multi-criteria method, and the JPQL and native boundaries in `notes/lab39-repository.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-repository.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-repository.md`
- [ ] Two derived methods with generated SQL
- [ ] Multi-criteria method written
- [ ] JPQL boundary stated
- [ ] Native SQL justified narrowly
