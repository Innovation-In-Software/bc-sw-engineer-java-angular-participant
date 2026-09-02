# Exercise 4 — MockMvc Evidence Matrix

**Module 28** · Checkpoint C · Exercises 1–6 Pass then Lab 28

## Activity card

| | |
| --- | --- |
| **Objective** | Plan MockMvc cases for 401, 403, and 200 on CRM routes |
| **Skills practiced** | Security test planning |
| **Expected outcome** | notes/mockmvc-matrix.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-28-exercises/` → notes/mockmvc-matrix.md |
| **Checkpoint** | C (after slides 176–179) |

## What you will learn

- No token → 401
- AGENT on admin → 403
- AGENT on customers CUS-1001 → 200

**Enterprise context:** Automated 401/403 proofs stop regressions when someone adds a new open controller.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/mockmvc-matrix.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — MockMvc Evidence Matrix

| Case | Auth | Route | Expect |
| --- | --- | --- | --- |
| Anonymous customers | none | GET /api/customers/CUS-1001 | 401 |
| Agent admin | AGENT | GET /api/admin/... | 403 |
| Agent customer | AGENT Bearer | GET /api/customers/CUS-1001 | 200 |
| Bad token | garbage Bearer | GET customers | 401 |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/mockmvc-matrix.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — MockMvc Evidence Matrix

| Case | Auth | Route | Expect |
| --- | --- | --- | --- |
| Anonymous customers | _____ | _____ | _____ |
| Agent admin | _____ | _____ | _____ |
| Agent customer | _____ | _____ | _____ |
| Bad token | _____ | _____ | _____ |

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`, lab users `agent1`/`admin1`. Replace every `_____` before Pass. **Never write real JWT secrets.**

## Expected result

MockMvc matrix in `notes/mockmvc-matrix.md`.

## Debug / design challenge

Should login success be part of the matrix or a separate test?

## Predict the Output / Behavior

Why test bad token separately from missing token?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/mockmvc-matrix.md` |
| Only 200 cases | Include 401 and 403 |
| Wrong status for agent admin | 403 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/mockmvc-matrix.md`
- [ ] 401 case
- [ ] 403 case
- [ ] 200 case
