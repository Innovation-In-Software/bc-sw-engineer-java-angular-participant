# Exercise 1 — Identify Domain Entities

**Module 3** · Pre-lab practice · Checkpoint A · all 8 then lab
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Banking Domain Entities and Responsibilities](../../../lab_diagrams/mod03-ex01-domain-entities.png)

> **Design before code:** Lab 3 is a banking system. First translate the business description into objects with focused responsibilities.

## Activity card

| | |
| --- | --- |
| **Objective** | Identify Customer, Account, Transaction entities with attributes and responsibilities |
| **Skills practiced** | Domain modeling, entity vs attribute, relationships |
| **Expected outcome** | notes.md entity table + relationships |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-03-exercises/notes.md` |
| **Checkpoint** | A (after slides 82–89) |

## What you will learn

- Nouns in requirements often become classes
- One clear responsibility per entity
- Design notes before coding Lab 3

**Enterprise context:** Banking core systems start with Customer/Account/Transaction models before any UI.

## Scenario

A bank employee needs to:

- register customers;
- open savings or current accounts;
- deposit and withdraw money;
- retain a record of each transaction;
- display customer and account details.

## Key vocabulary

| Term | Easy meaning | Banking example |
| ---- | ------------ | --------------- |
| Entity | A distinct domain thing with identity | Customer `C101` |
| Attribute | Data the entity owns | customer name, account balance |
| Responsibility | Work the entity should perform | account validates a withdrawal |
| Relationship | How entities connect | customer owns accounts |
| Invariant | Rule that must remain true | balance changes only through account methods |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Banking domain notes

| Entity | Identity | Important attributes | Main responsibility |
| ------ | -------- | -------------------- | ------------------- |
| Customer | customerId | name, email, phone | Maintain customer profile |
| Account | accountNumber | owner, balance, accountType | Protect balance and perform deposits/withdrawals |
| Transaction | transactionId | account, type, amount, timestamp | Record one account operation |
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Find candidate entities

**Why:** Important nouns in requirements often become classes, but not every noun deserves a class.

Read the scenario and underline the business nouns. Start with:

- `Customer`
- `Account`
- `Transaction`

Do **not** create classes for implementation details such as “menu option” or “printed line.”

### Step 2 — Create `notes.md`

**Why:** A short design note catches unclear ownership before code spreads responsibilities across the wrong classes.

Create `notes.md` in `module-03-exercises` and add:

```markdown
# Banking domain notes

| Entity | Identity | Important attributes | Main responsibility |
| ------ | -------- | -------------------- | ------------------- |
| Customer | customerId | name, email, phone | Maintain customer profile |
| Account | accountNumber | owner, balance, accountType | Protect balance and perform deposits/withdrawals |
| Transaction | transactionId | account, type, amount, timestamp | Record one account operation |
```

### Step 3 — Add relationships and rules

**Why:** Attributes alone do not explain how objects collaborate.

Below the table, add:

```markdown
## Relationships

- One Customer can own zero or more Accounts.
- One Account belongs to exactly one Customer.
- One Account can have many Transactions.
- One Transaction belongs to exactly one Account.

## Rules

- An account balance cannot be changed directly from outside Account.
- A deposit amount must be positive.
- A withdrawal cannot exceed the allowed balance.
```

### Step 4 — Explain one design decision

**Why:** Being able to justify ownership matters more than merely listing nouns.

Answer in 2–3 sentences:

> Why should `Account`, rather than `Main`, decide whether a withdrawal is valid?

Suggested idea: `Account` owns the balance and its rules, while `Main` should only coordinate user interaction.

## Expected result

`notes.md` contains at least three entities, useful attributes, focused responsibilities, relationships, multiplicities, and business rules.

## Common mistakes

| Mistake | Better design |
| ------- | ------------- |
| `Customer` deposits money directly by changing balance | Ask `Account` to perform the deposit |
| `Main` owns every business rule | Keep `Main` as a thin coordinator |
| “Database” is modeled as a banking entity | Treat storage as infrastructure, not domain identity |
| Responsibility says only “stores data” | State useful behavior or ownership |

## Troubleshooting

| Problem | Fix |
| ------- | --- |
| Blank/`_____` left in code | Replace with real Java |
| Wrong folder | `cd` to `module-03-exercises` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] `notes.md` identifies at least Customer, Account, Transaction
- [ ] Every entity has attributes and one focused responsibility
- [ ] Relationships include one-to-many multiplicities
- [ ] You can explain why Account owns withdrawal validation

