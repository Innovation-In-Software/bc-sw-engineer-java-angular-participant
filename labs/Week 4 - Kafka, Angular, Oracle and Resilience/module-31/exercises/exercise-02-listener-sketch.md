# Exercise 2 — Listener Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **C** (after slides 37–40) |
| **Deliverable** | `notes/lab31-listener-sketch.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

Sketch @KafkaListener signature, topics, group, and key↔payload checks.

### Enterprise context

Notification path must validate CUS-1001 key matches event data.

### Predict

Wrong group-id — do you re-read all history or skip?

### Debug

Listener method returns void vs Acknowledgment — when matters?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No topics attribute | Bind to crm.customer-events.v1 explicitly |
| Skipping key check | Reject or DLT when key ≠ customerId |

**Module 31** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-listener-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Listener Sketch

## Step 1 — Method outline

in this notes file.: `@KafkaListener(topics="crm.customer-events.v1", groupId="crm-notifications")` void onCustomerEvent(...).

## Step 2 — Second group

Sketch the audit listener with groupId `crm-audit` on the same topic.

## Step 3 — Payload type

Decide: start with `String`/`JsonNode` or a typed `CustomerEvent` DTO — pick one and justify in one line.

## Step 4 — Correlation

Note where you will log `correlationId` / `lab-request-001` for support.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-listener-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Listener Sketch

## Step 1 — Method outline

in this notes file.: `@KafkaListener(topics="crm.customer-events.v1", groupId="crm-notifications")` void onCustomerEvent(...).

## Step 2 — Second group

Sketch the audit listener with groupId `crm-audit` on the same topic.

## Step 3 — Payload type

Decide: start with `String`/`JsonNode` or a typed `CustomerEvent` DTO — pick one and justify in one line.

## Step 4 — Correlation

Note where you will log `correlationId` / `lab-request-001` for support.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two sketched listeners with group IDs and a payload typing choice in `notes/lab31-listener-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-listener-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-listener-sketch.md`
- [ ] Both groupIds present
- [ ] Same topic for both
- [ ] Typing + correlation notes written

