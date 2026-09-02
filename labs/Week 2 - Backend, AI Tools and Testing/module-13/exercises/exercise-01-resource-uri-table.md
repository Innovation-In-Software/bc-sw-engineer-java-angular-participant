# Exercise 1 — Design the Resource URI Table

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 28–34) |
| **Deliverable** | `notes/lab13-uri-table.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT · CUS-9999 not found |

### What you will learn

Turn the CRM domain into a resource-oriented URI table with plural nouns and no verbs in paths.

### Enterprise context

URIs are the part of an API you cannot change once clients depend on them. Verb-in-path designs multiply forever.

### Predict

You expose /getCustomer and /updateCustomer. What happens when delete and search arrive?

### Debug

A teammate proposes /api/customer/CUS-1001/getInteractions — name the two problems.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Verbs in the path | The HTTP method is the verb; the path is the noun |
| Singular collection name | Use plural: /api/customers |
| Sub-resource missing | Show interactions nested under a customer |

**Module 13** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-uri-table.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Design the Resource URI Table

## Name the Nouns

Resources: customers (top level) and interactions (nested beneath a customer).

## URI Table

/api/customers for the collection, /api/customers/CUS-1001 for the item, /api/customers/CUS-1001/interactions for the sub-resource.

## Fix a Bad URI

/getCustomerById?id=CUS-1001 becomes GET /api/customers/CUS-1001 — the verb moves into the method.

## Scope

Design only — no controller and no OpenAPI YAML written yet.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-uri-table.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Design the Resource URI Table

## Name the Nouns

_____

## URI Table

_____

## Fix a Bad URI

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A URI table with collection, item, and sub-resource paths, plus one corrected bad URI, in `notes/lab13-uri-table.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-uri-table.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-uri-table.md`
- [ ] Resources named as plural nouns
- [ ] Collection, item, and sub-resource URIs written
- [ ] One bad URI rewritten with the reason
