# Exercise 5 — REST Smoke Plan

**Module 23** · Checkpoint C · Exercises 1–6 Pass then Lab 23

## Activity card

| | |
| --- | --- |
| **Objective** | Plan create/get smoke for CUS-1001/CUS-1002 plus health |
| **Skills practiced** | API smoke planning |
| **Expected outcome** | notes/rest-smoke-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-23-exercises/` → notes/rest-smoke-plan.md |
| **Checkpoint** | C (after slides 53–59) |

## What you will learn

- POST then GET for Amina CUS-1001
- Include Ravi CUS-1002 and correlation lab-request-001
- Health UP before claiming Pass

**Enterprise context:** Reviewers want a repeatable smoke script — not ad-hoc clicks without IDs.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/rest-smoke-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — REST Smoke Plan

1. Start: mvn spring-boot:run
2. GET /actuator/health → UP
3. POST /api/customers for CUS-1001 (Amina, ACTIVE) with correlation lab-request-001
4. GET /api/customers/CUS-1001
5. Repeat create/get for CUS-1002 (Ravi, PROSPECT)
6. Commit your work to GitHub (no screenshots)

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/rest-smoke-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — REST Smoke Plan

## Start command
_____

## Health check
_____

## CUS-1001 steps
_____

## CUS-1002 steps
_____

## Correlation header/id
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

REST/health smoke plan in `notes/rest-smoke-plan.md`.

## Debug / design challenge

If health is DOWN, should you still grade the REST steps as Pass?

## Predict the Output / Behavior

Where do screenshots go for evidence?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/rest-smoke-plan.md` |
| Missing health step | Health before Pass |
| Wrong fixture IDs | CUS-1001 / CUS-1002 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/rest-smoke-plan.md`
- [ ] Health step
- [ ] Both customers
- [ ] Correlation noted
