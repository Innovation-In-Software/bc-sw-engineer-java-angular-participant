# Exercise 1 — AAA Service Tests Plan

**Module 17** · Checkpoint A · Exercises 1–6 Pass then Lab 17

## Activity card

| | |
| --- | --- |
| **Objective** | Outline three AAA service tests you will write in Lab 17 |
| **Skills practiced** | Arrange-Act-Assert planning |
| **Expected outcome** | notes/lab17-aaa-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-17-exercises/` → notes/lab17-aaa-plan.md |
| **Checkpoint** | A (after slides 186–190) |

## What you will learn

- Happy path: activate Ravi PROSPECT→ACTIVE
- Not found: CUS-9999 throws
- Illegal: Amina ACTIVE transition rejected

**Enterprise context:** Service tests are the fastest safety net for CRM status rules before UI or HTTP layers.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab17-aaa-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — AAA Service Tests Plan

## Happy path
AAA for activate Ravi PROSPECT → ACTIVE.

## Not found
AAA for CUS-9999 throws not found.

## Illegal
AAA for illegal transition on Amina ACTIVE.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-aaa-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — AAA Service Tests Plan

## Happy path (Arrange / Act / Assert)
_____

## Not found
_____

## Illegal
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three AAA outlines in `notes/lab17-aaa-plan.md`.

## Debug / design challenge

If Arrange reuses a static repo across tests, which flaky symptom appears?

## Predict the Output / Behavior

Does Act for illegal Amina call activate or changeStatus to PROSPECT?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-aaa-plan.md` |
| Only happy path listed | Add not-found and illegal |
| Starting the full lab mid-exercise | Finish pre-lab notes first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-aaa-plan.md`
- [ ] Happy path AAA
- [ ] Not-found AAA
- [ ] Illegal AAA
