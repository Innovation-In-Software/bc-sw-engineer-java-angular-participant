# Exercise 5 — Outline AI IaC Review Record

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 172–173) |
| **Deliverable** | `notes/lab45-ai-review-record.md` |
| **Fixtures** | CRM tags only · no PII in IaC · no tfstate/keys in Git |

### What you will learn

Outline ai-iac-review fields: suggestion, risk, human correction, validation evidence.

### Enterprise context

Undocumented AI acceptance fails the lab—humans stay accountable.

### Predict

Must you document at least one rejection or hardening?

### Debug

Review says 'AI looked fine' with no evidence — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No rejection recorded | Find ≥1 hardening or reject |
| Secrets in review screenshots | Redact keys/state |

**Module 45** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab45-ai-review-record.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Outline AI IaC Review Record

## Step 1 — Fields

prompt summary, assumptions, accepted snippets, rejected/hardened items, residual risks, approval status.

## Step 2 — Check the reference

Undocumented AI acceptance fails the lab.

## Step 3 — Sample reject row

Draft one rejected item with rationale and safer alternative.

## Step 4 — Approver

Leave approver/date blank for Lab 45 completion.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-ai-review-record.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Outline AI IaC Review Record

## Step 1 — Fields

prompt summary, assumptions, accepted snippets, rejected/hardened items, residual risks, approval status.

## Step 2 — Check the reference

Undocumented AI acceptance fails the lab.

## Step 3 — Sample reject row

Draft one rejected item with rationale and safer alternative.

## Step 4 — Approver

Leave approver/date blank for Lab 45 completion.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

AI review outline with sample rejection in `notes/lab45-ai-review-record.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-ai-review-record.md` |
| Applying because AI said so | Human reads plan and owns risk |
| Committing tfstate | Use remote state; commit examples only |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-ai-review-record.md`
- [ ] Fields listed
- [ ] Sample reject present
- [ ] Approval left for lab

