# Exercise 6 — Lab 37 Readiness Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 86–92) |
| **Deliverable** | `notes/lab37-readiness.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Prove the schema by planning the inserts that must fail, and confirm it can be rebuilt from scratch.

### Enterprise context

A constraint you never tested against a bad row may not exist at all — you have only assumed it.

### Predict

A duplicate email inserts successfully. What does that tell you about your DDL?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only positive tests planned | Three failing inserts, each naming its constraint |
| No rebuild path | The script must drop and recreate cleanly |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 37** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Lab 37 Readiness Self-Check

## Mistake Sweep

Swept the schema: money is numeric, timestamps are timestamptz, status has a check, and every FK states its delete behaviour.

## Negative Tests

Duplicate email fails the unique constraint; status PENDING fails the check; an account with an unknown customer_id fails the foreign key.

## Rebuild Proof

Run the DDL script twice from an empty database — it drops and recreates without manual steps.

## Pass Mark

Pass — type-choices, constraints, er-notes, indexes, and role-connection are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Lab 37 Readiness Self-Check

## Mistake Sweep

_____

## Negative Tests

_____

## Rebuild Proof

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A completed sweep, three negative tests with their constraints, a rebuild proof, and an honest Pass/Fail mark in `notes/lab37-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-readiness.md`
- [ ] Mistake sweep done with fixes noted
- [ ] Three failing inserts named with constraints
- [ ] Drop-and-recreate proof described
- [ ] All five earlier notes files confirmed complete
