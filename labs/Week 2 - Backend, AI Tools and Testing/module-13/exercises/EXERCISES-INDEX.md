# Module 13 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md)

**Module:** 13 — REST API Design with Java
**Next:** [`../lab13/LAB-13-WINDOWS.md`](../lab13/LAB-13-WINDOWS.md) or [`../lab13/LAB-13-MACOS.md`](../lab13/LAB-13-MACOS.md) → [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-13-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Design the Resource URI Table](exercise-01-resource-uri-table.md) | **A** | `notes/lab13-uri-table.md` |
| 2 | [Map Methods to Status Codes](exercise-02-method-status-map.md) | **B** | `notes/lab13-method-status-map.md` |
| 3 | [Write the Error Contract](exercise-03-error-contract.md) | **B** | `notes/lab13-error-contract.md` |
| 4 | [Plan Collections and Versioning](exercise-04-collection-and-versioning.md) | **C** | `notes/lab13-collection-versioning.md` |
| 5 | [Sketch the OpenAPI Skeleton](exercise-05-openapi-skeleton.md) | **C** | `notes/lab13-openapi-skeleton.md` |
| 6 | [Lab 13 Readiness Self-Check](exercise-06-lab13-readiness.md) | **D** | `notes/lab13-readiness.md` |

Then **checkpoint E** → Lab 13.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Design URIs, status maps, and the error contract on paper | Do not build a Spring Boot controller — that is Module 24 |
| Author an OpenAPI skeleton for the Customer resource | Do not implement business logic or persistence |
| Plan pagination, filtering, and versioning | Do not invent verbs in URIs (/getCustomer) |
| Match schemas to the Amina and Ravi fixtures | Do not put real customer data in any example |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-13-exercises` | `~/java-bootcamp/examples/module-13-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-13-exercises\notes | Out-Null
cd examples\module-13-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-13-exercises/notes
cd examples/module-13-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 13 OS guide.
