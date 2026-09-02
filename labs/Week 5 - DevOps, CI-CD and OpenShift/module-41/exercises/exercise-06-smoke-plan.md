# Exercise 6 — Plan Container Smoke

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 55–56) |
| **Deliverable** | `notes/lab41-smoke-plan.md` |
| **Fixtures** | Synthetic CUS-1001 smoke · no secrets in notes |

### What you will learn

Plan build/run/readiness/CUS-1001 smoke + graceful stop checks.

### Enterprise context

Hard gate evidence before OpenShift deploy.

### Predict

Bad DB URL at runtime — what should you observe?

### Debug

Starting Lab 43 Actions package job early — park it?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No Lab 39/40 app | Need bootable JAR + health first |
| Fixtures with real PII | Synthetic Amina/Ravi only |

**Module 41** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab41-smoke-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Plan Container Smoke

## Step 1 — Steps

Order: health ready → create/get `CUS-1001` → correlation header `lab-request-001` → stop container.

## Step 2 — Check the reference

Evidence is screenshots/logs under lab-41 notes—not production dumps.

## Step 3 — Failure case

One planned negative: wrong DB URL should fail readiness.

## Step 4 — Scope line

State this is a plan; full docker build/run is Lab 41.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-smoke-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Plan Container Smoke

## Step 1 — Steps

Order: health ready → create/get `CUS-1001` → correlation header `lab-request-001` → stop container.

## Step 2 — Check the reference

Evidence is screenshots/logs under lab-41 notes—not production dumps.

## Step 3 — Failure case

One planned negative: wrong DB URL should fail readiness.

## Step 4 — Scope line

State this is a plan; full docker build/run is Lab 41.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Smoke plan with happy and negative paths in `notes/lab41-smoke-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-smoke-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-smoke-plan.md`
- [ ] Happy path ordered
- [ ] Negative readiness case listed
- [ ] Pre-lab scope stated

