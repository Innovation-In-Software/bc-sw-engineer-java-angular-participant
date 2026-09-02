# Module 29 — Pre-Lab Exercises

> **Start here for Module 29:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 29 — Validation and Global Exception Handling  
**Next:** [`../lab29/LAB-29-WINDOWS.md`](../lab29/LAB-29-WINDOWS.md) or [`../lab29/LAB-29-MACOS.md`](../lab29/LAB-29-MACOS.md) → [`../lab29/LAB-29-GUIDE.md`](../lab29/LAB-29-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 6 → 5**.  
> Use JDK 21. Work under `examples/module-29-exercises/` — **notes files**, not the lab.  
> Lab 29 is the graded consolidation. Do **not** finish Lab 29 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/dto-constraints.md` | DTO Constraint Plan | A |
| 2 | `notes/lab29-handler-todos.md` | GlobalExceptionHandler TODOs | B |
| 3 | `notes/error-envelope.md` | ErrorResponse Envelope | B |
| 4 | `notes/exception-status-map.md` | Exception to Status Map | C |
| 6 | `notes/mockmvc-body-plan.md` | MockMvc Body Assertions Plan | C |
| 5 | `notes/lab29-readiness.md` | Lab 29 Readiness Checklist | C |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Annotate request DTOs with Bean Validation | Kafka retry/DLQ error models (Week 4) |
| Enable `@Valid` on controller parameters | Angular form libraries (Week 4) |
| Design a consistent `ErrorResponse` envelope | Replacing Spring Security with validation |
| Map validation/not-found/duplicate/illegal-transition to HTTP statuses | Returning stack-trace HTML to clients |
| Plan MockMvc assertions on status **and** body shape | Terraform alert wiring (Week 5) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-29-exercises` | `~/java-bootcamp/examples/module-29-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-29-exercises\notes | Out-Null
cd examples\module-29-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-29-exercises/notes
cd examples/module-29-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 29 uses `examples/lab29-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 187–197 (A) | DTO Constraint Plan | `notes/dto-constraints.md` | [`exercise-01-dto-constraints.md`](exercise-01-dto-constraints.md) |
| 2 | 198–204 (B) | GlobalExceptionHandler TODOs | `notes/lab29-handler-todos.md` | [`exercise-02-handler-todos.md`](exercise-02-handler-todos.md) |
| 3 | 198–204 (B) | ErrorResponse Envelope | `notes/error-envelope.md` | [`exercise-03-error-envelope.md`](exercise-03-error-envelope.md) |
| 4 | 205–210 (C) | Exception to Status Map | `notes/exception-status-map.md` | [`exercise-04-exception-status-map.md`](exercise-04-exception-status-map.md) |
| 6 | 205–210 (C) | MockMvc Body Assertions Plan | `notes/mockmvc-body-plan.md` | [`exercise-06-mockmvc-body-assertions.md`](exercise-06-mockmvc-body-assertions.md) |
| 5 | 205–210 (C) | Lab 29 Readiness Checklist | `notes/lab29-readiness.md` | [`exercise-05-lab29-readiness.md`](exercise-05-lab29-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 29 OS guide.
