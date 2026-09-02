# Exercise 3 — Render Every UI State

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 40–50) |
| **Deliverable** | `notes/lab35-ui-states.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Use the async pipe correctly and give loading, empty, and error their own template branches.

### Enterprise context

Without distinct branches, a failed request and an empty result look identical to the user and to support.

### Predict

Nothing appears in the Network tab. What does that tell you about subscription?

### Debug

You subscribe manually in ngOnInit and never unsubscribe. What accumulates?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Manual subscribe by default | Prefer the async pipe for cleanup |
| Empty and error share a branch | Give each its own message and action |
| No mapping step | Transform once, near the service |

**Module 35** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-ui-states.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Render Every UI State

## Async Pipe

The async pipe subscribes, renders each emission, and unsubscribes automatically on destroy.

## Three States

Loading shows a spinner; error shows a banner with retry; zero rows shows a no-matches message; otherwise the list.

## Cold Reminder

A cold observable does no work until subscribed, so with no subscriber there is no network request at all.

## Map Step

map the Page<Customer> envelope down to its content array before the view binds to it.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-ui-states.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Render Every UI State

## Async Pipe

_____

## Three States

_____

## Cold Reminder

_____

## Map Step

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The async-pipe rationale, three template branches, the cold-observable point, and a mapping step in `notes/lab35-ui-states.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-ui-states.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-ui-states.md`
- [ ] Async pipe behaviour stated
- [ ] Three branches described
- [ ] Cold-observable diagnostic named
- [ ] One mapping transformation given
