# Exercise 1 — Catch Order

**Module 16** · Checkpoint A · Exercises 1–6 Pass then Lab 16

## Activity card

| | |
| --- | --- |
| **Objective** | Order catch/handlers from specific domain exceptions to generic Exception |
| **Skills practiced** | Handler specificity, shadowing risk |
| **Expected outcome** | notes/lab16-catch-order.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-16-exercises/` → notes/lab16-catch-order.md |
| **Checkpoint** | A (after slides 168–173) |

## What you will learn

- Specific domain exceptions before Exception
- Broad catch first shadows 404/409 mapping
- Prep only — full handler wiring is Lab 16

**Enterprise context:** A single misplaced catch(Exception) turns every Northstar conflict into a useless 500 for partners.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab16-catch-order.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Catch Order

## Step 1 — List types
BusinessException (notFound/conflict), Validation failures, Exception.

## Step 2 — Order
BusinessException → validation → Exception (top to bottom).

## Step 3 — Why
Broad catch first would shadow domain mapping.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-catch-order.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Catch Order

## Step 1 — List types
_____

## Step 2 — Order (top → bottom)
1. _____
2. _____
3. _____

## Step 3 — Why
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ordered catch list with why-sentence in `notes/lab16-catch-order.md`.

## Debug / design challenge

If Exception is caught first, what status does ACTIVE→PROSPECT incorrectly become?

## Predict the Output / Behavior

Should NotFound and Conflict share one BusinessException type with a code, or two classes?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-catch-order.md` |
| Generic Exception listed first | Move specific handlers above Exception |
| Starting the full lab mid-exercise | Finish pre-lab notes first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-catch-order.md`
- [ ] Types listed
- [ ] Specific→general order
- [ ] Why sentence present
