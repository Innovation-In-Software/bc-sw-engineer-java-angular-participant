# Exercise 2 — Meaningful Asserts

**Module 17** · Checkpoint B · Exercises 1–6 Pass then Lab 17

## Activity card

| | |
| --- | --- |
| **Objective** | Rewrite weak asserts into status/id assertions for fixtures |
| **Skills practiced** | Assertion quality, assertThrows |
| **Expected outcome** | notes/lab17-meaningful-asserts.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-17-exercises/` → notes/lab17-meaningful-asserts.md |
| **Checkpoint** | B (after slides 191–192) |

## What you will learn

- assertNotNull alone is weak
- Assert CUS-1002 + ACTIVE after activate
- assertThrows for illegal Amina policy

**Enterprise context:** Green bars with empty asserts hide production defects — partners still break.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab17-meaningful-asserts.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — Meaningful Asserts

Weak: assertNotNull(result) after activate.
Strong: assertEquals CUS-1002 and ACTIVE.
Exception: assertThrows(BusinessException) for Amina illegal.
Prepare for Lab 17; do not complete full suite now.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-meaningful-asserts.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — Meaningful Asserts

## Weak
_____

## Strong (Ravi)
_____

## Exception assert (Amina)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Weak→strong rewrite in `notes/lab17-meaningful-asserts.md`.

## Debug / design challenge

Rewrite assertTrue(true) after activate into two meaningful asserts.

## Predict the Output / Behavior

Should you assert Exception.class or BusinessException.class for not-found?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-meaningful-asserts.md` |
| Keeping only assertNotNull | Add id/status asserts |
| Claiming Mockito required | Real collaborators OK until Lab 18 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-meaningful-asserts.md`
- [ ] Weak labeled
- [ ] Strong asserts listed
- [ ] assertThrows planned
