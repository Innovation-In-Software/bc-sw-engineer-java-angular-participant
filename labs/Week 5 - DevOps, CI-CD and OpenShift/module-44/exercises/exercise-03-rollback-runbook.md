# Exercise 3 — Outline Rollback Runbook

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 128–131) |
| **Deliverable** | `notes/lab44-rollback-runbook.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 digest · no secrets in artifact |

### What you will learn

Outline rollback to a known-good digest plus post-rollback verification.

### Enterprise context

Rollback without prior digest capture is incomplete—record before every promote.

### Predict

Why capture prior digest before promote, not after failure?

### Debug

DB migrate not backward compatible — rollback limit?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No known-good digest | Record prior before promote |
| Kafka DLT procedures now | Park Lab 46 |

**Module 44** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-rollback-runbook.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Outline Rollback Runbook

## Step 1 — Steps

Detect → decide → redeploy known-good digest → verify readiness → CRM smoke → comms update.

## Step 2 — Check the reference

Rollback names digest Y and a verification check—not “redeploy latest”.

## Step 3 — Timebox

Write a target recovery time placeholder (e.g. under N minutes) and who declares SEV.

## Step 4 — Kafka watch

Optional one-liner: watch consumer lag after rollback (detail in Lab 46).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-rollback-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Outline Rollback Runbook

## Step 1 — Steps

Detect → decide → redeploy known-good digest → verify readiness → CRM smoke → comms update.

## Step 2 — Check the reference

Rollback names digest Y and a verification check—not “redeploy latest”.

## Step 3 — Timebox

Write a target recovery time placeholder (e.g. under N minutes) and who declares SEV.

## Step 4 — Kafka watch

Optional one-liner: watch consumer lag after rollback (detail in Lab 46).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollback runbook outline with verification in `notes/lab44-rollback-runbook.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-rollback-runbook.md` |
| Rolling back to :latest | Pin known-good digest |
| Skipping smoke after undo | Re-check CUS-1001 path |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-rollback-runbook.md`
- [ ] Steps ordered
- [ ] Digest-based rollback stated
- [ ] Verification included

