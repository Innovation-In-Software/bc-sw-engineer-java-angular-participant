# Exercise 6 — Plan Evidence and Self-Check

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 70–92) |
| **Deliverable** | `notes/lab35-readiness.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Plan the network evidence, trace the full stack, and fix a debugging order for integration failures.

### Enterprise context

A disciplined check order finds an integration bug in two minutes; guessing at the template takes twenty.

### Predict

The list is blank and the Network tab is empty. Is the bug in the backend?

### Debug

One of your five earlier notes files still contains `_____` — does that count as Pass?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Screenshot without headers | The correlation header must be visible |
| Debug order starts at the template | Check the request left the browser first |
| Earlier file still has blanks | That is a Fail — finish it, then re-mark |

**Module 35** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Plan Evidence and Self-Check

## Network Evidence

A Network tab capture of GET /api/customers returning 200, with X-Correlation-Id: lab-request-001 visible in the request headers.

## End-to-End Trace

Click → CustomerApiService → interceptor → Spring controller → service → repository → PostgreSQL, and the response back.

## Debug Order

Did the request leave the browser, what status returned, what body returned, then the component.

## Pass Mark

Pass — api-service, typed-models, ui-states, errors-interceptors, and environments-cors are all complete.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Plan Evidence and Self-Check

## Network Evidence

_____

## End-to-End Trace

_____

## Debug Order

_____

## Pass Mark

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A named evidence capture, a full-stack trace, a debug order, and an honest Pass/Fail mark in `notes/lab35-readiness.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-readiness.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-readiness.md`
- [ ] Screenshot content specified
- [ ] End-to-end hops written
- [ ] Debug order starts at the network
- [ ] All five earlier notes files confirmed complete
