# Exercise 4 — Sketch Schema and Migrations

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 37–49) |
| **Deliverable** | `notes/lab50-schema-migrations.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Sketch the tables, ordered Flyway migrations, and one justified index for the capstone slice.

### Enterprise context

Migrations invented during a build session collide across branches and cannot be replayed onto a fresh environment.

### Predict

You edit `V1__create_customer_table.sql` after it has already run in dev — what does Flyway do next?

### Debug

Interaction history for CUS-1001 does a sequential scan — which index is missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Migrations unnumbered | Use V1__, V2__, V3__ versioned naming |
| Index with no query | Name the query each index serves |
| Editing an applied migration | Add a new version; never edit an applied one |

**Module 50** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-schema-migrations.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Sketch Schema and Migrations

## Tables

customer (id uuid pk, name, email, status, created_at); interaction (id uuid pk, customer_id fk, note, occurred_at).

## Migration Order

V1__create_customer_table.sql, then V2__create_interaction_table.sql, then V3__index_interaction_customer_occurred_at.sql.

## Index Decision

Composite index on interaction(customer_id, occurred_at) serves the interaction-history-by-customer read.

## Seed Rule

Seeds are synthetic only: CUS-1001 Amina Khan ACTIVE and CUS-1002 Ravi Singh PROSPECT.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-schema-migrations.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Sketch Schema and Migrations

## Tables

_____

## Migration Order

_____

## Index Decision

_____

## Seed Rule

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Named tables, an ordered Flyway list, one justified index, and a synthetic-seed rule in `notes/lab50-schema-migrations.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-schema-migrations.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-schema-migrations.md`
- [ ] Tables and primary keys named
- [ ] Flyway files listed in version order
- [ ] One index tied to a named query
- [ ] Synthetic-seed rule written
