# Exercise 4 — Fill Activate Interaction Sequence TODOs

**Module 18** · Checkpoint C · Exercises 1–6 Pass then Lab 18

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for the activate interaction sequence |
| **Skills practiced** | Interaction sequencing |
| **Expected outcome** | notes/lab18-activate-interaction-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-18-exercises/` → notes/lab18-activate-interaction-todos.md |
| **Checkpoint** | C (after slides 210–213) |

## What you will learn

- stub findById(CUS-1002) → activate → verify save → assert ACTIVE
- Captor proves saved status ACTIVE
- Optional notifier verify if present

**Enterprise context:** Ops demos fail when save is skipped after a successful-looking activate return.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab18-activate-interaction-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Fill Activate Interaction Sequence TODOs

1) stub findById(CUS-1002) → ravi PROSPECT
2) call service.activate(…)
3) verify repo.save(customer)
4) verify notifier.notifyActivated(…) // if present
5) assert status ACTIVE
6) ArgumentCaptor status ACTIVE

Captors prove saved Customer carried ACTIVE.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-activate-interaction-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Fill Activate Interaction Sequence TODOs

1) stub findById(_____) → ravi PROSPECT
2) call service._____(…)
3) verify repo._____(customer)
4) verify notifier._____(…) // if present
5) assert status _____
6) ArgumentCaptor status field _____

## Captor sentence
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled activate sequence in `notes/lab18-activate-interaction-todos.md`.

## Debug / design challenge

Insert never().save into a not-found variant of this sequence.

## Predict the Output / Behavior

If step 3 verify fails with Wanted but not invoked, which earlier stub is the first suspect?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-activate-interaction-todos.md` |
| Using Amina as happy-path id | Use CUS-1002 Ravi |
| Skipping captor status | Fill ACTIVE on captor step |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-activate-interaction-todos.md`
- [ ] All _____ replaced
- [ ] CUS-1002 present
- [ ] Captor sentence present
