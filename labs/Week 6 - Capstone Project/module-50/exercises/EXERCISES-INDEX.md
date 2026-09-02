# Module 50 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab50/LAB-50-GUIDE.md`](../lab50/LAB-50-GUIDE.md)

**Module:** 50 — Capstone Frontend and Persistence
**Next:** [`../lab50/LAB-50-WINDOWS.md`](../lab50/LAB-50-WINDOWS.md) or [`../lab50/LAB-50-MACOS.md`](../lab50/LAB-50-MACOS.md) → [`../lab50/LAB-50-GUIDE.md`](../lab50/LAB-50-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-50-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Map Features and Routes](exercise-01-feature-route-map.md) | **A** | `notes/lab50-feature-route-map.md` |
| 2 | [Pin the API Client Contract](exercise-02-api-client-contract.md) | **B** | `notes/lab50-api-client-contract.md` |
| 3 | [Plan JWT and Error States](exercise-03-jwt-and-error-states.md) | **B** | `notes/lab50-jwt-error-states.md` |
| 4 | [Sketch Schema and Migrations](exercise-04-schema-and-migrations.md) | **C** | `notes/lab50-schema-migrations.md` |
| 5 | [Trace One CRUD Path](exercise-05-e2e-crud-trace.md) | **C** | `notes/lab50-e2e-crud-trace.md` |
| 6 | [Plan Tests and Demo Evidence](exercise-06-test-and-demo-readiness.md) | **D** | `notes/lab50-test-demo-readiness.md` |

Then **checkpoint E** → Lab 50.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan Angular structure, routes, services, and DTOs | Do not build the full feature module — that is Lab 50 |
| Sketch schema, entities, and migrations on paper | Do not run Flyway migrations in this pre-lab |
| Trace one end-to-end CRUD path | Do not weaken validation to make a demo pass |
| Name test scenarios and demo evidence | Do not use React, Oracle, or real customer data |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-50-exercises` | `~/java-bootcamp/examples/module-50-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-50-exercises\notes | Out-Null
cd examples\module-50-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-50-exercises/notes
cd examples/module-50-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 50 OS guide.
