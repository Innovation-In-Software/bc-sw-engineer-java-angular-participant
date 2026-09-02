# Exercise 5 — Guard and Interceptor Plan

**Module 36** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan CanActivate + HttpInterceptor responsibilities.

## Steps

### Step 1 — Guard

Block unauthenticated routes (UX only).

### Step 2 — Interceptor

Attach Bearer for Lab 36 demo token / later JWT.

### Step 3 — Honesty

Guards are not security — API must deny.

### Step 4 — Capture

Save `notes/lab36-guard-interceptor.md`.

## Expected result

Plan separates UX guard from API enforcement.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Guard purpose | Pass / Fail |
| 2 | Interceptor purpose | Pass / Fail |
| 3 | API still authorizes | Pass / Fail |
