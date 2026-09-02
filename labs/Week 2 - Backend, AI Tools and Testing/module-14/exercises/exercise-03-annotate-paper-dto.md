# Exercise 3 — Annotate Paper DTO

**Module 14** · Checkpoint C · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Mark required/optional Bean Validation constraints on a paper CreateCustomerRequest |
| **Skills practiced** | @NotNull / @NotBlank / @Email / @Size naming (paper only) |
| **Expected outcome** | notes/lab14-annotate-dto.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-annotate-dto.md |
| **Checkpoint** | C (after slides 139–143) |

## What you will learn

- @NotBlank vs @NotNull for strings
- Paper annotations document the contract before wiring Spring
- Correlation stays in headers/logs, not as a business DTO field

**Enterprise context:** Contract docs that name annotations make later `@Valid` / OpenAPI work faster and less ambiguous.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-annotate-dto.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Annotate Paper DTO

## Reference
| Field | Constraint idea |
| --- | --- |
| fullName | @NotBlank + @Size |
| email | @Email (if present) |
| status | optional on create; default PROSPECT |
| customerId | server-assigned or pattern |

## Step 2 — Paper annotations
Write pseudo annotation names — documentation only.

## Step 3 — No Spring yet
Do not wire `@Valid` on a controller in this pre-lab.

## Step 4 — Correlation
`lab-request-001` stays in headers/logs.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-annotate-dto.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Annotate Paper DTO

## Reference
| Field | Constraint / annotation |
| --- | --- |
| fullName | _____ |
| email | _____ |
| status | _____ |
| customerId | _____ |

## Step 2 — Paper annotations
List annotation names you would use: _____

## Step 3 — No Spring yet
Spring `@Valid` in this pre-lab? _____

## Step 4 — Correlation
Where does `lab-request-001` live? _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Paper DTO constraints without live Spring validation in `notes/lab14-annotate-dto.md`.

## Debug / design challenge

`@NotNull` on a String still allows `"   "` — which annotation closes that gap?

## Predict the Output / Behavior

Will `@Email` accept an empty string if the field is optional?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-annotate-dto.md` |
| Wiring a Spring controller | Paper annotations only; Lab 14 uses ValidatorFactory |
| Putting correlation in the DTO body | Keep it in headers/logs |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-annotate-dto.md`
- [ ] Constraint table filled
- [ ] No `@Valid` wiring claimed
- [ ] Correlation placement noted
