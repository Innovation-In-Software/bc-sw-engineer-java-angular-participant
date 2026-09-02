# Exercise 5 — Compare Offset and Keyset Paging

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 79–86) |
| **Deliverable** | `notes/lab38-pagination.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · volume data with documented skew |

### What you will learn

Explain OFFSET's real cost, write a keyset query, and guarantee a deterministic sort order.

### Enterprise context

Deep OFFSET paging degrades linearly with page number, so the slowest requests come from the most engaged users.

### Predict

A user reaches page 5000. How many rows did the database produce to return 20?

### Debug

A row appears on both page 2 and page 3. What is missing from the ORDER BY?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| OFFSET assumed cheap | It produces and discards every skipped row |
| Keyset without a tiebreaker | Add the primary key to the ordering |
| Trade-off not stated | Keyset cannot jump to an arbitrary page |

**Module 38** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-pagination.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Compare Offset and Keyset Paging

## Offset Cost

It produces all 100,020 rows in order, discards the first 100,000, and returns the last 20.

## Keyset Query

where (opened_at, id) < (:lastOpenedAt, :lastId) order by opened_at desc, id desc limit 20.

## Trade-off

Keyset cannot jump to an arbitrary page number — it only moves relative to a known row.

## Stable Order

Equal sort values can otherwise shuffle between queries; adding id as the final key makes the order total.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-pagination.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Compare Offset and Keyset Paging

## Offset Cost

_____

## Keyset Query

_____

## Trade-off

_____

## Stable Order

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

OFFSET's cost, a keyset query, its trade-off, and the deterministic-order rule in `notes/lab38-pagination.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-pagination.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-pagination.md`
- [ ] OFFSET cost explained
- [ ] Keyset query written
- [ ] Trade-off stated
- [ ] Tiebreaker justified
