# Exercise 6 — Plan the CI Stage and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 70–86) |
| **Deliverable** | `notes/lab19-ci-readiness.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Plan a headless CI stage with failure evidence, and set a policy on flaky tests.

### Enterprise context

A red UI build with no screenshot costs more time to diagnose than the test saved by existing.

### Predict

You add automatic retries to make the suite green. What happens to the underlying bug?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No headless flags | Name them; CI runners have no display |
| No failure artifacts | Upload a screenshot and page source |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 19** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-ci-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Plan the CI Stage and Self-Check

## Headless Run

Chrome with --headless=new, --no-sandbox, and a fixed --window-size so layout is deterministic.

## Failure Evidence

On failure, capture a screenshot and the page source and upload both as workflow artifacts.

## Gate Rule

A red UI suite blocks the merge; a flaky test is fixed or removed, never masked with automatic retries.

## Pass Mark

Pass — test-level-map, spring-test-plan, postgres-test-strategy, selectors, and waits are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-ci-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Plan the CI Stage and Self-Check

## Headless Run

_____

## Failure Evidence

_____

## Gate Rule

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Headless flags, a failure-evidence plan, a flakiness policy, and an honest Pass/Fail mark in `notes/lab19-ci-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-ci-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-ci-readiness.md`
- [ ] Headless flags named
- [ ] Screenshot and source uploaded on failure
- [ ] Merge-blocking policy stated
- [ ] All five earlier notes files confirmed complete
