# Exercise 3 — PR Description Outline

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 215–218) |
| **Deliverable** | `notes/lab47-pr-description.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · one fact base · no secrets |

### What you will learn

Outline PR description with verify steps, fixtures, and rollback note.

### Enterprise context

Reviewers cannot test without commands and CRM fixture IDs.

### Predict

What verification steps belong in a CRM fix PR?

### Debug

PR says 'fixed stuff' with no test plan — rewrite?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No verify commands | Add mvn/test or curl steps |
| Secrets in PR body | Scrub tokens/passwords |

**Module 47** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-47-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab47-pr-description.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 47 — PR Description Outline

## Step 1 — Sections

Why, what changed, how verified (`./mvnw -B test` / CI link placeholder), rollback, risks.

## Step 2 — Check the reference

PR must be reviewable without Slack archaeology.

## Step 3 — Verify bullets

List two verification bullets using synthetic fixtures.

## Step 4 — Scope

Outline only—full packet is Lab 47.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-47-exercises/`, create `notes/` if needed, then create `notes/lab47-pr-description.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 47 — PR Description Outline

## Step 1 — Sections

Why, what changed, how verified (`./mvnw -B test` / CI link placeholder), rollback, risks.

## Step 2 — Check the reference

PR must be reviewable without Slack archaeology.

## Step 3 — Verify bullets

List two verification bullets using synthetic fixtures.

## Step 4 — Scope

Outline only—full packet is Lab 47.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

PR description outline with verify and rollback in `notes/lab47-pr-description.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab47-pr-description.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 47 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab47-pr-description.md`
- [ ] Five sections present
- [ ] Verify bullets use fixtures
- [ ] Rollback mentioned

