# Exercise 2 — Pin the API Client Contract

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 20–26) |
| **Deliverable** | `notes/lab50-api-client-contract.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Pin the typed service contract and DTO shape before writing any HttpClient call.

### Enterprise context

A frontend model that drifts from the API DTO fails at runtime in the browser, not at compile time in CI.

### Predict

Java sends `createdAt` as an ISO string and TypeScript types it as `Date` — where does that break?

### Debug

`getById('CUS-9999')` returns 404. Does your contract say what the service returns to the component?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Methods listed without status codes | Add 201 + Location, 404, 409 where they apply |
| DTO fields untyped | Give every field a TypeScript type |
| No mismatch named | Name one concrete field that could drift |

**Module 50** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-api-client-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Pin the API Client Contract

## Method Table

list GET /api/customers?page&size; getById GET /api/customers/{id}; create POST → 201 + Location; update PUT; delete DELETE → 204.

## DTO Fields

id: string; name: string; email: string; status: 'ACTIVE' | 'PROSPECT'; createdAt: string (ISO, not Date).

## Mismatch Risk

createdAt: Java sends an ISO-8601 string; typing it as Date in TypeScript compiles but breaks at runtime.

## Scope

Contract only — no HttpClient code and no interceptor written yet.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-api-client-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Pin the API Client Contract

## Method Table

_____

## DTO Fields

_____

## Mismatch Risk

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A five-method contract with status codes, a typed CustomerDto, and one named drift risk in `notes/lab50-api-client-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-api-client-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-api-client-contract.md`
- [ ] Five methods with verb, URL, and status
- [ ] CustomerDto fields typed
- [ ] One concrete drift risk named
