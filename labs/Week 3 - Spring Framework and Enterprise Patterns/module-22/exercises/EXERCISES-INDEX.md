# Module 22 — Pre-Lab Exercises

> **Start here for Module 22:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 22 — Spring Core and Inversion of Control (IoC)  
**Next:** [`../lab22/LAB-22-WINDOWS.md`](../lab22/LAB-22-WINDOWS.md) or [`../lab22/LAB-22-MACOS.md`](../lab22/LAB-22-MACOS.md) → [`../lab22/LAB-22-GUIDE.md`](../lab22/LAB-22-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-22-exercises/` — **notes files**, not the lab.  
> Lab 22 is the graded consolidation. Do **not** finish Lab 22 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/ioc-vs-new.md` | IoC Versus Manual Wiring | A |
| 2 | `notes/constructor-di.md` | Constructor Injection Preference | B |
| 3 | `notes/lab22-lifecycle-notes.md` | Bean Lifecycle Callbacks | C |
| 4 | `notes/stereotype-map.md` | Stereotype Annotation Map | D |
| 5 | `notes/bean-graph-sketch.md` | Bean Graph Skeleton (TODOs) | E |
| 6 | `notes/lab22-readiness.md` | Lab 22 Readiness Checklist | E |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Explain IoC vs manual `new` for Northstar CRM collaborators | Spring Boot Initializr starters and embedded Tomcat (Lab 23) |
| Name stereotype roles: `@Service`, `@Repository`, `@Component` | Spring MVC REST endpoints (Lab 24) |
| Prefer constructor injection with `final` fields | Full `dev`/`prod` profile YAML and secrets (Lab 26) |
| Sketch a bean graph for CustomerController → CustomerService → repository/notifier | `@Transactional` money transfers (Lab 27) |
| Plan unit tests that construct `CustomerService` without Spring | Spring Security JWT / roles (Lab 28) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-22-exercises` | `~/java-bootcamp/examples/module-22-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-22-exercises\notes | Out-Null
cd examples\module-22-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-22-exercises/notes
cd examples/module-22-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 22 uses `examples/lab22-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 1–13 (A) | IoC Versus Manual Wiring | `notes/ioc-vs-new.md` | [`exercise-01-ioc-vs-new.md`](exercise-01-ioc-vs-new.md) |
| 2 | 14–18 (B) | Constructor Injection Preference | `notes/constructor-di.md` | [`exercise-02-constructor-injection.md`](exercise-02-constructor-injection.md) |
| 3 | 19–23 (C) | Bean Lifecycle Callbacks | `notes/lab22-lifecycle-notes.md` | [`exercise-03-lifecycle-notes.md`](exercise-03-lifecycle-notes.md) |
| 4 | 24–28 (D) | Stereotype Annotation Map | `notes/stereotype-map.md` | [`exercise-04-stereotype-map.md`](exercise-04-stereotype-map.md) |
| 5 | 29–31 (E) | Bean Graph Skeleton (TODOs) | `notes/bean-graph-sketch.md` | [`exercise-05-bean-graph-skeleton.md`](exercise-05-bean-graph-skeleton.md) |
| 6 | 29–31 (E) | Lab 22 Readiness Checklist | `notes/lab22-readiness.md` | [`exercise-06-lab22-readiness.md`](exercise-06-lab22-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 22 OS guide.
