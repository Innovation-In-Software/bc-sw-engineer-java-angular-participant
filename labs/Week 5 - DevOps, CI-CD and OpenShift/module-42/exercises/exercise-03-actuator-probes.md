# Exercise 3 — Actuator probes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** |
| **Deliverable** | `notes/lab42-actuator-probes.md` |

### What you will learn

Match OpenShift probes to Lab 41 `/actuator/health/readiness` and `/liveness`.

### Predict

Readiness fails, liveness passes — does the Route still send traffic?

### Debug

Probe 404 — Actuator probes not enabled / path wrong / security blocks health.

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-actuator-probes.md`

## Worked example

```markdown
# Lab 42 — Probes

| Probe | Path | If it fails |
| --- | --- | --- |
| startup / readiness | `/actuator/health/readiness` | No Endpoints; Route 503 |
| liveness | `/actuator/health/liveness` | Pod restart |

Do not expose `/actuator/env` or `/actuator/beans`.
```

## Steps

1. Create the notes file.
2. Fill the probe table.
3. Answer the Predict question in one sentence.
4. Scope: do not change Lab 41 image in this exercise.
