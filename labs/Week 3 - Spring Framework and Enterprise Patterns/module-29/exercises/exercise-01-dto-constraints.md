# Exercise 1 — DTO Constraint Plan

**Module 29** · Checkpoint A · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | Plan Bean Validation annotations for CustomerRequest fields |
| **Skills practiced** | DTO constraint design |
| **Expected outcome** | notes/dto-constraints.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/dto-constraints.md |
| **Checkpoint** | A (after slides 187–197) |

## What you will learn

- @NotBlank / @Email / @Size on CRM fields
- Constraints on the request DTO, not the entity only
- Invalid email → 400 after @Valid

**Enterprise context:** Partners reject APIs that accept blank names and dump SQL errors later.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/dto-constraints.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — DTO Constraint Plan

| Field | Constraints |
| --- | --- |
| fullName | @NotBlank, @Size |
| email | @NotBlank, @Email |
| status | @NotNull (or allowed values) |

Trigger: @Valid on controller create method.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/dto-constraints.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — DTO Constraint Plan

| Field | Constraints |
| --- | --- |
| fullName | _____ |
| email | _____ |
| status | _____ |

## How triggered
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

DTO constraints in `notes/dto-constraints.md`.

## Debug / design challenge

What happens if annotations exist but @Valid is missing?

## Predict the Output / Behavior

Should uniqueness of CUS-1001 be a Bean Validation annotation or a service rule?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/dto-constraints.md` |
| Putting uniqueness only as @NotNull | Uniqueness stays service/409 |
| No @Valid note | Say how triggered |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/dto-constraints.md`
- [ ] Three fields
- [ ] Trigger noted
