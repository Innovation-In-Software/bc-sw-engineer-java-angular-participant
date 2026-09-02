# Exercise 5 — Plan the Role and Connection

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 68–84) |
| **Deliverable** | `notes/lab37-role-connection.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Write the JDBC URL shape and define a least-privilege application role with no DDL rights.

### Enterprise context

An application role that can drop tables means any injection flaw can drop tables too.

### Predict

`crm_app` holds DDL rights and a SQL injection flaw reaches it. What is now possible?

### Debug

A password was committed and then deleted in a later commit. Is it safe?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Password in the URL | Inject it at run time from the environment |
| App role owns DDL | Migrations run as a separate role |
| Superuser used by the app | Grant only the row operations needed |

**Module 37** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-role-connection.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Plan the Role and Connection

## JDBC URL

jdbc:postgresql://localhost:5432/crm with user crm_app; the password is injected, never written in the URL.

## App Role

crm_app may select, insert, update, and delete on the CRM tables — nothing else.

## Least Privilege

It is denied create and drop, so a compromised application cannot alter or destroy the schema.

## Secret Handling

The password comes from an environment variable or secret store at run time; a committed one stays in history forever.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-role-connection.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Plan the Role and Connection

## JDBC URL

_____

## App Role

_____

## Least Privilege

_____

## Secret Handling

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A JDBC URL shape, the app role's grants, one explicit denial, and the secret-handling rule in `notes/lab37-role-connection.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-role-connection.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-role-connection.md`
- [ ] URL written without a password
- [ ] Role grants listed
- [ ] One denial justified
- [ ] Secret handling stated
