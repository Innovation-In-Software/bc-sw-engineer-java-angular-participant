# Exercise 5 — Sketch the OpenAPI Skeleton

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 58–65) |
| **Deliverable** | `notes/lab13-openapi-skeleton.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT · CUS-9999 not found |

### What you will learn

Sketch the OpenAPI document structure, two paths, and the Customer schema before writing any YAML.

### Enterprise context

A contract written first can be reviewed and mocked by the frontend team while the backend is still being built.

### Predict

You type `status` as a free-text string. Which invalid values now pass validation?

### Debug

`id` is typed as integer but the fixture is CUS-1001. What fails, and where?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Schema types guessed | Match the fixtures: id is a string, status is an enum |
| Only one path sketched | Cover both collection and item |
| components section missing | Reuse Customer and ErrorResponse schemas |

**Module 13** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-openapi-skeleton.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Sketch the OpenAPI Skeleton

## Top-Level Keys

openapi, info, servers, paths, and components.

## Two Paths

/customers with get and post; /customers/{id} with get, put, and delete.

## Customer Schema

Customer: id string (CUS-1001), name string, email string, status enum of ACTIVE and PROSPECT.

## API-First

Writing the contract first lets the Angular team review and mock it before any controller exists.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-openapi-skeleton.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Sketch the OpenAPI Skeleton

## Top-Level Keys

_____

## Two Paths

_____

## Customer Schema

_____

## API-First

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A document outline, two sketched paths, a fixture-accurate Customer schema, and the API-first rationale in `notes/lab13-openapi-skeleton.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-openapi-skeleton.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-openapi-skeleton.md`
- [ ] Top-level sections listed
- [ ] Both paths with their operations
- [ ] Customer schema matches the fixtures
- [ ] API-first rationale written
