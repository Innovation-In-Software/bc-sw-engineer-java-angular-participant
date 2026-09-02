# Exercise 4 — Trace Event Flow Upward

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 52–58) |
| **Deliverable** | `notes/lab34-event-flow.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Trace a user event from template to state change, and decide who owns the update.

### Enterprise context

When any component can write shared state, a UI that changes unexpectedly has no single place to debug.

### Predict

The row component calls `selectedId.set()` itself. Where do you look when the wrong row highlights?

### Debug

A grandchild's event never reaches the grandparent. What is missing at the middle level?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Child writes shared state | Emit upward; the owner sets it |
| Payload untyped | Type the EventEmitter |
| Grandchild event lost | Re-emit at each level or share a service signal |

**Module 34** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-event-flow.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Trace Event Flow Upward

## Event Chain

(click) in the row template → selected.emit(customer) → parent's onSelect → selectedId.set(customer.id).

## Custom Event

@Output() selected = new EventEmitter<Customer>() — the payload is the whole customer.

## Who Owns State

The parent owns selectedId and is the only writer, so every change has one traceable origin.

## Two Levels Up

Either re-emit through the middle component, or move the signal into a service both levels inject.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-event-flow.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Trace Event Flow Upward

## Event Chain

_____

## Custom Event

_____

## Who Owns State

_____

## Two Levels Up

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A traced event chain, a typed output, a stated ownership rule, and a grandchild strategy in `notes/lab34-event-flow.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-event-flow.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-event-flow.md`
- [ ] Event chain traced end to end
- [ ] Output typed
- [ ] State ownership justified
- [ ] Grandchild case answered
