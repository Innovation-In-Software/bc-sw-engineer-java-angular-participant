# Module 45 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 45 — Infrastructure as Code with Terraform and Ansible  
**Next:** [`../lab45/LAB-45-GUIDE.md`](../lab45/LAB-45-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-45-exercises/` — not the lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Infra contract](exercise-01-infra-contract.md) | **A** | `notes/lab45-infra-contract.md` |
| 2 | [Terraform checks](exercise-02-terraform-checks.md) | **B** | `notes/lab45-terraform-checks.md` |
| 3 | [Ansible idempotence](exercise-03-ansible-idempotence.md) | **C** | `notes/lab45-ansible-idempotence.md` |
| 4 | [AI prompt TODOs](exercise-04-ai-prompt-todos.md) | **D** | `notes/lab45-ai-prompt-todos.md` |
| 5 | [AI review record](exercise-05-ai-review-record.md) | **D** | `notes/lab45-ai-review-record.md` |
| 6 | [Cost/exposure quiz](exercise-06-cost-exposure-quiz.md) | **D** | `notes/lab45-cost-exposure-quiz.md` |

Then **checkpoint E** → Lab 45.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Contract, TF checks, Ansible notes, AI prompt/review, cost quiz | Commit tfstate / real tfvars / cloud keys |
| Reject public-DB AI output | Unapproved destroy of shared training; Kafka DLT (Lab 46) |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-45-exercises` | `~/java-bootcamp/examples/module-45-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-45-exercises\notes | Out-Null
```

## Done when

All six notes files exist; AI review outline + cost quiz self-mark **Pass**.
