# Exercise 3 — Service Layer Skeleton (TODOs)

**Module 25** · Checkpoint B · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Fill TODOs for CustomerService create/get rules |
| **Skills practiced** | Service skeleton design |
| **Expected outcome** | notes/lab25-service-todo-skeleton.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/lab25-service-todo-skeleton.md |
| **Checkpoint** | B (after slides 97–104) |

## What you will learn

- Constructor takes CustomerRepository
- create checks duplicate then save
- get throws not-found for CUS-9999

**Enterprise context:** Service skeletons become the contract REST controllers and tests both trust.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab25-service-todo-skeleton.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Service Layer Skeleton

CustomerService(CustomerRepository repo)
create(customer): if exists → conflict; else save
get(id): find or not-found
Seeds used by repo: CUS-1001 ACTIVE, CUS-1002 PROSPECT
No ResponseEntity here.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/lab25-service-todo-skeleton.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Service Layer Skeleton

## Constructor deps
_____

## create TODO
_____

## get TODO
_____

## Forbidden in this class
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Service skeleton in `notes/lab25-service-todo-skeleton.md`.

## Debug / design challenge

Where should seeding of CUS-1001 live — service or repository?

## Predict the Output / Behavior

Can create return ResponseEntity.ok(...) from the service?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab25-service-todo-skeleton.md` |
| HTTP types in service | Mark forbidden |
| No duplicate check | Add create rule |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab25-service-todo-skeleton.md`
- [ ] Constructor deps
- [ ] create/get TODOs
- [ ] Forbidden HTTP noted
