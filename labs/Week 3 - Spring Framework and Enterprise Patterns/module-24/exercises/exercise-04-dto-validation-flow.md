# Exercise 4 — Trace DTO, Validation and Errors

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 40–47) |
| **Deliverable** | `notes/lab24-validation-flow.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Keep the controller thin: bind, validate, delegate, map — and let a global handler translate exceptions.

### Enterprise context

Business logic in a controller cannot be reused by a scheduler or a Kafka consumer, and is far harder to test.

### Predict

Validation logic is written inline in the handler. What happens when a Kafka consumer needs the same rule?

### Debug

Every handler has its own try/catch. How many error shapes does the client now see?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Business rules in the controller | Delegate to the service |
| Entity returned directly | Return a DTO to insulate the schema |
| try/catch per handler | One global handler produces one error shape |

**Module 24** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-validation-flow.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Trace DTO, Validation and Errors

## Layer Boundary

The controller binds input, applies @Valid, delegates to the service, and maps the result to a status. Rules and transactions belong to the service.

## DTO vs Entity

A DTO stops schema changes from becoming breaking API changes and keeps lazy-loading out of serialization.

## Validation Trigger

@Valid on the @RequestBody triggers Bean Validation; a failure becomes a 400 carrying the error envelope.

## Exception Path

The service throws CustomerNotFoundException; a global handler maps it to 404 with code CUSTOMER_NOT_FOUND — the controller catches nothing.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-validation-flow.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Trace DTO, Validation and Errors

## Layer Boundary

_____

## DTO vs Entity

_____

## Validation Trigger

_____

## Exception Path

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A stated layer boundary, a DTO rationale, the validation trigger and status, and the exception path in `notes/lab24-validation-flow.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-validation-flow.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-validation-flow.md`
- [ ] Controller vs service split written
- [ ] DTO rationale given
- [ ] @Valid and 400 named
- [ ] Exception path traced to a global handler
