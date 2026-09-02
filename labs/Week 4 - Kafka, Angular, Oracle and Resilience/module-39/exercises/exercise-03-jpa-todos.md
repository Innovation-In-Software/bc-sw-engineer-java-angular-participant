# Exercise 3 — Fill JPA TODOs

**Module 39** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks on an entity sketch.

## Steps

### Step 1 — Template

Create `notes/lab39-jpa-todos.md`:

```java
@Entity
@Table(name = "_____")
class Customer {
  @Id String customerId; // e.g. _____
  String fullName;       // e.g. _____
  String status;         // e.g. _____
}
```

### Step 2 — Fill

`customer`, `CUS-1001`, `Amina Khan`, `ACTIVE`.

### Step 3 — ddl

Note `ddl-auto=validate` — schema comes from Flyway.

### Step 4 — Dialect

PostgreSQL driver — not Oracle.

## Expected result

JPA TODOs filled with Amina fixture.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table/id filled | Pass / Fail |
| 2 | Amina fields | Pass / Fail |
| 3 | validate + Flyway noted | Pass / Fail |
