# Exercise 5 — Outline Security Assessment

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 23–25) |
| **Deliverable** | `notes/lab40-assessment-outline.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Outline security-assessment.md: scope, tools, findings, residual risks.

### Enterprise context

Peer must reproduce without verbal hand-waving.

### Predict

What belongs in residual risk (owner + expiry)?

### Debug

Vague 'looks fine' assessment — why rejected?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Missing versions/commands | Add reproduce section |
| Secrets in screenshots | Sanitize HTML/JSON reports |

**Module 40** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-assessment-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Outline Security Assessment

## Step 1 — Sections

List: scope, tools, findings summary, remediations planned, residual risks, evidence index.

## Step 2 — Check the reference

Residual risk row must include: risk, severity, owner, due date, mitigating control.

## Step 3 — Evidence index draft

Map claim → artifact path placeholders (Dependency-Check HTML, triage CSV, regression test name).

## Step 4 — Scope honesty

Add a one-line note: pre-lab outline only; full remediation/re-scan is Lab 40 timed/full path.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-assessment-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Outline Security Assessment

## Step 1 — Sections

List: scope, tools, findings summary, remediations planned, residual risks, evidence index.

## Step 2 — Check the reference

Residual risk row must include: risk, severity, owner, due date, mitigating control.

## Step 3 — Evidence index draft

Map claim → artifact path placeholders (Dependency-Check HTML, triage CSV, regression test name).

## Step 4 — Scope honesty

Add a one-line note: pre-lab outline only; full remediation/re-scan is Lab 40 timed/full path.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Assessment outline with residual-risk and evidence placeholders in `notes/lab40-assessment-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-assessment-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-assessment-outline.md`
- [ ] Six sections present
- [ ] Residual risk fields complete in template
- [ ] Pre-lab scope stated

