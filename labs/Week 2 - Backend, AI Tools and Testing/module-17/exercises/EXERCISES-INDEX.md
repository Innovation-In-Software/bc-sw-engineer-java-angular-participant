# Module 17 — Pre-Lab Exercises

> **Start here for Module 17:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 17 — JUnit Testing Fundamentals  
**Next:** [`../lab17/LAB-17-WINDOWS.md`](../lab17/LAB-17-WINDOWS.md) or [`../lab17/LAB-17-MACOS.md`](../lab17/LAB-17-MACOS.md) → [`../lab17/LAB-17-GUIDE.md`](../lab17/LAB-17-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-17-exercises/` — **notes files**, not the lab.  
> Lab 17 is the graded consolidation. Do **not** finish Lab 17 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab17-aaa-plan.md` | AAA Service Tests Plan | A |
| 2 | `notes/lab17-meaningful-asserts.md` | Meaningful Asserts | B |
| 3 | `notes/lab17-csvsource-table.md` | CsvSource Table Design | C |
| 4 | `notes/lab17-test-names.md` | Expressive Test Names | D |
| 5 | `notes/lab17-jacoco-gate-todos.md` | Fill JaCoCo Gate Narrative TODOs | D |
| 6 | `notes/lab17-prep-checklist.md` | Lab 17 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Practice expressive JUnit 5 test names for CRM cases | Do not complete the full Lab 17 suite in this pre-lab |
| Design a CsvSource table for status inputs | Do not deep-dive Mockito (Lab 18) |
| Prefer meaningful asserts over assertNotNull-only | Do not treat AI-generated tests as final without review |
| Narrate a JaCoCo gate goal as TODOs | Do not skip parameterized case design |
| Plan AAA service tests without deep Mockito | Do not configure Selenium UI tests here (Lab 19) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-17-exercises` | `~/java-bootcamp/examples/module-17-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-17-exercises\notes | Out-Null
cd examples\module-17-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-17-exercises/notes
cd examples/module-17-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 17 uses `examples/lab17-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 186–190 (A) | AAA Service Tests Plan | `notes/lab17-aaa-plan.md` | [`exercise-01-aaa-service-tests-plan.md`](exercise-01-aaa-service-tests-plan.md) |
| 2 | 191–192 (B) | Meaningful Asserts | `notes/lab17-meaningful-asserts.md` | [`exercise-02-meaningful-asserts.md`](exercise-02-meaningful-asserts.md) |
| 3 | 193 (C) | CsvSource Table Design | `notes/lab17-csvsource-table.md` | [`exercise-03-csvsource-table.md`](exercise-03-csvsource-table.md) |
| 4 | 194–198 (D) | Expressive Test Names | `notes/lab17-test-names.md` | [`exercise-04-test-names.md`](exercise-04-test-names.md) |
| 5 | 194–198 (D) | Fill JaCoCo Gate Narrative TODOs | `notes/lab17-jacoco-gate-todos.md` | [`exercise-05-fill-jacoco-gate-todos.md`](exercise-05-fill-jacoco-gate-todos.md) |
| 6 | 194–198 (D) | Lab 17 Prep Checklist | `notes/lab17-prep-checklist.md` | [`exercise-06-lab17-prep-checklist.md`](exercise-06-lab17-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 17 OS guide.
