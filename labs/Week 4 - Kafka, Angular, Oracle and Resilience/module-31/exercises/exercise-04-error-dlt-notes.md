# Exercise 3 — Error and DLT Notes

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 41–46) |
| **Deliverable** | `notes/lab31-error-dlt-notes.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

Plan retries vs non-retryable errors and DLT recoverer naming.

### Enterprise context

Poison CRM payloads must not block the partition forever.

### Predict

Validation error — retry forever or DLT?

### Debug

DLT empty after failures — recoverer not on factory?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Infinite retries | Classify contract errors as non-retryable |
| DLT topic name unclear | Document Spring default vs Lab 30 .dlq |

**Module 31** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-error-dlt-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Error and DLT Notes

## Step 1 — Retryable

Example: transient network blip calling email API — retry.

## Step 2 — Non-retryable

Example: JSON missing `customerId` — DLT after limited attempts.

## Step 3 — Ops note

Write: support replays DLT after fixing the consumer, using correlation `lab-request-001`.

## Step 4 — No runtime

Confirm you will not publish to DLT from CLI in this pre-lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-error-dlt-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Error and DLT Notes

## Step 1 — Retryable

Example: transient network blip calling email API — retry.

## Step 2 — Non-retryable

Example: JSON missing `customerId` — DLT after limited attempts.

## Step 3 — Ops note

Write: support replays DLT after fixing the consumer, using correlation `lab-request-001`.

## Step 4 — No runtime

Confirm you will not publish to DLT from CLI in this pre-lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear retry vs DLT decision notes for Lab 31 in `notes/lab31-error-dlt-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-error-dlt-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-error-dlt-notes.md`
- [ ] Retryable example
- [ ] Non-retryable example
- [ ] Replay/ops sentence

