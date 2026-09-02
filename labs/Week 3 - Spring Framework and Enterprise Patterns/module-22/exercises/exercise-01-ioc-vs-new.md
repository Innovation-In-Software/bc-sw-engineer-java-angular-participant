# Exercise 1 — IoC Versus Manual Wiring

**Module 22** · Checkpoint A · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Explain why Northstar CRM should stop constructing repositories with new inside services |
| **Skills practiced** | IoC vs manual wiring analysis |
| **Expected outcome** | notes/ioc-vs-new.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/ioc-vs-new.md |
| **Checkpoint** | A (after slides 1–13) |

## What you will learn

- Manual new hard-wires InMemoryCustomerRepository
- IoC supplies collaborators so tests can pass fakes
- Smell: service owns construction of its dependencies

**Enterprise context:** Teams that keep new inside services cannot swap stores or isolate unit tests without editing production code.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/ioc-vs-new.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — IoC Versus Manual Wiring

| Approach | Who creates collaborators? | Test impact |
| --- | --- | --- |
| Manual `new` | Service constructs InMemoryCustomerRepository | Hard to swap fakes |
| IoC / DI | Spring (or test) supplies collaborators | Constructor takes a fake repo |

Smell: CustomerService owns `new InMemoryCustomerRepository()`.
Fix: declare CustomerRepository in the constructor; let the container (or test) supply it.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/ioc-vs-new.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — IoC Versus Manual Wiring

| Approach | Who creates collaborators? | Test impact |
| --- | --- | --- |
| Manual `new` | _____ | _____ |
| IoC / DI | _____ | _____ |

## Smell (one sentence)
_____

## Fix (one sentence)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

IoC vs new contrast in `notes/ioc-vs-new.md`.

## Debug / design challenge

Rewrite a service that news NotificationService so a unit test can assert notify was called without Spring.

## Predict the Output / Behavior

If two places each `new` a repository, how many in-memory maps exist at runtime?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/ioc-vs-new.md` |
| Saying new is fine forever | Call out test/swapability smell |
| Skipping the fix sentence | Constructor + supplied collaborator |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/ioc-vs-new.md`
- [ ] Table filled
- [ ] Smell noted
- [ ] Fix noted
