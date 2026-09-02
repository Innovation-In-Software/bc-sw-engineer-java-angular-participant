# Exercise 3 — Sketch Idempotent Handling

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 195–197) |
| **Deliverable** | `notes/lab46-idempotency-sketch.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · correlation lab-request-001 · no PII in metrics |

### What you will learn

Sketch durable idempotency keys for CUS-1001/CUS-1002 event side effects.

### Enterprise context

Replay without idempotency double-applies CRM updates.

### Predict

Replay same event-id twice — what must not happen?

### Debug

Duplicate side effects after DLT replay — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only in-memory seen-set | Persist processed keys |
| Email as metric tag | Use low-cardinality ids only |

**Module 46** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab46-idempotency-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Sketch Idempotent Handling

## Step 1 — Side effects

List side effects your consumer might own (projection upsert, email, audit row).

## Step 2 — Check the reference

Idempotency keys / upserts / dedupe store—pick a strategy in notes.

## Step 3 — Scenario

Describe duplicate delivery for an event about `CUS-1002` status change.

## Step 4 — Test idea

Name one test: process same event twice → one projection row.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-idempotency-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Sketch Idempotent Handling

## Step 1 — Side effects

List side effects your consumer might own (projection upsert, email, audit row).

## Step 2 — Check the reference

Idempotency keys / upserts / dedupe store—pick a strategy in notes.

## Step 3 — Scenario

Describe duplicate delivery for an event about `CUS-1002` status change.

## Step 4 — Test idea

Name one test: process same event twice → one projection row.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Idempotency strategy and duplicate-delivery scenario documented in `notes/lab46-idempotency-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-idempotency-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-idempotency-sketch.md`
- [ ] Side effects listed
- [ ] Strategy chosen
- [ ] Duplicate test idea named

