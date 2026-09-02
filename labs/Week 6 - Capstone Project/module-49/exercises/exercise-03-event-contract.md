# Exercise 3 — Sketch Event Contract

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 46–50) |
| **Deliverable** | `notes/lab49-event-contract.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · CUS-9999 not-found |

### What you will learn

Sketch versioned Kafka event fields (e.g. CustomerInteractionRecordedV1) + correlation.

### Enterprise context

Unversioned payloads are not done—consumers and Lab 50/52 need a stable contract.

### Predict

Why include eventVersion / V1 in the type name?

### Debug

Publishing before DB commit — risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No correlation id | Include lab-request-001 / header plan |
| Unversioned 'done' | Name V1 fields explicitly |

**Module 49** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab49-event-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Sketch Event Contract

## Step 1 — Fields

eventType, eventVersion, customerId, occurredAt, correlationId, payload{}

## Step 2 — Check the reference

Consumers must be idempotent; duplicates are normal.

## Step 3 — Example

Write one example JSON for `CUS-1001` with `lab-request-001` (synthetic).

## Step 4 — Compatibility

One sentence on how you will handle a v2 field addition later.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-event-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Sketch Event Contract

## Step 1 — Fields

eventType, eventVersion, customerId, occurredAt, correlationId, payload{}

## Step 2 — Check the reference

Consumers must be idempotent; duplicates are normal.

## Step 3 — Example

Write one example JSON for `CUS-1001` with `lab-request-001` (synthetic).

## Step 4 — Compatibility

One sentence on how you will handle a v2 field addition later.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Versioned event contract sketch with example JSON in `notes/lab49-event-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-event-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-event-contract.md`
- [ ] Version field present
- [ ] Example uses fixtures
- [ ] Compatibility note written

