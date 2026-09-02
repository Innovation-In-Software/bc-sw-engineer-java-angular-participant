# Exercise 3 — MDC Lifecycle

**Module 20** · Checkpoint C · Exercises 1–6 Pass then Lab 20

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch put → use → clear MDC for correlation across a request |
| **Skills practiced** | MDC request scoping |
| **Expected outcome** | notes/lab20-mdc-lifecycle.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-20-exercises/` → notes/lab20-mdc-lifecycle.md |
| **Checkpoint** | C (after slides 245–247) |

## What you will learn

- Put correlation on request entry
- Service logs pick up MDC via pattern
- Clear in finally to prevent leaks

**Enterprise context:** Without MDC, grepping one partner outage means reading every INFO line manually.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab20-mdc-lifecycle.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — MDC Lifecycle

Put: MDC.put("corr", "lab-request-001") on entry.
Use: service logs include corr via %X{corr}.
Clear: finally { MDC.clear(); }
Metrics/Actuator wait for Lab 21.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-mdc-lifecycle.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — MDC Lifecycle

## Put
_____

## Use
_____

## Clear
_____

## Lab 21 boundary
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

MDC lifecycle sketch in `notes/lab20-mdc-lifecycle.md`.

## Debug / design challenge

Where should put happen — controller method body only, or a filter wrapping all requests?

## Predict the Output / Behavior

Does Logback pattern %X{corr} work if you never MDC.put?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-mdc-lifecycle.md` |
| Skipping clear | Add finally clear |
| Claiming Actuator required now | Defer to Lab 21 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-mdc-lifecycle.md`
- [ ] Put step
- [ ] Use step
- [ ] Clear step
