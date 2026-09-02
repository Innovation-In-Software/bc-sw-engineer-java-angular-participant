# Exercise 4 — Clear MDC Finally Drill

**Module 20** · Checkpoint C · Exercises 1–6 Pass then Lab 20

## Activity card

| | |
| --- | --- |
| **Objective** | Document why uncleared MDC corrupts the next CRM request on a thread |
| **Skills practiced** | Thread-local leak awareness |
| **Expected outcome** | notes/lab20-mdc-clear.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-20-exercises/` → notes/lab20-mdc-clear.md |
| **Checkpoint** | C (after slides 245–247) |

## What you will learn

- Request A sets lab-request-001; without clear, B inherits it
- Filter finally clears MDC
- IT idea: assert MDC empty after request

**Enterprise context:** Thread pools reuse threads — MDC leaks look like “wrong customer” in prod logs.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab20-mdc-clear.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Clear MDC Finally Drill

Bug: Request A sets lab-request-001; without clear, request B logs wrong correlation.
Fix: Filter finally clears MDC.
Test idea: assert MDC empty after request.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-mdc-clear.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Clear MDC Finally Drill

## Bug story
_____

## Fix
_____

## Test idea
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear-MDC drill notes in `notes/lab20-mdc-clear.md`.

## Debug / design challenge

If an exception skips the happy path return, which block still must clear MDC?

## Predict the Output / Behavior

Static String CORRELATION = lastSeen — why is that worse than MDC?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-mdc-clear.md` |
| No bug story | Describe A→B leak |
| Clear only on success | Use finally |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-mdc-clear.md`
- [ ] Bug story
- [ ] Fix noted
- [ ] Test idea present
