# Exercise 2 — Boot Starters Inventory

**Module 23** · Checkpoint B · Exercises 1–6 Pass then Lab 23

## Activity card

| | |
| --- | --- |
| **Objective** | Inventory the starters Lab 23 needs and what each provides |
| **Skills practiced** | Starter selection |
| **Expected outcome** | notes/starters.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-23-exercises/` → notes/starters.md |
| **Checkpoint** | B (after slides 47–52) |

## What you will learn

- web → MVC + embedded server + JSON
- actuator → health (and more)
- test → Spring Test / JUnit support

**Enterprise context:** Wrong starters waste hours — peers must start the CRM with a known POM set.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/starters.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — Boot Starters Inventory

| Starter | Why for CRM lab |
| --- | --- |
| spring-boot-starter-web | REST /api/customers + embedded Tomcat |
| spring-boot-starter-actuator | /actuator/health smoke |
| spring-boot-starter-test | ContextLoads + API IT |
| spring-boot-starter-validation (optional) | @Valid bodies |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/starters.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — Boot Starters Inventory

| Starter | Why for CRM lab |
| --- | --- |
| spring-boot-starter-web | _____ |
| spring-boot-starter-actuator | _____ |
| spring-boot-starter-test | _____ |
| spring-boot-starter-validation (optional) | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Starters inventory in `notes/starters.md`.

## Debug / design challenge

Does starter-actuator replace the need for starter-web?

## Predict the Output / Behavior

What breaks in `mvn test` if starter-test is missing?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/starters.md` |
| Skipping actuator | Health smoke requires it |
| Listing kafka/security starters | Out of Module 23 scope |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/starters.md`
- [ ] web/actuator/test noted
- [ ] Optional validation noted
- [ ] No out-of-scope starters as required
