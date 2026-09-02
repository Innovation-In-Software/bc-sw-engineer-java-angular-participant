# Exercise 5 — Fill Release Checklist TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 139–143) |
| **Deliverable** | `notes/lab44-checklist-todos.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 digest · no secrets in artifact |

### What you will learn

Fill go/no-go checklist TODOs: approver, digest match, watch window, rollback owner.

### Enterprise context

Unsigned checklists are a process gap—approver field is required.

### Predict

GO without a watch-window owner — what’s missing?

### Debug

Checklist marks GO while digest ≠ staging — fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Empty approver | Require named approver |
| Terraform apply here | Park Lab 45 |

**Module 44** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-checklist-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Fill Release Checklist TODOs

## Step 1 — Template

Create `release-checklist-todo.md`:
- Artifact digest: (your note here)
- Staging smoke CUS-1001: (your note here)
- Correlation lab-request-001: (your note here)
- Approval recorded: (your note here)
- Rollback digest ready: (your note here)
- Secrets confirmed out of Git: (your note here)

## Step 2 — Fill what you know

Fill process fields; leave digest blanks for Lab 44 evidence.

## Step 3 — Expand/contract note

Add one DB expand-before-contract reminder line.

## Step 4 — Scope

Mark checklist as pre-lab warmup.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-checklist-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Fill Release Checklist TODOs

## Step 1 — Template

Create `release-checklist-todo.md`:
- Artifact digest: _____
- Staging smoke CUS-1001: _____
- Correlation lab-request-001: _____
- Approval recorded: _____
- Rollback digest ready: _____
- Secrets confirmed out of Git: _____

## Step 2 — Fill what you know

Fill process fields; leave digest blanks for Lab 44 evidence.

## Step 3 — Expand/contract note

Add one DB expand-before-contract reminder line.

## Step 4 — Scope

Mark checklist as pre-lab warmup.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Partially filled release checklist ready for Lab 44 in `notes/lab44-checklist-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-checklist-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-checklist-todos.md`
- [ ] Template created
- [ ] Process fields filled
- [ ] DB compatibility note present

