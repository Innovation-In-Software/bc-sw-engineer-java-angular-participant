# Module 51 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab51/LAB-51-GUIDE.md`](../lab51/LAB-51-GUIDE.md)

**Module:** 51 — Capstone Security, CI-CD and Deployment
**Next:** [`../lab51/LAB-51-WINDOWS.md`](../lab51/LAB-51-WINDOWS.md) or [`../lab51/LAB-51-MACOS.md`](../lab51/LAB-51-MACOS.md) → [`../lab51/LAB-51-GUIDE.md`](../lab51/LAB-51-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-51-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Define the PR Gate Policy](exercise-01-pr-gate-policy.md) | **A** | `notes/lab51-pr-gate-policy.md` |
| 2 | [Plan the Angular Build Job](exercise-02-angular-job-plan.md) | **A** | `notes/lab51-angular-job.md` |
| 3 | [Plan Scanning and Image Identity](exercise-03-scan-and-image-plan.md) | **B** | `notes/lab51-scan-image-plan.md` |
| 4 | [Plan the Deployment Stages](exercise-04-deploy-stage-plan.md) | **C** | `notes/lab51-deploy-stage-plan.md` |
| 5 | [Plan Secrets and Approvals](exercise-05-secrets-and-approvals.md) | **C** | `notes/lab51-secrets-approvals.md` |
| 6 | [Write Smoke, Rollback and Self-Check](exercise-06-smoke-rollback-readiness.md) | **D** | `notes/lab51-smoke-rollback-readiness.md` |

Then **checkpoint E** → Lab 51.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan workflow jobs, gates, and approvals on paper | Do not run a production deploy from this pre-lab |
| Name scanners, severities, and failure thresholds | Do not paste real secrets or tokens anywhere |
| Write the smoke and rollback runbook steps | Do not weaken a gate to make the pipeline go green |
| Reference the Lab 48 infrastructure plan | Do not adopt Bitbucket Pipelines as the taught path |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-51-exercises` | `~/java-bootcamp/examples/module-51-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-51-exercises\notes | Out-Null
cd examples\module-51-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-51-exercises/notes
cd examples/module-51-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 51 OS guide.
