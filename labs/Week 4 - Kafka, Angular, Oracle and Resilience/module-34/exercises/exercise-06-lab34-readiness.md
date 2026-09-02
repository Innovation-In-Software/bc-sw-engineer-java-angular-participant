# Exercise 6 — Plan UI States and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 72–90) |
| **Deliverable** | `notes/lab34-readiness.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Define three visually distinct UI states and confirm the earlier deliverables are complete.

### Enterprise context

Empty and error rendering identically means neither the user nor the person triaging the report can tell them apart.

### Predict

Loading and empty both render nothing. What does the user conclude on a slow connection?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| States render identically | Distinct text and an action for each |
| Error state silent | Show a banner with retry |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 34** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Plan UI States and Self-Check

## Three States

Loading shows a spinner and no list; empty shows a message with a clear-filter action; error shows a banner with retry.

## Tell Them Apart

Empty says no customers match this filter; error says something went wrong and offers retry — different words, different actions.

## Re-render Check

Calling a filter method from the template re-runs it on every check; a computed signal recalculates only on dependency change.

## Pass Mark

Pass — signal-state, observables, signals-vs-rxjs, event-flow, and form-plan are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Plan UI States and Self-Check

## Three States

_____

## Tell Them Apart

_____

## Re-render Check

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three distinct states, a user-facing distinction, a re-render fix, and an honest Pass/Fail mark in `notes/lab34-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-readiness.md`
- [ ] Loading, empty, and error each described
- [ ] User can distinguish empty from error
- [ ] One re-render cause and fix named
- [ ] All five earlier notes files confirmed complete
