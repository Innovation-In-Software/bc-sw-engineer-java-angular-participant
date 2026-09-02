# Exercise 4 — Plan Collections and Versioning

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 54–57) |
| **Deliverable** | `notes/lab13-collection-versioning.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT · CUS-9999 not found |

### What you will learn

Decide the collection query parameters, the list envelope, and a versioning strategy with a breaking-change rule.

### Enterprise context

Returning a bare array makes paging impossible for the client, and an unversioned API cannot evolve without breaking consumers.

### Predict

The list returns a plain JSON array. How does the UI know whether a page 2 exists?

### Debug

You rename `name` to `fullName` in the response. Which existing clients still work?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Bare array returned | Wrap rows with paging metadata |
| No defaults given | State default page and size |
| Version strategy unjustified | Give the reason, not just the choice |

**Module 13** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-collection-versioning.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Plan Collections and Versioning

## Query Parameters

page (default 0), size (default 20, max 100), sort as field,direction, and status as an optional filter.

## Response Envelope

content plus page, size, totalElements, and totalPages so the client can render a pager.

## Version Choice

URI versioning as /api/v1/... — visible in logs and trivially routable, which suits this cohort's tooling.

## Breaking Change

Breaking: removing or renaming a field, or changing its type. Non-breaking: adding an optional field.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-collection-versioning.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Plan Collections and Versioning

## Query Parameters

_____

## Response Envelope

_____

## Version Choice

_____

## Breaking Change

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Query parameters with defaults, a paging envelope, a justified version strategy, and a breaking-change rule in `notes/lab13-collection-versioning.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-collection-versioning.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-collection-versioning.md`
- [ ] Page, size, sort, filter named with defaults
- [ ] List envelope includes paging metadata
- [ ] Versioning choice justified
- [ ] Breaking vs non-breaking examples given
