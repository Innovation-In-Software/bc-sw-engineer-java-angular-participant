# Exercise 6 — Outline CI Runbook

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 111–117) |
| **Deliverable** | `notes/lab43-ci-runbook-outline.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic only · no secrets in Git |

### What you will learn

Outline how peers re-run failed verify, find artifacts, and locate secrets.

### Enterprise context

Hard gate: peer can re-run CI from runbook without verbal help.

### Predict

Where do you document secret *names* vs values?

### Debug

Terraform apply from CI in this module — wrong lab?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Vague 'check Actions' | Exact job names + artifact paths |
| Unredacted tokens in evidence | Redact; rotate |

**Module 43** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab43-ci-runbook-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Outline CI Runbook

## Step 1 — Headings

Triggers, jobs, where reports live, how to re-run, what deploy steps exist (none yet).

## Step 2 — Re-run recipe

Bullet the GitHub UI/CLI re-run path and local `./mvnw -B clean verify` equivalent.

## Step 3 — Evidence index

Placeholder links for Surefire zip and JAR SHA artifact names.

## Step 4 — Scope

Mark as pre-lab outline for Lab 43.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-ci-runbook-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Outline CI Runbook

## Step 1 — Headings

Triggers, jobs, where reports live, how to re-run, what deploy steps exist (none yet).

## Step 2 — Re-run recipe

Bullet the GitHub UI/CLI re-run path and local `./mvnw -B clean verify` equivalent.

## Step 3 — Evidence index

Placeholder links for Surefire zip and JAR SHA artifact names.

## Step 4 — Scope

Mark as pre-lab outline for Lab 43.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CI runbook outline with re-run recipe in `notes/lab43-ci-runbook-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-ci-runbook-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-ci-runbook-outline.md`
- [ ] Headings complete
- [ ] Re-run recipe present
- [ ] Pre-lab marked

