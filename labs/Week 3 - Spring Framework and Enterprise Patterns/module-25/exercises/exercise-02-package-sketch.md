# Exercise 2 — Package Sketch

**Module 25** · Checkpoint B · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch com.northstar.crm packages for api/service/repository/model |
| **Skills practiced** | Package architecture |
| **Expected outcome** | notes/package-tree.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/package-tree.md |
| **Checkpoint** | B (after slides 97–104) |

## What you will learn

- api = controllers
- service = CustomerService
- repository = interface + InMemory impl

**Enterprise context:** Reviewers navigate by package — mixed layers in one folder hide seams.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/package-tree.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Package Sketch

com.northstar.crm
  api/CustomerController
  service/CustomerService
  repository/CustomerRepository
  repository/InMemoryCustomerRepository
  model/Customer
  CrmApplication

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/package-tree.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Package Sketch

## Tree
_____

## Where does the controller live?
_____

## Where does InMemoryCustomerRepository live?
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Package tree in `notes/package-tree.md`.

## Debug / design challenge

Should extra REST adapters sit under repository?

## Predict the Output / Behavior

Why keep model free of Spring Web annotations?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/package-tree.md` |
| Putting repo under api | Use repository package |
| Skipping CrmApplication root | Keep scan root clear |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/package-tree.md`
- [ ] api/service/repository/model
- [ ] Application root noted
