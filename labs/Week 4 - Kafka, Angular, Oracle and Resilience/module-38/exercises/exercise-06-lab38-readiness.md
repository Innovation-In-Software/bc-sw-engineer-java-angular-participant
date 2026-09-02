# Exercise 6 — Plan the Tuning Evidence

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 87–94) |
| **Deliverable** | `notes/lab38-readiness.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Fix a measure-change-measure workflow with credible evidence, one change at a time.

### Enterprise context

Two changes between measurements means you cannot tell which one helped, so both stay forever.

### Predict

You add an index and rewrite the query together, and it gets faster. Which change did it?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Tuning before measuring | Baseline first, always |
| Evidence without plans | Record the plan, rows, timing, and buffers |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 38** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Plan the Tuning Evidence

## Workflow

Measure a baseline with EXPLAIN (ANALYZE, BUFFERS), make one change, measure again, keep it only if it helped.

## Evidence Pair

Both runs record the query text, plan shape, actual rows, timing, and buffer counts.

## One Change

With two changes at once, an improvement cannot be attributed, so an unhelpful change survives and costs writes.

## Pass Mark

Pass — queries, index-selectivity, read-plan, antipatterns, and pagination are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Plan the Tuning Evidence

## Workflow

_____

## Evidence Pair

_____

## One Change

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The tuning loop, an evidence standard, the one-change rule, and an honest Pass/Fail mark in `notes/lab38-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-readiness.md`
- [ ] Workflow starts with measurement
- [ ] Evidence contents specified
- [ ] One-change rule justified
- [ ] All five earlier notes files confirmed complete
