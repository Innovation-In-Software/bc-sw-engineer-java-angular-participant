# Exercise 1 — Choose Column Types Deliberately

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 16–32) |
| **Deliverable** | `notes/lab37-type-choices.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Choose a deliberate PostgreSQL type per column, including the money and timestamp rules.

### Enterprise context

A money column stored as double produces rounding discrepancies that surface in reconciliation, long after release.

### Predict

You sum ten thousand `double precision` balances. What does the total disagree with?

### Debug

A `timestamp` column is read from a server in another region. What is now ambiguous?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| float used for money | numeric with an explicit scale |
| timestamp without time zone | timestamptz stores an absolute instant |
| Everything in one JSONB blob | Anything you filter or join on deserves a column |

**Module 37** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-type-choices.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Choose Column Types Deliberately

## Column Table

id text for CUS-1001 style keys (or uuid), name text, email text, status text, created_at timestamptz.

## Money Rule

numeric(12,2) holds money; float and double precision must never, because they cannot store 0.10 exactly.

## Time Zones

timestamptz — it records an absolute instant, so the value stays unambiguous across regions.

## JSONB Limit

JSONB suits genuinely variable attributes; anything filtered, joined, or constrained belongs in a real column.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-type-choices.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Choose Column Types Deliberately

## Column Table

_____

## Money Rule

_____

## Time Zones

_____

## JSONB Limit

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A per-column type table with the money, timestamp, and JSONB rules in `notes/lab37-type-choices.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-type-choices.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-type-choices.md`
- [ ] Type given for every customer column
- [ ] numeric justified for money
- [ ] timestamptz justified
- [ ] JSONB boundary stated
