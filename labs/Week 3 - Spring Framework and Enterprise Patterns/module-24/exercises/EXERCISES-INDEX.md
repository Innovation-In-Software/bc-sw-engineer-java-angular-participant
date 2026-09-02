# Module 24 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab24/LAB-24-GUIDE.md`](../lab24/LAB-24-GUIDE.md)

**Module:** 24 — REST Endpoints and Request Mapping
**Next:** [`../lab24/LAB-24-WINDOWS.md`](../lab24/LAB-24-WINDOWS.md) or [`../lab24/LAB-24-MACOS.md`](../lab24/LAB-24-MACOS.md) → [`../lab24/LAB-24-GUIDE.md`](../lab24/LAB-24-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-24-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Plan the Controller Mappings](exercise-01-controller-mapping-plan.md) | **A** | `notes/lab24-mapping-plan.md` |
| 2 | [Bind Path, Query and Body](exercise-02-binding-table.md) | **B** | `notes/lab24-binding-table.md` |
| 3 | [Shape Responses with ResponseEntity](exercise-03-response-entity-map.md) | **B** | `notes/lab24-response-map.md` |
| 4 | [Trace DTO, Validation and Errors](exercise-04-dto-validation-flow.md) | **C** | `notes/lab24-validation-flow.md` |
| 5 | [Write the Angular CORS Note](exercise-05-cors-for-angular.md) | **C** | `notes/lab24-cors-angular.md` |
| 6 | [Plan MockMvc Tests and Self-Check](exercise-06-mockmvc-readiness.md) | **D** | `notes/lab24-mockmvc-readiness.md` |

Then **checkpoint E** → Lab 24.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan controller mappings, binding, and status codes | Do not write business logic in the controller |
| Design MockMvc test cases and a CORS note | Do not disable CORS with a blanket allow-all |
| Reuse the Module 13 URI and status contract | Do not redesign the API surface here |
| Use the synthetic CRM fixtures | Do not connect a real database in this pre-lab |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-24-exercises` | `~/java-bootcamp/examples/module-24-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-24-exercises\notes | Out-Null
cd examples\module-24-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-24-exercises/notes
cd examples/module-24-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 24 OS guide.
