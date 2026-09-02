# Exercise 6 — Write Smoke, Rollback and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 38–44) |
| **Deliverable** | `notes/lab51-smoke-rollback-readiness.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Write specific post-deploy smoke checks and a rollback runbook that verifies the rollback itself.

### Enterprise context

A rollback nobody verified is a second outage waiting behind the first one.

### Predict

You roll back and tell the room it is fixed, without re-running smoke. What might still be broken?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Smoke checks are vague | Name the request and the expected response |
| Rollback not verified | Re-run readiness and the CUS-1001 read after rolling back |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 51** · Capstone pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-smoke-rollback-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Write Smoke, Rollback and Self-Check

## Smoke Checks

Readiness probe returns 200; GET /api/customers/CUS-1001 returns Amina Khan with X-Correlation-Id lab-request-001 echoed.

## Rollback Trigger

Any failed smoke check triggers rollback; the release owner calls it, with no debugging in production first.

## Rollback Command

oc rollout undo on the deployment, then re-run readiness and the CUS-1001 read to confirm the previous revision serves.

## Pass Mark

Pass — pr-gate-policy, angular-job, scan-image-plan, deploy-stage-plan, and secrets-approvals are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-smoke-rollback-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Write Smoke, Rollback and Self-Check

## Smoke Checks

_____

## Rollback Trigger

_____

## Rollback Command

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Specific smoke checks, a rollback trigger and owner, a verified rollback step, and an honest Pass/Fail roll-call in `notes/lab51-smoke-rollback-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-smoke-rollback-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-smoke-rollback-readiness.md`
- [ ] Smoke checks name request and expected response
- [ ] Rollback trigger and decision owner named
- [ ] Rollback verified after running
- [ ] All five earlier notes files confirmed complete
