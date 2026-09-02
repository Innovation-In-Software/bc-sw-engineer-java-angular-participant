# Exercise 5 — Alert from create_failure_total

**Module 21** · Checkpoint D · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Write a mini runbook for a create_failure_total alert |
| **Skills practiced** | Alert runbooking |
| **Expected outcome** | notes/lab21-alert-runbook.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-alert-runbook.md |
| **Checkpoint** | D (after slides 264–269) |

## What you will learn

- Signal: failure rate above threshold for N minutes
- Triage: Actuator health then correlation logs
- CRM check: recent create paths / fixtures

**Enterprise context:** On-call needs a one-pager — “look around” is not a runbook.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-alert-runbook.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Alert from create_failure_total

Signal: failure rate exceeds threshold for N minutes.
Triage: /actuator/health then logs by lab-request-001.
CRM check: create path for recent traffic; confirm not a bad deploy of validation.
Owner: on-call backend / platform.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-alert-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Alert from create_failure_total

## Signal
_____

## Triage steps
_____

## CRM check
_____

## Owner
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Alert runbook in `notes/lab21-alert-runbook.md`.

## Debug / design challenge

If health is UP but failures rise, what do you check next?

## Predict the Output / Behavior

Name one reason paging on a single failure event is a bad default.

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-alert-runbook.md` |
| No triage steps | Health then logs |
| No owner | Name a role |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-alert-runbook.md`
- [ ] Signal defined
- [ ] Triage present
- [ ] Owner present
