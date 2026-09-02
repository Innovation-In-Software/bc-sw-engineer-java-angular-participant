# Exercise 4 — AI Review Policy

**Module 25** · Checkpoint C · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Write a short policy for reviewing Copilot/AI service-repo drafts |
| **Skills practiced** | AI-assisted coding hygiene |
| **Expected outcome** | notes/ai-review-policy.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/ai-review-policy.md |
| **Checkpoint** | C (after slides 105–110a) |

## What you will learn

- Reject controller→repository shortcuts
- Reject secrets or PII logging
- Record accept/reject in lab25-001

**Enterprise context:** AI accelerates scaffolding — unchecked drafts recreate the layering bugs this lab exists to stop.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/ai-review-policy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — AI Review Policy

Must reject: ResponseEntity in service; controller importing repository; invented JPA mid-lab.
Must check: fixtures CUS-1001/CUS-1002; constructor DI; tests still meaningful.
Record: docs/lab25-001.md accept/reject + reason (or N/A if unused).

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/ai-review-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — AI Review Policy

## Must reject
_____

## Must check
_____

## Where to record review
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

AI review policy in `notes/ai-review-policy.md`.

## Debug / design challenge

Copilot suggests @Autowired fields on CustomerService — accept or reject?

## Predict the Output / Behavior

If you did not use AI, what do you write in lab25-001?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/ai-review-policy.md` |
| Saying AI needs no review | Mandatory human review |
| No record location | docs/lab25-001.md |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/ai-review-policy.md`
- [ ] Reject list
- [ ] Check list
- [ ] Record location
