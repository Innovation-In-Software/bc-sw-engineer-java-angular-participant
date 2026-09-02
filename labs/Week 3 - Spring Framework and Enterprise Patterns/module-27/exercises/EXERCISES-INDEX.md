# Module 27 — Pre-Lab Exercises

> **Start here for Module 27:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 27 — Transaction Management  
**Next:** [`../lab27/LAB-27-WINDOWS.md`](../lab27/LAB-27-WINDOWS.md) or [`../lab27/LAB-27-MACOS.md`](../lab27/LAB-27-MACOS.md) → [`../lab27/LAB-27-GUIDE.md`](../lab27/LAB-27-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-27-exercises/` — **notes files**, not the lab.  
> Lab 27 is the graded consolidation. Do **not** finish Lab 27 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/acid-crm.md` | ACID for CRM Transfers | A |
| 2 | `notes/tx-boundary.md` | Transaction Boundary Placement | B |
| 3 | `notes/rollback-plan.md` | Rollback Evidence Plan | B |
| 4 | `notes/lab27-transfer-pseudocode.md` | Transfer Pseudocode (TODOs) | C |
| 5 | `notes/propagation-warnings.md` | Propagation Warnings | C |
| 6 | `notes/lab27-readiness.md` | Lab 27 Readiness Checklist | C |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Explain ACID with CRM transfer observations | JWT SecurityFilterChain (Lab 28) |
| Place `@Transactional` on service methods (not controllers) | Distributed sagas / Kafka transactions (Week 4) |
| Plan debit + credit + log as one unit of work | Manual `EntityManager` commit APIs as primary style |
| Design rollback evidence using `ACC-FORCE-FAIL` | Putting `@Transactional` on controllers |
| Review AI drafts for swallowed exceptions / wrong propagation | Production multi-DB XA configuration |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-27-exercises` | `~/java-bootcamp/examples/module-27-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-27-exercises\notes | Out-Null
cd examples\module-27-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-27-exercises/notes
cd examples/module-27-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 27 uses `examples/lab27-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 137–146 (A) | ACID for CRM Transfers | `notes/acid-crm.md` | [`exercise-01-acid-crm.md`](exercise-01-acid-crm.md) |
| 2 | 147–151 (B) | Transaction Boundary Placement | `notes/tx-boundary.md` | [`exercise-02-transaction-boundary.md`](exercise-02-transaction-boundary.md) |
| 3 | 147–151 (B) | Rollback Evidence Plan | `notes/rollback-plan.md` | [`exercise-03-rollback-plan.md`](exercise-03-rollback-plan.md) |
| 4 | 152–156a (C) | Transfer Pseudocode (TODOs) | `notes/lab27-transfer-pseudocode.md` | [`exercise-04-transfer-pseudocode.md`](exercise-04-transfer-pseudocode.md) |
| 5 | 152–156a (C) | Propagation Warnings | `notes/propagation-warnings.md` | [`exercise-05-propagation-warnings.md`](exercise-05-propagation-warnings.md) |
| 6 | 152–156a (C) | Lab 27 Readiness Checklist | `notes/lab27-readiness.md` | [`exercise-06-lab27-readiness.md`](exercise-06-lab27-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 27 OS guide.
