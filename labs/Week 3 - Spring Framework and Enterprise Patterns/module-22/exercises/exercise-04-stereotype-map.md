# Exercise 4 — Stereotype Annotation Map

**Module 22** · Checkpoint D · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Map CRM classes to the correct Spring stereotypes |
| **Skills practiced** | Stereotype selection |
| **Expected outcome** | notes/stereotype-map.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/stereotype-map.md |
| **Checkpoint** | D (after slides 24–28) |

## What you will learn

- @RestController for CustomerController
- @Service for CustomerService / NotificationService
- @Repository for InMemoryCustomerRepository

**Enterprise context:** Wrong stereotypes confuse scanners and reviewers — layer names should match annotations.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/stereotype-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Stereotype Annotation Map

| Class | Stereotype |
| --- | --- |
| CustomerController | @RestController |
| CustomerService | @Service |
| NotificationService | @Service |
| InMemoryCustomerRepository | @Repository |
| Customer (model) | none — plain type |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/stereotype-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Stereotype Annotation Map

| Class | Stereotype |
| --- | --- |
| CustomerController | _____ |
| CustomerService | _____ |
| NotificationService | _____ |
| InMemoryCustomerRepository | _____ |
| Customer (model) | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Stereotype map in `notes/stereotype-map.md`.

## Debug / design challenge

Should CustomerRepository (the interface) get @Repository?

## Predict the Output / Behavior

What exception do you see if InMemoryCustomerRepository lacks @Repository and no @Bean?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/stereotype-map.md` |
| Annotating the model | Customer stays plain |
| @Service on the repository | Use @Repository |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/stereotype-map.md`
- [ ] Five rows filled
- [ ] Model is plain
- [ ] Controller is RestController
