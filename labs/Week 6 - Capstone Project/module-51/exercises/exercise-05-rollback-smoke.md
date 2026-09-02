# Exercise 5 — Rollback and Smoke Plan

**Module 51** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Write the happy smoke and the undo path.

## Steps

### Step 1 — Smoke

GET CUS-1001 through the Route after rollout.

### Step 2 — Undo

`oc rollout undo` on the Deployment.

### Step 3 — Re-check

Smoke again after undo.

### Step 4 — Capture

`notes/lab51-rollback-smoke.md`.

## Expected result

Smoke + undo + re-check documented.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Smoke named | Pass / Fail |
| 2 | Undo named | Pass / Fail |
| 3 | Re-check named | Pass / Fail |
