# Module 43 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 43 — GitHub Actions and CI/CD Integration  
**Next:** [`../lab43/LAB-43-GUIDE.md`](../lab43/LAB-43-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-43-exercises/` — not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Pipeline policy](exercise-01-pipeline-policy.md) | **A** | `notes/lab43-pipeline-policy.md` |
| 2 | [ci.yml TODOs](exercise-02-workflow-todos.md) | **B** | `notes/lab43-workflow-todos.md` |
| 3 | [JDK 21 verify](exercise-03-java21-verify.md) | **C** | `notes/lab43-java21-verify.md` |
| 4 | [Package-once](exercise-04-immutable-jar.md) | **C** | `notes/lab43-immutable-jar.md` |
| 5 | [Secrets checklist](exercise-05-secrets-checklist.md) | **D** | `notes/lab43-secrets-checklist.md` |
| 6 | [CI runbook outline](exercise-06-ci-runbook-outline.md) | **D** | `notes/lab43-ci-runbook-outline.md` |

Then **checkpoint E** → Lab 43.


## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Triggers, verify, package-once, secrets rules, runbook | Deploy creds / kubeconfig in YAML |
| Controlled failure plan | Full CD promotions (Lab 44) / Terraform CI (Lab 45) |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-43-exercises` | `~/java-bootcamp/examples/module-43-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-43-exercises\notes | Out-Null
```

## Done when

All six notes files exist; secrets checklist + runbook self-mark **Pass**; CRM verifies locally.
