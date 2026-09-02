# Module 28 — Pre-Lab Exercises

> **Start here for Module 28:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 28 — Spring Security Fundamentals  
**Next:** [`../lab28/LAB-28-WINDOWS.md`](../lab28/LAB-28-WINDOWS.md) or [`../lab28/LAB-28-MACOS.md`](../lab28/LAB-28-MACOS.md) → [`../lab28/LAB-28-GUIDE.md`](../lab28/LAB-28-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-28-exercises/` — **notes files**, not the lab.  
> Lab 28 is the graded consolidation. Do **not** finish Lab 28 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/authn-authz.md` | Authentication Versus Authorization | A |
| 2 | `notes/filter-chain.md` | SecurityFilterChain Sketch | B |
| 3 | `notes/lab28-jwt-login-todos.md` | JWT Login TODOs | C |
| 4 | `notes/mockmvc-matrix.md` | MockMvc Evidence Matrix | C |
| 5 | `notes/security-notes-outline.md` | Production IdP Checklist | D |
| 6 | `notes/lab28-readiness.md` | Lab 28 Readiness Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Plan JWT login and Bearer access for CRM APIs | Full OAuth2 Authorization Server implementation |
| Distinguish 401 vs 403 for agent/admin roles | Bean Validation global ErrorResponse polish (Lab 29) |
| Sketch a stateless SecurityFilterChain | Kafka ACL security (Week 4) |
| Protect `/api/customers/**` and `/api/admin/**` differently | Angular token storage UI (Week 4) |
| Document production IdP / key-rotation checklist items | Committing real JWT signing secrets |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-28-exercises` | `~/java-bootcamp/examples/module-28-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-28-exercises\notes | Out-Null
cd examples\module-28-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-28-exercises/notes
cd examples/module-28-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 28 uses `examples/lab28-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 161–166 (A) | Authentication Versus Authorization | `notes/authn-authz.md` | [`exercise-01-authn-vs-authz.md`](exercise-01-authn-vs-authz.md) |
| 2 | 167–175 (B) | SecurityFilterChain Sketch | `notes/filter-chain.md` | [`exercise-02-filter-chain-sketch.md`](exercise-02-filter-chain-sketch.md) |
| 3 | 176–179 (C) | JWT Login TODOs | `notes/lab28-jwt-login-todos.md` | [`exercise-03-jwt-login-todos.md`](exercise-03-jwt-login-todos.md) |
| 4 | 176–179 (C) | MockMvc Evidence Matrix | `notes/mockmvc-matrix.md` | [`exercise-04-mockmvc-matrix.md`](exercise-04-mockmvc-matrix.md) |
| 5 | 180–182 (D) | Production IdP Checklist | `notes/security-notes-outline.md` | [`exercise-05-production-checklist.md`](exercise-05-production-checklist.md) |
| 6 | 180–182 (D) | Lab 28 Readiness Checklist | `notes/lab28-readiness.md` | [`exercise-06-lab28-readiness.md`](exercise-06-lab28-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 28 OS guide.
