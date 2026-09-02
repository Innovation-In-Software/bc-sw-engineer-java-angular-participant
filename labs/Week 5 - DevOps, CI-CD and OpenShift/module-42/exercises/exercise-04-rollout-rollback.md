# Exercise 4 — Rollout and Rollback

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 31–36) |
| **Deliverable** | `notes/lab42-rollout-rollback.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Plan the rollout verification checks and a rehearsed rollback with named evidence.

### Enterprise context

A rollback rehearsed for the first time during an incident is a second incident.

### Predict

You roll back and declare success without re-running the smoke check. What might still be broken?

### Debug

`rollout status` succeeded but users report errors. Which check did the status not cover?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Rollback never rehearsed | Practise it before you need it |
| No smoke after rollback | Re-verify readiness and CUS-1001 |
| Evidence folders unnamed | notes/lab-42/ before and after |

**Module 42** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-rollout-rollback.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Rollout and Rollback

## Rollout Watch

rollout status completes, pods report Ready, the Route answers over HTTP, and GET CUS-1001 returns Amina.

## Rollback Story

Deploy a deliberately bad revision, observe the failure, then roll back to the previous known-good digest and re-verify.

## Evidence

notes/lab-42/before/ and notes/lab-42/after/.

## Correlation

Every smoke call carries X-Correlation-Id: lab-request-001 so the request is traceable in logs.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-rollout-rollback.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Rollout and Rollback

## Rollout Watch

_____

## Rollback Story

_____

## Evidence

_____

## Correlation

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollout checks, a rehearsed rollback story, named evidence folders, and the correlation header in `notes/lab42-rollout-rollback.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-rollout-rollback.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-rollout-rollback.md`
- [ ] Four rollout checks listed
- [ ] Rollback rehearsal described
- [ ] Evidence folders named
- [ ] Correlation header included
