# Exercise 3 — Fill SQL/Index TODOs

**Module 38** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for a sargable status filter.

## Steps

### Step 1 — Template

Create `notes/lab38-sql-index-todos.md`:

```sql
EXPLAIN ANALYZE
SELECT customer_id, full_name
FROM customer
WHERE status = _____;  -- sargable
-- Avoid: WHERE _____ (status);  -- non-sargable example you will not use
```

### Step 2 — Fill

`'PROSPECT'` for Ravi’s cohort; non-sargable example `LOWER` on a column or a wrapping function.

### Step 3 — Tool

`EXPLAIN ANALYZE` in PostgreSQL — not Oracle autotrace as the path.

### Step 4 — Boundary

Do not create random indexes in this exercise — Lab 38 timed path.

## Expected result

SQL TODOs show a sargable PROSPECT filter.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | PROSPECT filled | Pass / Fail |
| 2 | Non-sargable named | Pass / Fail |
| 3 | EXPLAIN ANALYZE named | Pass / Fail |
