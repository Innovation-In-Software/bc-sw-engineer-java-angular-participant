# Exercise 2 — Mapper No-Leak Rule

**Module 14** · Checkpoint B · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch toDto/toEntity rules that keep internals out of API responses |
| **Skills practiced** | Manual mapping, request vs response shapes |
| **Expected outcome** | notes/lab14-mapper-no-leak.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-mapper-no-leak.md |
| **Checkpoint** | B (after slides 136–138) |

## What you will learn

- toDto maps only contract fields (id, fullName, status)
- Forbidden: hashes, risk scores, persistence-only columns
- Activate request is narrow; Lab 15 owns deep transitions

**Enterprise context:** Integration partners break when mappers copy every entity field into JSON/XML by habit.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-mapper-no-leak.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Mapper No-Leak Rule

## Step 1 — toDto
Map only id, fullName, status for CUS-1001 responses.

## Step 2 — Forbidden
List forbidden: password hashes, internal risk scores, raw SQL ids if different.

## Step 3 — Activate DTO
Activate request carries customerId only (+ correlation header outside body).

## Step 4 — Prep boundary
Write: *DTOs before deep service rules — Lab 15 owns transitions.*

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-mapper-no-leak.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Mapper No-Leak Rule

## Step 1 — toDto
CUS-1001 response fields: _____

## Step 2 — Forbidden
1. _____
2. _____

## Step 3 — Activate DTO
Body fields: _____ · Correlation: _____

## Step 4 — Prep boundary
Lab that owns deep transitions: _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Mapper rules with Lab 15 boundary stated in `notes/lab14-mapper-no-leak.md`.

## Debug / design challenge

toEntity copies a client-supplied `status=ACTIVE` on create — is that a leak or a business-rule problem? Name which lab deepens it.

## Predict the Output / Behavior

Does mapping `null` email to empty string hide a validation failure?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-mapper-no-leak.md` |
| Mapping every entity field | Whitelist contract fields only |
| Claiming MapStruct is required | Lab 14 uses manual mapper |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-mapper-no-leak.md`
- [ ] toDto fields listed
- [ ] Forbidden fields listed
- [ ] Lab 15 deferral noted
