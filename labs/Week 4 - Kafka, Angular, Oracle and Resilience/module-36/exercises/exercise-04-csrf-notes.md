# Exercise 4 — CSRF Notes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 24–27) |
| **Deliverable** | `notes/lab36-security.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

Decide whether classic CSRF applies to this SPA, based on how the token actually travels.

### Enterprise context

CSRF applies when the browser attaches credentials automatically — the token model decides whether you are exposed.

### Predict

Your app switches from a bearer header to a cookie session. What threat just came into scope?

### Debug

A reviewer asks 'do you need CSRF tokens?' — what do you check first?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| CSRF assumed always relevant | It depends on how credentials travel |
| Lab stance not stated | Say which model your starter uses |
| SameSite omitted | Add it to the checklist for any cookie use |

**Module 36** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-security.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — CSRF Notes

## Cookie Sessions

If the auth cookie is sent automatically by the browser, CSRF is in scope and needs SameSite or CSRF tokens.

## Bearer Header

If the token lives only in an explicit Authorization header set by JavaScript, classic CSRF is reduced.

## Lab Stance

The Lab 36 starter uses the bearer-header model, per the starter README.

## Checklist Item

Checklist: apply SameSite cookie attributes if the app ever adopts cookies.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — CSRF Notes

## Cookie Sessions

_____

## Bearer Header

_____

## Lab Stance

_____

## Checklist Item

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Both models described, the lab's stance, and the SameSite checklist item in `notes/lab36-security.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-security.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-security.md`
- [ ] Cookie-session case written
- [ ] Bearer-header case written
- [ ] Lab stance stated
- [ ] SameSite item added
