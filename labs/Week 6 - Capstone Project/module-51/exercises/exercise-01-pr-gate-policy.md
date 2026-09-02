# Exercise 1 — Define the PR Gate Policy

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 4–8) |
| **Deliverable** | `notes/lab51-pr-gate-policy.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Write the pull-request gate policy, marking each check blocking or advisory with an override owner.

### Enterprise context

A pipeline where every check blocks gets routed around; one where none block proves nothing. The split is the real decision.

### Predict

If deploy runs on pull_request, what can an untrusted fork PR reach?

### Debug

Your PR run takes 40 minutes. Which gate moves to the main-branch job, and what do you lose?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Everything marked blocking | Justify each one; move slow checks to main |
| No override owner | Name who can override and where it is recorded |
| Deploy listed on PR | Deploy never runs on pull_request |

**Module 51** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-pr-gate-policy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Define the PR Gate Policy

## Gate List

Blocking on every PR: mvn verify, ng test, dependency scan at High or above, SAST.

## Blocking vs Advisory

Blocking as above; advisory: coverage delta, image size, lint. Only the release owner overrides, recorded in the PR.

## Fast Feedback

Target under 10 minutes; the container build and DAST move to the main-branch job.

## Scope

Policy only — no YAML written yet; Lab 51 Step 1 implements it.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-pr-gate-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Define the PR Gate Policy

## Gate List

_____

## Blocking vs Advisory

_____

## Fast Feedback

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A gate list split into blocking and advisory with an override owner and a run-time target in `notes/lab51-pr-gate-policy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-pr-gate-policy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-pr-gate-policy.md`
- [ ] Gates listed for every PR
- [ ] Each marked blocking or advisory
- [ ] Override owner named
- [ ] PR run-time target stated
