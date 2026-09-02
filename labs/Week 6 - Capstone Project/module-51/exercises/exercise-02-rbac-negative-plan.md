# Exercise 2 — Plan RBAC Negative Tests

**Module 51** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Design deny-by-default proofs before coding.

## Reference

| Proof | Evidence idea |
| --- | --- |
| JWT resource server | Security tests + config snippets |
| SAST gate | Sanitized CI summary |
| Image digest | sha256 in runbook |
| OpenShift deploy | oc rollout + Route smoke |
| Rollback | oc rollout undo |

## Steps

### Step 1 — Cases

No token → 401; wrong role → 403; cross-customer denied as designed.

### Step 2 — Why

Feature-complete is not release-ready without negative authz.

### Step 3 — Matrix

Role × endpoint with expected status.

### Step 4 — Scope

Plan only — Lab 51 implements.

## Expected result

RBAC negative-test matrix drafted.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three negatives | Pass / Fail |
| 2 | Matrix present | Pass / Fail |
| 3 | Pre-lab marked | Pass / Fail |
