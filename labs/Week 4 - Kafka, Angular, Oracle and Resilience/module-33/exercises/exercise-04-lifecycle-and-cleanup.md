# Exercise 4 — Plan Lifecycle and Cleanup

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 49–60) |
| **Deliverable** | `notes/lab33-lifecycle.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Place initialisation and cleanup in the right hooks, and describe the symptom of skipping cleanup.

### Enterprise context

A subscription never released keeps running after the view is gone, so every revisit adds another live handler.

### Predict

You read an `@Input()` in the constructor. What value do you get?

### Debug

Navigating away and back doubles the network requests each time. Which hook is missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Data loaded in the constructor | Inputs are not set yet; use ngOnInit |
| No cleanup named | Release subscriptions and timers in ngOnDestroy |
| *ngIf not compiling | Standalone components must import CommonModule |

**Module 33** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-lifecycle.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Plan Lifecycle and Cleanup

## Standalone Imports

A standalone component sets standalone: true and lists CommonModule in its imports array.

## Init Work

ngOnInit does the initial load and reads @Input values, which are undefined during the constructor.

## Destroy Work

ngOnDestroy releases subscriptions and clears any interval the component started.

## Leak Symptom

Skipping it means each revisit adds another live handler — duplicated requests, then a UI that grows slower.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-lifecycle.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Plan Lifecycle and Cleanup

## Standalone Imports

_____

## Init Work

_____

## Destroy Work

_____

## Leak Symptom

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Standalone imports, hook placement with reasons, a cleanup obligation, and the leak symptom in `notes/lab33-lifecycle.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-lifecycle.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-lifecycle.md`
- [ ] Standalone imports explained
- [ ] ngOnInit vs constructor justified
- [ ] A cleanup obligation named
- [ ] Leak symptom described
