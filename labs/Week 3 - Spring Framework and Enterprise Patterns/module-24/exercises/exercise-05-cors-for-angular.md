# Exercise 5 — Write the Angular CORS Note

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 48–56) |
| **Deliverable** | `notes/lab24-cors-angular.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Write a CORS note that names the exact origin, methods, and headers the Angular CRM UI needs.

### Enterprise context

A CORS error looks like a backend outage to the frontend developer and like a working endpoint to the backend developer.

### Predict

curl returns 200 and the Angular call fails. Which side actually rejected it?

### Debug

You allow `*` and also send credentials. Why does the browser still refuse?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Wildcard origin used | Name http://localhost:4200 explicitly |
| Custom headers not allowed | Allow Authorization and X-Correlation-Id |
| Preflight not accounted for | OPTIONS must be permitted too |

**Module 24** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-cors-angular.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Write the Angular CORS Note

## Why It Happens

CORS is enforced by the browser, not the server; curl has no origin and no such policy, so it always succeeds.

## Allowed Origin

Allow http://localhost:4200 explicitly — a wildcard is invalid alongside credentials and is not shippable.

## Methods and Headers

Methods GET, POST, PUT, DELETE, OPTIONS; headers Content-Type, Authorization, X-Correlation-Id.

## Preflight

Any request with a custom header such as Authorization or a non-simple content type triggers an OPTIONS preflight.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-cors-angular.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Write the Angular CORS Note

## Why It Happens

_____

## Allowed Origin

_____

## Methods and Headers

_____

## Preflight

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A CORS note with the browser explanation, an explicit origin, allowed methods and headers, and preflight in `notes/lab24-cors-angular.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-cors-angular.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-cors-angular.md`
- [ ] Browser-versus-server explanation written
- [ ] Explicit dev origin named
- [ ] Methods and custom headers listed
- [ ] Preflight trigger explained
