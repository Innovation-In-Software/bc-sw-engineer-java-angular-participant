# Exercise 5 — Split Smart and Presentational

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 61–72) |
| **Deliverable** | `notes/lab33-component-map.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Classify components as smart or presentational and place them with a repeatable reuse test.

### Enterprise context

A presentational component that injects a service can no longer be reused or tested in isolation.

### Predict

CustomerRow starts injecting CustomerService. What can you no longer do with it?

### Debug

Your shared/ folder contains a component that imports the Customer model. Right place?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Everything marked smart | Row components take inputs and stay dumb |
| shared/ used as a junk drawer | Apply the second-feature test |
| Trying to fetch data | No HttpClient until Module 35 — hard-code fixtures |

**Module 33** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-component-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Split Smart and Presentational

## Classify

CustomerListPage is smart: it injects services and owns state. CustomerRow is presentational: inputs in, events out.

## Folder Map

features/customers/{customer-list-page, customer-row, customers.routes.ts}; shared/{loading-spinner, error-banner}.

## Reuse Test

If a second feature would use it unchanged, it goes in shared; if it knows about customers, it stays in the feature.

## Fixtures

Amina CUS-1001 and Ravi CUS-1002 come from a hard-coded array in the smart component — no API until Module 35.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-component-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Split Smart and Presentational

## Classify

_____

## Folder Map

_____

## Reuse Test

_____

## Fixtures

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A smart/presentational classification, a folder tree, the reuse test, and the fixture source in `notes/lab33-component-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-component-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-component-map.md`
- [ ] Both components classified with reasons
- [ ] Folder tree written
- [ ] Reuse test stated
- [ ] Fixture source named
