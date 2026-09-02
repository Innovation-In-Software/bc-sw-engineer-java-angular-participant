# Exercise 4 — Sketch Findings Triage CSV

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 14–22) |
| **Deliverable** | `notes/lab40-triage-csv-sketch.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Sketch CSV columns: CVE, severity, decision, owner, expiry.

### Enterprise context

Every suppression needs policy justification + expiry.

### Predict

False positive CPE — what evidence do you keep?

### Debug

Accept forever with no owner — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Empty decision column | fix / accept / false-positive / defer |
| Real customer PII in CSV | Synthetic fixtures only |

**Module 40** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-triage-csv-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Sketch Findings Triage CSV

## Reference

| Classification | Meaning |
| --- | --- |
| true_positive | Confirm and fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| accepted_risk | Time-bounded, owned |
| fixed | Re-scan evidence required |

## Step 1 — Columns

Define CSV headers: finding_id, cve, cvss, dependency, path, classification, owner, due_date, notes.

## Step 2 — Check the reference

Classifications: `true_positive`, `false_positive`, `accepted_risk`, `fixed`. Accepted risk needs owner + expiry.

## Step 3 — Sample rows

Invent two synthetic rows (not real CVEs from production). One true_positive on a transitive JAR; one false_positive with rationale.

## Step 4 — CRM link

Note how a true_positive on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-triage-csv-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Sketch Findings Triage CSV

## Reference

| Classification | Meaning |
| --- | --- |
| true_positive | Confirm and fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| accepted_risk | Time-bounded, owned |
| fixed | Re-scan evidence required |

## Step 1 — Columns

Define CSV headers: finding_id, cve, cvss, dependency, path, classification, owner, due_date, notes.

## Step 2 — Check the reference

Classifications: `true_positive`, `false_positive`, `accepted_risk`, `fixed`. Accepted risk needs owner + expiry.

## Step 3 — Sample rows

Invent two synthetic rows (not real CVEs from production). One true_positive on a transitive JAR; one false_positive with rationale.

## Step 4 — CRM link

Note how a true_positive on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A triage CSV sketch with two synthetic rows and clear classifications in `notes/lab40-triage-csv-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-triage-csv-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-triage-csv-sketch.md`
- [ ] Headers match the triage model
- [ ] Two sample rows classified
- [ ] Accepted-risk rules stated

