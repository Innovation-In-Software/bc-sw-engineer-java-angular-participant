# Exercise 4 — Define Promotion Gates

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **C** (after slides 132–138) |
| **Deliverable** | `notes/lab44-promotion-gates.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 digest · no secrets in artifact |

### What you will learn

Define objective gates for test → staging → prod (verify, smoke, approval).

### Enterprise context

Each environment has different risk; gates must be measurable, not vibes.

### Predict

What blocks staging→prod if smoke fails on CUS-1001?

### Debug

Rebuilding on the deploy host during promote — risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Subjective GO only | Add checklist evidence fields |
| Skipping staging | Require staging smoke before prod candidate |

**Module 44** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-promotion-gates.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Define Promotion Gates

## Step 1 — Gate list

Examples: verify green, SAST gate, staging smoke, change approval, residual risk owned.

## Step 2 — Check the reference

Gates need evidence links—not vibes.

## Step 3 — Owner column

Assign role owners: QA/dev lead/security/ops (adapt to team).

## Step 4 — No-go examples

List three automatic no-go conditions (secret leak, digest mismatch, failed readiness).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-promotion-gates.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Define Promotion Gates

## Step 1 — Gate list

Examples: verify green, SAST gate, staging smoke, change approval, residual risk owned.

## Step 2 — Check the reference

Gates need evidence links—not vibes.

## Step 3 — Owner column

Assign role owners: QA/dev lead/security/ops (adapt to team).

## Step 4 — No-go examples

List three automatic no-go conditions (secret leak, digest mismatch, failed readiness).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Promotion gate table with owners and no-go conditions in `notes/lab44-promotion-gates.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-promotion-gates.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-promotion-gates.md`
- [ ] Gates measurable
- [ ] Owners assigned
- [ ] Three no-gos listed

