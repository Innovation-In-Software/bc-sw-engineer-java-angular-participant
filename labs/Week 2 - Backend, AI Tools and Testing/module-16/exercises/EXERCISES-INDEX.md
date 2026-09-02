# Module 16 — Pre-Lab Exercises

> **Start here for Module 16:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 16 — Exception Handling in Distributed APIs  
**Next:** [`../lab16/LAB-16-WINDOWS.md`](../lab16/LAB-16-WINDOWS.md) or [`../lab16/LAB-16-MACOS.md`](../lab16/LAB-16-MACOS.md) → [`../lab16/LAB-16-GUIDE.md`](../lab16/LAB-16-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-16-exercises/` — **notes files**, not the lab.  
> Lab 16 is the graded consolidation. Do **not** finish Lab 16 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md). Status cheat sheet: [`../HTTP-STATUS-CODES.md`](../HTTP-STATUS-CODES.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab16-catch-order.md` | Catch Order | A |
| 2 | `notes/lab16-errorresponse-json.md` | ErrorResponse JSON Draft | B |
| 3 | `notes/lab16-status-map.md` | Failure to Status Map | C |
| 4 | `notes/lab16-message-hygiene-todos.md` | Fill Message Hygiene TODOs | D |
| 5 | `notes/lab16-correlation-always.md` | Correlation on Every Error | D |
| 6 | `notes/lab16-prep-checklist.md` | Lab 16 Prep Checklist | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map domain failures to HTTP status ideas | Do not complete full Lab 16 implementation in pre-lab |
| Draft ErrorResponse JSON for not-found and conflict | Do not require a live Spring Boot app in pre-lab |
| Order catch/handlers from specific to general | Do not return raw exception messages with PII |
| Write message hygiene TODOs (no stack traces to clients) | Do not skip correlation on error paths |
| Require correlation id on every error response sketch | Do not deepen logging frameworks (Lab 20) beyond error shape |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-16-exercises` | `~/java-bootcamp/examples/module-16-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-16-exercises\notes | Out-Null
cd examples\module-16-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-16-exercises/notes
cd examples/module-16-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 16 uses `examples/lab16-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 168–173 (A) | Catch Order | `notes/lab16-catch-order.md` | [`exercise-01-catch-order.md`](exercise-01-catch-order.md) |
| 2 | 174 (B) | ErrorResponse JSON Draft | `notes/lab16-errorresponse-json.md` | [`exercise-02-errorresponse-json.md`](exercise-02-errorresponse-json.md) |
| 3 | 175–177 (C) | Failure to Status Map | `notes/lab16-status-map.md` | [`exercise-03-failure-status-map.md`](exercise-03-failure-status-map.md) |
| 4 | 178–181 (D) | Fill Message Hygiene TODOs | `notes/lab16-message-hygiene-todos.md` | [`exercise-04-fill-message-hygiene-todos.md`](exercise-04-fill-message-hygiene-todos.md) |
| 5 | 178–181 (D) | Correlation on Every Error | `notes/lab16-correlation-always.md` | [`exercise-05-correlation-always.md`](exercise-05-correlation-always.md) |
| 6 | 178–181 (D) | Lab 16 Prep Checklist | `notes/lab16-prep-checklist.md` | [`exercise-06-lab16-prep-checklist.md`](exercise-06-lab16-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 16 OS guide.
