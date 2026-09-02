# Exercise 3 — Outline Delivery Gates

**Module 51** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

List pipeline stages for Angular + Maven capstone delivery.

## Steps

### Step 1 — Jobs

`npm ci` / `npx ng build`; `mvn -B verify`; SAST/dep scan.

### Step 2 — Fail

SAST gate must be able to fail the PR.

### Step 3 — Secrets

No credentials in YAML; Actions secrets by **name** only.

### Step 4 — Identity

CD consumes a digest — no `mvn package` on promote.

## Expected result

Gate outline includes Angular, Maven, failing SAST, digest promote.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Frontend+backend jobs | Pass / Fail |
| 2 | SAST can fail | Pass / Fail |
| 3 | Digest promote | Pass / Fail |
