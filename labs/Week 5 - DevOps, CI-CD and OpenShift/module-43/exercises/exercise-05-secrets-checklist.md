# Exercise 5 — Actions Secrets Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 111–117) |
| **Deliverable** | `notes/lab43-secrets-checklist.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic only · no secrets in Git |

### What you will learn

List which names live in Actions secrets vs plain vars; never echo values.

### Enterprise context

Kubeconfig and registry tokens must not appear in workflow YAML or screenshots.

### Predict

CRM_REGISTRY_TOKEN in plain text in ci.yml — gate fail?

### Debug

Secret appears in Actions log — response?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| echo $SECRET | Never print; rotate if leaked |
| Full CD promotions now | Park Lab 44 |

**Module 43** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab43-secrets-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Actions Secrets Checklist

## Step 1 — Sort

Sort: workflow YAML, README, registry password, kubeconfig, `.env`, scan reports.

## Step 2 — Check the reference

Only non-secret config in Git; credentials in Actions secrets/variables as instructed.

## Step 3 — Leak response

Write three steps if a secret is committed: rotate, purge history per policy, notify instructor.

## Step 4 — CRM note

Customer fixtures are not secrets—but real customer dumps are forbidden.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-secrets-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Actions Secrets Checklist

## Step 1 — Sort

Sort: workflow YAML, README, registry password, kubeconfig, `.env`, scan reports.

## Step 2 — Check the reference

Only non-secret config in Git; credentials in Actions secrets/variables as instructed.

## Step 3 — Leak response

Write three steps if a secret is committed: rotate, purge history per policy, notify instructor.

## Step 4 — CRM note

Customer fixtures are not secrets—but real customer dumps are forbidden.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Secrets checklist with leak response in `notes/lab43-secrets-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-secrets-checklist.md` |
| Hardcoding tokens in ci.yml | Use Actions secrets |
| Skipping tests to go green | Fix or quarantine with policy |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-secrets-checklist.md`
- [ ] Items classified
- [ ] Leak response has three steps
- [ ] Fixture vs secret clarified

