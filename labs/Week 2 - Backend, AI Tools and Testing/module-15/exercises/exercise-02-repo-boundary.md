# Exercise 2 — Repository Boundary

**Module 15** · Checkpoint B · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | List what belongs in the repository versus the service |
| **Skills practiced** | Persistence vs business ownership |
| **Expected outcome** | notes/lab15-repo-boundary.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-repo-boundary.md |
| **Checkpoint** | B (after slides 156) |

## What you will learn

- Repo owns CRUD, existence, persistence mapping
- Service owns transition matrix, domain exceptions, notifiers
- Anti-pattern: repo.activateCustomer hiding rules

**Enterprise context:** Putting activate rules in the repository makes every new adapter re-implement policy — or worse, silently diverge.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-repo-boundary.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Repository Boundary

## Step 1 — Repo owns
CRUD by id, existence checks, persistence mapping.

## Step 2 — Service owns
Transition matrix, notifier calls, domain exceptions.

## Step 3 — Anti-pattern
repo.activateCustomer hiding business rules.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-repo-boundary.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Repository Boundary

## Step 1 — Repo owns
_____

## Step 2 — Service owns
_____

## Step 3 — Anti-pattern
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A crisp ownership list for repo vs service in `notes/lab15-repo-boundary.md`.

## Debug / design challenge

Someone adds `repo.changeStatusIfAllowed` — rewrite it as a service responsibility.

## Predict the Output / Behavior

Can the repository throw NotFound for missing id? Can it decide PROSPECT→ACTIVE?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-repo-boundary.md` |
| Putting transitions in repo list | Move transitions to service owns |
| Skipping the anti-pattern | Name repo.activateCustomer explicitly |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-repo-boundary.md`
- [ ] Repo responsibilities listed
- [ ] Service responsibilities listed
- [ ] Anti-pattern named
