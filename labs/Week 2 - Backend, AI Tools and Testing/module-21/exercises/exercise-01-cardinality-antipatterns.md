# Exercise 1 — Cardinality Anti-Patterns

**Module 21** · Checkpoint A · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Reject labels that explode time-series for Northstar traffic |
| **Skills practiced** | Metric label hygiene |
| **Expected outcome** | notes/lab21-cardinality-antipatterns.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-cardinality-antipatterns.md |
| **Checkpoint** | A (after slides 255–260) |

## What you will learn

- outcome=success|failure is OK
- customerId / correlationId as labels = no
- Ids belong in logs/traces

**Enterprise context:** One label per customerId can create millions of Prometheus series and take down scrapers.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-cardinality-antipatterns.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Cardinality Anti-Patterns

| Label | OK? |
| --- | --- |
| outcome=success|failure | yes |
| customerId=CUS-1001 | no |
| correlationId=lab-request-001 | no — use logs |

Ids go in logs/traces. Good metric: crm.customer.create with outcome tag.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-cardinality-antipatterns.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Cardinality Anti-Patterns

| Label | OK? |
| --- | --- |
| outcome=success|failure | _____ |
| customerId=CUS-1001 | _____ |
| correlationId=lab-request-001 | _____ |

## Where ids go
_____

## Good metric sketch
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Cardinality table in `notes/lab21-cardinality-antipatterns.md`.

## Debug / design challenge

Rewrite metric customer_create{customerId="CUS-1001"} into a safe design.

## Predict the Output / Behavior

Is status=ACTIVE|PROSPECT always safe as a label? When might it still hurt?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-cardinality-antipatterns.md` |
| Allowing customerId labels | Mark no — high cardinality |
| Skipping where-ids-go | Send ids to logs/traces |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-cardinality-antipatterns.md`
- [ ] Three label rows
- [ ] Ids placement noted
- [ ] Good metric sketched
