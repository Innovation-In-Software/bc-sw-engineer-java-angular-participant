# Exercise 6 — Lab 36 Readiness

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 34–37) |
| **Deliverable** | `notes/lab36-readiness.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

Record the three security decisions and confirm the earlier exercises are genuinely complete.

### Enterprise context

Security decisions made during coding are made under time pressure; written ones can be reviewed.

### Predict

You start Lab 36 without deciding storage. When does that decision get made instead?

### Debug

Your Exercise 5 file still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Decisions not written | All three, with reasons |
| Trying to wire a real IdP | Not required for this pre-lab |
| Guard TODOs incomplete | That is a Fail — finish them, then re-mark |

**Module 36** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Lab 36 Readiness

## Decision Log

Storage: in-memory, chosen in Exercise 2. Redirect: /login, from Exercise 5. XSS: prefer default escaping, from Exercise 3.

## Evidence Preview

Evidence to come: an unauthenticated visit redirects to /login, and Amina <b>Khan</b> renders literally.

## No Real IdP

Confirmed — no Okta or Auth0 configuration is needed for this pre-lab.

## Pass Mark

Pass — the Exercise 5 guard TODOs contain no remaining blanks.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Lab 36 Readiness

## Decision Log

_____

## Evidence Preview

_____

## No Real IdP

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-item decision log, an evidence preview, the no-IdP confirmation, and an honest Pass/Fail mark in `notes/lab36-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-readiness.md`
- [ ] Three decisions logged with reasons
- [ ] Evidence preview written
- [ ] No-IdP scope confirmed
- [ ] Guard TODOs confirmed complete
