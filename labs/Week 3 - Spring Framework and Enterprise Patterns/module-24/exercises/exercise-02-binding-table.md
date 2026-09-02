# Exercise 2 — Bind Path, Query and Body

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 23–30) |
| **Deliverable** | `notes/lab24-binding-table.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Map each handler input to the right binding annotation and make the optional filter genuinely optional.

### Enterprise context

A required-by-default query parameter turns a plain list request into a 400 the first time a client omits it.

### Predict

`list` declares `@RequestParam String status` with no default. What does GET /api/customers return?

### Debug

A create request returns 415. What is wrong with the request, not the code?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Filter has no default | Add defaultValue or required=false |
| DTO lacks a no-arg constructor | Jackson needs one to deserialize |
| Content-Type omitted | Send application/json or expect 415 |

**Module 24** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-binding-table.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Bind Path, Query and Body

## Binding Table

getOne binds @PathVariable id; list binds @RequestParam status; create binds @RequestBody CustomerDto.

## Optional Filter

status uses @RequestParam(defaultValue = "") so an absent filter returns the full list.

## Jackson Mapping

Jackson needs a no-arg constructor, accessible fields or setters, and Content-Type: application/json.

## Wrong Type

An unconvertible parameter produces a 400 from Spring's type conversion, before the method body runs.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-binding-table.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Bind Path, Query and Body

## Binding Table

_____

## Optional Filter

_____

## Jackson Mapping

_____

## Wrong Type

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A per-handler binding table, a defaulted filter, Jackson's requirements, and the wrong-type behaviour in `notes/lab24-binding-table.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-binding-table.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-binding-table.md`
- [ ] Each input mapped to its annotation
- [ ] Filter defaulted or marked not required
- [ ] Jackson requirements named
- [ ] Conversion failure behaviour stated
