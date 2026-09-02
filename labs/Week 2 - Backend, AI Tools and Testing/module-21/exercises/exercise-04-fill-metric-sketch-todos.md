# Exercise 4 — Fill Metric Sketch TODOs

**Module 21** · Checkpoint D · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for metrics and an alert on create_failure_total |
| **Skills practiced** | Metric + alert sketching |
| **Expected outcome** | notes/lab21-metric-sketch-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-metric-sketch-todos.md |
| **Checkpoint** | D (after slides 264–269) |

## What you will learn

- create_success_total / create_failure_total
- Forbidden label: customerId
- Alert + first responder checks logs for lab-request-001

**Enterprise context:** Alerts without a triage path become ignored noise — sketch the action with the counter.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-metric-sketch-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Fill Metric Sketch TODOs

Success: create_success_total / crm.customer.create success
Failure: create_failure_total
Forbidden label: customerId
Alert: CrmCreateFailuresHigh when failure rises above threshold
Action: check logs for lab-request-001

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-metric-sketch-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Fill Metric Sketch TODOs

Success counter: _____
Failure counter: _____
Forbidden label: _____
Alert name: _____
Alert threshold idea: _____
First responder action: _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled metric/alert TODOs in `notes/lab21-metric-sketch-todos.md`.

## Debug / design challenge

Should the alert threshold use a raw forever-total or a rate over N minutes?

## Predict the Output / Behavior

Why must the first responder look at logs instead of metric labels for CUS-1001?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-metric-sketch-todos.md` |
| Using customerId as label | Mark forbidden |
| No responder action | Point to correlation logs |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-metric-sketch-todos.md`
- [ ] Both counters
- [ ] Forbidden label
- [ ] Alert + action
