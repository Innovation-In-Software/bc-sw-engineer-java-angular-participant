# Exercise 6 — Draft AppSec Go/No-Go Questions

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 23–25) |
| **Deliverable** | `notes/lab40-gate-go-nogo.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Draft go/no-go questions for the CRM AppSec gate.

### Enterprise context

Hard gate before Lab 41 Docker — unresolved Criticals block.

### Predict

One Critical CVE accepted with no expiry — go or no-go?

### Debug

Green verify but no triage CSV — pass the gate?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Skipping remediation evidence | Need before/after + regression test |
| Pushing images early | Lab 41 after this gate |

**Module 40** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-gate-go-nogo.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Draft AppSec Go/No-Go Questions

## Step 1 — Questions

Draft five go/no-go questions (High CVE owned?, secrets in Git?, authz negative test?, suppression policy?, verify still green?).

## Step 2 — Check the reference

Leadership rule: no ship on raw scanner volume; no silent suppressions; no secrets.

## Step 3 — Tie to CRM

For each question, one line on impact to agents serving Amina/Ravi.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-gate-go-nogo.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Draft AppSec Go/No-Go Questions

## Step 1 — Questions

Draft five go/no-go questions (High CVE owned?, secrets in Git?, authz negative test?, suppression policy?, verify still green?).

## Step 2 — Check the reference

Leadership rule: no ship on raw scanner volume; no silent suppressions; no secrets.

## Step 3 — Tie to CRM

For each question, one line on impact to agents serving Amina/Ravi.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Five go/no-go questions with CRM impact lines in `notes/lab40-gate-go-nogo.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-gate-go-nogo.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-gate-go-nogo.md`
- [ ] Five questions drafted
- [ ] Each has CRM impact
- [ ] Secrets/suppression rules reflected

