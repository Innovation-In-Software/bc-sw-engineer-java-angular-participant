# Exercise 3 — Smell Bingo

**Module 12** · Checkpoint B · Exercises 1–6 Pass then Lab 12

## Activity card

| | |
| --- | --- |
| **Objective** | Mark smells in a messy CustomerService snippet (bingo) |
| **Skills practiced** | Smell recognition, refactor triggers |
| **Expected outcome** | notes/lab12-smell-bingo.md |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-12-exercises/` → notes/lab12-smell-bingo.md |
| **Checkpoint** | B (after slides 100–104) |

## What you will learn

- Smells are signals — name them before rewriting
- Complexity/readability issues often cluster
- Lab 12 docs/smells.md will expand this list

**Enterprise context:** Smell catalogs make code review concrete instead of taste-based.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab12-smell-bingo.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Smell Bingo

## Step 1 — Smell list

Bingo card: long method, magic strings for ACTIVE/PROSPECT, == on Strings, mixed I/O in domain, unclear names.

## Step 2 — Fixture tie-in

For each smell, note how it could corrupt CUS-1001 / CUS-1002 handling.

## Step 3 — Priority

Star the two smells you will fix first in the timed lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-smell-bingo.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Smell Bingo

## Step 1 — Smell list

Bingo card: long method, magic strings for ACTIVE/PROSPECT, == on Strings, mixed I/O in domain, unclear names.

## Step 2 — Fixture tie-in

For each smell, note how it could corrupt CUS-1001 / CUS-1002 handling.

## Step 3 — Priority

Star the two smells you will fix first in the timed lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A smell bingo card prioritized for Lab 12 in `notes/lab12-smell-bingo.md`.


## Debug / design challenge

Find == on String ids — mark it as a smell with a fix note.

## Predict the Output / Behavior

Is a 60-line doStuff method a long-method smell?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-smell-bingo.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 12 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-smell-bingo.md`
- [ ] Five smells listed
- [ ] Fixture impact noted
- [ ] Two priorities starred

