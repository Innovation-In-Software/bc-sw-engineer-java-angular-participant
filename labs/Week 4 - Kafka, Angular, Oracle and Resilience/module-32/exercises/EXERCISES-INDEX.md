# Module 32 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 32 — Resilience and Fault Tolerance  
**Next:** [`../lab32/LAB-32-GUIDE.md`](../lab32/LAB-32-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-32-exercises/` — not the lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Why resilience](exercise-01-why-resilience.md) | **A** | `notes/lab32-resilience.md` |
| 2 | [Circuit states](exercise-02-circuit-states.md) | **B** | `notes/lab32-circuit-states.md` |
| 3 | [Fallback contract](exercise-03-fallback-contract.md) | **C** | `notes/lab32-fallback-contract.md` |
| 4 | [Pattern map](exercise-04-pattern-map.md) | **D** | `notes/lab32-pattern-map.md` |
| 5 | [Resilience TODOs](exercise-05-fill-resilience-todos.md) | **D** | `notes/lab32-todos.md` |
| 6 | [Lab readiness](exercise-06-lab32-readiness.md) | **D** | `notes/lab32-prep-checklist.md` |

Then **checkpoint E** → Lab 32.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Retry, CB, timeout, truthful fallback for **reads** | Aggressive write retries / fake success |
| WireMock scenario plan | Angular UI toasts (Module 33) |
| Resilience4j instance `accountProfile` | Replacing Kafka patterns |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-32-exercises` | `~/java-bootcamp/examples/module-32-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-32-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; fallback contract forbids fake write success.
