# Exercise 4 — Transfer Pseudocode (TODOs)

**Module 27** · Checkpoint C · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | Fill transfer pseudocode TODOs for debit, credit, log, and force-fail |
| **Skills practiced** | Transfer design |
| **Expected outcome** | notes/lab27-transfer-pseudocode.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/lab27-transfer-pseudocode.md |
| **Checkpoint** | C (after slides 152–156a) |

## What you will learn

- Load accounts
- If dest == ACC-FORCE-FAIL throw
- Debit, credit, write log inside same TX

**Enterprise context:** Pseudocode prevents AI from inventing two commits or controller-side SQL.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab27-transfer-pseudocode.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Transfer Pseudocode

@Transactional
transfer(from, to, amount, correlation):
  load accounts
  if to == ACC-FORCE-FAIL: throw
  debit from; credit to
  write TransactionLog(correlation)
  // commit via Spring

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/lab27-transfer-pseudocode.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Transfer Pseudocode

## Annotation / method
_____

## Force-fail check
_____

## Money steps
_____

## Log step
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Transfer pseudocode in `notes/lab27-transfer-pseudocode.md`.

## Debug / design challenge

Where should insufficient-funds validation throw relative to debit?

## Predict the Output / Behavior

Can the controller write TransactionLog directly?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab27-transfer-pseudocode.md` |
| Missing force-fail | Include ACC-FORCE-FAIL |
| Log outside TX in notes | Same transactional method |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab27-transfer-pseudocode.md`
- [ ] TX annotation
- [ ] Force-fail
- [ ] Debit/credit/log
