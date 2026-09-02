# Module 31 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 31 — Kafka Integration with Spring Boot  
**Next:** [`../lab31/LAB-31-GUIDE.md`](../lab31/LAB-31-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-31-exercises/` — not the lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Spring Kafka roles](exercise-01-spring-kafka-roles.md) | **A** | `notes/lab31-spring-kafka.md` |
| 2 | [Spring Kafka TODOs](exercise-03-fill-spring-kafka-todos.md) | **B** | `notes/lab31-todos.md` |
| 3 | [Listener sketch](exercise-02-listener-sketch.md) | **C** | `notes/lab31-listener-sketch.md` |
| 4 | [Error and DLT](exercise-04-error-dlt-notes.md) | **D** | `notes/lab31-error-dlt-notes.md` |
| 5 | [Idempotency plan](exercise-05-idempotency-plan.md) | **D** | `notes/lab31-idempotency-plan.md` |
| 6 | [Lab readiness](exercise-06-lab31-readiness.md) | **D** | `notes/lab31-prep-checklist.md` |

Then **checkpoint E** → Lab 31.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| KafkaTemplate, @KafkaListener, DLT, idempotency plan | Resilience4j (Lab 32) |
| Config property names for bootstrap/topics | Angular UI / SQL schema work |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-31-exercises` | `~/java-bootcamp/examples/module-31-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-31-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; broker/EmbeddedKafka plan ready for Lab 31.
