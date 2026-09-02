# Exercise 2 — Plan Typed API Client

**Module 50** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List HttpClient functions and DTO fields the UI needs.

## Reference

| UI state | User sees |
| --- | --- |
| loading | Spinner/skeleton |
| empty | Empty guidance |
| error | Actionable message |
| success | Data / confirmation |

## Steps

### Step 1 — Functions

search/get customers, list/create interactions.

### Step 2 — Typed

TypeScript DTOs matching REST JSON.

### Step 3 — Errors

Map 401/403/404/500 to user-visible copy.

### Step 4 — Auth

Interceptor attaches Bearer — do not hardcode tokens.

## Expected result

API client plan with error mapping and interceptor note.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Functions listed | Pass / Fail |
| 2 | Error mapping | Pass / Fail |
| 3 | No hardcoded tokens | Pass / Fail |
