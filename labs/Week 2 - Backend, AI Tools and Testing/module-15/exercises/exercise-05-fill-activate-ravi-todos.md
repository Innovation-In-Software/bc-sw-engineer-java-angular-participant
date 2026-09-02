# Exercise 5 — Fill Activate Ravi Pseudocode TODOs

**Module 15** · Checkpoint D · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for activate(CUS-1002) pseudocode |
| **Skills practiced** | Use-case sequencing, validate-before-mutate |
| **Expected outcome** | notes/lab15-activate-ravi-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-activate-ravi-todos.md |
| **Checkpoint** | D (after slides 158–163) |

## What you will learn

- Load Ravi by CUS-1002; require PROSPECT; set ACTIVE; save
- Log correlation lab-request-001
- Repository saves; it does not decide the transition

**Enterprise context:** Ops demos always activate Ravi (PROSPECT); activating Amina (ACTIVE) is the negative path.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-activate-ravi-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Fill Activate Ravi Pseudocode TODOs

customer = repo.findById(CUS-1002)
if null → NotFound
if status is not PROSPECT → domain/illegal transition
set status ACTIVE
repo.save/update(customer)
log correlation lab-request-001

Repository saves state; it does not decide PROSPECT→ACTIVE.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-activate-ravi-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Fill Activate Ravi Pseudocode TODOs

customer = repo.findById(_____)
if customer is null → throw _____
if status is not _____ → throw _____
set status to _____
repo._____(customer)
log correlation _____

## Repo boundary
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled activate pseudocode with repo boundary called out in `notes/lab15-activate-ravi-todos.md`.

## Debug / design challenge

If you set ACTIVE before checking PROSPECT, what bug appears on Amina?

## Predict the Output / Behavior

After a failed illegal transition, should repo.save still run?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-activate-ravi-todos.md` |
| Putting transition ifs in repository | Keep rules in service |
| Activating Amina as the happy path | Use Ravi PROSPECT as the demo path |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-activate-ravi-todos.md`
- [ ] All _____ replaced
- [ ] PROSPECT→ACTIVE correct
- [ ] Repo boundary sentence present
