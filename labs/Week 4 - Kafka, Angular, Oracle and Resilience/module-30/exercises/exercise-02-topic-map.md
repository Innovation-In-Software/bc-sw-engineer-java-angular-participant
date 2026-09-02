# Exercise 2 — Topic and Key Map

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 9–14) |
| **Deliverable** | `notes/lab30-topic-map.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Name topics, partitions, and customer-ID keys for Amina/Ravi.

### Enterprise context

Same customerId key → same partition → per-customer order.

### Predict

What happens if key is null / random?

### Debug

Two topics vs one topic + eventType — trade-offs?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Forgot DLQ name | Plan crm.customer-events.v1.dlq now |
| Partition count unknown | Lab uses 3 partitions — document why |

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-30-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab30-topic-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 30 — Topic and Key Map

## Reference

| Concept | Northstar choice |
| --- | --- |
| Main topic | crm.customer-events.v1 |
| DLQ topic | crm.customer-events.v1.dlq |
| Partitions (lab) | 3 |
| Record key | customerId (e.g. CUS-1001) |

## Step 2 — Keying reason

Write why keying by `CUS-1001` / `CUS-1002` keeps a customer's events ordered within a partition.

## Step 3 — Versioning

Explain what the `.v1` suffix buys the team when the payload schema changes later.

## Step 4 — DLQ trigger

List two failure cases that should land a record in the DLQ (conceptual only).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-30-exercises/`, create `notes/` if needed, then create `notes/lab30-topic-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 30 — Topic and Key Map

## Reference

| Concept | Northstar choice |
| --- | --- |
| Main topic | crm.customer-events.v1 |
| DLQ topic | crm.customer-events.v1.dlq |
| Partitions (lab) | 3 |
| Record key | customerId (e.g. CUS-1001) |

## Step 2 — Keying reason

Write why keying by `CUS-1001` / `CUS-1002` keeps a customer's events ordered within a partition.

## Step 3 — Versioning

Explain what the `.v1` suffix buys the team when the payload schema changes later.

## Step 4 — DLQ trigger

List two failure cases that should land a record in the DLQ (conceptual only).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A filled topic/key map plus DLQ failure examples ready for Lab 30 in `notes/lab30-topic-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab30-topic-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 30 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab30-topic-map.md`
- [ ] Main + DLQ topic names match the reference
- [ ] Key = customerId justified
- [ ] Two DLQ cases listed

