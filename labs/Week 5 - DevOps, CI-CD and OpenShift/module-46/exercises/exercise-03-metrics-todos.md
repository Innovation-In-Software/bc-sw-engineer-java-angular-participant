# Exercise 3 — Fill Metrics/Alert TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 195–197) |
| **Deliverable** | `notes/lab46-metrics-todos.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · correlation lab-request-001 · no PII in metrics |

### What you will learn

Fill lag, error, DLT-rate, and latency panel/alert TODOs.

### Enterprise context

Operators need lag and DLT growth signals before release watch windows expire.

### Predict

High-cardinality email tags on metrics — risk?

### Debug

Metrics empty in Actuator — exposure/security?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No lag panel | Add consumer lag + alert idea |
| Raw emails as tags | Use customerId/eventType only |

**Module 46** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab46-metrics-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Fill Metrics/Alert TODOs

## Step 1 — Template

Fill:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-metrics-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Fill Metrics/Alert TODOs

## Step 1 — Template

Fill:
```
Processed count: _____
Failed count: _____
Retry count: _____
DLT count: _____
Lag signal: _____
Alert if lag > _____ for _____
```

## Step 2 — Panels

List three dashboard panels tied to agent impact (lag, DLT growth, error rate).

## Step 3 — Cardinality

Strike any plan that tags metrics with raw email addresses.

## Step 4 — Scope

Checklist only—wiring Micrometer is Lab 46.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Metrics/alert TODO sheet filled without high-cardinality PII tags in `notes/lab46-metrics-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-metrics-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-metrics-todos.md`
- [ ] Metric blanks filled
- [ ] Three panels listed
- [ ] No email tags

