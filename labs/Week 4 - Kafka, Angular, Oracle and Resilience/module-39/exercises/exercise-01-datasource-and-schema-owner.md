# Exercise 1 — Decide Who Owns the Schema

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–22) |
| **Deliverable** | `notes/lab39-schema-owner.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Distinguish JPA, Hibernate, and Spring Data JPA, and put schema ownership with migrations rather than Hibernate.

### Enterprise context

ddl-auto=update means the schema differs per environment, was never reviewed, and cannot be rolled back.

### Predict

`ddl-auto=update` runs against production. What review did that schema change receive?

### Debug

An entity field has no matching column and startup succeeds anyway. What is ddl-auto set to?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| ddl-auto=update | Migrations own the schema; use validate |
| Three layers conflated | Spec, implementation, and repository layer |
| Password in application.yml | Inject it from the environment |

**Module 39** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-schema-owner.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Decide Who Owns the Schema

## Layer Roles

JPA is the specification, Hibernate implements it, and Spring Data JPA generates repository implementations over it.

## Datasource Keys

spring.datasource.url, username, password, and driver-class-name, plus spring.jpa properties.

## Schema Owner

Flyway migrations own the schema; spring.jpa.hibernate.ddl-auto=validate so a mismatch fails at startup.

## No Secrets

The password is injected from an environment variable or secret store — never written into a committed file.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-schema-owner.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Decide Who Owns the Schema

## Layer Roles

_____

## Datasource Keys

_____

## Schema Owner

_____

## No Secrets

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The three layers distinguished, datasource keys, schema ownership with ddl-auto=validate, and the secret rule in `notes/lab39-schema-owner.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-schema-owner.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-schema-owner.md`
- [ ] JPA, Hibernate, Spring Data distinguished
- [ ] Datasource properties named
- [ ] Migrations own the schema, ddl-auto=validate
- [ ] Password source stated
