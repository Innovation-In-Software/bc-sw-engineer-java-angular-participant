# Exercise 4 — Plan Errors and Interceptors

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 52–60) |
| **Deliverable** | `notes/lab35-errors-interceptors.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Map error statuses to UI behaviour, set a safe retry rule, and plan the auth and correlation interceptors.

### Enterprise context

An automatic retry on a create that already succeeded produces duplicate records nobody asked for.

### Predict

A POST times out after the server committed, and the client retries. What now exists?

### Debug

A user reports an error at 3pm. Without a correlation id, how do you find the log line?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| 401 and 403 treated alike | 403 keeps the session; only 401 logs out |
| Blanket retry | GET only, unless there is an idempotency key |
| Login request gets a token | Exempt auth endpoints from the interceptor |

**Module 35** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-errors-interceptors.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Plan Errors and Interceptors

## Status Map

401 clears the token and routes to /login; 403 shows an inline not-permitted message; 404 shows the empty state; 500 shows a retry banner.

## Retry Rule

Retry GET requests only; POST, PUT, and DELETE are never retried automatically without an idempotency key.

## Auth Interceptor

Every /api/** call gets Authorization: Bearer; /api/auth/login and static assets are exempt.

## Correlation

X-Correlation-Id, sent on every request and echoed in the API's error envelope.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-errors-interceptors.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Plan Errors and Interceptors

## Status Map

_____

## Retry Rule

_____

## Auth Interceptor

_____

## Correlation

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A four-status UI map, a retry rule, interceptor scope, and the correlation header in `notes/lab35-errors-interceptors.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-errors-interceptors.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-errors-interceptors.md`
- [ ] Four statuses mapped to behaviour
- [ ] Retry limited to idempotent calls
- [ ] Interceptor scope and exemptions stated
- [ ] Correlation header named
