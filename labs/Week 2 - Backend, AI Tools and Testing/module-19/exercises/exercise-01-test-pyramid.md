# Exercise 1 — Test Pyramid for CRM

**Module 19** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Place activate unit tests, API IT, and Selenium on an Angular CRM pyramid.

## Steps

### Step 1 — Base

Many fast JUnit tests for service rules (Labs 17–18).

### Step 2 — Middle

Fewer `@SpringBootTest` / MockMvc tests with PostgreSQL strategy.

### Step 3 — Top

Few Selenium journeys against Angular (`data-testid`).

### Step 4 — Capture

Save `notes/lab19-test-pyramid.md`.

## Expected result

Pyramid note keeps UI tests few and Angular-specific.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three layers named | Pass / Fail |
| 2 | PostgreSQL IT noted | Pass / Fail |
| 3 | Angular UI at the top | Pass / Fail |
