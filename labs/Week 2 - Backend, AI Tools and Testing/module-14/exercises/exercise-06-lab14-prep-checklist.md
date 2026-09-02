# Exercise 6 — Lab 14 Prep Checklist

**Module 14** · Checkpoint D · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 14 without finishing it now |
| **Skills practiced** | Readiness gate, fixture check |
| **Expected outcome** | notes/lab14-prep-checklist.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-prep-checklist.md |
| **Checkpoint** | D (after slides 144–147) |

## What you will learn

- Gate Lab 14 on completed Ex 1–5 notes
- Fixtures stay Amina/Ravi + correlation id
- Honest scope: no Spring `@Valid` yet

**Enterprise context:** Teams that skip the prep gate burn class time rediscovering entity leaks and missing deps.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 prep checklist

## Earlier exercise files present?
| File | Present? |
| ---- | -------- |
| notes/lab14-entity-vs-dto.md | yes |
| notes/lab14-mapper-no-leak.md | yes |
| notes/lab14-annotate-dto.md | yes |
| notes/lab14-invalid-cases.md | yes |
| notes/lab14-validatorfactory-todos.md | yes |

## Fixtures
CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 14 now.
No Spring @Valid controllers yet.

## Self mark
Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab14-entity-vs-dto.md | _____ |
| notes/lab14-mapper-no-leak.md | _____ |
| notes/lab14-annotate-dto.md | _____ |
| notes/lab14-invalid-cases.md | _____ |
| notes/lab14-validatorfactory-todos.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 14 now.
Spring `@Valid`? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness with honest Spring `@Valid` deferral in `notes/lab14-prep-checklist.md`.

## Debug / design challenge

One notes file is missing — which exercise do you reopen before the OS guide?

## Predict the Output / Behavior

If you mark Pass but still plan to return `Customer` from the facade, what failed the gate?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-prep-checklist.md` |
| Marking Pass with blanks | Fill every yes/no and scope line |
| Starting Lab 14 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-prep-checklist.md`
- [ ] Artifacts confirmed
- [ ] Boundary statement present
- [ ] Pass/Fail marked
