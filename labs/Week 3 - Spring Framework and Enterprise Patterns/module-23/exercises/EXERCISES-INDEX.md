# Module 23 — Pre-Lab Exercises

> **Start here for Module 23:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 23 — Spring Boot Auto-Configuration  
**Next:** [`../lab23/LAB-23-WINDOWS.md`](../lab23/LAB-23-WINDOWS.md) or [`../lab23/LAB-23-MACOS.md`](../lab23/LAB-23-MACOS.md) → [`../lab23/LAB-23-GUIDE.md`](../lab23/LAB-23-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-23-exercises/` — **notes files**, not the lab.  
> Lab 23 is the graded consolidation. Do **not** finish Lab 23 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/autoconfig-ownership.md` | Auto-Config Versus Ownership | A |
| 2 | `notes/starters.md` | Boot Starters Inventory | B |
| 3 | `notes/health-sketch.md` | CrmApplication Stub (TODOs) | B |
| 4 | `notes/lab23-application-yml-sketch.md` | application.yml Sketch | C |
| 5 | `notes/rest-smoke-plan.md` | REST Smoke Plan | C |
| 6 | `notes/lab23-readiness.md` | Lab 23 Readiness Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify Spring Boot starters (`web`, `actuator`, `test`) | Spring MVC REST mappings (Lab 24) |
| Sketch `CrmApplication` + `application.yml` basics | Deep profile/secret externalization (Lab 26) |
| Plan REST `/api/customers` smoke for CUS-1001 / CUS-1002 | `@Transactional` transfers (Lab 27) |
| Explain Actuator `/actuator/health` as a smoke check | JWT SecurityFilterChain (Lab 28) |
| Separate auto-config gifts from ownership (domain rules) | Kafka / Angular / PostgreSQL (Week 4) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-23-exercises` | `~/java-bootcamp/examples/module-23-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-23-exercises\notes | Out-Null
cd examples\module-23-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-23-exercises/notes
cd examples/module-23-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 23 uses `examples/lab23-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 36–46 (A) | Auto-Config Versus Ownership | `notes/autoconfig-ownership.md` | [`exercise-01-autoconfig-vs-ownership.md`](exercise-01-autoconfig-vs-ownership.md) |
| 2 | 47–52 (B) | Boot Starters Inventory | `notes/starters.md` | [`exercise-02-starters-inventory.md`](exercise-02-starters-inventory.md) |
| 3 | 47–52 (B) | CrmApplication Stub (TODOs) | `notes/health-sketch.md` | [`exercise-03-crm-application-stub.md`](exercise-03-crm-application-stub.md) |
| 4 | 53–59 (C) | application.yml Sketch | `notes/lab23-application-yml-sketch.md` | [`exercise-04-application-yml-sketch.md`](exercise-04-application-yml-sketch.md) |
| 5 | 53–59 (C) | REST Smoke Plan | `notes/rest-smoke-plan.md` | [`exercise-05-rest-smoke-plan.md`](exercise-05-rest-smoke-plan.md) |
| 6 | 60–61 (D) | Lab 23 Readiness Checklist | `notes/lab23-readiness.md` | [`exercise-06-lab23-readiness.md`](exercise-06-lab23-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 23 OS guide.
