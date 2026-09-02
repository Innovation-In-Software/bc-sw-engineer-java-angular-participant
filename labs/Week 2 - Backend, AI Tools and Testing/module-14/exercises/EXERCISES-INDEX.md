# Module 14 — Pre-Lab Exercises

> **Start here for Module 14:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 14 — DTOs, Validation and API Contracts  
**Next:** [`../lab14/LAB-14-WINDOWS.md`](../lab14/LAB-14-WINDOWS.md) or [`../lab14/LAB-14-MACOS.md`](../lab14/LAB-14-MACOS.md) → [`../lab14/LAB-14-GUIDE.md`](../lab14/LAB-14-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-14-exercises/` — **notes files**, not the lab.  
> Lab 14 is the graded consolidation. Do **not** finish Lab 14 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab14-entity-vs-dto.md` | Entity vs DTO | A |
| 2 | `notes/lab14-mapper-no-leak.md` | Mapper No-Leak Rule | B |
| 3 | `notes/lab14-annotate-dto.md` | Annotate Paper DTO | C |
| 4 | `notes/lab14-invalid-cases.md` | Invalid Cases Catalog | D |
| 5 | `notes/lab14-validatorfactory-todos.md` | Fill ValidatorFactory TODOs | D |
| 6 | `notes/lab14-prep-checklist.md` | Lab 14 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Separate entity vs DTO responsibilities for Customer | Do not complete full Lab 14 wiring in pre-lab |
| Annotate a paper DTO for create/activate requests | Do not use live Spring `@Valid` controllers |
| Plan a mapper that does not leak persistence fields | Do not deepen full service transition rules (Lab 15) |
| Draft ValidatorFactory TODOs for invalid cases | Do not expose JPA entities as API bodies |
| List invalid payloads for Amina/Ravi-shaped requests | Do not skip documenting mapper no-leak rules |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-14-exercises` | `~/java-bootcamp/examples/module-14-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-14-exercises\notes | Out-Null
cd examples\module-14-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-14-exercises/notes
cd examples/module-14-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 14 uses `examples/lab14-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 133–135 (A) | Entity vs DTO | `notes/lab14-entity-vs-dto.md` | [`exercise-01-entity-vs-dto.md`](exercise-01-entity-vs-dto.md) |
| 2 | 136–138 (B) | Mapper No-Leak Rule | `notes/lab14-mapper-no-leak.md` | [`exercise-02-mapper-no-leak.md`](exercise-02-mapper-no-leak.md) |
| 3 | 139–143 (C) | Annotate Paper DTO | `notes/lab14-annotate-dto.md` | [`exercise-03-annotate-paper-dto.md`](exercise-03-annotate-paper-dto.md) |
| 4 | 144–147 (D) | Invalid Cases Catalog | `notes/lab14-invalid-cases.md` | [`exercise-04-invalid-cases.md`](exercise-04-invalid-cases.md) |
| 5 | 144–147 (D) | Fill ValidatorFactory TODOs | `notes/lab14-validatorfactory-todos.md` | [`exercise-05-fill-validatorfactory-todos.md`](exercise-05-fill-validatorfactory-todos.md) |
| 6 | 144–147 (D) | Lab 14 Prep Checklist | `notes/lab14-prep-checklist.md` | [`exercise-06-lab14-prep-checklist.md`](exercise-06-lab14-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 14 OS guide.
