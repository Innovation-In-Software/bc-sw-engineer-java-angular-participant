# Exercise 5 — Seed and Verify Plan

**Module 37** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan how you will prove seeds after compose/psql.

## Steps

### Step 1 — Seeds

CUS-1001 Amina ACTIVE; CUS-1002 Ravi PROSPECT.

### Step 2 — Query

`SELECT customer_id, status FROM customer ORDER BY 1;`

### Step 3 — Compose

One Compose project at a time — host 5432 / `crm-postgres` name clashes.

### Step 4 — Capture

Save `notes/lab37-seed-verify.md`.

## Expected result

Verify plan names both fixtures and port clash awareness.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both seeds | Pass / Fail |
| 2 | SELECT named | Pass / Fail |
| 3 | Port clash noted | Pass / Fail |
