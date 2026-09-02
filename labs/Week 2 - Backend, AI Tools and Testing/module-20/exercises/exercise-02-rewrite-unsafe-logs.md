# Exercise 2 — Rewrite Unsafe Logs

**Module 20** · Checkpoint B · Exercises 1–6 Pass then Lab 20

## Activity card

| | |
| --- | --- |
| **Objective** | Turn unsafe Customer logs into id+status+correlation lines |
| **Skills practiced** | PII-free structured messages |
| **Expected outcome** | notes/lab20-safe-logs.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-20-exercises/` → notes/lab20-safe-logs.md |
| **Checkpoint** | B (after slides 244) |

## What you will learn

- Unsafe: Customer.toString with email/phone
- Safe: customerId + status + correlation
- Safe activate line for CUS-1002

**Enterprise context:** Logging “Amina Khan <email>” is a reportable privacy incident in many enterprises.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab20-safe-logs.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Rewrite Unsafe Logs

Unsafe: log full Customer toString including email.
Safe: customerId=CUS-1001 status=ACTIVE correlation=lab-request-001
Ravi activate start: customerId=CUS-1002 status=PROSPECT correlation=lab-request-001

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-safe-logs.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Rewrite Unsafe Logs

## Unsafe example
_____

## Safe rewrite (Amina/CUS-1001)
_____

## Safe Ravi activate start
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Unsafe→safe rewrites in `notes/lab20-safe-logs.md`.

## Debug / design challenge

Rewrite: log.info("created {}", customer) where toString includes email.

## Predict the Output / Behavior

Is fullName allowed if the ticket already knows Amina?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-safe-logs.md` |
| Keeping email in safe line | Remove PII; keep ids |
| Missing correlation | Include lab-request-001 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-safe-logs.md`
- [ ] Unsafe labeled
- [ ] Safe Amina line
- [ ] Safe Ravi line
