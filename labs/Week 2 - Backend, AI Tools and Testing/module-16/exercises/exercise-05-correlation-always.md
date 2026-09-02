# Exercise 5 — Correlation on Every Error

**Module 16** · Checkpoint D · Exercises 1–6 Pass then Lab 16

## Activity card

| | |
| --- | --- |
| **Objective** | Checklist that success and failure paths both carry correlation |
| **Skills practiced** | Tracing discipline |
| **Expected outcome** | notes/lab16-correlation-always.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-16-exercises/` → notes/lab16-correlation-always.md |
| **Checkpoint** | D (after slides 178–181) |

## What you will learn

- Success activate still logs/echoes lab-request-001
- Fail CUS-9999 includes same correlation field
- Missing header policy: generate later — note for future labs

**Enterprise context:** Without correlation on Fail, on-call cannot join API errors to broker/DB logs.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab16-correlation-always.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Correlation on Every Error

Success: activate Ravi still echoes/logs lab-request-001.
Failure: CUS-9999 includes same correlationId.
Missing header: generate later (note).

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-correlation-always.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Correlation on Every Error

## Success path
_____

## Failure path
_____

## Missing header policy
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Correlation checklist for success and Fail in `notes/lab16-correlation-always.md`.

## Debug / design challenge

Facade returns Fail JSON without correlationId — which test should catch it?

## Predict the Output / Behavior

Can correlationId differ between the request header and the Fail body? (It should match.)

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-correlation-always.md` |
| Only documenting success | Add Fail CUS-9999 path |
| Omitting lab-request-001 | Use the course correlation id |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-correlation-always.md`
- [ ] Success path noted
- [ ] Failure path noted
- [ ] Missing-header note present
