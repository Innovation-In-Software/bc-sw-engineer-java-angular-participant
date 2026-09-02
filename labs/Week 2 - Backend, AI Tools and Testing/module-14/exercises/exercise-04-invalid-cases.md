# Exercise 4 — Invalid Cases Catalog

**Module 14** · Checkpoint D · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Catalog invalid requests you will assert later in Lab 14 |
| **Skills practiced** | Negative-path design, valid control fixture |
| **Expected outcome** | notes/lab14-invalid-cases.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-invalid-cases.md |
| **Checkpoint** | D (after slides 144–147) |

## What you will learn

- Invalid email / blank name fail before service
- Unknown id (CUS-9999) is a not-found story, not a happy path
- Keep one valid control (Ravi-shaped PROSPECT)

**Enterprise context:** QA and contract tests need an explicit invalid catalog — ad hoc typos are not a test plan.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-invalid-cases.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Invalid Cases Catalog

## Step 1 — Create invalids
1. blank fullName
2. invalid email
3. missing activate id / CUS-9999 unknown

## Step 2 — Activate invalids
Activate missing id; activate CUS-9999 unknown.

## Step 3 — Valid control
Control: create Ravi-shaped PROSPECT with non-blank name.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-invalid-cases.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Invalid Cases Catalog

## Step 1 — Create invalids
1. _____
2. _____
3. _____

## Step 2 — Activate invalids
_____

## Step 3 — Valid control
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A negative/positive case list ready for the timed lab in `notes/lab14-invalid-cases.md`.

## Debug / design challenge

Is CUS-9999 a Bean Validation failure or a service/not-found failure? Say which layer.

## Predict the Output / Behavior

If invalid email still reaches `CustomerService`, which facade step was skipped?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-invalid-cases.md` |
| Only happy-path cases | Add at least three invalids + one valid control |
| Using Amina as not-found | Keep Amina valid; use CUS-9999 for unknown |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-invalid-cases.md`
- [ ] At least three invalids
- [ ] One valid control
- [ ] Notes saved
