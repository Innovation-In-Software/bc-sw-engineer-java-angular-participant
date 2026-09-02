# Exercise 1 — Layer Diagram

**Module 15** · Checkpoint A · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch API → service → repository for Northstar Customer activate |
| **Skills practiced** | Layered architecture, call-flow labeling |
| **Expected outcome** | notes/lab15-layers.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-layers.md |
| **Checkpoint** | A (after slides 152–155) |

## What you will learn

- Three layers: API adapter, CustomerService, CustomerRepository
- activate(CUS-1002) flows inward; entity/DTO returns outward
- Correlation lab-request-001 crosses the API edge

**Enterprise context:** CRM activate must traverse the same layers whether called from REST or a batch job.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-layers.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Layer Diagram

## Step 1 — Boxes
API adapter → CustomerService → CustomerRepository

## Step 2 — Arrow labels
activate(CUS-1002) inward; Customer/DTO outward

## Step 3 — Correlation
lab-request-001 at API edge into service logging

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-layers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Layer Diagram

## Step 1 — Boxes
Layer 1: _____
Layer 2: _____
Layer 3: _____

## Step 2 — Arrow labels
Inward call: _____
Outward return: _____

## Step 3 — Correlation
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-layer diagram with activate flow labeled in `notes/lab15-layers.md`.

## Debug / design challenge

If activate logic sits only in the API adapter, which two layers are skipped?

## Predict the Output / Behavior

Does the repository call the service, or the service call the repository?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-layers.md` |
| Only two layers drawn | Name API, service, and repository |
| Starting the full lab mid-exercise | Finish pre-lab notes first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-layers.md`
- [ ] Three layers named
- [ ] Activate flow labeled
- [ ] Correlation edge noted
