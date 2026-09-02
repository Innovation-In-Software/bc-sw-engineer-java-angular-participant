# Exercise 6 — Plan Repository Tests and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 85–94) |
| **Deliverable** | `notes/lab39-readiness.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Plan repository tests against real PostgreSQL and understand why open-in-view is disabled.

### Enterprise context

Repository tests exist to verify the mapping against the real database; on H2 they verify it against H2.

### Predict

With open-in-view enabled, a lazy association is serialised in the controller. What happens, and when do you notice?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Tests on H2 | Use real PostgreSQL via Testcontainers |
| Only happy paths | Include the constraint-violation case |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 39** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Plan Repository Tests and Self-Check

## Test Cases

findByEmail returns Amina CUS-1001; findByStatus pages correctly; inserting a duplicate email throws DataIntegrityViolationException.

## Real PostgreSQL

The tests verify mapping, constraints, and native behaviour — all of which differ on H2, so H2 would prove the wrong thing.

## Open-in-View

Open-in-view keeps the persistence context open during rendering, so lazy loads succeed silently and hide N+1; disabling it fails fast.

## Pass Mark

Pass — schema-owner, entity-mapping, repository, fetch-strategy, and transactions-migrations are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Plan Repository Tests and Self-Check

## Test Cases

_____

## Real PostgreSQL

_____

## Open-in-View

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three repository test cases, the real-PostgreSQL rationale, the open-in-view reasoning, and an honest Pass/Fail mark in `notes/lab39-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-readiness.md`
- [ ] Three cases including a failure case
- [ ] Real PostgreSQL justified
- [ ] Open-in-view explained
- [ ] All five earlier notes files confirmed complete
