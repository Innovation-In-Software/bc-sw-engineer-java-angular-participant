# Exercise 3 — Choose the Test Database Strategy

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 26–32) |
| **Deliverable** | `notes/lab19-postgres-test-strategy.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Choose and justify a test database strategy with a named isolation mechanism and synthetic seed data.

### Enterprise context

Tests that pass against H2 and fail against PostgreSQL are proving something about H2, not about your application.

### Predict

Tests share one database and run in parallel. What kind of failure appears intermittently?

### Debug

A test passes alone and fails in the suite. What is leaking between tests?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| H2 chosen for speed | Use the same engine as production |
| Isolation asserted, not named | Name rollback or truncation |
| Real data mentioned | Synthetic fixtures only |

**Module 19** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-postgres-test-strategy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Choose the Test Database Strategy

## Pick One

Testcontainers running real PostgreSQL — the same engine as production, disposable per run, no shared state.

## Same Engine

H2 differs in native SQL, JSON handling, sequences, and case sensitivity, so green tests can hide real breakage.

## Isolation

Each test runs in a transaction rolled back afterwards; tests that must commit truncate the affected tables.

## Seed Data

Seeds insert CUS-1001 Amina Khan and CUS-1002 Ravi Singh — synthetic fixtures, never real customer data.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-postgres-test-strategy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Choose the Test Database Strategy

## Pick One

_____

## Same Engine

_____

## Isolation

_____

## Seed Data

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A justified database choice, the same-engine argument, a named isolation mechanism, and seed rules in `notes/lab19-postgres-test-strategy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-postgres-test-strategy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-postgres-test-strategy.md`
- [ ] Strategy chosen with a reason
- [ ] Same-engine argument written
- [ ] Isolation mechanism named
- [ ] Synthetic seed data stated
