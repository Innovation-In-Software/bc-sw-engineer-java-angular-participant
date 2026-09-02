# Module 34 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab34/LAB-34-GUIDE.md`](../lab34/LAB-34-GUIDE.md)

**Module:** 34 — State and Event Management in Angular
**Next:** [`../lab34/LAB-34-WINDOWS.md`](../lab34/LAB-34-WINDOWS.md) or [`../lab34/LAB-34-MACOS.md`](../lab34/LAB-34-MACOS.md) → [`../lab34/LAB-34-GUIDE.md`](../lab34/LAB-34-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-34-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Model State with Signals](exercise-01-signal-state-model.md) | **A** | `notes/lab34-signal-state.md` |
| 2 | [Trace Observables and Subjects](exercise-02-observable-basics.md) | **B** | `notes/lab34-observables.md` |
| 3 | [Decide Signals versus RxJS](exercise-03-signals-vs-rxjs.md) | **B** | `notes/lab34-signals-vs-rxjs.md` |
| 4 | [Trace Event Flow Upward](exercise-04-event-flow.md) | **C** | `notes/lab34-event-flow.md` |
| 5 | [Plan the Reactive Filter Form](exercise-05-reactive-form-plan.md) | **C** | `notes/lab34-form-plan.md` |
| 6 | [Plan UI States and Self-Check](exercise-06-lab34-readiness.md) | **D** | `notes/lab34-readiness.md` |

Then **checkpoint E** → Lab 34.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Design signal state, computed values, and event flow | Do not add NgRx or another state library |
| Plan the reactive form and its validation | Do not call a real API — that is Module 35 |
| Decide Signals versus RxJS per case, with reasons | Do not subscribe without planning cleanup |
| Plan loading, empty, and error states explicitly | Do not collapse those three into one blank screen |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-34-exercises` | `~/java-bootcamp/examples/module-34-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-34-exercises\notes | Out-Null
cd examples\module-34-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-34-exercises/notes
cd examples/module-34-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 34 OS guide.
