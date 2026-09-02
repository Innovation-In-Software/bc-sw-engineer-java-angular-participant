# Module 35 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab35/LAB-35-GUIDE.md`](../lab35/LAB-35-GUIDE.md)

**Module:** 35 — Frontend to API Integration
**Next:** [`../lab35/LAB-35-WINDOWS.md`](../lab35/LAB-35-WINDOWS.md) or [`../lab35/LAB-35-MACOS.md`](../lab35/LAB-35-MACOS.md) → [`../lab35/LAB-35-GUIDE.md`](../lab35/LAB-35-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-35-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Plan the API Service](exercise-01-api-service-plan.md) | **A** | `notes/lab35-api-service.md` |
| 2 | [Align Typed Models to the API](exercise-02-typed-models.md) | **B** | `notes/lab35-typed-models.md` |
| 3 | [Render Every UI State](exercise-03-ui-state-plan.md) | **B** | `notes/lab35-ui-states.md` |
| 4 | [Plan Errors and Interceptors](exercise-04-error-and-interceptors.md) | **C** | `notes/lab35-errors-interceptors.md` |
| 5 | [Configure Environments and CORS](exercise-05-environments-and-cors.md) | **C** | `notes/lab35-environments-cors.md` |
| 6 | [Plan Evidence and Self-Check](exercise-06-lab35-readiness.md) | **D** | `notes/lab35-readiness.md` |

Then **checkpoint E** → Lab 35.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan the API service, typed models, and interceptors | Do not implement backend endpoints here |
| Design UI states and the global error strategy | Do not retry non-idempotent calls blindly |
| Configure environment base URLs and note CORS | Do not hard-code a production URL in the code |
| Use the synthetic CRM fixtures | Do not put tokens or secrets in environment files in Git |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-35-exercises` | `~/java-bootcamp/examples/module-35-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-35-exercises\notes | Out-Null
cd examples\module-35-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-35-exercises/notes
cd examples/module-35-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 35 OS guide.
