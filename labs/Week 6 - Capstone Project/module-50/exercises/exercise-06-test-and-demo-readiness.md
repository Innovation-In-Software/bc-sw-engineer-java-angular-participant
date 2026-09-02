# Exercise 6 — Plan Tests and Demo Evidence

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 64–90) |
| **Deliverable** | `notes/lab50-test-demo-readiness.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Name a three-level test matrix with a real failure case, plus the demo evidence Lab 50 grades.

### Enterprise context

An all-happy-path matrix passes CI and still ships an app whose error states were never rendered once.

### Predict

Your matrix has no failure case. Which of your Exercise 3 UI states was never exercised?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| All happy-path tests | Add at least one failure scenario |
| Demo evidence unnamed | Name the screenshot files and the notes file |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 50** · Capstone pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-test-demo-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Plan Tests and Demo Evidence

## Test Matrix

Unit: CustomerService maps a 404 to the empty state. Repository: interaction history for CUS-1001 returns rows newest-first. Selenium: create, read, edit CUS-1001.

## Failing Case

Failure case: requesting CUS-9999 renders the not-found empty-state card, not a blank list.

## Demo Evidence

Evidence: notes/lab-50/ holds list, detail, and error captures; docs/frontend-persistence-demo.md narrates them.

## Pass Mark

Pass — feature-route-map, api-client-contract, jwt-error-states, schema-migrations, and e2e-crud-trace are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-test-demo-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Plan Tests and Demo Evidence

## Test Matrix

_____

## Failing Case

_____

## Demo Evidence

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-level test matrix with a failure case, named demo evidence, and an honest Pass/Fail roll-call in `notes/lab50-test-demo-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-test-demo-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-test-demo-readiness.md`
- [ ] Unit, repository, and Selenium scenarios named
- [ ] At least one failure case included
- [ ] Demo screenshots and notes file named
- [ ] All five earlier notes files confirmed complete
