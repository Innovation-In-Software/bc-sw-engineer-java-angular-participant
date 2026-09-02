# Exercise 1 — ACID for CRM Transfers

**Module 27** · Checkpoint A · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | Map each ACID letter to a CRM transfer observation you will prove |
| **Skills practiced** | ACID evidence planning |
| **Expected outcome** | notes/acid-crm.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/acid-crm.md |
| **Checkpoint** | A (after slides 137–146) |

## What you will learn

- Atomicity = debit+credit+log together
- Consistency = valid balances after success/fail
- Isolation/Durability = short notes tied to lab evidence

**Enterprise context:** Finance review rejects ACID buzzwords without balances/log screenshots.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/acid-crm.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — ACID for CRM Transfers

| Letter | CRM observation |
| --- | --- |
| A | Forced fail leaves MAIN unchanged; no success log |
| C | After happy path, balances and log agree |
| I | Default isolation; no dirty mid-transfer reads required for Pass |
| D | Committed happy path survives restart (note H2 mode) |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/acid-crm.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — ACID for CRM Transfers

| Letter | CRM observation |
| --- | --- |
| A | _____ |
| C | _____ |
| I | _____ |
| D | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

ACID table in `notes/acid-crm.md`.

## Debug / design challenge

If a success log row exists after ACC-FORCE-FAIL, which ACID letter failed?

## Predict the Output / Behavior

Is “we used @Transactional” enough evidence for Atomicity?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/acid-crm.md` |
| Only definitions, no CRM tie-in | Cite balances/log |
| Skipping Isolation note | Write at least awareness |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/acid-crm.md`
- [ ] All four letters
- [ ] CRM observations
