# Exercise 3 — Model the CRM Relationships

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 52–58) |
| **Deliverable** | `notes/lab37-er-notes.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

State CRM cardinalities precisely, model a many-to-many with a join table, and know when not to normalize.

### Enterprise context

A relationship modelled wrongly is expensive to change once data exists and code depends on it.

### Predict

Tags are stored as a comma-separated string in one column. How do you query for one tag?

### Debug

An invoice shows today's price rather than the price charged last year. What should have been stored?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Cardinality vague | State it as a sentence in both directions |
| List stored in a column | Use a join table with two foreign keys |
| Normalizing history | Store the value as it was, deliberately |

**Module 37** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-er-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Model the CRM Relationships

## Cardinalities

One customer has many accounts; an account belongs to exactly one customer.

## Many-to-Many

Customers and tags: customer_tag(customer_id, tag_id) with a composite primary key over both.

## Normalize

Repeated status labels move into a status table so the allowed set lives in one place.

## When Not To

The price charged on an order is stored, not looked up — the current price will change, the record must not.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-er-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Model the CRM Relationships

## Cardinalities

_____

## Many-to-Many

_____

## Normalize

_____

## When Not To

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Stated cardinalities, a join-table design, one normalization move, and one deliberate exception in `notes/lab37-er-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-er-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-er-notes.md`
- [ ] Cardinality stated in words
- [ ] Join table columns and key given
- [ ] One normalization example
- [ ] One justified denormalization
