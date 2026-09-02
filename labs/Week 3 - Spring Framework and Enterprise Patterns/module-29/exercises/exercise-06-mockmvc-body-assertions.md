# Exercise 6 — MockMvc Body Assertions Plan

**Module 29** · Checkpoint C · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | Plan MockMvc assertions for status and ErrorResponse body shape |
| **Skills practiced** | API contract testing |
| **Expected outcome** | notes/mockmvc-body-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/mockmvc-body-plan.md |
| **Checkpoint** | C (after slides 205–210) |

## What you will learn

- Assert status
- Assert code / message / correlationId
- Assert violations for 400

**Enterprise context:** Status-only tests miss envelope regressions that break Angular error screens.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/mockmvc-body-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — MockMvc Body Assertions Plan

| Case | Status | Body asserts |
| --- | --- | --- |
| Bad email | 400 | code=VALIDATION_FAILED; violations not empty; correlationId |
| CUS-9999 | 404 | code=CUSTOMER_NOT_FOUND |
| Duplicate | 409 | code=DUPLICATE_CUSTOMER |
| GET CUS-1001 | 200 | happy path (not error envelope) |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/mockmvc-body-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — MockMvc Body Assertions Plan

| Case | Status | Body asserts |
| --- | --- | --- |
| Bad email | _____ | _____ |
| CUS-9999 | _____ | _____ |
| Duplicate | _____ | _____ |
| GET CUS-1001 | _____ | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

MockMvc body plan in `notes/mockmvc-body-plan.md`.

## Debug / design challenge

Why sort field violations in the handler or loosen order asserts?

## Predict the Output / Behavior

Should 401 from Lab 28 be tested in the same class?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/mockmvc-body-plan.md` |
| Status only | Include body fields |
| Skipping correlation | Assert correlationId |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/mockmvc-body-plan.md`
- [ ] 400/404/409 cases
- [ ] Body asserts
