# Exercise 6 — Tie Observability to Release Watch

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 198–200) |
| **Deliverable** | `notes/lab46-watch-window.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · correlation lab-request-001 · no PII in metrics |

### What you will learn

Tie Kafka lag/DLT alerts to Lab 44-style release watch windows.

### Enterprise context

Lab 47 will communicate incidents—keep evidence shareable and secret-free.

### Predict

What Kafka signals belong on a post-promote watch checklist?

### Debug

Starting Module 47 slides during this warmup — park?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Watch with no owner | Name on-call / student owner |
| PII in dashboard screenshots | Redact names/emails |

**Module 46** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab46-watch-window.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Tie Observability to Release Watch

## Step 1 — Watch list

During a `crm-api` release watch, list signals: readiness, error rate, consumer lag, DLT count.

## Step 2 — Check the reference

Observability evidence supports go/no-go and rollback decisions.

## Step 3 — Scenario

If lag spikes after 1.4.0 while agents fail on `CUS-1001`, what is your first check?

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-watch-window.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Tie Observability to Release Watch

## Step 1 — Watch list

During a `crm-api` release watch, list signals: readiness, error rate, consumer lag, DLT count.

## Step 2 — Check the reference

Observability evidence supports go/no-go and rollback decisions.

## Step 3 — Scenario

If lag spikes after 1.4.0 while agents fail on `CUS-1001`, what is your first check?

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Release-watch signal list with first-check answer in `notes/lab46-watch-window.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-watch-window.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-watch-window.md`
- [ ] Four signals listed
- [ ] First-check answered
- [ ] Notes saved

