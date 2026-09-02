# Exercise 5 — Service Test Plan

**Module 25** · Checkpoint C · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Plan CustomerServiceTest cases for create/get/duplicate/not-found |
| **Skills practiced** | Service unit-test planning |
| **Expected outcome** | notes/service-test-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/service-test-plan.md |
| **Checkpoint** | C (after slides 105–110a) |

## What you will learn

- Use fake or fresh in-memory repo
- Assert exceptions from the service
- Do not require MockMvc for service unit tests

**Enterprise context:** Layered design pays off when service tests run without starting Tomcat.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/service-test-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Service Test Plan

| Case | Setup | Expect |
| --- | --- | --- |
| get CUS-1001 | seeded repo | ACTIVE Amina |
| duplicate create | existing id | conflict/exception |
| get CUS-9999 | empty/missing | not-found |
| create CUS-new | fresh | saved |

No Spring Boot required for pure unit tests.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/service-test-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Service Test Plan

| Case | Setup | Expect |
| --- | --- | --- |
| get CUS-1001 | _____ | _____ |
| duplicate create | _____ | _____ |
| get CUS-9999 | _____ | _____ |
| create new | _____ | _____ |

## Spring Boot required for unit test?
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Service test plan in `notes/service-test-plan.md`.

## Debug / design challenge

Why prefer a fresh repository per @BeforeEach?

## Predict the Output / Behavior

Should these unit tests call CustomerController?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/service-test-plan.md` |
| Only MockMvc tests | Plan pure service tests |
| Missing duplicate case | Include conflict |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/service-test-plan.md`
- [ ] Four cases
- [ ] No Boot required noted
