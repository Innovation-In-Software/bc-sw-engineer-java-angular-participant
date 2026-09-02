# Module 46 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 46 — Kafka Resilience and Observability  
**Next:** [`../lab46/LAB-46-GUIDE.md`](../lab46/LAB-46-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-46-exercises/` — not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Failure taxonomy](exercise-01-failure-taxonomy.md) | **A** | `notes/lab46-failure-taxonomy.md` |
| 2 | [Idempotency sketch](exercise-02-idempotency-sketch.md) | **B** | `notes/lab46-idempotency-sketch.md` |
| 3 | [Metrics TODOs](exercise-03-metrics-todos.md) | **C** | `notes/lab46-metrics-todos.md` |
| 4 | [DLT policy](exercise-04-dlt-policy.md) | **C** | `notes/lab46-dlt-policy.md` |
| 5 | [Replay runbook](exercise-05-replay-runbook.md) | **C** | `notes/lab46-replay-runbook.md` |
| 6 | [Watch window](exercise-06-watch-window.md) | **D** | `notes/lab46-watch-window.md` |

Then **checkpoint E** → Lab 46.


## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Taxonomy, metrics, DLT, idempotency, dry-run replay, watch tie-in | Infinite retry; prod topic dumps |
| Synthetic CRM ids only | Module 47 incident write-ups as this warmup |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-46-exercises` | `~/java-bootcamp/examples/module-46-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-46-exercises\notes | Out-Null
```

## Done when

All six notes files exist; DLT policy + replay dry-run self-mark **Pass**.
