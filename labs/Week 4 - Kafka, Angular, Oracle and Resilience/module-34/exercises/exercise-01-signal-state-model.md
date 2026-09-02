# Exercise 1 — Model State with Signals

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–28) |
| **Deliverable** | `notes/lab34-signal-state.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Model screen state as signals and derive the filtered list as a computed rather than a stored field.

### Enterprise context

A hand-maintained derived list drifts the moment someone adds a second way to change the source data.

### Predict

You store `filteredCustomers` as a field and update it in the filter handler. Which update path gets forgotten?

### Debug

The template shows `[object Object]` instead of rows. What is missing from the expression?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Derived list stored, not computed | Use computed() so it cannot go stale |
| Signal read without parentheses | customers is the signal, customers() the value |
| Everything in one signal | Separate data, filter, and loading |

**Module 34** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-signal-state.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Model State with Signals

## State List

customers: Customer[], filter: string, loading: boolean — three separate signals.

## Read and Write

Template reads visible(); the handler calls filter.set(inputValue) to update.

## Computed

visible = computed(() => customers().filter(c => c.name.includes(filter()))).

## Why Not a Field

A signal notifies Angular exactly what depends on it, so the view updates without a manual trigger.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-signal-state.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Model State with Signals

## State List

_____

## Read and Write

_____

## Computed

_____

## Why Not a Field

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A named signal list, read/write examples, a computed derived list, and the signal rationale in `notes/lab34-signal-state.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-signal-state.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-signal-state.md`
- [ ] Signals named for data, filter, and loading
- [ ] Read and update shown
- [ ] Filtered list is computed
- [ ] Signal advantage stated
