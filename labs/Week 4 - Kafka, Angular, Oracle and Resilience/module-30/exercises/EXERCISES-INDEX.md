# Module 30 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 30 — Event-Driven Architecture with Kafka  
**Next:** [`../lab30/LAB-30-GUIDE.md`](../lab30/LAB-30-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes only under `examples/module-30-exercises/` — not the lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Why async](exercise-01-eda-why-async.md) | **A** | `notes/lab30-prelab-eda.md` |
| 2 | [Topic map](exercise-02-topic-map.md) | **B** | `notes/lab30-topic-map.md` |
| 3 | [Kafka TODOs](exercise-04-fill-kafka-basics.md) | **B** | `notes/lab30-kafka-todos.md` |
| 4 | [Envelope](exercise-03-envelope-sketch.md) | **C** | `notes/lab30-envelope-sketch.md` |
| 5 | [Producer checklist](exercise-05-producer-checklist.md) | **C** | `notes/lab30-producer-checklist.md` |
| 6 | [Lab readiness](exercise-06-lab30-readiness.md) | **D** | `notes/lab30-prep-checklist.md` |

Then **checkpoint E** → Lab 30.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Topics, keys, envelopes, producer checklist | Spring Kafka listeners (Lab 31) |
| Plan DLQ + lag vocabulary | Resilience4j / Angular / JPA |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-30-exercises` | `~/java-bootcamp/examples/module-30-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-30-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; Docker (or shared bootstrap) ready for Lab 30.
