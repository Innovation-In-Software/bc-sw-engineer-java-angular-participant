# Exercise 2 — Profile YAML TODOs

**Module 26** · Checkpoint A · Exercises 1–6 Pass then Lab 26

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch which keys belong in base vs profile YAML files |
| **Skills practiced** | Profile YAML design |
| **Expected outcome** | notes/lab26-profile-yaml-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-26-exercises/` → notes/lab26-profile-yaml-todos.md |
| **Checkpoint** | A (after slides 115–125) |

## What you will learn

- Base: application name / shared defaults
- dev: logging / local datasource teasers
- prod: no secret defaults — ${ENV} refs

**Enterprise context:** Reviewers expect application-dev.yml naming — wrong filenames mean the profile never loads.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab26-profile-yaml-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Profile YAML TODOs

Files: application.yml, application-dev.yml, application-test.yml, application-prod.yml
Base: spring.application.name, server.port
dev: logging.level DEBUG (example)
prod: spring.datasource.password: ${DB_PASSWORD} (no default)
Never commit real DB_PASSWORD.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/lab26-profile-yaml-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Profile YAML TODOs

## Required files
_____

## Base keys
_____

## dev example key
_____

## prod secret pattern
_____

## Scope
Pre-lab only. No real passwords.

```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab26-001` / `lab-request-001`. Replace every `_____` before Pass. **Never write real passwords.**

## Expected result

YAML TODOs in `notes/lab26-profile-yaml-todos.md`.

## Debug / design challenge

What happens if you name the file application.dev.yml instead of application-dev.yml?

## Predict the Output / Behavior

Is ${DB_PASSWORD:} with empty default acceptable in prod?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab26-profile-yaml-todos.md` |
| Real password in notes | Use placeholder language only |
| Missing prod file | Include application-prod.yml |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab26-profile-yaml-todos.md`
- [ ] Four files listed
- [ ] prod secret pattern
- [ ] No real secrets
