# Exercise 5 — Map the Environment Strategy

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 30–31) |
| **Deliverable** | `notes/lab48-environment-strategy.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Map four environments to OpenShift Projects and write evidence-based promotion gates.

### Enterprise context

Rebuilding per environment means prod runs an artifact nothing ever tested. Promotion by digest is what keeps the tested thing the shipped thing.

### Predict

If each environment rebuilds from source, what exactly did the stage smoke test prove about prod?

### Debug

Your gate says 'promote when stable' — what evidence would a reviewer ask for instead?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Environments rebuilt, not promoted | Same image digest; only config differs |
| Gates are subjective | Name evidence: smoke result, approver, rollback |
| Real data mentioned below prod | Synthetic fixtures only: CUS-1001, CUS-1002 |

**Module 48** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-environment-strategy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Map the Environment Strategy

## Four Environments

dev → crm-dev, test → crm-test, stage → crm-stage, prod → crm-prod.

## What Differs

The image digest is identical across all four; ConfigMap values, Secret references, and replica counts differ.

## Promotion Gates

Stage → prod requires a green staging smoke run, a named approver, and a rehearsed rollback command.

## Data Rule

Only synthetic fixtures below prod: CUS-1001 Amina Khan and CUS-1002 Ravi Singh.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-environment-strategy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Map the Environment Strategy

## Four Environments

_____

## What Differs

_____

## Promotion Gates

_____

## Data Rule

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Four environments mapped to OpenShift Projects, a same-digest promotion rule, named gates, and a synthetic-data rule in `notes/lab48-environment-strategy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-environment-strategy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-environment-strategy.md`
- [ ] Four environments mapped to Project names
- [ ] Same-digest promotion stated
- [ ] Stage→prod gate names its evidence
- [ ] Synthetic-data-only rule written
