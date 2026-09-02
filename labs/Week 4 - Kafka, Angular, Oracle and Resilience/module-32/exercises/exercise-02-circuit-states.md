# Exercise 4 — Circuit States

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 60–64) |
| **Deliverable** | `notes/lab32-circuit-states.md` |
| **Fixtures** | CUS-1001 Account Profile · instance `accountProfile` |

### What you will learn

Describe CLOSED, OPEN, HALF_OPEN and what CRM traffic does in each.

### Enterprise context

OPEN must fail fast so WireMock (dependency) is not hammered.

### Predict

In OPEN, do outbound calls still hit the Account API?

### Debug

CB never opens in tests — wrong instance name?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Forgot half-open | HALF_OPEN probes before returning to CLOSED |
| Confused with Kafka lag | Circuit is for outbound HTTP calls here |

**Module 32** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab32-circuit-states.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Circuit States

## Step 1 — Closed

Normal calls flow; failures counted.

## Step 2 — Open

Calls fail fast / use fallback; Account Profile is not hammered.

## Step 3 — Half-open

Trial calls probe recovery; success → closed, failure → open.

## Step 4 — Draw

Sketch a tiny state diagram (boxes + arrows) in markdown.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-circuit-states.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Circuit States

## Step 1 — Closed

Normal calls flow; failures counted.

## Step 2 — Open

Calls fail fast / use fallback; Account Profile is not hammered.

## Step 3 — Half-open

Trial calls probe recovery; success → closed, failure → open.

## Step 4 — Draw

Sketch a tiny state diagram (boxes + arrows) in markdown.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

State descriptions plus a simple diagram in notes in `notes/lab32-circuit-states.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-circuit-states.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-circuit-states.md`
- [ ] All three states described
- [ ] Diagram present
- [ ] Fallback mentioned for open

