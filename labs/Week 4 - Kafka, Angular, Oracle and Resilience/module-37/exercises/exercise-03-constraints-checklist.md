# Exercise 3 — Constraints Checklist

**Module 37** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Check NOT NULL, UNIQUE, CHECK, FK for customer.

## Steps

### Step 1 — NOT NULL

customer_id, full_name, status.

### Step 2 — UNIQUE

customer_id (if not only PK) / business keys as designed.

### Step 3 — CHECK

status IN ('ACTIVE','PROSPECT', …) as the lab requires.

### Step 4 — Capture

Save `notes/lab37-constraints.md`.

## Expected result

Constraint checklist covers nulls, uniqueness, status.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | NOT NULL listed | Pass / Fail |
| 2 | CHECK/status listed | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
