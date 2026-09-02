# Exercise 6 — Backend Slice DoD

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 54–58) |
| **Deliverable** | `notes/lab49-definition-of-done.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · CUS-9999 not-found |

### What you will learn

Write DoD: verify green, failure path, versioned event, demo.md, no secrets.

### Enterprise context

Hard gate before calling the slice ready for Lab 50 UI attachment.

### Predict

Is 'compiles on my laptop' enough for DoD?

### Debug

Starting Lab 51 JWT deep-dive instead of slice DoD — sequence?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| DoD without tests | Require verify + one failure path |
| Angular work now | Lab 50 |

**Module 49** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab49-definition-of-done.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Backend Slice DoD

## Step 1 — Items

API works, migration present, event versioned, tests green, demo notes, no secrets.

## Step 2 — Check the reference

Green demo alone is not enough—peer must reproduce from docs.

## Step 3 — Negative proof

Require one failing-path proof in the DoD.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-definition-of-done.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Backend Slice DoD

## Step 1 — Items

API works, migration present, event versioned, tests green, demo notes, no secrets.

## Step 2 — Check the reference

Green demo alone is not enough—peer must reproduce from docs.

## Step 3 — Negative proof

Require one failing-path proof in the DoD.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

DoD checklist emphasizing reproducibility and negative proof in `notes/lab49-definition-of-done.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-definition-of-done.md` |
| UI work during backend day | Stay on Lab 49 slice |
| Unversioned events | Add eventVersion now |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-definition-of-done.md`
- [ ] DoD items listed
- [ ] Negative proof required
- [ ] Notes saved

