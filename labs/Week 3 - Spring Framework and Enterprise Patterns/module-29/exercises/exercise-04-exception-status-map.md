# Exercise 4 — Exception to Status Map

**Module 29** · Checkpoint C · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | Map CRM failure cases to HTTP statuses and error codes |
| **Skills practiced** | Status mapping |
| **Expected outcome** | notes/exception-status-map.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/exception-status-map.md |
| **Checkpoint** | C (after slides 205–210) |

## What you will learn

- Validation → 400
- CUS-9999 → 404
- Duplicate CUS-1001 → 409

**Enterprise context:** Status mismatches break client retry logic and monitoring alerts.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/exception-status-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — Exception to Status Map

| Case | Status | Code |
| --- | --- | --- |
| Invalid email/body | 400 | VALIDATION_FAILED |
| CUS-9999 | 404 | CUSTOMER_NOT_FOUND |
| Duplicate CUS-1001 | 409 | DUPLICATE_CUSTOMER |
| Illegal status transition | 400/422 | ILLEGAL_TRANSITION |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/exception-status-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — Exception to Status Map

| Case | Status | Code |
| --- | --- | --- |
| Invalid body | _____ | _____ |
| CUS-9999 | _____ | _____ |
| Duplicate CUS-1001 | _____ | _____ |
| Illegal transition | _____ | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

Status map in `notes/exception-status-map.md`.

## Debug / design challenge

Is 500 acceptable for expected not-found?

## Predict the Output / Behavior

Should duplicate be 400 or 409 in this lab?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/exception-status-map.md` |
| 404 for validation | Use 400 |
| 200 on duplicate | Use 409 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/exception-status-map.md`
- [ ] 400/404/409 rows
- [ ] Codes named
