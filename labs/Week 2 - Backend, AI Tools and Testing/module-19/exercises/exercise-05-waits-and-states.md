# Exercise 5 — Plan Waits and UI States

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 52–68) |
| **Deliverable** | `notes/lab19-waits.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Replace fixed sleeps with explicit wait conditions and write a test that proves the error state renders.

### Enterprise context

A fixed sleep is too slow on a fast machine and too short on a loaded CI runner — it fails both ways.

### Predict

Your suite uses `Thread.sleep(3000)` in twelve places. What is the cost per CI run?

### Debug

A test passes locally and fails in CI roughly one run in five. What is the likely cause?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Fixed sleeps used | Wait on a condition, not a duration |
| Waiting on the wrong thing | Wait for the spinner to disappear, not appear |
| Error test asserts no crash | Assert the banner and its message are visible |

**Module 19** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-waits.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Plan Waits and UI States

## Sleep vs Wait

A fixed sleep wastes time when the app is fast and fails when it is slow; an explicit wait returns as soon as the condition holds.

## Wait Conditions

Wait for visibility of [data-testid='customer-list'], and for invisibility of [data-testid='loading'].

## Error State Test

Stub or trigger a failing request, then assert [data-testid='error-banner'] is visible and shows the retry action.

## Form Journey

Open the form, fill name and email, click save, wait for the list, and assert the new row is present.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-waits.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Plan Waits and UI States

## Sleep vs Wait

_____

## Wait Conditions

_____

## Error State Test

_____

## Form Journey

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The sleep-versus-wait argument, two wait conditions, an error-state assertion, and a form journey in `notes/lab19-waits.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-waits.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-waits.md`
- [ ] Sleep failure explained in both directions
- [ ] Two explicit wait conditions given
- [ ] Error test asserts visible state
- [ ] Form journey steps listed
