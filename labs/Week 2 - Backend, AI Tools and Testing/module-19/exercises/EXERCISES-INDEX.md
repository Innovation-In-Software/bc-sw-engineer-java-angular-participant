# Module 19 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

**Module:** 19 — Integration Testing and UI Test Automation
**Next:** [`../lab19/LAB-19-WINDOWS.md`](../lab19/LAB-19-WINDOWS.md) or [`../lab19/LAB-19-MACOS.md`](../lab19/LAB-19-MACOS.md) → [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-19-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Place Tests on the Pyramid](exercise-01-test-level-map.md) | **A** | `notes/lab19-test-level-map.md` |
| 2 | [Plan the Spring Integration Tests](exercise-02-spring-test-plan.md) | **A** | `notes/lab19-spring-test-plan.md` |
| 3 | [Choose the Test Database Strategy](exercise-03-test-db-strategy.md) | **B** | `notes/lab19-postgres-test-strategy.md` |
| 4 | [Choose Stable Selectors](exercise-04-selector-strategy.md) | **C** | `notes/lab19-selectors.md` |
| 5 | [Plan Waits and UI States](exercise-05-waits-and-states.md) | **C** | `notes/lab19-waits.md` |
| 6 | [Plan the CI Stage and Self-Check](exercise-06-ci-and-readiness.md) | **D** | `notes/lab19-ci-readiness.md` |

Then **checkpoint E** → Lab 19.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan integration tests, selectors, waits, and the CI stage | Do not write the full Lab 19 suite in this pre-lab |
| Design the PostgreSQL test-database strategy | Do not point tests at a shared or production database |
| Choose stable selectors and explicit waits | Do not use Thread.sleep to stabilise a UI test |
| Plan CI evidence and screenshots | Do not commit ChromeDriver binaries or secrets |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-19-exercises` | `~/java-bootcamp/examples/module-19-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-19-exercises\notes | Out-Null
cd examples\module-19-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-19-exercises/notes
cd examples/module-19-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 19 OS guide.
