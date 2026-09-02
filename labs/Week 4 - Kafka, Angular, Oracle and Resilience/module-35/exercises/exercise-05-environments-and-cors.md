# Exercise 5 — Configure Environments and CORS

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 62–68) |
| **Deliverable** | `notes/lab35-environments-cors.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Move the API base URL into environment files and specify the exact Spring Boot CORS configuration.

### Enterprise context

A hard-coded localhost URL builds and ships, then fails in every environment that is not a developer laptop.

### Predict

The base URL is inline in the service. What happens to the production build?

### Debug

Preflight fails and the error mentions CORS. Which allowed-headers entry is missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| URL hard-coded | Read it from environment.apiUrl |
| Wildcard origin | Name the dev origin explicitly |
| Custom header not allowed | Allow X-Correlation-Id or preflight fails |

**Module 35** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-environments-cors.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Configure Environments and CORS

## Environment Files

environment.ts and environment.prod.ts, each exporting apiUrl.

## No Hard-Coding

A hard-coded URL ships to production unchanged and cannot differ per environment.

## CORS Cause

CORS is a browser policy; curl sends no origin and is never subject to it, so the two tools disagree.

## Boot Config

Origin http://localhost:4200; methods GET, POST, PUT, DELETE, OPTIONS; headers Content-Type, Authorization, X-Correlation-Id.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-environments-cors.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Configure Environments and CORS

## Environment Files

_____

## No Hard-Coding

_____

## CORS Cause

_____

## Boot Config

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Environment files with apiUrl, the no-hard-coding reason, the CORS explanation, and the Boot allow-list in `notes/lab35-environments-cors.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-environments-cors.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-environments-cors.md`
- [ ] Environment files and property named
- [ ] Hard-coding rationale written
- [ ] Browser-versus-curl explanation given
- [ ] Origin, methods, and headers listed
