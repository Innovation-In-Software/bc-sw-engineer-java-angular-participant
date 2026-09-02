# Exercise 6 — Document End-to-End Data Flow

**Module 50** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Write UI→API→JPA→PostgreSQL for add-interaction on CUS-1001.

## Steps

### Step 1 — Action

Add interaction on CUS-1001 with lab-request-001.

### Step 2 — Sequence

Angular → interceptor → controller → service → repository → row.

### Step 3 — Failure

Where validation/DB failure surfaces in the UI.

### Step 4 — Save

`notes/lab50-data-flow.md`.

## Expected result

Data-flow note with failure surfacing.

## If it fails

| Problem | Fix |
| --- | --- |
| React SPA as the UI | Angular is the taught UI |
| Manual SQL in prod | Use Flyway |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Sequence numbered | Pass / Fail |
| 2 | Failure marked | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
