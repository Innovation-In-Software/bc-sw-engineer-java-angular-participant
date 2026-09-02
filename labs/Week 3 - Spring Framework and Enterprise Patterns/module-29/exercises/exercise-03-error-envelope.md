# Exercise 3 — ErrorResponse Envelope

**Module 29** · Checkpoint B · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | Define ErrorResponse fields including correlation and violations |
| **Skills practiced** | Error envelope design |
| **Expected outcome** | notes/error-envelope.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/error-envelope.md |
| **Checkpoint** | B (after slides 198–204) |

## What you will learn

- status, code, message
- correlationId lab-request-001
- violations[] for field errors

**Enterprise context:** A single envelope lets every client render one error component.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/error-envelope.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — ErrorResponse Envelope

Fields: status, code, message, correlationId, violations[{field, message}]
Example code: VALIDATION_FAILED
Always echo lab-request-001 when provided.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/error-envelope.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — ErrorResponse Envelope

## Fields
_____

## Violation item shape
_____

## Correlation rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

Envelope notes in `notes/error-envelope.md`.

## Debug / design challenge

Should rejected passwords appear in violations.rejectedValue?

## Predict the Output / Behavior

Is returning only a string body enough for Lab 29 Pass?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/error-envelope.md` |
| Missing correlation | Require correlationId |
| No violations list | Include field errors |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/error-envelope.md`
- [ ] Core fields
- [ ] Violations
- [ ] Correlation
