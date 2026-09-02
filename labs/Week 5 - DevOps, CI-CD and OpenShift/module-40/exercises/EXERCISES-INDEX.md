# Module 40 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 40 — Application Security Testing  
**Next:** [`../lab40/LAB-40-GUIDE.md`](../lab40/LAB-40-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-40-exercises/` — not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [OWASP surface map](exercise-01-owasp-surface-map.md) | **A** | `notes/lab40-owasp-surface-map.md` |
| 2 | [Dependency-Check plan](exercise-02-dependency-check-plan.md) | **B** | `notes/lab40-dependency-check-plan.md` |
| 3 | [SAST path TODOs](exercise-03-sast-todo-notes.md) | **C** | `notes/lab40-sast-todo-notes.md` |
| 4 | [Triage CSV sketch](exercise-04-triage-csv-sketch.md) | **C** | `notes/lab40-triage-csv-sketch.md` |
| 5 | [Assessment outline](exercise-05-assessment-outline.md) | **D** | `notes/lab40-assessment-outline.md` |
| 6 | [Go/no-go questions](exercise-06-gate-go-nogo.md) | **D** | `notes/lab40-gate-go-nogo.md` |

Then **checkpoint E** → Lab 40.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Surfaces, SCA plan, triage CSV, SAST notes, gate questions | Docker (41) / k3s (42) / GitHub Actions (43) |
| Residual risk owner + expiry language | Silent suppressions / real PII in evidence |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-40-exercises` | `~/java-bootcamp/examples/module-40-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-40-exercises\notes | Out-Null
```

## Done when

All six notes files exist; go/no-go self-mark **Pass**; Lab 39 verify green before scanning.
