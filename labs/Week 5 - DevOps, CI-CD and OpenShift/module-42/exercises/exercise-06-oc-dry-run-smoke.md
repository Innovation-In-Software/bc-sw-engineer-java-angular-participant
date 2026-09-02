# Exercise 6 — `oc` dry-run and smoke plan

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** |
| **Deliverable** | `notes/lab42-oc-dry-run-smoke.md` |

### What you will learn

Order dry-run → apply → `oc get` → curl Route readiness → `CUS-1001`.

### Enterprise context

No cluster on the laptop is still a Pass if dry-run / Console validate and the runbook are complete.

### Predict

Anonymous GET `/api/customers/CUS-1001` through the Route — 401 or 200?

### Debug

`oc` not on PATH — Console YAML import or wait for instructor CLI install notes.

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-oc-dry-run-smoke.md`

## Worked example

```markdown
# Lab 42 — oc smoke plan

1. `oc apply -f openshift/ --dry-run=client`
2. Apply ConfigMap; create Secret out-of-band; apply Deployment/Service/Route
3. `oc rollout status deployment/crm-api`
4. curl readiness on the Route; GET `CUS-1001` with Basic `admin:change-me` and `X-Correlation-Id: lab-request-001`
```

## Steps

1. Create the notes file.
2. Number the four steps in your own words.
3. Name the evidence folder `notes/lab-42/`.
4. Scope: do not paste tokens.
