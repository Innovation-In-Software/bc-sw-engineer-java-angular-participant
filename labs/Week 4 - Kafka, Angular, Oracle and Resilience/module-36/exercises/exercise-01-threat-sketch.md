# Exercise 1 — Threat Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 4–8) |
| **Deliverable** | `notes/lab36-security.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

Map the CRM SPA's assets and threats, and state the UI-versus-API authorization boundary.

### Enterprise context

A frontend that hides privileged buttons without server enforcement is one DevTools edit away from exposure.

### Predict

You hide the admin menu unless role is ADMIN. What does an attacker do with the API directly?

### Debug

A reviewer says 'the button is hidden, so it's secure'. What is the one-sentence rebuttal?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Fewer than three threats | Cover XSS, token theft, CSRF, open redirect |
| UI treated as authorization | Spring Security must enforce every rule |
| Assets listed vaguely | Name tokens, PII, and admin actions |

**Module 36** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-security.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Threat Sketch

## Assets

Session tokens, customer PII for CUS-1001 and CUS-1002, and any privileged admin action.

## Threats

XSS stealing the token, token theft from storage, CSRF if a cookie session is used, and open redirects after login.

## UI vs API

Hiding a button is not authorization — Spring Security must reject the request regardless of what the UI shows.

## Save

All of the above saved to notes/lab36-security.md.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Threat Sketch

## Assets

_____

## Threats

_____

## UI vs API

_____

## Save

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An asset list, at least three named threats, and the UI-vs-API sentence in `notes/lab36-security.md`.

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
- [ ] Assets listed
- [ ] Three or more threats named
- [ ] UI-vs-API sentence written
