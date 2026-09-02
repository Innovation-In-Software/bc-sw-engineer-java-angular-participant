# Exercise 2 — HTTP Method and Status Matrix

**Module 13** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill a method × status matrix for create, get, list, and not-found.

## Reference

| Action | Method | Success | Failure |
| --- | --- | --- | --- |
| Get Amina | GET item | 200 | 404 CUS-9999 |
| Create | POST collection | 201 | 400 validation |
| List | GET collection | 200 | 400 bad query |

## Steps

### Step 1 — Get

GET item → 200 with Amina; GET missing `CUS-9999` → 404.

### Step 2 — Create

POST collection → 201 (or 200 if documented) with Location idea.

### Step 3 — Correlation

Carry `lab-request-001` as a header, not a business field.

### Step 4 — Capture

Save `notes/lab13-http-matrix.md`.

## Expected result

Matrix covers happy get/create and 404 for CUS-9999.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | GET 200/404 listed | Pass / Fail |
| 2 | POST status listed | Pass / Fail |
| 3 | Correlation in headers | Pass / Fail |
