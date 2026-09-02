# Exercise 1 — Classify Consumer Failures

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 178–183) |
| **Deliverable** | `notes/lab46-failure-taxonomy.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · correlation lab-request-001 · no PII in metrics |

### What you will learn

Classify CRM consumer failures: transient vs poison vs business reject vs infrastructure.

### Enterprise context

Poison on the main topic blocks partitions while lag grows unnoticed.

### Predict

Malformed JSON for CUS-1001 — retry forever or DLT?

### Debug

Lag stuck with no DLT traffic — what to check?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Infinite retry as strategy | Bound retries; route poison to DLT |
| Dumping prod topics for notes | Use training topics only |

**Module 46** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab46-failure-taxonomy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Classify Consumer Failures

## Reference

| Failure | Typical action |
| --- | --- |
| Validation | DLT + fix publisher |
| Deserialization | DLT + schema/version check |
| Transient DB | Bounded retry then DLT |
| Poison forever-retry | Forbidden pattern |

## Step 1 — Categories

List: validation, deserialization, timeout, DB, authz—with one CRM example each.

## Step 2 — Check the reference

Poison messages must not block the partition forever while lag grows unnoticed.

## Step 3 — User impact

Map one failure to stale profile data for `CUS-1001` or stuck status for `CUS-1002`.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-failure-taxonomy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Classify Consumer Failures

## Reference

| Failure | Typical action |
| --- | --- |
| Validation | DLT + fix publisher |
| Deserialization | DLT + schema/version check |
| Transient DB | Bounded retry then DLT |
| Poison forever-retry | Forbidden pattern |

## Step 1 — Categories

List: validation, deserialization, timeout, DB, authz—with one CRM example each.

## Step 2 — Check the reference

Poison messages must not block the partition forever while lag grows unnoticed.

## Step 3 — User impact

Map one failure to stale profile data for `CUS-1001` or stuck status for `CUS-1002`.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Failure taxonomy with CRM user impact in `notes/lab46-failure-taxonomy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-failure-taxonomy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-failure-taxonomy.md`
- [ ] Five categories listed
- [ ] User impact mapped
- [ ] Notes saved

