# Exercise 3 — Rollback Evidence Plan

**Module 27** · Checkpoint B · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | Plan how you will prove rollback with ACC-FORCE-FAIL |
| **Skills practiced** | Rollback evidence design |
| **Expected outcome** | notes/rollback-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/rollback-plan.md |
| **Checkpoint** | B (after slides 147–151) |

## What you will learn

- Record MAIN balance before
- Transfer to ACC-FORCE-FAIL
- Assert MAIN unchanged + no TransactionLog success row

**Enterprise context:** Without before/after balances, “it rolled back” is unverifiable in peer review.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/rollback-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Rollback Evidence Plan

1. Note ACC-1001-MAIN balance before
2. POST transfer destination ACC-FORCE-FAIL
3. Expect error response
4. MAIN balance unchanged
5. No success TransactionLog row
6. Screenshot/notes under lab-27/

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/rollback-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Rollback Evidence Plan

## Before measurement
_____

## Force-fail action
_____

## After assertions
_____

## Evidence location
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollback plan in `notes/rollback-plan.md`.

## Debug / design challenge

If the log uses REQUIRES_NEW, what misleading evidence might you see?

## Predict the Output / Behavior

Why reset seeds between automated tests?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/rollback-plan.md` |
| No before balance | Measure before |
| Skipping log assertion | No success log on fail |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/rollback-plan.md`
- [ ] Before/after
- [ ] ACC-FORCE-FAIL
- [ ] Log assertion
