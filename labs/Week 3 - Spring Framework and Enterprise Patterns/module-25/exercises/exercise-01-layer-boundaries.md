# Exercise 1 — Layer Boundary Quiz

**Module 25** · Checkpoint A · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Assign CRM responsibilities to Controller, Service, or Repository |
| **Skills practiced** | Layer boundary analysis |
| **Expected outcome** | notes/layers.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/layers.md |
| **Checkpoint** | A (after slides 91–96) |

## What you will learn

- HTTP mapping → controller
- Uniqueness / lifecycle → service
- save/find by id → repository

**Enterprise context:** Leadership rejects PRs where controllers talk to maps — seams must be obvious in review.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/layers.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Layer Boundary Quiz

| Responsibility | Layer |
| --- | --- |
| Map JSON ↔ HTTP status | Controller |
| Reject duplicate CUS-1001 | Service |
| Store Customer by id | Repository |
| PROSPECT → ACTIVE rule | Service |
| Import CustomerRepository | Service (not Controller) |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/layers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Layer Boundary Quiz

| Responsibility | Layer (Controller / Service / Repository) |
| --- | --- |
| Map JSON ↔ HTTP status | _____ |
| Reject duplicate CUS-1001 | _____ |
| Store Customer by id | _____ |
| PROSPECT → ACTIVE rule | _____ |
| May import CustomerRepository? | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Boundary quiz in `notes/layers.md`.

## Debug / design challenge

Rewrite a controller that calls map.put directly into proper layers.

## Predict the Output / Behavior

If ResponseEntity appears inside CustomerService, which layer leaked?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/layers.md` |
| Putting uniqueness in repository only | Service owns the rule |
| Allowing controller→repository | Mark as forbidden |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/layers.md`
- [ ] Five rows filled
- [ ] Controller cannot import repository
