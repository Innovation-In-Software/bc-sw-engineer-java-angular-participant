# Exercise 3 — Write the Error Contract

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 48–53) |
| **Deliverable** | `notes/lab13-error-contract.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT · CUS-9999 not found |

### What you will learn

Fix one error envelope with a machine-readable code and a correlation id, and rule out leaking internals.

### Enterprise context

Without one error shape, every client writes bespoke parsing for every endpoint, and support cannot trace a reported failure.

### Predict

Your 404 and 400 bodies have different shapes. What does the Angular error interceptor have to do?

### Debug

An error body contains a Hibernate stack trace — name two things an attacker learns.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Different shape per endpoint | One envelope for every error |
| No machine-readable code | Clients should switch on code, not message text |
| Stack trace included | Never expose traces, SQL, or hostnames |

**Module 13** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-error-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Write the Error Contract

## Error Fields

Every error returns timestamp, status, code, message, and path.

## Correlation

correlationId echoes the inbound X-Correlation-Id header, defaulting to a generated value.

## Two Examples

404 gives code CUSTOMER_NOT_FOUND for CUS-9999; 400 gives VALIDATION_FAILED listing the offending fields.

## Leak Check

Never included: stack traces, raw SQL, internal hostnames, or another customer's data.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-error-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Write the Error Contract

## Error Fields

_____

## Correlation

_____

## Two Examples

_____

## Leak Check

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

One error envelope with a code and correlation id, two worked examples, and a leak rule in `notes/lab13-error-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-error-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-error-contract.md`
- [ ] Error fields defined once
- [ ] Correlation id and its header named
- [ ] 404 and 400 examples written
- [ ] Leak rule stated
