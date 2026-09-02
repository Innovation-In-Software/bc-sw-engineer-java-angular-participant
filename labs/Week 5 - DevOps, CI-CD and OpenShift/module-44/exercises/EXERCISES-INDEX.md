# Module 44 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 44 — Continuous Delivery and Release Management  
**Next:** [`../lab44/LAB-44-GUIDE.md`](../lab44/LAB-44-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-44-exercises/` — not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [CD vs CDeploy](exercise-01-cd-vs-cdeploy.md) | **A** | `notes/lab44-cd-vs-cdeploy.md` |
| 2 | [Manifest fields](exercise-02-manifest-fields.md) | **A** | `notes/lab44-manifest-fields.md` |
| 3 | [Rollback runbook](exercise-03-rollback-runbook.md) | **B** | `notes/lab44-rollback-runbook.md` |
| 4 | [Promotion gates](exercise-04-promotion-gates.md) | **C** | `notes/lab44-promotion-gates.md` |
| 5 | [Release checklist](exercise-05-checklist-todos.md) | **D** | `notes/lab44-checklist-todos.md` |
| 6 | [Staging smoke](exercise-06-staging-smoke-plan.md) | **D** | `notes/lab44-staging-smoke-plan.md` |

Then **checkpoint E** → Lab 44.


## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Manifest, gates, checklist, rollback, staging smoke plan | Rebuild on deploy host; secrets in artifact |
| Digest-based promote plan | Terraform/Ansible (Lab 45) / Kafka DLT (Lab 46) |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-44-exercises` | `~/java-bootcamp/examples/module-44-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-44-exercises\notes | Out-Null
```

## Done when

All six notes files exist; checklist + rollback self-mark **Pass**; Lab 43 digest ready.
