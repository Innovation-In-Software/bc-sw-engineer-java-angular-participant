# Exercise 4 — Fill Message Hygiene TODOs

**Module 16** · Checkpoint D · Exercises 1–6 Pass then Lab 16

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for safe vs unsafe error messages |
| **Skills practiced** | Client-safe messaging, log vs response |
| **Expected outcome** | notes/lab16-message-hygiene-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-16-exercises/` → notes/lab16-message-hygiene-todos.md |
| **Checkpoint** | D (after slides 178–181) |

## What you will learn

- Safe not-found vs unsafe SQL/PII messages
- Stack traces in server logs only
- correlationId always; live Spring advice not required in pre-lab

**Enterprise context:** Leaking SQL or emails in error JSON is a security incident waiting for a ticket.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab16-message-hygiene-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Fill Message Hygiene TODOs

Safe not-found: Customer not found.
Unsafe: SQLException: ... email=...
Correlation field: correlationId
Log stack trace? yes (server) · Return stack to client? no
Live @ControllerAdvice in pre-lab? no

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-message-hygiene-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Fill Message Hygiene TODOs

Safe not-found message: _____
Unsafe message anti-pattern: _____
Correlation always field: _____
Log stack trace (server)? _____
Return stack trace to client? _____
@ControllerAdvice live in this pre-lab? _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled hygiene TODOs in `notes/lab16-message-hygiene-todos.md`.

## Debug / design challenge

Rewrite: "User admin@corp.com password hash mismatch" into a safe client message.

## Predict the Output / Behavior

If the client sees a stack trace, which Pass criterion already failed?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-message-hygiene-todos.md` |
| Allowing client stack traces | Set client stack blank to no |
| Skipping correlation field | Name correlationId |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-message-hygiene-todos.md`
- [ ] All _____ replaced
- [ ] Client stack = no
- [ ] Correlation named
