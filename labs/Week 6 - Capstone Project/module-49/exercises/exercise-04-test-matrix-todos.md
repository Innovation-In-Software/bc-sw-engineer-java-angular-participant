# Exercise 4 — Fill Test Matrix TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 54–58) |
| **Deliverable** | `notes/lab49-test-matrix-todos.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · CUS-9999 not-found |

### What you will learn

Fill happy-path and failure-path unit/IT TODOs for the slice.

### Enterprise context

Green demo without failure-path evidence fails capstone quality.

### Predict

Name one not-found and one validation failure to test.

### Debug

Skipping all failure tests — gate?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only happy path | Add 400/404 Problem Details cases |
| Flaky Kafka IT plan | Unique keys / awaitility notes |

**Module 49** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab49-test-matrix-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Fill Test Matrix TODOs

## Step 1 — Template

Fill blanks:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-test-matrix-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Fill Test Matrix TODOs

## Step 1 — Template

Fill blanks:
```
Unit test service rule: _____
Validation failure case: _____
Integration API happy: _____
Kafka publish assertion: _____
Idempotent consume case: _____
Authz negative (if in slice): _____
```

## Step 2 — Minimum bar

Ensure at least one happy and one failure path are concrete.

## Step 3 — Evidence

Name Surefire report path placeholders for demo notes.

## Step 4 — Scope

Plan only—writing tests is Lab 49.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Test matrix with concrete happy/failure cases in `notes/lab49-test-matrix-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-test-matrix-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-test-matrix-todos.md`
- [ ] Happy and failure filled
- [ ] Kafka/idempotency considered
- [ ] Pre-lab marked

