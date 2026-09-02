# Exercise 2 — Smart vs Presentational

**Module 33** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Mark which components own data vs which only render inputs.

## Steps

### Step 1 — Smart

List page owns the customer array (later: a service).

### Step 2 — Presentational

`CustomerCard` / `StatusBadge` receive `@Input` only.

### Step 3 — Events

Card `select` is `@Output` — parent decides navigation.

### Step 4 — Capture

Save `notes/lab33-smart-presentational.md`.

## Expected result

Role split documented for list vs card.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Smart page named | Pass / Fail |
| 2 | Presentational children named | Pass / Fail |
| 3 | Output planned | Pass / Fail |
