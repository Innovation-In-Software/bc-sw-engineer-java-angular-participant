# Module 42 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab42/LAB-42-GUIDE.md`](../lab42/LAB-42-GUIDE.md)

**Module:** 42 — Kubernetes (k3s) Deployment
**Next:** [`../lab42/LAB-42-WINDOWS.md`](../lab42/LAB-42-WINDOWS.md) or [`../lab42/LAB-42-MACOS.md`](../lab42/LAB-42-MACOS.md) → [`../lab42/LAB-42-GUIDE.md`](../lab42/LAB-42-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-42-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Deployment YAML TODOs](exercise-01-yaml-todos.md) | **A** | `notes/lab42-yaml-todos.md` |
| 2 | [Map the Manifests](exercise-02-manifest-map.md) | **B** | `notes/lab42-manifest-map.md` |
| 3 | [Config versus Secret](exercise-03-config-vs-secret.md) | **B** | `notes/lab42-config-vs-secret.md` |
| 4 | [Rollout and Rollback](exercise-04-rollout-rollback.md) | **C** | `notes/lab42-rollout-rollback.md` |
| 5 | [Design Three Probes](exercise-05-probe-design.md) | **C** | `notes/lab42-probe-design.md` |
| 6 | [Runbook Outline](exercise-06-runbook-outline.md) | **D** | `notes/lab42-runbook-outline.md` |

Then **checkpoint E** → Lab 42.

## k3s slides, OpenShift lab

Module 42's slides teach Kubernetes on the shared **k3s** training cluster and
compare it with OpenShift. **Lab 42 runs on OpenShift**, so these exercises use
OpenShift names. The concepts are identical -- only the wrapper differs:

| On the slides (k3s) | In Lab 42 (OpenShift) |
| --- | --- |
| `kubectl` | `oc` (a superset of `kubectl`) |
| Namespace | Project |
| Ingress (Traefik) | Route |

Write your notes using the OpenShift column -- that is what Lab 42 grades.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Write manifests, probe designs, and the runbook outline on paper | Do not apply anything to a shared cluster |
| Classify settings into ConfigMap and Secret | Do not put secret values in Git, ever |
| Plan rollout and rollback evidence | Do not run a destructive action without instructor approval |
| Reference the digest-pinned image from Lab 41 | Do not deploy by :latest alone |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-42-exercises` | `~/java-bootcamp/examples/module-42-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-42-exercises\notes | Out-Null
cd examples\module-42-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-42-exercises/notes
cd examples/module-42-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 42 OS guide.
