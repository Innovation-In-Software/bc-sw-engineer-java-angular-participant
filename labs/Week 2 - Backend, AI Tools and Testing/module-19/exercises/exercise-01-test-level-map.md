# Exercise 1 — Place Tests on the Pyramid

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–12) |
| **Deliverable** | `notes/lab19-test-level-map.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Place concrete CRM tests at each pyramid level and explain the shape in terms of cost and confidence.

### Enterprise context

An inverted pyramid gives slow, flaky feedback that teams eventually learn to ignore.

### Predict

Your suite is forty Selenium tests and six unit tests. What does the PR gate feel like?

### Debug

A test proves the controller maps JSON correctly but starts a browser. Which level should it be?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only one level given | Cover unit, integration, and end-to-end |
| No cost stated | Say what each level costs in time |
| Inverted pyramid | Many unit, some integration, few e2e |

**Module 19** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-test-level-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Place Tests on the Pyramid

## Three Levels

Unit: the status-transition rule in CustomerService. Integration: GET /api/customers/CUS-1001 hitting a real database. End-to-end: Selenium opening the list and editing Amina.

## Cost and Speed

Unit runs in milliseconds and proves logic; integration runs in seconds and proves wiring; end-to-end takes tens of seconds and proves the user journey.

## Shape

Unit tests are cheap and pinpoint failures; end-to-end tests are slow and fail for unrelated reasons, so you keep only the few that cover critical journeys.

## Scope

Plan only — no test code yet; Lab 19 writes the suite.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-test-level-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Place Tests on the Pyramid

## Three Levels

_____

## Cost and Speed

_____

## Shape

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

One CRM example per level with cost and value, plus the pyramid rationale, in `notes/lab19-test-level-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-test-level-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-test-level-map.md`
- [ ] All three levels exemplified
- [ ] Speed and value noted per level
- [ ] Pyramid shape justified
