# Exercise 2 — SecurityFilterChain Sketch

**Module 28** · Checkpoint B · Exercises 1–6 Pass then Lab 28

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch matchers for login, customers, and admin routes |
| **Skills practiced** | Filter-chain design |
| **Expected outcome** | notes/filter-chain.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-28-exercises/` → notes/filter-chain.md |
| **Checkpoint** | B (after slides 167–175) |

## What you will learn

- Stateless session
- permitAll /api/auth/login
- customers AGENT|ADMIN; admin ADMIN-only

**Enterprise context:** Open-by-default chains ship new controllers unprotected — default deny is the enterprise baseline.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/filter-chain.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — SecurityFilterChain Sketch

Session: STATELESS
/api/auth/login → permitAll
/api/customers/** → hasAnyRole(AGENT, ADMIN)
/api/admin/** → hasRole(ADMIN)
Other APIs → authenticated (default deny extras)

JWT filter before UsernamePasswordAuthenticationFilter.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/filter-chain.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — SecurityFilterChain Sketch

## Session policy
_____

## Login matcher
_____

## Customers matcher + roles
_____

## Admin matcher + roles
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`, lab users `agent1`/`admin1`. Replace every `_____` before Pass. **Never write real JWT secrets.**

## Expected result

Filter-chain sketch in `notes/filter-chain.md`.

## Debug / design challenge

Should CSRF stay enabled for a pure Bearer JWT API?

## Predict the Output / Behavior

What goes wrong if /api/customers/** is permitAll?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/filter-chain.md` |
| permitAll on customers | Require roles |
| No admin rule | ADMIN-only admin routes |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/filter-chain.md`
- [ ] Login permitAll
- [ ] Customers roles
- [ ] Admin ADMIN
