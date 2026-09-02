# Module 15 — Pre-Lab Exercises

> **Start here for Module 15:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 15 — Business Logic and Service Layer Design  
**Next:** [`../lab15/LAB-15-WINDOWS.md`](../lab15/LAB-15-WINDOWS.md) or [`../lab15/LAB-15-MACOS.md`](../lab15/LAB-15-MACOS.md) → [`../lab15/LAB-15-GUIDE.md`](../lab15/LAB-15-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-15-exercises/` — **notes files**, not the lab.  
> Lab 15 is the graded consolidation. Do **not** finish Lab 15 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab15-layers.md` | Layer Diagram | A |
| 2 | `notes/lab15-repo-boundary.md` | Repository Boundary | B |
| 3 | `notes/lab15-transition-matrix.md` | Transition Matrix | C |
| 4 | `notes/lab15-interface-ctor-sketch.md` | Interface and Constructor Sketch | D |
| 5 | `notes/lab15-activate-ravi-todos.md` | Fill Activate Ravi Pseudocode TODOs | D |
| 6 | `notes/lab15-prep-checklist.md` | Lab 15 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Draw API → service → repository for activate | Do not complete full Lab 15 implementation in pre-lab |
| Build PROSPECT/ACTIVE transition matrix | Do not implement `@ControllerAdvice` (Lab 16) |
| Sketch CustomerService interface + ctor injection | Do not put transition rules inside repository adapters |
| Draft activate Ravi pseudocode TODOs | Do not host REST frameworks beyond a sketch |
| State repository boundary (no business rules in repo) | Do not skip documenting illegal transitions |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-15-exercises` | `~/java-bootcamp/examples/module-15-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-15-exercises\notes | Out-Null
cd examples\module-15-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-15-exercises/notes
cd examples/module-15-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 15 uses `examples/lab15-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 152–155 (A) | Layer Diagram | `notes/lab15-layers.md` | [`exercise-01-layer-diagram.md`](exercise-01-layer-diagram.md) |
| 2 | 156 (B) | Repository Boundary | `notes/lab15-repo-boundary.md` | [`exercise-02-repo-boundary.md`](exercise-02-repo-boundary.md) |
| 3 | 157 (C) | Transition Matrix | `notes/lab15-transition-matrix.md` | [`exercise-03-transition-matrix.md`](exercise-03-transition-matrix.md) |
| 4 | 158–163 (D) | Interface and Constructor Sketch | `notes/lab15-interface-ctor-sketch.md` | [`exercise-04-interface-ctor-sketch.md`](exercise-04-interface-ctor-sketch.md) |
| 5 | 158–163 (D) | Fill Activate Ravi Pseudocode TODOs | `notes/lab15-activate-ravi-todos.md` | [`exercise-05-fill-activate-ravi-todos.md`](exercise-05-fill-activate-ravi-todos.md) |
| 6 | 158–163 (D) | Lab 15 Prep Checklist | `notes/lab15-prep-checklist.md` | [`exercise-06-lab15-prep-checklist.md`](exercise-06-lab15-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 15 OS guide.
