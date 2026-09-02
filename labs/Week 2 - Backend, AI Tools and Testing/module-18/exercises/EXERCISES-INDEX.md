# Module 18 — Pre-Lab Exercises

> **Start here for Module 18:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 18 — Mockito for Test Isolation  
**Next:** [`../lab18/LAB-18-WINDOWS.md`](../lab18/LAB-18-WINDOWS.md) or [`../lab18/LAB-18-MACOS.md`](../lab18/LAB-18-MACOS.md) → [`../lab18/LAB-18-GUIDE.md`](../lab18/LAB-18-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-18-exercises/` — **notes files**, not the lab.  
> Lab 18 is the graded consolidation. Do **not** finish Lab 18 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab18-keep-real-validator.md` | When to Keep Real Validator | A |
| 2 | `notes/lab18-stub-verify.md` | Stub vs Verify | B |
| 3 | `notes/lab18-argumentcaptor-preview.md` | ArgumentCaptor Preview | C |
| 4 | `notes/lab18-activate-interaction-todos.md` | Fill Activate Interaction Sequence TODOs | C |
| 5 | `notes/lab18-anti-patterns.md` | Mockito Anti-Patterns | D |
| 6 | `notes/lab18-prep-checklist.md` | Lab 18 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Contrast stub vs verify for CustomerRepository | Do not complete the full Lab 18 suite in this pre-lab |
| Decide when to keep a real validator collaborator | Do not mock everything including value objects unnecessarily |
| Draft activate interaction sequence TODOs | Do not start Selenium IT (Lab 19) |
| List Mockito anti-patterns to reject from AI | Do not skip verifying interaction order where it matters |
| Preview ArgumentCaptor for saved Customer status | Do not accept AI mocks of JDK types without cause |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-18-exercises` | `~/java-bootcamp/examples/module-18-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-18-exercises\notes | Out-Null
cd examples\module-18-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-18-exercises/notes
cd examples/module-18-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 18 uses `examples/lab18-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 203–207 (A) | When to Keep Real Validator | `notes/lab18-keep-real-validator.md` | [`exercise-01-keep-real-validator.md`](exercise-01-keep-real-validator.md) |
| 2 | 208–209 (B) | Stub vs Verify | `notes/lab18-stub-verify.md` | [`exercise-02-stub-vs-verify.md`](exercise-02-stub-vs-verify.md) |
| 3 | 210–213 (C) | ArgumentCaptor Preview | `notes/lab18-argumentcaptor-preview.md` | [`exercise-03-argumentcaptor-preview.md`](exercise-03-argumentcaptor-preview.md) |
| 4 | 210–213 (C) | Fill Activate Interaction Sequence TODOs | `notes/lab18-activate-interaction-todos.md` | [`exercise-04-fill-activate-interaction-todos.md`](exercise-04-fill-activate-interaction-todos.md) |
| 5 | 214–215 (D) | Mockito Anti-Patterns | `notes/lab18-anti-patterns.md` | [`exercise-05-anti-patterns.md`](exercise-05-anti-patterns.md) |
| 6 | 214–215 (D) | Lab 18 Prep Checklist | `notes/lab18-prep-checklist.md` | [`exercise-06-lab18-prep-checklist.md`](exercise-06-lab18-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 18 OS guide.
