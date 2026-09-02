# Exercise 2 — Controller-Service-Repository Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 35–41) |
| **Deliverable** | `notes/lab49-layer-checklist.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · CUS-9999 not-found |

### What you will learn

Checklist DTO validation, service transactions, and repository boundaries.

### Enterprise context

Controllers stay thin; business rules and transactions live in the service.

### Predict

Where should Bean Validation annotations live?

### Debug

Entity leaked in JSON response — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Fat controllers | Move logic to service |
| Weaken validation for demos | Keep constraints; fix tests |

**Module 49** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab49-layer-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Controller-Service-Repository Checklist

## Reference

| Layer | Owns | Avoids |
| --- | --- | --- |
| Controller | HTTP mapping, status codes | Business rules sprawl |
| Service | Transactions, domain rules | Raw JDBC in controller |
| Repository | Persistence | HTTP concerns |

## Step 1 — Table

Controller: HTTP/DTO; Service: rules/transactions; Repository: persistence.

## Step 2 — Check the reference

Validation belongs on inputs; business rules not only in controllers.

## Step 3 — Transaction note

Mark which service method needs `@Transactional` (placeholder).

## Step 4 — JDK/Maven

Note verify habit: `mvn -B test` on the backend module.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-layer-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Controller-Service-Repository Checklist

## Reference

| Layer | Owns | Avoids |
| --- | --- | --- |
| Controller | HTTP mapping, status codes | Business rules sprawl |
| Service | Transactions, domain rules | Raw JDBC in controller |
| Repository | Persistence | HTTP concerns |

## Step 1 — Table

Controller: HTTP/DTO; Service: rules/transactions; Repository: persistence.

## Step 2 — Check the reference

Validation belongs on inputs; business rules not only in controllers.

## Step 3 — Transaction note

Mark which service method needs `@Transactional` (placeholder).

## Step 4 — JDK/Maven

Note verify habit: `mvn -B test` on the backend module.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Layer checklist with transaction placeholder in `notes/lab49-layer-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-layer-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-layer-checklist.md`
- [ ] Three layers described
- [ ] Validation placement stated
- [ ] `mvn -B test` noted

