# Exercise 5 — Fill Forbidden PII Checklist TODOs

**Module 20** · Checkpoint D · Exercises 1–6 Pass then Lab 20

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for a forbidden PII logging checklist |
| **Skills practiced** | Privacy allow/deny lists |
| **Expected outcome** | notes/lab20-forbidden-pii-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-20-exercises/` → notes/lab20-forbidden-pii-todos.md |
| **Checkpoint** | D (after slides 248–250) |

## What you will learn

- Forbidden: email, phone, raw national/card ids
- Allowed: customerId, correlation, status
- Clear MDC in finally = yes

**Enterprise context:** Security reviews ask for an explicit forbidden list — “be careful” is not a control.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab20-forbidden-pii-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Fill Forbidden PII Checklist TODOs

Forbidden: email, phone, national id / card PAN ideas
Allowed: customerId CUS-1001/CUS-1002, correlation lab-request-001
Clear MDC in finally? yes
try { … } finally { MDC.clear(); }

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-forbidden-pii-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Fill Forbidden PII Checklist TODOs

Forbidden: _____
Forbidden: _____
Forbidden: _____
Allowed customerId: _____
Allowed correlation: _____
Clear MDC in finally? _____

## Finally snippet
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled PII checklist in `notes/lab20-forbidden-pii-todos.md`.

## Debug / design challenge

Is “Amina” alone forbidden even without email?

## Predict the Output / Behavior

May ERROR logs include the request JSON body “just this once”?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-forbidden-pii-todos.md` |
| Allowing email as allowed | Move email to forbidden |
| Clear MDC = no | Must be yes |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-forbidden-pii-todos.md`
- [ ] Three forbidden
- [ ] Allowed ids
- [ ] Clear = yes
