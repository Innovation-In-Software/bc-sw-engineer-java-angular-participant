# Exercise 1 — Select Backend Vertical Slice

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 35–41) |
| **Deliverable** | `notes/lab49-slice-selection.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · CUS-9999 not-found |

### What you will learn

Pick one Lab 48 backlog story (e.g. CAP-12 interaction) as the backend vertical slice.

### Enterprise context

Capstone quality needs one end-to-end slice—not a horizontal pile of unfinished APIs.

### Predict

Why prefer interaction recording for CUS-1001 over 'all customers CRUD'?

### Debug

Starting Angular UI in this warmup — park?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No Lab 48 story | Use CAP-12 equivalent; label assumption |
| Boiling the ocean | One vertical slice only |

**Module 49** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab49-slice-selection.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Select Backend Vertical Slice

## Step 1 — Options

Candidate slices: customer create/read, interaction record, status change + event.

## Step 2 — Check the reference

Slice must include API + persistence + Kafka touch if messaging is in scope.

## Step 3 — Fixtures

Define how `CUS-1001`/`CUS-1002` and `lab-request-001` appear in demos/tests.

## Step 4 — Out of scope

Explicitly list what this slice will not include.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-slice-selection.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Select Backend Vertical Slice

## Step 1 — Options

Candidate slices: customer create/read, interaction record, status change + event.

## Step 2 — Check the reference

Slice must include API + persistence + Kafka touch if messaging is in scope.

## Step 3 — Fixtures

Define how `CUS-1001`/`CUS-1002` and `lab-request-001` appear in demos/tests.

## Step 4 — Out of scope

Explicitly list what this slice will not include.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

One selected slice with in/out scope and fixtures in `notes/lab49-slice-selection.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-slice-selection.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-slice-selection.md`
- [ ] Slice chosen
- [ ] In/out scope listed
- [ ] Fixtures planned

