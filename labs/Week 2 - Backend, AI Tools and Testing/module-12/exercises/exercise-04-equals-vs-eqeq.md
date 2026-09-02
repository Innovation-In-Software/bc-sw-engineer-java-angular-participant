# Exercise 4 — Equals vs ==

**Module 12** · Checkpoint B · Exercises 1–6 Pass then Lab 12

## Activity card

| | |
| --- | --- |
| **Objective** | Contrast equals vs == for status and customer id checks |
| **Skills practiced** | Correctness habit, readability |
| **Expected outcome** | notes/lab12-equals-vs-eqeq.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-12-exercises/` → notes/lab12-equals-vs-eqeq.md |
| **Checkpoint** | B (after slides 100–104) |

## What you will learn

- == compares references for objects; equals compares value
- Map keyed by id + equals fixes flaky get lookups
- Enums can use == safely; String ids should not rely on it

**Enterprise context:** Lookup bugs from == on String ids are classic production defects.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab12-equals-vs-eqeq.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Equals vs ==

## Reference

| Check | Use | Why |
| --- | --- | --- |
| status ACTIVE? | Objects.equals / enum | String identity is unsafe |
| same Customer instance? | == | Reference equality only |
| id CUS-1001? | equals | Value equality |

## Step 2 — Bad snippet

Write a bad line: `if (status == "ACTIVE")` and label it Fail.

## Step 3 — Good snippet

Write a good conceptual check for Amina ACTIVE using equals or enum.

## Step 4 — JDK note

Note: prefer enums on JDK 21 sketches when status set is closed.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-equals-vs-eqeq.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Equals vs ==

## Reference

| Check | Use | Why |
| --- | --- | --- |
| status ACTIVE? | Objects.equals / enum | String identity is unsafe |
| same Customer instance? | == | Reference equality only |
| id CUS-1001? | equals | Value equality |

## Step 2 — Bad snippet

Write a bad line: `if (status == "ACTIVE")` and label it Fail.

## Step 3 — Good snippet

Write a good conceptual check for Amina ACTIVE using equals or enum.

## Step 4 — JDK note

Note: prefer enums on JDK 21 sketches when status set is closed.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A comparison cheat sheet tied to Northstar statuses in `notes/lab12-equals-vs-eqeq.md`.


## Debug / design challenge

Explain why getCustomer(new String("CUS-1001")) fails with ==.

## Predict the Output / Behavior

Preferred structure for id lookup: List scan with == or Map + equals?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-equals-vs-eqeq.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 12 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-equals-vs-eqeq.md`
- [ ] Table plus null-safe row
- [ ] Bad and good snippets present
- [ ] Enum preference noted

