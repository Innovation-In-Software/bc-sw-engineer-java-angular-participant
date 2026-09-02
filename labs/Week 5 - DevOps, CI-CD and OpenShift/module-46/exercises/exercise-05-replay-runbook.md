# Exercise 5 — Outline DLT Replay Runbook

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 195–197) |
| **Deliverable** | `notes/lab46-replay-runbook.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · correlation lab-request-001 · no PII in metrics |

### What you will learn

Outline dry-run-first DLT replay with rate limits and verification.

### Enterprise context

Blind replay can re-poison or amplify load—dry-run and batch limits first.

### Predict

Why dry-run before live DLT replay?

### Debug

Replay storms rebalance — tune?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Replay all DLT at once | Rate-limit; sample first |
| No success criteria | Define lag/DLT/CRM checks |

**Module 46** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab46-replay-runbook.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Outline DLT Replay Runbook

## Step 1 — Steps

Inspect DLT → classify → dry-run → limited replay → verify projection → stop criteria.

## Step 2 — Check the reference

Rate-limit replay; never replay blindly into prod topics.

## Step 3 — Evidence

Name what screenshots prove DLT landing and successful limited replay.

## Step 4 — Comms link

Note Lab 47 may communicate this class of incident—keep evidence shareable.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-replay-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Outline DLT Replay Runbook

## Step 1 — Steps

Inspect DLT → classify → dry-run → limited replay → verify projection → stop criteria.

## Step 2 — Check the reference

Rate-limit replay; never replay blindly into prod topics.

## Step 3 — Evidence

Name what screenshots prove DLT landing and successful limited replay.

## Step 4 — Comms link

Note Lab 47 may communicate this class of incident—keep evidence shareable.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Replay runbook outline with dry-run in `notes/lab46-replay-runbook.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-replay-runbook.md` |
| Infinite retry | Bounded retry + DLT |
| Replaying without idempotency | Prove upsert/dedupe first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-replay-runbook.md`
- [ ] Steps include dry-run
- [ ] Stop criteria present
- [ ] Evidence named

