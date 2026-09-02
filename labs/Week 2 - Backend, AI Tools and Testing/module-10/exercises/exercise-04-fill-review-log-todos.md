# Exercise 4 — Fill Review-Log TODOs

**Module 10** · Checkpoint C · Exercises 1–6 Pass then Lab 10

## Activity card

| | |
| --- | --- |
| **Objective** | Fill review-log TODOs before accepting Copilot hunks in Lab 10 |
| **Skills practiced** | Review logging, Accept/Reject/Edit discipline |
| **Expected outcome** | notes/lab10-review-log-todos.md with blanks filled |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-10-exercises/` → notes/lab10-review-log-todos.md |
| **Checkpoint** | C (after slides 70–71) |

## What you will learn

- Review logs prove you did not accept AI blindly
- Fixture checks catch wrong status defaults early
- Edit is often better than infinite re-prompting

**Enterprise context:** Audit-friendly AI use means recording what you accepted and why.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file (starter) | `notes/lab10-review-log-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 10 review-log TODOs

Prompt strength: (your note here)
Phantom annotation found? (your note here) (yes/no + name)
Fixture check Amina status: (your note here)
Fixture check Ravi status: (your note here)
JDK/Maven note: (your note here)
Accept / Reject / Edit: (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Copy template

Create `notes/lab10-review-log-todos.md` and paste:

```markdown
# Lab 10 review-log TODOs

Prompt strength: _____
Phantom annotation found? _____ (yes/no + name)
Fixture check Amina status: _____
Fixture check Ravi status: _____
JDK/Maven note: _____
Accept / Reject / Edit: _____
```

### Step 2 — Fill blanks

Replace each `_____` with concrete prep values (e.g. ACTIVE, PROSPECT, JDK 21, Reject).

### Step 3 — One reject reason

If Reject/Edit, write one sentence naming the invented API or wrong fixture.

### Step 4 — Self-check

Confirm Ravi is PROSPECT and Amina is ACTIVE; fix any swapped blanks.

## Expected result

A completed review-log TODO sheet at `notes/lab10-review-log-todos.md` with correct Northstar statuses.


## Debug / design challenge

Leave Accept/Reject blank — explain why graders fail that entry.

## Predict the Output / Behavior

If phantom annotation found = yes, should Accept still be the default?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| Leaving blanks empty | Fill every `_____` before claiming prep done |
| Swapping Amina/Ravi status | Amina ACTIVE; Ravi PROSPECT |
| Wrong file name | Must be `notes/lab10-review-log-todos.md` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab10-review-log-todos.md`
- [ ] All `_____` replaced
- [ ] Statuses match fixtures
- [ ] Accept/Reject decision recorded

