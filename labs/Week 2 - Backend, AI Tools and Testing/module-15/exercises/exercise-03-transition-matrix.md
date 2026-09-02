# Exercise 3 — Transition Matrix

**Module 15** · Checkpoint C · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | Tabulate allowed and forbidden customer status transitions |
| **Skills practiced** | Business-rule documentation, fixture implications |
| **Expected outcome** | notes/lab15-transition-matrix.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-transition-matrix.md |
| **Checkpoint** | C (after slides 157) |

## What you will learn

- PROSPECT → ACTIVE allowed (Ravi activate)
- ACTIVE → PROSPECT forbidden
- HTTP mapping of exceptions waits for Lab 16

**Enterprise context:** Support and auditors ask “can we demote an ACTIVE customer?” — the matrix is the contract.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-transition-matrix.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Transition Matrix

| From | To | Allowed? |
| --- | --- | --- |
| PROSPECT | ACTIVE | yes (Ravi) |
| ACTIVE | ACTIVE | reject or no-op — decide |
| ACTIVE | PROSPECT | no |

## Amina
CUS-1001 already ACTIVE — activate rejected/no-op per policy.

## Illegal list
1. ACTIVE → PROSPECT
2. (your second illegal)

## Boundary
Exception HTTP mapping waits for Lab 16.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-transition-matrix.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Transition Matrix

| From | To | Allowed? |
| --- | --- | --- |
| PROSPECT | ACTIVE | _____ |
| ACTIVE | ACTIVE | _____ |
| ACTIVE | PROSPECT | _____ |

## Amina (CUS-1001)
_____

## Illegal list
1. _____
2. _____

## Boundary
Lab that maps exceptions to HTTP: _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A transition matrix with Amina/Ravi implications in `notes/lab15-transition-matrix.md`.

## Debug / design challenge

If ACTIVE→ACTIVE is reject, what should happen to Amina’s status after a failed activate?

## Predict the Output / Behavior

Is ACTIVE→PROSPECT a validation annotation failure or a domain transition failure?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-transition-matrix.md` |
| No illegal transitions listed | Add at least ACTIVE→PROSPECT |
| Claiming Lab 15 does @ControllerAdvice | Defer HTTP mapping to Lab 16 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-transition-matrix.md`
- [ ] Matrix filled
- [ ] Amina case noted
- [ ] Lab 16 mapping deferred
