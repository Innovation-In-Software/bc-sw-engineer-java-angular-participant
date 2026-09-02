# Exercise 1 — Entity vs DTO

**Module 14** · Checkpoint A · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Explain why Northstar HTTP/JSON payloads must not be persistence entities |
| **Skills practiced** | Entity vs DTO boundary, leak risk naming |
| **Expected outcome** | notes/lab14-entity-vs-dto.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-entity-vs-dto.md |
| **Checkpoint** | A (after slides 133–135) |

## What you will learn

- Entity = persistence shape; DTO = API contract shape
- Exposing entities leaks audit columns, lazy relations, internal flags
- Amina/Ravi fixtures drive response field lists without JPA annotations

**Enterprise context:** CRM APIs that return entities couple clients to schema churn and risk leaking PII/internal fields.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-entity-vs-dto.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Entity vs DTO

## Step 1 — Definitions
Entity = persistence shape; DTO = API contract shape.

## Step 2 — Leak risks
List two leaks: internal flags, lazy relations, or audit columns in responses.

## Step 3 — Fixture DTO fields
DTO fields for Amina: customerId, fullName, status — no persistence annotations.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-entity-vs-dto.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Entity vs DTO

## Step 1 — Definitions
Entity = _____; DTO = _____.

## Step 2 — Leak risks
1. _____
2. _____

## Step 3 — Fixture DTO fields
Amina (`CUS-1001`) response fields: _____

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear entity/DTO split with fixture field list in `notes/lab14-entity-vs-dto.md`.

## Debug / design challenge

Someone returned `Customer` from the facade — name two fields that should never appear on the wire.

## Predict the Output / Behavior

If the client gets `version`/`createdBy` after a schema change, what broke?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-entity-vs-dto.md` |
| Treating entity and DTO as synonyms | Rewrite definitions with persistence vs contract |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 14 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-entity-vs-dto.md`
- [ ] Definitions written
- [ ] Two leak risks
- [ ] Amina DTO fields listed
