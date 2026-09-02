# Module 33 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab33/LAB-33-GUIDE.md`](../lab33/LAB-33-GUIDE.md)

**Module:** 33 — Angular Component Architecture
**Next:** [`../lab33/LAB-33-WINDOWS.md`](../lab33/LAB-33-WINDOWS.md) or [`../lab33/LAB-33-MACOS.md`](../lab33/LAB-33-MACOS.md) → [`../lab33/LAB-33-GUIDE.md`](../lab33/LAB-33-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-33-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Plan the Angular Workspace](exercise-01-workspace-plan.md) | **A** | `notes/lab33-workspace-plan.md` |
| 2 | [Map Component Anatomy and Binding](exercise-02-component-anatomy.md) | **B** | `notes/lab33-component-anatomy.md` |
| 3 | [Design the Input/Output Contract](exercise-03-input-output-contract.md) | **B** | `notes/lab33-io-contract.md` |
| 4 | [Plan Lifecycle and Cleanup](exercise-04-lifecycle-and-cleanup.md) | **C** | `notes/lab33-lifecycle.md` |
| 5 | [Split Smart and Presentational](exercise-05-smart-presentational-map.md) | **C** | `notes/lab33-component-map.md` |
| 6 | [Lab 33 Readiness Self-Check](exercise-06-lab33-readiness.md) | **D** | `notes/lab33-readiness.md` |

Then **checkpoint E** → Lab 33.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan the workspace, components, and folder map on paper | Do not build the full Lab 33 UI here |
| Design input/output contracts and the smart/presentational split | Do not call a real API — that is Module 35 |
| Name lifecycle hooks and cleanup obligations | Do not add state libraries; Signals come in Module 34 |
| Use the synthetic Amina and Ravi fixtures | Do not use React patterns or terminology |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-33-exercises` | `~/java-bootcamp/examples/module-33-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-33-exercises\notes | Out-Null
cd examples\module-33-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-33-exercises/notes
cd examples/module-33-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 33 OS guide.
