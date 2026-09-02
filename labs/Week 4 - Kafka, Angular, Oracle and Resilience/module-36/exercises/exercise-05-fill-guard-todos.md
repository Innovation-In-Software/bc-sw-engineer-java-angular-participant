# Exercise 5 — Fill Route Guard TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 29–32) |
| **Deliverable** | `notes/lab36-todos.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

Complete the route guard TODOs and state the limit of what a client-side guard enforces.

### Enterprise context

A route guard improves the user experience; it is not access control, because the client can be modified.

### Predict

A user edits the JavaScript to skip the guard. What still stops them reading CUS-1001?

### Debug

Your guard passes but the API returns data to an unauthorized user. Which layer failed?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Blanks left unfilled | Every _____ must be replaced |
| Guard treated as security | It is UX; the server enforces |
| Full token logged | Log the correlation id instead |

**Module 36** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Fill Route Guard TODOs

## Paste

notes/lab36-todos.md created with the RequireAuth stub pasted in full.

## Fill Blanks

token = getAccessToken(); redirect target "/login"; return true; examples use lab-token-001.

## Role Note

Optional TODO: hide AdminMenu unless role === ADMIN — labelled UI only, not authorization.

## Backend Reminder

Spring Security must still reject unauthorized API calls for CUS-1001 data even when the guard passes.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Fill Route Guard TODOs

## Paste

_____

## Fill Blanks

_____

## Role Note

_____

## Backend Reminder

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A completed guard stub with no blanks, a UI-only role note, and the backend reminder in `notes/lab36-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-todos.md`
- [ ] Stub pasted and every blank filled
- [ ] Role note labelled UI only
- [ ] Backend enforcement reminder written
