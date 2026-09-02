# Exercise 2 — Trace Observables and Subjects

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 30–44) |
| **Deliverable** | `notes/lab34-observables.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Explain cold subscription, safe cleanup, and why shared state uses BehaviorSubject rather than Subject.

### Enterprise context

An observable nobody subscribed to never runs, which is the real cause of most 'my request never fired' reports.

### Predict

A component subscribes to a `Subject` one tick after it emitted. What does it display?

### Debug

A manual `.subscribe()` in ngOnInit with no cleanup — what accumulates on repeated navigation?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Expecting work without subscribing | Cold observables run on subscribe |
| Manual subscribe, no cleanup | Prefer async pipe or takeUntilDestroyed |
| Subject used for shared state | BehaviorSubject seeds late subscribers |

**Module 34** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-observables.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Trace Observables and Subjects

## Cold Start

Nothing runs at all — a cold observable does no work until something subscribes.

## Cleanup

Use the async pipe so the template manages it, or takeUntilDestroyed() to tie it to the component's life.

## BehaviorSubject

A Subject gives a late subscriber nothing; a BehaviorSubject immediately replays its current value.

## Where It Fits

A search box benefits from a stream — debounced keystrokes over time, not one value.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-observables.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Trace Observables and Subjects

## Cold Start

_____

## Cleanup

_____

## BehaviorSubject

_____

## Where It Fits

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Cold-start behaviour, two cleanup strategies, the Subject distinction, and a stream use case in `notes/lab34-observables.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-observables.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-observables.md`
- [ ] Cold subscription explained
- [ ] Two cleanup approaches named
- [ ] BehaviorSubject difference stated
- [ ] One stream use case given
