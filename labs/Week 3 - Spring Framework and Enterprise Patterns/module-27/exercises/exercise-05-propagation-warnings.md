# Exercise 5 — Propagation Warnings

**Module 27** · Checkpoint C · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | List propagation pitfalls that break rollback evidence |
| **Skills practiced** | Propagation risk analysis |
| **Expected outcome** | notes/propagation-warnings.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/propagation-warnings.md |
| **Checkpoint** | C (after slides 152–156a) |

## What you will learn

- REQUIRED default joins caller TX
- REQUIRES_NEW can commit log while money rolls back
- Self-invocation skips TX

**Enterprise context:** Wrong propagation creates “half committed” audit trails that look fine until finance audits.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/propagation-warnings.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Propagation Warnings

| Pattern | Risk |
| --- | --- |
| REQUIRES_NEW on log only | Log commits; money rolls back |
| Self-invocation | @Transactional ignored |
| Catch Exception and swallow | No rollback |
| @Transactional on controller | Wrong boundary |

Lab default: REQUIRED on TransferService.transfer

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/propagation-warnings.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Propagation Warnings

| Pattern | Risk |
| --- | --- |
| REQUIRES_NEW on log | _____ |
| Self-invocation | _____ |
| Swallow exception | _____ |
| TX on controller | _____ |

## Lab default
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Propagation warnings in `notes/propagation-warnings.md`.

## Debug / design challenge

Copilot suggests try/catch around debit that returns null — accept or reject?

## Predict the Output / Behavior

Why is REQUIRED usually enough for this lab?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/propagation-warnings.md` |
| Saying REQUIRES_NEW is always better | Call out split-commit risk |
| No swallow-exception row | Include it |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/propagation-warnings.md`
- [ ] Four risks
- [ ] Lab default REQUIRED
