# Exercise 5 — Fill Correlation One-Liner TODOs

**Module 12** · Checkpoint C · Exercises 1–6 Pass then Lab 12

## Activity card

| | |
| --- | --- |
| **Objective** | Fill correlation one-liner TODOs for lab-request-001 logging/review |
| **Skills practiced** | Reviewability, correlation habit |
| **Expected outcome** | notes/lab12-correlation-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-12-exercises/` → notes/lab12-correlation-todos.md |
| **Checkpoint** | C (after slides 105–107) |

## What you will learn

- Correlation ids make demos and logs reviewable
- Static analysis/IDE inspections are awareness — human review still required
- One-liners document intent without rewriting the world

**Enterprise context:** Support teams need correlation across create/get/update failures.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab12-correlation-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Fill Correlation One-Liner TODOs

## Step 1 — Copy TODOs

Correlation id value: (your note here)
Log on activate entry: (your note here)
Log on activate success for Ravi: (your note here)
Never log field: (your note here)
Place correlation in: (your note here) (header/MDC — pick one for now)

## Step 2 — Fill blanks

Fill with `lab-request-001`, short log phrases, and a PII field you must not log (e.g. raw email if present later).

## Step 3 — One-liner rule

Write: *Every public service entry logs correlation once.*

## Step 4 — Self-check

Confirm the correlation blank is exactly lab-request-001.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-correlation-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Fill Correlation One-Liner TODOs

## Step 1 — Copy TODOs

Correlation id value: _____
Log on activate entry: _____
Log on activate success for Ravi: _____
Never log field: _____
Place correlation in: _____ (header/MDC — pick one for now)

## Step 2 — Fill blanks

Fill with `lab-request-001`, short log phrases, and a PII field you must not log (e.g. raw email if present later).

## Step 3 — One-liner rule

Write: *Every public service entry logs correlation once.*

## Step 4 — Self-check

Confirm the correlation blank is exactly lab-request-001.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled correlation TODOs ready for Lab 12 notes in `notes/lab12-correlation-todos.md`.


## Debug / design challenge

Blank correlationId in a failure path — fill lab-request-001.

## Predict the Output / Behavior

Where should correlationId appear in Main demo output?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-correlation-todos.md` |
| Logging full payloads | Log ids + correlation only |
| Inventing a second correlation scheme | Stick to lab-request-001 for prep |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-correlation-todos.md`
- [ ] All _____ replaced
- [ ] lab-request-001 present
- [ ] PII exclusion named

