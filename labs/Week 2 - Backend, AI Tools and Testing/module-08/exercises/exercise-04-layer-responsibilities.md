# Exercise 4 — Assign Layer Responsibilities

**Module 8** · Checkpoint C · Exercises 1–6 Pass then Lab 8

## Activity card

| | |
| --- | --- |
| **Objective** | Assign responsibilities to controller, service, and repository layers |
| **Skills practiced** | Layered architecture boundaries |
| **Expected outcome** | layer-responsibilities.md with clear ownership |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-08-exercises/` → layer-responsibilities.md |
| **Checkpoint** | C (after slides 10–14) |

## What you will learn

- Controller adapts input/output; service owns business rules
- Repository owns persistence access details
- Cross-cutting concerns (logging/config) should not dump logic into every layer

**Enterprise context:** Audit and change control need a clear owner when a customer update rule changes.

## Layer map

| Layer/package | Owns | Does not own |
| ------------- | ---- | ------------ |
| `controller` | Transport boundary, request/response mapping | Business rules, storage |
| `service` | Validation, orchestration, business policy | HTTP details, SQL |
| `repository` | Save/find abstraction | UI formatting, business workflow |
| `entity` | Domain state/identity | HTTP request shape |
| `dto` | Boundary input/output shape | Persistence behavior |
| `config` | Object/application configuration | Customer operations |
| `exception` | Meaningful failure types | Catch-all utility logic |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `layer-responsibilities.md` and assign each CRM task to the layer that should own it.

**Done looks like:** Every responsibility has one primary home, and the repaired flow follows controller → service → repository.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Assign the tasks

| Task | Layer |
| ---- | ----- |
| Accept future create-customer input | |
| Reject blank customer name | |
| Find customer by ID | |
| Represent customer ID/name/status | |
| Represent create request fields | |
| Define customer-not-found failure | |
| Wire application objects later | |

### Step 2 — Check the reference

```text
accept input → controller
business validation → service
find by ID → repository
domain state → entity
request shape → dto
failure type → exception
wiring/configuration → config
```

### Step 3 — Repair a “god controller”

Bad flow:

```text
Controller validates every business rule
→ edits an in-memory list directly
→ constructs database queries
→ formats errors
```

Rewrite it:

```text
Controller maps request
→ Service validates/orchestrates
→ Repository saves/finds
→ Service returns result
→ Controller maps response
```

### Step 4 — Explain why boundaries help

Write 3–5 sentences covering:

- isolated testing;
- replacing storage without changing controller;
- keeping transport concerns out of business logic;
- making ownership discoverable.

## Expected result

Every responsibility has one primary home, and the repaired flow follows controller → service → repository.


## Debug / design challenge

Put SQL string building in the controller — rewrite ownership correctly.

## Predict the Output / Behavior

Which layer should enforce 'status must be ACTIVE or INACTIVE'?

## Troubleshooting

See steps above if something does not compile or match the worked example.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Seven tasks assigned correctly | Pass / Fail |
| 2 | God-controller flow repaired | Pass / Fail |
| 3 | You explain at least two benefits of boundaries | Pass / Fail |
