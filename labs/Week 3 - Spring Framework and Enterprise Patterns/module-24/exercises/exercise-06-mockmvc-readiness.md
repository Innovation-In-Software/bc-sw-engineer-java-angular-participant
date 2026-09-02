# Exercise 6 — Plan MockMvc Tests and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 57–62) |
| **Deliverable** | `notes/lab24-mockmvc-readiness.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Design four MockMvc cases with real content assertions, and confirm the earlier deliverables are complete.

### Enterprise context

A test that asserts only on status code passes even when the endpoint returns the wrong customer entirely.

### Predict

Your get-found test asserts only `status().isOk()`. What bug still passes?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Status-only assertions | Add one jsonPath content assertion per case |
| Missing the 404 case | CUS-9999 must be covered |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 24** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-mockmvc-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Plan MockMvc Tests and Self-Check

## Test Matrix

get CUS-1001 found; get CUS-9999 missing; create CUS-1003; list filtered by status=ACTIVE.

## Assertions

200 with $.name = Amina Khan; 404 with no body; 201 with a Location header; 200 with $.content length 1.

## No Real Server

MockMvc drives the Spring MVC stack in-process, so there is no port, no server start, and no browser.

## Pass Mark

Pass — mapping-plan, binding-table, response-map, validation-flow, and cors-angular are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-mockmvc-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Plan MockMvc Tests and Self-Check

## Test Matrix

_____

## Assertions

_____

## No Real Server

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Four MockMvc cases with status and content assertions, the in-process rationale, and an honest Pass/Fail mark in `notes/lab24-mockmvc-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-mockmvc-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-mockmvc-readiness.md`
- [ ] Four cases including the 404
- [ ] Each case asserts status and content
- [ ] MockMvc rationale written
- [ ] All five earlier notes files confirmed complete
