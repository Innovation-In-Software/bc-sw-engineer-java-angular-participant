# Exercise 4 — Draft the AI Usage Plan

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 26–29) |
| **Deliverable** | `notes/lab48-ai-usage-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Turn AI governance into an allowed / verify / forbidden policy with real verification mechanisms.

### Enterprise context

Teams that never write the AI policy down end up with unreviewed generated migrations in production. The verification column is the control.

### Predict

AI drafts a Flyway migration that drops a column. Which of your verification checks catches it?

### Debug

'I read the output' is offered as the verification step — why is that not enough?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Verification says 'reviewed' | Name the mechanism: a test, a run, a diff |
| Forbidden list vague | Name secrets, real PII, and production applies |
| No attribution rule | Say how the PR discloses AI assistance |

**Module 48** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-ai-usage-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Draft the AI Usage Plan

## Allowed

Allowed: component and DTO boilerplate, first-draft unit tests, Terraform/Ansible sketches, doc prose.

## Verify

Angular: ng test passes and a human reads every template binding. Flyway: migration runs forward on a scratch DB and its rollback path is stated.

## Forbidden

Forbidden: pasting secrets or real customer PII into a prompt; letting AI run a production apply; merging generated code unreviewed.

## Attribution

Every AI-assisted PR notes which files were AI-drafted and who verified them.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-ai-usage-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Draft the AI Usage Plan

## Allowed

_____

## Verify

_____

## Forbidden

_____

## Attribution

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An allowed / verify / forbidden policy with two concrete verification checks and an attribution rule in `notes/lab48-ai-usage-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-ai-usage-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-ai-usage-plan.md`
- [ ] Three allowed tasks listed
- [ ] One Angular and one Flyway/SQL verification check
- [ ] Forbidden list names secrets, PII, prod applies
- [ ] Attribution rule written
