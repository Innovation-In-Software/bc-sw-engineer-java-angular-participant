# Exercise 2 — Map the Customer Entity

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 24–36) |
| **Deliverable** | `notes/lab39-entity-mapping.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Map an entity to its table explicitly and name the lifecycle states that determine when changes persist.

### Enterprise context

An entity mapping that disagrees with the migrated schema fails at startup — which is the behaviour you want.

### Predict

You modify a managed entity inside a transaction and never call save. Is the change persisted?

### Debug

Startup fails saying a column is missing. Which artifact is out of date, the entity or the migration?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Implicit column names | Name them explicitly to survive refactoring |
| Id strategy defaulted | Choose IDENTITY or SEQUENCE deliberately |
| Lifecycle states unnamed | Transient, managed, detached, removed |

**Module 39** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-entity-mapping.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Map the Customer Entity

## Annotations

@Entity marks it persistent, @Table binds the table name, @Id marks the key, @Column maps each field.

## Id Strategy

@GeneratedValue(strategy = IDENTITY) maps to a PostgreSQL identity column; SEQUENCE with allocationSize suits bulk inserts.

## Column Mapping

@Column(name = "email", nullable = false, length = 255).

## Lifecycle

Transient, managed, detached, removed — a managed entity has an identity and flushes changes at commit.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-entity-mapping.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Map the Customer Entity

## Annotations

_____

## Id Strategy

_____

## Column Mapping

_____

## Lifecycle

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Annotated entity fields, a justified id strategy, an explicit column mapping, and the lifecycle states in `notes/lab39-entity-mapping.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-entity-mapping.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-entity-mapping.md`
- [ ] Annotations listed with purpose
- [ ] Id strategy justified for PostgreSQL
- [ ] Explicit @Column shown
- [ ] Four lifecycle states named
