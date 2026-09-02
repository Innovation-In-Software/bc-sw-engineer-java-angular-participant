# Exercise 4 — Idempotency Plan

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 41–46) |
| **Deliverable** | `notes/lab31-idempotency-plan.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

Choose an idempotency key and ProcessedEventStore mark timing.

### Enterprise context

Replay of Amina CustomerCreated must not double-notify.

### Predict

Mark after side-effect vs before — which duplicates?

### Debug

Using only offset as id — what if rebalance/replay?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No eventId | Use eventId or customerId+eventType+occurredAt |
| Store in memory only | OK for lab; note prod needs durable store |

**Module 31** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-idempotency-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Idempotency Plan

## Step 1 — Why duplicates

List two causes: producer retry, consumer rebalance/reprocess.

## Step 2 — Business key

Propose an idempotency key, e.g. `eventId` or `customerId+eventType+occurredAt` for `CUS-1001`.

## Step 3 — Store idea

One sentence: check a processed-events table/set before side effects (email).

## Step 4 — Out of scope

Do not implement the table yet — paper design only.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-idempotency-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Idempotency Plan

## Step 1 — Why duplicates

List two causes: producer retry, consumer rebalance/reprocess.

## Step 2 — Business key

Propose an idempotency key, e.g. `eventId` or `customerId+eventType+occurredAt` for `CUS-1001`.

## Step 3 — Store idea

One sentence: check a processed-events table/set before side effects (email).

## Step 4 — Out of scope

Do not implement the table yet — paper design only.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A short idempotency plan tied to Northstar customer events in `notes/lab31-idempotency-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-idempotency-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-idempotency-plan.md`
- [ ] Two duplicate causes
- [ ] Concrete key proposal
- [ ] Processed-store idea stated

