# Exercise 2 — Plan Dependency-Check Gate

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 9–13) |
| **Deliverable** | `notes/lab40-dependency-check-plan.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Plan Maven `-Psecurity-scan` profile, pin version, fail CVSS threshold.

### Enterprise context

SCA findings need triage — not silent suppressions.

### Predict

Where does the NVD DB live on first run?

### Debug

Unpinned plugin version — what drifts?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| API key in Git | Use env only for NVD key |
| Deleting the profile to go green | Triage/fix instead |

**Module 40** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-dependency-check-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Plan Dependency-Check Gate

## Step 1 — Profile sketch

Write a bullet plan for a Maven profile `-Psecurity-scan`: plugin goal, HTML+JSON reports, and a CVSS fail threshold placeholder.

## Step 2 — Check the reference

Confirm JDK 21 + Maven Wrapper habits: `./mvnw -B -Psecurity-scan dependency-check:check` from the CRM module root.

## Step 3 — Suppression policy draft

Write three required fields for any suppression: CVE id, owner, expiry date. State that silent suppressions fail the gate.

## Step 4 — Folder prep

Create note paths for sanitized HTML/JSON under `notes/lab-40/` (do not run the full scan yet unless instructor says smoke only).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-dependency-check-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Plan Dependency-Check Gate

## Step 1 — Profile sketch

Write a bullet plan for a Maven profile `-Psecurity-scan`: plugin goal, HTML+JSON reports, and a CVSS fail threshold placeholder.

## Step 2 — Check the reference

Confirm JDK 21 + Maven Wrapper habits: `./mvnw -B -Psecurity-scan dependency-check:check` from the CRM module root.

## Step 3 — Suppression policy draft

Write three required fields for any suppression: CVE id, owner, expiry date. State that silent suppressions fail the gate.

## Step 4 — Folder prep

Create note paths for sanitized HTML/JSON under `notes/lab-40/` (do not run the full scan yet unless instructor says smoke only).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A written scan-gate plan and suppression policy exist for Lab 40 in `notes/lab40-dependency-check-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-dependency-check-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-dependency-check-plan.md`
- [ ] Profile goal and report formats named
- [ ] CVSS threshold placeholder present
- [ ] Suppression fields include owner + expiry

