# Exercise 1 — Log Level Quiz

**Module 20** · Checkpoint A · Exercises 1–6 Pass then Lab 20

## Activity card

| | |
| --- | --- |
| **Objective** | Assign DEBUG/INFO/WARN/ERROR to CRM events |
| **Skills practiced** | Log level selection |
| **Expected outcome** | notes/lab20-level-quiz.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-20-exercises/` → notes/lab20-level-quiz.md |
| **Checkpoint** | A (after slides 237–243) |

## What you will learn

- Activate success → INFO
- Illegal transition → WARN; unexpected → ERROR
- DEBUG off by default in prod profiles

**Enterprise context:** Wrong levels bury incidents (everything DEBUG) or page on-call (everything ERROR).

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab20-level-quiz.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Log Level Quiz

| Event | Level |
| --- | --- |
| Activate success Ravi | INFO |
| Illegal transition Amina | WARN |
| Unexpected repo failure | ERROR |
| Entering mapper field copy | DEBUG |

DEBUG off by default in prod.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-level-quiz.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Log Level Quiz

| Event | Level |
| --- | --- |
| Activate success Ravi | _____ |
| Illegal transition Amina | _____ |
| Unexpected repo failure | _____ |
| Mapper field copy detail | _____ |

## Prod habit
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled level table in `notes/lab20-level-quiz.md`.

## Debug / design challenge

Should blank-name validation be WARN or ERROR? Pick one and say why.

## Predict the Output / Behavior

If root is DEBUG in prod, what operational problem appears first?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-level-quiz.md` |
| All events ERROR | Differentiate INFO/WARN/ERROR |
| Skipping prod DEBUG habit | Note DEBUG off by default |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-level-quiz.md`
- [ ] Four levels assigned
- [ ] Prod habit present
