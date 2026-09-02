# Exercise 2 — Plan the Angular Build Job

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 10–12) |
| **Deliverable** | `notes/lab51-angular-job.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Plan an explicit Angular CI job with deterministic install, headless tests, and a named build artifact.

### Enterprise context

A fullstack pipeline that only runs Maven passes green and ships a frontend nobody built.

### Predict

`ng test` is run without `--watch=false` in CI. What does the job do?

### Debug

The build passes locally and fails in CI on a dependency version. Which install command caused that?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| npm install used | npm ci is deterministic and needs package-lock.json |
| Test job hangs | Add --watch=false and a headless browser |
| No artifact named | Name dist/ and where it goes next |

**Module 51** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-angular-job.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Plan the Angular Build Job

## Step Order

checkout → setup-node 20 with npm cache → npm ci → ng test → ng build.

## Deterministic Install

npm ci installs exactly the lockfile and fails on drift; it requires package-lock.json to be committed.

## Headless Tests

ng test --watch=false --browsers=ChromeHeadless so the run terminates and needs no display.

## Build Output

ng build --configuration production writes dist/, uploaded as a build artifact for the image stage.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-angular-job.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Plan the Angular Build Job

## Step Order

_____

## Deterministic Install

_____

## Headless Tests

_____

## Build Output

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An ordered Angular job with npm ci justified, headless test flags, and a named artifact in `notes/lab51-angular-job.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-angular-job.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-angular-job.md`
- [ ] Job steps in order
- [ ] npm ci justified
- [ ] Headless, non-watching test flags named
- [ ] Build artifact named
