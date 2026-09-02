# Exercise 5 — Digest vs Latest

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 55–56) |
| **Deliverable** | `notes/lab41-digest-discipline.md` |
| **Fixtures** | Synthetic CUS-1001 smoke · no secrets in notes |

### What you will learn

Explain why :latest-only is rejected; plan digest pinning notes.

### Enterprise context

Lab 42/44 pull reproducible digests — not floating latest.

### Predict

Two engineers pull :latest a week apart — same bits?

### Debug

Pushing only :latest with secrets — gate fail reasons?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Skipping digest capture | Record image id/digest in runbook |
| Registry auth in Git | Auth outside repo |

**Module 41** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab41-digest-discipline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Digest vs Latest

## Step 1 — Define

In two sentences, define image digest vs mutable tag.

## Step 2 — Check the reference

Lab 42/44 promote by digest; `:latest` can drift between staging and prod.

## Step 3 — CRM example

Write an example tag scheme: `crm-api:lab41` plus digest note placeholder `sha256:(your note here)`.

## Step 4 — Runbook heading

Add a `docs/container-runbook.md` heading list: build, inspect user, run, stop, digest capture.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-digest-discipline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Digest vs Latest

## Step 1 — Define

In two sentences, define image digest vs mutable tag.

## Step 2 — Check the reference

Lab 42/44 promote by digest; `:latest` can drift between staging and prod.

## Step 3 — CRM example

Write an example tag scheme: `crm-api:lab41` plus digest note placeholder `sha256:_____`.

## Step 4 — Runbook heading

Add a `docs/container-runbook.md` heading list: build, inspect user, run, stop, digest capture.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Digest discipline and runbook headings documented in `notes/lab41-digest-discipline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-digest-discipline.md` |
| Pushing only :latest | Record digest for promotion |
| Embedding .env in image | Inject at run/deploy time |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-digest-discipline.md`
- [ ] Digest vs tag explained
- [ ] Example tag scheme written
- [ ] Runbook headings listed

