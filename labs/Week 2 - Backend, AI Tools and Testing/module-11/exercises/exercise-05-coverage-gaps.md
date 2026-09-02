# Exercise 5 — Coverage Gaps Map

**Module 11** · Checkpoint D · Exercises 1–6 Pass then Lab 11

## Activity card

| | |
| --- | --- |
| **Objective** | Map what Lab 11 covers vs what Labs 17–18 will deepen |
| **Skills practiced** | Coverage honesty, curriculum boundaries |
| **Expected outcome** | notes/lab11-coverage-gaps.md |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-11-exercises/` → notes/lab11-coverage-gaps.md |
| **Checkpoint** | D (after slides 89) |

## What you will learn

- Lab 11 is a bridge — not 100% coverage theater
- JUnit depth and Mockito isolation expand later
- Name gaps so Copilot cannot claim completeness

**Enterprise context:** Honest coverage maps prevent false audit claims from AI suites.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab11-coverage-gaps.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 11 coverage gaps map

## In scope for Lab 11 (prep + lab)
- AI-assisted happy-path / status-change test sketch
- AAA discipline (Arrange / Act / Assert)
- Reject trivial asserts (assertNotNull-only, assertTrue(true))
- Extract CustomerNotifier + one Mockito verify (preview)

## Deferred to Lab 17
- Parameterized tests and stronger naming conventions
- JaCoCo coverage narrative / gates

## Deferred to Lab 18
- stub vs verify depth
- ArgumentCaptor and richer interaction testing

## One sentence takeaway
Lab 11 is a guided preview of AI + tests; Labs 17–18 are the formal testing curriculum.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/lab11-coverage-gaps.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 11 coverage gaps map

## In scope for Lab 11 (prep + lab)
- AI-assisted happy-path / status-change test sketch
- AAA discipline (Arrange / Act / Assert)
- Reject trivial asserts (assertNotNull-only, assertTrue(true))
- Extract CustomerNotifier + one Mockito verify (preview)

## Deferred to Lab 17
- Parameterized tests and stronger naming conventions
- JaCoCo coverage narrative / gates

## Deferred to Lab 18
- stub vs verify depth
- ArgumentCaptor and richer interaction testing

## One sentence takeaway
Lab 11 is a guided preview of AI + tests; Labs 17–18 are the formal testing curriculum.
```

You may add one extra bullet under each section; do not delete the required themes.

### Step 3 — Self-check

File separates **Lab 11** vs **Lab 17** vs **Lab 18** — no “Copilot = 100% coverage” claim.

## Expected result

`notes/lab11-coverage-gaps.md` with a clear boundary map between Lab 11 and Labs 17–18.


## Debug / design challenge

List one gap Lab 18 will own that Lab 11 only samples.

## Predict the Output / Behavior

Is 'Copilot wrote 8 tests' enough proof of production readiness?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| Mixing Lab 17 and 18 items | JaCoCo / parameterized → 17; Mockito depth / captor → 18 |
| Claiming full coverage now | Remove that claim; Lab 11 is a preview |
| Wrong file name | Must be `notes/lab11-coverage-gaps.md` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-coverage-gaps.md` | Pass / Fail |
| 2 | Lab 11 in-scope items listed | Pass / Fail |
| 3 | Lab 17 and Lab 18 deferred items named | Pass / Fail |
