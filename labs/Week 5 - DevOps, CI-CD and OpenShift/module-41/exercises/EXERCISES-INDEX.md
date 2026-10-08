# Module 41 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 41 — Containerization with Docker  
**Next:** [`../lab41/LAB-41-GUIDE.md`](../lab41/LAB-41-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-41-exercises/` — not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Multi-stage sketch](exercise-01-multistage-sketch.md) | **A** | `notes/lab41-multistage-sketch.md` |
| 2 | [Dockerfile TODOs](exercise-02-dockerfile-todos.md) | **B** | `notes/lab41-dockerfile-todos.md` |
| 3 | [Health and resources](exercise-03-health-resources.md) | **B** | `notes/lab41-health-resources.md` |
| 4 | [.dockerignore and env](exercise-04-dockerignore-env.md) | **C** | `notes/lab41-dockerignore-env.md` |
| 5 | [Digest vs latest](exercise-05-digest-discipline.md) | **D** | `notes/lab41-digest-discipline.md` |
| 6 | [Container smoke plan](exercise-06-smoke-plan.md) | **D** | `notes/lab41-smoke-plan.md` |

Then **checkpoint E** → Lab 41.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Multi-stage, dockerignore, health, digest, smoke plans | k3s (Lab 42) / GitHub Actions package (Lab 43) |
| Runtime env via `.env.example` | Secrets in image layers / `:latest`-only release |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-41-exercises` | `~/java-bootcamp/examples/module-41-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-41-exercises\notes | Out-Null
```

## Done when

All six notes files exist; smoke-plan self-mark **Pass**; Docker available for Lab 41.
