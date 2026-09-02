# Exercise 4 — Fill DDL TODOs

**Module 37** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for a customer table sketch.

## Steps

### Step 1 — Template

Create `notes/lab37-ddl-todos.md`:

```sql
CREATE TABLE customer (
  customer_id VARCHAR(___) PRIMARY KEY,
  full_name TEXT NOT NULL,
  status TEXT NOT NULL CHECK (status IN (_____, _____))
);
```

### Step 2 — Fill

Length for CUS-####; `'ACTIVE'`, `'PROSPECT'`.

### Step 3 — Seed

Note INSERT for Amina/Ravi in Lab 37 — not this file’s job to run.

### Step 4 — Engine

PostgreSQL — not Oracle VARCHAR2 as the taught type.

## Expected result

DDL TODOs filled for PostgreSQL customer.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Blanks filled | Pass / Fail |
| 2 | ACTIVE/PROSPECT | Pass / Fail |
| 3 | Oracle not taught | Pass / Fail |
