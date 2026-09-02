# Exercise 1 — When to Keep Real Validator

**Module 18** · Checkpoint A · Exercises 1–6 Pass then Lab 18

## Activity card

| | |
| --- | --- |
| **Objective** | Decide which collaborator stays real for activate tests |
| **Skills practiced** | Isolation policy, mock boundaries |
| **Expected outcome** | notes/lab18-keep-real-validator.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-18-exercises/` → notes/lab18-keep-real-validator.md |
| **Checkpoint** | A (after slides 203–207) |

## What you will learn

- Mock CustomerRepository (I/O boundary)
- Keep pure StatusValidator/CustomerValidator real when deterministic
- Mock notifier to avoid email/IO

**Enterprise context:** Over-mocking domain helpers hides transition bugs that production still hits.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab18-keep-real-validator.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — When to Keep Real Validator

Mock CustomerRepository — I/O boundary.
Keep pure validator real if deterministic and fast.
Mock notifier to avoid email/IO.
Rule: mock I/O and unstable deps; keep pure domain helpers real when cheap.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-keep-real-validator.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — When to Keep Real Validator

## Mock repo?
_____

## Real validator?
_____

## Mock notifier?
_____

## Rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear mock/real policy in `notes/lab18-keep-real-validator.md`.

## Debug / design challenge

If you mock the validator to always allow ACTIVE→PROSPECT, what production bug do you miss?

## Predict the Output / Behavior

Should DefaultCustomerService be @Mock when it is the SUT?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-keep-real-validator.md` |
| Mocking everything including validator blindly | Keep pure validator real |
| Starting the full lab mid-exercise | Finish pre-lab notes first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-keep-real-validator.md`
- [ ] Repo mock decision
- [ ] Validator real decision
- [ ] Rule sentence present
