# Exercise 4 — Interface and Constructor Sketch

**Module 15** · Checkpoint D · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch CustomerService methods and constructor dependencies on paper |
| **Skills practiced** | Interface design, constructor DI |
| **Expected outcome** | notes/lab15-interface-ctor-sketch.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-interface-ctor-sketch.md |
| **Checkpoint** | D (after slides 158–163) |

## What you will learn

- Methods such as findById / activate / changeStatus
- Ctor deps: repository + validator (+ optional notifier)
- Prefer explicit ctor over field injection

**Enterprise context:** Constructor injection makes DefaultCustomerService testable with a fake repository — no Spring required for Lab 15.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-interface-ctor-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Interface and Constructor Sketch

## Step 1 — Interface
Methods: findById, activate(customerId) / changeStatus.

## Step 2 — Constructor
Deps: CustomerRepository, CustomerValidator (optional notifier).

## Step 3 — No framework magic
Prefer explicit ctor over field injection.

## Step 4 — Prep boundary
Prepare for Lab 15; do not complete full service implementation now.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-interface-ctor-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Interface and Constructor Sketch

## Step 1 — Interface
Methods: _____

## Step 2 — Constructor
Deps: _____

## Step 3 — No framework magic
Prefer _____ over field injection.

## Step 4 — Prep boundary
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Interface + ctor sketch ready for the timed lab in `notes/lab15-interface-ctor-sketch.md`.

## Debug / design challenge

If you `new` the repository inside DefaultCustomerService, what test ability do you lose?

## Predict the Output / Behavior

Should activate take a full Customer entity from the client, or a customerId?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-interface-ctor-sketch.md` |
| Field injection only | Sketch constructor parameters |
| Implementing the full lab class here | Paper sketch only |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-interface-ctor-sketch.md`
- [ ] Methods listed
- [ ] Deps listed
- [ ] Pre-lab boundary present
