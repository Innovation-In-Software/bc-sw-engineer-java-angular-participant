# Exercise 2 — Sketch the Actions Pipeline

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 16–19) |
| **Deliverable** | `notes/lab48-actions-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Turn the capstone CI/CD architecture into a per-event job table covering both Angular and Spring Boot.

### Enterprise context

A fullstack pipeline that only builds the backend passes CI and ships a broken UI. The event table is what makes both halves explicit.

### Predict

If deploy runs automatically on every push to main, what is the first Friday-afternoon failure mode?

### Debug

Your plan lists `mvn verify` but no `ng test` — what breaks, and when do you find out?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only backend jobs listed | Add the Angular half: npm ci, ng test, ng build |
| Deploy set to automatic | Taught path is tag + manual approval for OpenShift |
| Gates listed but not enforced | Say explicitly which gate fails the build |

**Module 48** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-actions-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Sketch the Actions Pipeline

## Event Table

pull_request → ng test + mvn verify + scans; push main → + package once; tag v* → + manual deploy.

## Fullstack Jobs

Angular: npm ci, ng test --watch=false, ng build. Backend: mvn -B clean verify.

## Gates

Dependency scan (fail on High), SAST, container build + image scan before any push.

## Deploy Ownership

Only the release owner approves the OpenShift environment; deploy never runs unattended.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-actions-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Sketch the Actions Pipeline

## Event Table

_____

## Fullstack Jobs

_____

## Gates

_____

## Deploy Ownership

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-row event table with Angular and Maven jobs, named gates, and manual deploy ownership in `notes/lab48-actions-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-actions-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-actions-plan.md`
- [ ] Three events with their jobs
- [ ] Both Angular and Maven jobs named
- [ ] Gates listed with a fail condition
- [ ] Deploy is manual-approval only
