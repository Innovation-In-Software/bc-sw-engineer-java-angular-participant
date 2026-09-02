# Exercise 6 — Cost and Exposure Quiz

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 172–173) |
| **Deliverable** | `notes/lab45-cost-exposure-quiz.md` |
| **Fixtures** | CRM tags only · no PII in IaC · no tfstate/keys in Git |

### What you will learn

Answer cost/exposure questions: destroy shared infra, public endpoints, runaway resources.

### Enterprise context

Training sandbox: no unapproved destroy of shared infra; watch blast radius.

### Predict

terraform destroy on shared instructor cluster without approval — OK?

### Debug

AI suggests largest instance type 'for prod-like' in student sandbox — response?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Destroy shared training | Ask instructor; never freestyle |
| Replacing app CI labs | Keep Lab 43–44 delivery narrative |

**Module 45** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab45-cost-exposure-quiz.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Cost and Exposure Quiz

## Step 1 — Scenarios

For each: public DB, unrestricted SG, huge VM without need, missing tags—write fail reason.

## Step 2 — Check the reference

Cost limits and tags are part of the infra contract.

## Step 3 — CRM link

One sentence: insecure infra endangers APIs that serve agent lookups of Amina/Ravi.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-cost-exposure-quiz.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Cost and Exposure Quiz

## Step 1 — Scenarios

For each: public DB, unrestricted SG, huge VM without need, missing tags—write fail reason.

## Step 2 — Check the reference

Cost limits and tags are part of the infra contract.

## Step 3 — CRM link

One sentence: insecure infra endangers APIs that serve agent lookups of Amina/Ravi.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Risk quiz answers saved in `notes/lab45-cost-exposure-quiz.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-cost-exposure-quiz.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-cost-exposure-quiz.md`
- [ ] Four scenarios answered
- [ ] Contract link made
- [ ] CRM impact stated

