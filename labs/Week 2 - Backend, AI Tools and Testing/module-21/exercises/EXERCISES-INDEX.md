# Module 21 — Pre-Lab Exercises

> **Start here for Module 21:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 21 — API Observability and Monitoring  
**Next:** [`../lab21/LAB-21-WINDOWS.md`](../lab21/LAB-21-WINDOWS.md) or [`../lab21/LAB-21-MACOS.md`](../lab21/LAB-21-MACOS.md) → [`../lab21/LAB-21-GUIDE.md`](../lab21/LAB-21-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-21-exercises/` — **notes files**, not the lab.  
> Lab 21 is the graded consolidation. Do **not** finish Lab 21 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab21-cardinality-antipatterns.md` | Cardinality Anti-Patterns | A |
| 2 | `notes/lab21-actuator-allowlist.md` | Actuator Allow-List | B |
| 3 | `notes/lab21-probes.md` | Liveness vs Readiness | C |
| 4 | `notes/lab21-metric-sketch-todos.md` | Fill Metric Sketch TODOs | D |
| 5 | `notes/lab21-alert-runbook.md` | Alert from create_failure_total | D |
| 6 | `notes/lab21-prep-checklist.md` | Lab 21 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Contrast liveness vs readiness for CRM services | Do not complete full production dashboards in this pre-lab |
| Spot high-cardinality anti-patterns in metric labels | Do not expose every Actuator endpoint publicly |
| Sketch metric TODOs including create_failure_total | Do not label metrics with raw customerId |
| Draft an Actuator endpoint allow-list | Do not confuse logs-only debugging with SLOs |
| Plan an alert from create_failure_total threshold | Do not skip documenting alert action owners |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-21-exercises` | `~/java-bootcamp/examples/module-21-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-21-exercises\notes | Out-Null
cd examples\module-21-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-21-exercises/notes
cd examples/module-21-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 21 uses `examples/lab21-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 255–260 (A) | Cardinality Anti-Patterns | `notes/lab21-cardinality-antipatterns.md` | [`exercise-01-cardinality-antipatterns.md`](exercise-01-cardinality-antipatterns.md) |
| 2 | 261–262 (B) | Actuator Allow-List | `notes/lab21-actuator-allowlist.md` | [`exercise-02-actuator-allowlist.md`](exercise-02-actuator-allowlist.md) |
| 3 | 263 (C) | Liveness vs Readiness | `notes/lab21-probes.md` | [`exercise-03-liveness-vs-readiness.md`](exercise-03-liveness-vs-readiness.md) |
| 4 | 264–269 (D) | Fill Metric Sketch TODOs | `notes/lab21-metric-sketch-todos.md` | [`exercise-04-fill-metric-sketch-todos.md`](exercise-04-fill-metric-sketch-todos.md) |
| 5 | 264–269 (D) | Alert from create_failure_total | `notes/lab21-alert-runbook.md` | [`exercise-05-alert-from-failure-total.md`](exercise-05-alert-from-failure-total.md) |
| 6 | 264–269 (D) | Lab 21 Prep Checklist | `notes/lab21-prep-checklist.md` | [`exercise-06-lab21-prep-checklist.md`](exercise-06-lab21-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 21 OS guide.
