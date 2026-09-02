# Exercise 3 — Plan JWT and Error States

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 28–34) |
| **Deliverable** | `notes/lab50-jwt-error-states.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Map JWT attachment and each HTTP error status to one specific, distinguishable UI state.

### Enterprise context

Collapsing loading, empty, and error into one blank screen is the defect users report as 'the app is broken'.

### Predict

A 403 is handled by clearing the token and redirecting to login — what does the user lose, and why is it wrong?

### Debug

The list is blank. From the UI alone, can you tell whether it is still loading, genuinely empty, or failed?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| 401 and 403 handled identically | 403 means valid token, action not permitted |
| Loading and empty look the same | Three distinct states: pending, empty, error |
| Login request gets a token header | Exempt auth endpoints from the interceptor |

**Module 50** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-jwt-error-states.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Plan JWT and Error States

## Interceptor Rule

Every /api/** request gets the Authorization: Bearer header; /api/auth/login and static assets are exempt.

## Status Map

401 clears the token and routes to /login; 403 shows an inline not-permitted message; 404 shows the empty-state card for CUS-9999; 409 keeps the form and shows the conflict.

## Empty vs Loading

Pending shows a spinner; a 200 with zero rows shows 'No customers yet'; a failure shows the error banner with a retry.

## Scope

Plan only — no interceptor written, no real IdP such as Okta or Auth0 configured.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-jwt-error-states.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Plan JWT and Error States

## Interceptor Rule

_____

## Status Map

_____

## Empty vs Loading

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An interceptor rule, a four-status UI map, and three distinct list states in `notes/lab50-jwt-error-states.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-jwt-error-states.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-jwt-error-states.md`
- [ ] Interceptor scope and exemptions stated
- [ ] 401/403/404/409 each mapped to distinct behaviour
- [ ] Loading, empty, and error distinguished
