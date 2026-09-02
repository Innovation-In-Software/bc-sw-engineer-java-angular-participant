# Exercise 1 — Target API Sketch

**Module 12** · Checkpoint A · Exercises 1–6 Pass then Lab 12

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch the post-cleanup CustomerService API (create/get/updateStatus) |
| **Skills practiced** | Naming, method design, target API planning |
| **Expected outcome** | notes/lab12-target-api-sketch.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-12-exercises/` → notes/lab12-target-api-sketch.md |
| **Checkpoint** | A (after slides 94–99) |

## What you will learn

- Refactor toward intentional method names, not doStuff
- Sketch the API before rewriting the body
- Keep REST hosting / Spring out of this cleanup lab

**Enterprise context:** CRM refactors start with a named contract so reviews stay comparable.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab12-target-api-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Target API Sketch

## Step 1 — Methods

List: findById, activateProspect, maybe validateStatus — Write in this notes file.

## Step 2 — Ravi path

Note activateProspect(CUS-1002) moves PROSPECT → ACTIVE.

## Step 3 — Keep out

Explicitly exclude REST endpoints and Spring controllers from this sketch.

## Step 4 — Prep boundary

Write: *Do not complete full Lab 12 refactor in pre-lab.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-target-api-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Target API Sketch

## Step 1 — Methods

List: findById, activateProspect, maybe validateStatus — Write in this notes file.

## Step 2 — Ravi path

Note activateProspect(CUS-1002) moves PROSPECT → ACTIVE.

## Step 3 — Keep out

Explicitly exclude REST endpoints and Spring controllers from this sketch.

## Step 4 — Prep boundary

Write: *Do not complete full Lab 12 refactor in pre-lab.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A minimal target API with honest exclusions in `notes/lab12-target-api-sketch.md`.


## Debug / design challenge

Replace doStuff with createCustomer/getCustomer/updateStatus in your sketch.

## Predict the Output / Behavior

Which method should move Ravi PROSPECT → ACTIVE?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-target-api-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 12 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-target-api-sketch.md`
- [ ] Methods listed
- [ ] Ravi transition noted
- [ ] REST hosting / Spring excluded

