# Exercise 2 — Plan Package Organization

**Module 8** · Checkpoint B · Exercises 1–6 Pass then Lab 8

## Activity card

| | |
| --- | --- |
| **Objective** | Plan com.northstar.crm package names that match folder paths |
| **Skills practiced** | Package naming, directory ↔ package mapping |
| **Expected outcome** | package-plan.md with FQNs and rules |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-08-exercises/` → package-plan.md |
| **Checkpoint** | B (after slides 9) |

## What you will learn

- Package names are lowercase and match folders
- Fully qualified names encode layer intent (entity, dto, service…)
- Avoid default package for enterprise code

**Enterprise context:** Large teams navigate Northstar CRM by package, not by hunting flat folders.

## Package rules

| Rule | Good example |
| ---- | ------------ |
| Lowercase package segments | `com.northstar.crm.service` |
| Reverse-domain root | `com.northstar.crm` |
| Class name uses PascalCase | `CustomerService` |
| Folder path matches package declaration | `com/northstar/crm/service` |
| Package describes responsibility | `repository`, not `misc` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `package-plan.md` mapping CRM types to packages and fully qualified class names.

**Done looks like:** All seven types have focused packages, valid fully qualified names, and matching source paths.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Complete the map

| Type | Package | Fully qualified name |
| ---- | ------- | -------------------- |
| `CustomerController` | | |
| `CustomerService` | | |
| `CustomerRepository` | | |
| `Customer` | | |
| `CustomerRequest` | | |
| `AppConfig` | | |
| `CustomerNotFoundException` | | |

### Step 2 — Check the reference

```text
com.northstar.crm.controller.CustomerController
com.northstar.crm.service.CustomerService
com.northstar.crm.repository.CustomerRepository
com.northstar.crm.entity.Customer
com.northstar.crm.dto.CustomerRequest
com.northstar.crm.config.AppConfig
com.northstar.crm.exception.CustomerNotFoundException
```

### Step 3 — Translate package to path

For:

```java
package com.northstar.crm.service;
```

the production source path must be:

```text
src/main/java/com/northstar/crm/service/
```

Write the equivalent path for `CustomerRequest`.

**Expected:** `src/main/java/com/northstar/crm/dto/CustomerRequest.java`

### Step 4 — Correct bad names

| Bad | Correct |
| --- | ------- |
| `com.Northstar.CRM.Service` | `com.northstar.crm.service` |
| package `utils` for customer business rules | `service` or a focused domain package |
| `customer_service.java` | `CustomerService.java` |
| package declaration does not match folders | Make both paths identical |

## Expected result

All seven types have focused packages, valid fully qualified names, and matching source paths.


## Debug / design challenge

Propose com.Northstar.CRM — fix casing and explain why.

## Predict the Output / Behavior

What folder path matches package com.northstar.crm.service?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| IDE reports wrong package | Compare declaration with path under `src/main/java` |
| Everything lands in root package | Create responsibility-specific subpackages |
| Generic `util` becomes a dumping ground | Name packages for a stable concern |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Seven FQCNs are correct | Pass / Fail |
| 2 | DTO path matches its declaration | Pass / Fail |
| 3 | Package segments are lowercase and meaningful | Pass / Fail |
