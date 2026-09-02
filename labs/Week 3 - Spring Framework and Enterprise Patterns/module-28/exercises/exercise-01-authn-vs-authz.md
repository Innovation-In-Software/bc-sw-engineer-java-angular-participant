# Exercise 1 — Authentication Versus Authorization

**Module 28** · Checkpoint A · Exercises 1–6 Pass then Lab 28

## Activity card

| | |
| --- | --- |
| **Objective** | Contrast authn vs authz with CRM 401/403 examples |
| **Skills practiced** | Authn vs authz analysis |
| **Expected outcome** | notes/authn-authz.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-28-exercises/` → notes/authn-authz.md |
| **Checkpoint** | A (after slides 161–166) |

## What you will learn

- Authn = who (agent1 login / JWT)
- Authz = what (AGENT vs ADMIN routes)
- 401 vs 403 mapping

**Enterprise context:** Support tickets often say “security broken” when the real issue is 403 vs 401 confusion.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/authn-authz.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — Authentication Versus Authorization

| Concept | Question | CRM example | HTTP |
| --- | --- | --- | --- |
| Authentication | Who are you? | Missing/bad JWT | 401 |
| Authorization | What may you do? | agent1 hits /api/admin | 403 |

Correlation lab-request-001 ≠ authentication.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/authn-authz.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — Authentication Versus Authorization

| Concept | Question | CRM example | HTTP |
| --- | --- | --- | --- |
| Authentication | _____ | _____ | _____ |
| Authorization | _____ | _____ | _____ |

## Correlation vs auth
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`, lab users `agent1`/`admin1`. Replace every `_____` before Pass. **Never write real JWT secrets.**

## Expected result

Authn/authz notes in `notes/authn-authz.md`.

## Debug / design challenge

Expired JWT on a permitted role — 401 or 403?

## Predict the Output / Behavior

Valid AGENT token on /api/admin — 401 or 403?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/authn-authz.md` |
| Swapping 401/403 | Fix status mapping |
| Treating correlation as auth | Call out it is not |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/authn-authz.md`
- [ ] Both concepts
- [ ] 401/403 mapped
- [ ] Correlation note
