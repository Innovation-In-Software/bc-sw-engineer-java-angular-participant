# Exercise 4 — Fill Deploy Evidence TODOs

**Module 51** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for instructor-hosted OpenShift evidence.

## Steps

### Step 1 — Template

```
Image identity: sha256:_____
Promote command idea: oc set image _____
Smoke: GET CUS-1001 via _____
Rollback: oc rollout undo _____
Never commit: _____
```

### Step 2 — Fill

Digest placeholder, Deployment name, OpenShift Route, Deployment, cluster credentials.

### Step 3 — Not k3s

Taught runtime is instructor OpenShift + `oc`.

### Step 4 — Live apply

Do not `oc apply` without an instructor Project.

## Expected result

Deploy TODOs use oc/Route — not kubectl/k3s.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Digest named | Pass / Fail |
| 2 | oc set image / undo | Pass / Fail |
| 3 | Credentials not committed | Pass / Fail |
