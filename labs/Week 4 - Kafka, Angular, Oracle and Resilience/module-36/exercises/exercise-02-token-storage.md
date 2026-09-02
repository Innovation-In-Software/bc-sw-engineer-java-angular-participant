# Exercise 2 — Token Storage Options

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 10–15) |
| **Deliverable** | `notes/lab36-security.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

Compare token storage options and justify the one this lab uses.

### Enterprise context

A token in localStorage is readable by any script that ever gets injected, including a third-party dependency.

### Predict

A dependency is compromised and injects a script. Which storage options just leaked the token?

### Debug

Your token survives a page refresh. Which storage did you choose, and what did you accept?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| localStorage chosen for convenience | It is readable by any injected script |
| Choice without justification | Two sentences saying why |
| Real token written down | Use lab-token-001 only |

**Module 36** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-security.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Token Storage Options

## Study the Table

The four options and their risks, copied into the notes as a reference table.

## Lab Choice

In-memory storage for Lab 36: it is not readable by injected scripts after a refresh, and losing it on refresh is acceptable for a lab.

## Never Rules

Never commit a real token; never put a database password in a Vite or Angular environment file.

## Fixture

All examples use the fake token lab-token-001.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Token Storage Options

## Study the Table

_____

## Lab Choice

_____

## Never Rules

_____

## Fixture

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The storage table, a justified choice, never-commit rules, and the fake fixture in `notes/lab36-security.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-security.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-security.md`
- [ ] Storage table copied
- [ ] Choice justified in two sentences
- [ ] Never-commit rules written
- [ ] Only lab-token-001 used
