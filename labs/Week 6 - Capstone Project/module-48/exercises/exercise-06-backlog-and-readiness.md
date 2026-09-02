# Exercise 6 — Seed the Backlog and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 32–33) |
| **Deliverable** | `notes/lab48-backlog-readiness.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Seed the CAP-12 backlog story for Lab 49 and audit the five earlier plans honestly.

### Enterprise context

Lab 49 builds CAP-12 directly. A vague story or a stubbed plan turns the first capstone build session into re-planning.

### Predict

Your CAP-12 has a title but no acceptance criteria — what is the first argument the team has in Lab 49?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| CAP-12 has no acceptance criteria | Write it as given / when / then with fixtures |
| Stories too large | Each story fits one session |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 48** · Capstone pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-backlog-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Seed the Backlog and Self-Check

## CAP-12 Seed

CAP-12 Record customer interaction: given ACTIVE CUS-1001, when an interaction is recorded, then it persists and InteractionRecorded is published with correlation lab-request-001.

## Two More Stories

CAP-13 Show interaction history for a customer. CAP-14 Reject interaction on an inactive customer with a 409.

## Plan Roll-Call

stack-freeze, actions-plan, iac-plan, ai-usage-plan, environment-strategy — all five exist and contain no `_____`.

## Pass Mark

Pass — every earlier exercise is complete, so Lab 48 can start.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-backlog-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Seed the Backlog and Self-Check

## CAP-12 Seed

_____

## Two More Stories

_____

## Plan Roll-Call

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CAP-12 written as given/when/then, two more sized stories, and an honest Pass/Fail roll-call in `notes/lab48-backlog-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-backlog-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-backlog-readiness.md`
- [ ] CAP-12 has acceptance criteria and fixtures
- [ ] Two further CAP stories, one session each
- [ ] All five earlier notes files confirmed complete
- [ ] Self-mark recorded as Pass or Fail
