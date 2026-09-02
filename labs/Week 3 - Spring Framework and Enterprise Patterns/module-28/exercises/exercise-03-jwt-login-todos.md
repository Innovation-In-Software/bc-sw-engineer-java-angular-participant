# Exercise 3 — JWT Login TODOs

**Module 28** · Checkpoint C · Exercises 1–6 Pass then Lab 28

## Activity card

| | |
| --- | --- |
| **Objective** | Fill login/issue/parse TODOs for the JWT flow |
| **Skills practiced** | JWT login design |
| **Expected outcome** | notes/lab28-jwt-login-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-28-exercises/` → notes/lab28-jwt-login-todos.md |
| **Checkpoint** | C (after slides 176–179) |

## What you will learn

- POST /api/auth/login
- JwtService issue + parse
- Authorization: Bearer on later calls

**Enterprise context:** Without a clear login contract, MockMvc matrices invent inconsistent paths and fail peer review.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab28-jwt-login-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — JWT Login TODOs

POST /api/auth/login {username,password} → {accessToken, tokenType}
JwtService issueToken / parseSubject / parseRole (lab stub OK)
Client: Authorization: Bearer <accessToken>
Lab users: agent1 (AGENT), admin1 (ADMIN)
Secret: env JWT_SECRET → northstar.security.jwt-secret (placeholder in .env.example)

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/lab28-jwt-login-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — JWT Login TODOs

## Login path + body
_____

## Token response
_____

## Bearer header form
_____

## Lab users/roles
_____

## Secret handling
_____

## Scope
Pre-lab only. No real secrets.

```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`, lab users `agent1`/`admin1`. Replace every `_____` before Pass. **Never write real JWT secrets.**

## Expected result

JWT login TODOs in `notes/lab28-jwt-login-todos.md`.

## Debug / design challenge

Where should password encoding happen relative to token issue?

## Predict the Output / Behavior

Is putting the JWT in a query string a good default?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab28-jwt-login-todos.md` |
| Real secret in notes | Placeholder/env only |
| Missing Bearer form | Authorization: Bearer … |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab28-jwt-login-todos.md`
- [ ] Login path
- [ ] Bearer form
- [ ] Users/roles
- [ ] No real secrets
