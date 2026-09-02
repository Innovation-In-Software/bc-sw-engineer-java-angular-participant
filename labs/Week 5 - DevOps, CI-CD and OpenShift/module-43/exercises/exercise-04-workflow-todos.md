# Exercise 4 — Fill ci.yml TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 103–106) |
| **Deliverable** | `notes/lab43-workflow-todos.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic only · no secrets in Git |

### What you will learn

Fill workflow triggers, jobs, and step TODOs for CRM CI.

### Enterprise context

Workflow file is the reviewable contract for delivery gates.

### Predict

on: only push to feature/* — what feedback do PRs lose?

### Debug

Pipeline cannot find pom.xml — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Wrong working-directory | cd to CRM module path |
| Secrets hardcoded in YAML | Use GitHub Actions secrets |

**Module 43** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab43-workflow-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Fill ci.yml TODOs

## Step 1 — Skeleton

Create notes `ci.yml.skeleton` with blanks for `java-version`, verify command, artifact paths, and package `if:` condition.

## Step 2 — Fill

Fill blanks using Temurin 21 and `./mvnw -B clean verify` / package-once pattern.

## Step 3 — Secrets comment

Add a YAML comment: `# secrets via GitHub Actions secrets — never hardcode`.

## Step 4 — Scope

State that pushing and greening the workflow is Lab 43, not this exercise.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-workflow-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Fill ci.yml TODOs

## Step 1 — Skeleton

Create notes `ci.yml.skeleton` with blanks for `java-version`, verify command, artifact paths, and package `if:` condition.

## Step 2 — Fill

Fill blanks using Temurin 21 and `./mvnw -B clean verify` / package-once pattern.

## Step 3 — Secrets comment

Add a YAML comment: `# secrets via GitHub Actions secrets — never hardcode`.

## Step 4 — Scope

State that pushing and greening the workflow is Lab 43, not this exercise.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled workflow skeleton ready for Lab 43 in `notes/lab43-workflow-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-workflow-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-workflow-todos.md`
- [ ] Blanks filled for Java/verify/package
- [ ] Secrets comment present
- [ ] Pre-lab scope stated

