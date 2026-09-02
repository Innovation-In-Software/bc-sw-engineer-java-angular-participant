# Exercise 1 — Define Pipeline Triggers

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 92–102) |
| **Deliverable** | `notes/lab43-pipeline-policy.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic only · no secrets in Git |

### What you will learn

Decide what runs on pull_request, main push, and version tags.

### Enterprise context

PRs get fast verify; main/tags get package gates—deploy credentials stay out of YAML.

### Predict

Should PRs typically publish the immutable JAR artifact?

### Debug

One job does verify+package+deploy on every PR — risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Deploy on every PR | Gate package/deploy to main/tags |
| Treating green Actions as Lab done | Need evidence + runbook still |

**Module 43** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab43-pipeline-policy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Define Pipeline Triggers

## Reference

| Event | Verify | Package JAR+SHA |
| --- | --- | --- |
| pull_request | Yes | No (typical) |
| push main | Yes | Yes |
| tag v* | Yes | Yes |

## Step 1 — Matrix

Fill a table: event → jobs (verify always; package on main/tags; deploy later/not yet).

## Step 2 — Check the reference

Leadership: PRs get fast feedback; main/tags get stronger gates; deploy creds never in Git.

## Step 3 — CRM identity

Note synthetic fixtures may appear only in test evidence (`CUS-1001`, `lab-request-001`).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-pipeline-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Define Pipeline Triggers

## Reference

| Event | Verify | Package JAR+SHA |
| --- | --- | --- |
| pull_request | Yes | No (typical) |
| push main | Yes | Yes |
| tag v* | Yes | Yes |

## Step 1 — Matrix

Fill a table: event → jobs (verify always; package on main/tags; deploy later/not yet).

## Step 2 — Check the reference

Leadership: PRs get fast feedback; main/tags get stronger gates; deploy creds never in Git.

## Step 3 — CRM identity

Note synthetic fixtures may appear only in test evidence (`CUS-1001`, `lab-request-001`).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Trigger/job policy table documented in `notes/lab43-pipeline-policy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-pipeline-policy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-pipeline-policy.md`
- [ ] Three events covered
- [ ] Verify vs package split clear
- [ ] No secrets in policy

