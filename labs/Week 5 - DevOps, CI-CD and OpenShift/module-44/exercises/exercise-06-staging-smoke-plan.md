# Exercise 6 — Plan Staging Smoke

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 139–143) |
| **Deliverable** | `notes/lab44-staging-smoke-plan.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 digest · no secrets in artifact |

### What you will learn

Plan staging smoke with synthetic CUS-1001/CUS-1002 and correlation id only.

### Enterprise context

Non-prod smoke must not use real customer data; evidence is redacted.

### Predict

Smoke 401 after promote — config drift or artifact change?

### Debug

Smoke green but agents still fail — expand smoke?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Real PII in smoke | Use synthetic fixtures only |
| No correlation id | Include lab-request-001 style id |

**Module 44** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-staging-smoke-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Plan Staging Smoke

## Step 1 — Cases

Read `CUS-1001`, optional activate path for `CUS-1002`, readiness, correlation header.

## Step 2 — Evidence

List screenshot names under `notes/lab-44/`.

## Step 3 — Forbidden

No production data, no real emails, no secret URLs in evidence.

## Step 4 — Scope

Plan only—execution is Lab 44.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-staging-smoke-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Plan Staging Smoke

## Step 1 — Cases

Read `CUS-1001`, optional activate path for `CUS-1002`, readiness, correlation header.

## Step 2 — Evidence

List screenshot names under `notes/lab-44/`.

## Step 3 — Forbidden

No production data, no real emails, no secret URLs in evidence.

## Step 4 — Scope

Plan only—execution is Lab 44.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Staging smoke plan with evidence naming in `notes/lab44-staging-smoke-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-staging-smoke-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-staging-smoke-plan.md`
- [ ] Fixture cases listed
- [ ] Evidence paths named
- [ ] Forbidden items stated

