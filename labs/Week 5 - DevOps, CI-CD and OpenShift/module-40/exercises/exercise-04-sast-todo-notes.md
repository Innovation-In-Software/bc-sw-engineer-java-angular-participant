# Exercise 4 — Fill SAST Path TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 9–13) |
| **Deliverable** | `notes/lab40-sast-todo-notes.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

List request→sink paths: injection, authz, secrets, unsafe deserialization.

### Enterprise context

Manual focused SAST complements Dependency-Check.

### Predict

Object-level authz miss on GET /customers/{id} — how prove?

### Debug

DAST-only mindset — what do you miss offline?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No code locations | Record class/method for each finding |
| CI workflow files now | Park GitHub Actions for Lab 43 |

**Module 40** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-sast-todo-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Fill SAST Path TODOs

## Step 1 — Copy template

In notes, create `sast-path-todo.md` with blanks:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-sast-todo-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Fill SAST Path TODOs

## Step 1 — Copy template

In notes, create `sast-path-todo.md` with blanks:
```
Endpoint: _____
Authz check: _____
Sink (SQL/file/log): _____
Customer fixture used: _____
Risk if missing check: _____
```

## Step 2 — Fill for customer read

Fill blanks for `GET /api/customers/{id}` using `CUS-1001`. Authz must mention role/object-level check TODOs.

## Step 3 — Second path

Duplicate the template for a write path (update interaction or status) involving `CUS-1002`.

## Step 4 — Self-check

Ensure no passwords, tokens, or real PII appear. Mark items still `_____` that Lab 40 will prove with code.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two filled SAST path notes with remaining blanks only where Lab 40 code proof is required in `notes/lab40-sast-todo-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-sast-todo-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-sast-todo-notes.md`
- [ ] Template filled for read and write paths
- [ ] Fixtures CUS-1001/CUS-1002 used
- [ ] No secrets in notes

