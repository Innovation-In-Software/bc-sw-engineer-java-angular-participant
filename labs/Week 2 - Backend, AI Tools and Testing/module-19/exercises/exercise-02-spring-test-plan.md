# Exercise 2 — Plan the Spring Integration Tests

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 14–24) |
| **Deliverable** | `notes/lab19-spring-test-plan.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Choose the narrowest Spring test slice per case and say what integration tests prove that unit tests cannot.

### Enterprise context

Using @SpringBootTest for everything turns a twenty-second suite into a four-minute one nobody runs locally.

### Predict

Every test class uses @SpringBootTest with slightly different properties. What does startup time do?

### Debug

A repository test passes with a mock but fails against PostgreSQL. What did the mock hide?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| @SpringBootTest everywhere | Use the narrowest slice that proves the point |
| Only happy paths | Include a not-found and a validation case |
| Context cost ignored | Keep configuration uniform so it caches |

**Module 19** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-spring-test-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Plan the Spring Integration Tests

## Slice Choice

@WebMvcTest for the controller mapping, @DataJpaTest for repository queries, @SpringBootTest only for the full GET/POST flow.

## Two Cases

GET /api/customers/CUS-1001 returns 200 with Amina Khan; POST creates a customer and returns 201 with a Location header.

## What It Proves

It proves the wiring: real SQL, real JSON binding, real transaction behaviour — all of which a mock assumes away.

## Context Cost

Each distinct context configuration is loaded and cached separately, so varied configuration means repeated reloads.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-spring-test-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Plan the Spring Integration Tests

## Slice Choice

_____

## Two Cases

_____

## What It Proves

_____

## Context Cost

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A slice choice per test, two concrete cases, the integration-test value, and the context-cost point in `notes/lab19-spring-test-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-spring-test-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-spring-test-plan.md`
- [ ] Narrowest slice chosen per case
- [ ] GET and POST cases written
- [ ] Integration value stated
- [ ] Context caching explained
