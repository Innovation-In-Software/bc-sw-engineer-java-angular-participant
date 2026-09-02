# Module 25 — Pre-Lab Exercises

> **Start here for Module 25:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 25 — Service and Repository Layers  
**Next:** [`../lab25/LAB-25-WINDOWS.md`](../lab25/LAB-25-WINDOWS.md) or [`../lab25/LAB-25-MACOS.md`](../lab25/LAB-25-MACOS.md) → [`../lab25/LAB-25-GUIDE.md`](../lab25/LAB-25-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-25-exercises/` — **notes files**, not the lab.  
> Lab 25 is the graded consolidation. Do **not** finish Lab 25 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/layers.md` | Layer Boundary Quiz | A |
| 2 | `notes/package-tree.md` | Package Sketch | B |
| 3 | `notes/lab25-service-todo-skeleton.md` | Service Layer Skeleton (TODOs) | B |
| 4 | `notes/ai-review-policy.md` | AI Review Policy | C |
| 5 | `notes/service-test-plan.md` | Service Test Plan | C |
| 6 | `notes/lab25-readiness.md` | Lab 25 Readiness Checklist | C |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Separate Controller → Service → Repository responsibilities | JPA/PostgreSQL persistence swap (Week 4 Lab 39) |
| Keep HTTP types out of the service layer | Deep profile secret binding (Lab 26) |
| Plan an in-memory `CustomerRepository` seeded with fixtures | `@Transactional` multi-account transfers (Lab 27) |
| Place lifecycle/uniqueness rules in the service | JWT role matrix (Lab 28) |
| Practice AI review notes (`lab25-001`) without accepting unsafe drafts | Bean Validation `@Valid` global handler polish (Lab 29) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-25-exercises` | `~/java-bootcamp/examples/module-25-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-25-exercises\notes | Out-Null
cd examples\module-25-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-25-exercises/notes
cd examples/module-25-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 25 uses `examples/lab25-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 91–96 (A) | Layer Boundary Quiz | `notes/layers.md` | [`exercise-01-layer-boundaries.md`](exercise-01-layer-boundaries.md) |
| 2 | 97–104 (B) | Package Sketch | `notes/package-tree.md` | [`exercise-02-package-sketch.md`](exercise-02-package-sketch.md) |
| 3 | 97–104 (B) | Service Layer Skeleton (TODOs) | `notes/lab25-service-todo-skeleton.md` | [`exercise-03-service-todo-skeleton.md`](exercise-03-service-todo-skeleton.md) |
| 4 | 105–110a (C) | AI Review Policy | `notes/ai-review-policy.md` | [`exercise-04-ai-review-policy.md`](exercise-04-ai-review-policy.md) |
| 5 | 105–110a (C) | Service Test Plan | `notes/service-test-plan.md` | [`exercise-05-test-plan.md`](exercise-05-test-plan.md) |
| 6 | 105–110a (C) | Lab 25 Readiness Checklist | `notes/lab25-readiness.md` | [`exercise-06-lab25-readiness.md`](exercise-06-lab25-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 25 OS guide.
