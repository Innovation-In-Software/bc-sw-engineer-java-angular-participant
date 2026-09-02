# Module 10 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 10 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 10:** [`../README.md`](../README.md)

**Module:** 10 — GitHub Copilot Fundamentals for Java Developers  
**Next (after all 6 Pass):** OS how-to → [`../lab10/LAB-10-WINDOWS.md`](../lab10/LAB-10-WINDOWS.md) or [`../lab10/LAB-10-MACOS.md`](../lab10/LAB-10-MACOS.md) → [`../lab10/LAB-10-GUIDE.md`](../lab10/LAB-10-GUIDE.md)

> **Gate for Lab 10:** All **six** exercises must be Pass.  
> **JDK:** 21 · **Maven:** 3.9+ · Practice: `examples/module-10-exercises/` · Lab: `examples/lab10-crm/`  
> **Classroom order:** **1 → 2 → 3 → 4 → 5 → 6**  
> If Copilot is unavailable, complete notes analysis manually for pre-lab Pass.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (58–65) | Ex 1 weak vs strong prompts | Learn → Practice |
| Checkpoint B (66–69) | Ex 2 customer sketch | Learn → Practice |
| Checkpoint C (70–71) | Ex 3–4 phantoms + review log | Learn → Practice |
| Checkpoint D (72–73) | Ex 5–6 JDK/Maven + prep | Learn → Practice |
| Checkpoint E (74–76) | Lab 10 | Practice → Lab |

## Scope boundary

| Do now | Do not add yet |
| ------ | -------------- |
| Strong prompts + phantom hunt | Full Lab 10 deliverable in pre-lab |
| Review-log TODOs | Spring Boot / JPA to “make Copilot happy” |
| JDK/Maven checklist | Full JUnit suites (Module 11+) |
| Prep checklist | Secrets / production PII in prompts |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-10-exercises\notes | Out-Null
cd examples\module-10-exercises
java -version
mvn -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-10-exercises/notes && cd examples/module-10-exercises
java -version && mvn -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | Guide | Notes file |
| - | -------- | ---- | ---- | ----- | ---------- |
| 1 | Weak vs Strong Prompts | 10–12 min | Analysis | [`exercise-01-weak-vs-strong-prompts.md`](exercise-01-weak-vs-strong-prompts.md) | `notes/lab10-prelab-prompts.md` |
| 2 | Customer Sketch | 12–15 min | Architecture | [`exercise-02-customer-sketch.md`](exercise-02-customer-sketch.md) | `notes/customer-sketch-notes.md` |
| 3 | Phantom Annotation Hunt | 10–12 min | Analysis | [`exercise-03-phantom-annotation-hunt.md`](exercise-03-phantom-annotation-hunt.md) | `notes/phantom-annotation-notes.md` |
| 4 | Review-Log TODOs | 10–12 min | Hands-on | [`exercise-04-fill-review-log-todos.md`](exercise-04-fill-review-log-todos.md) | `notes/lab10-review-log-todos.md` |
| 5 | JDK / Maven Habit | 8–10 min | Checklist | [`exercise-05-jdk-maven-habit.md`](exercise-05-jdk-maven-habit.md) | `notes/jdk-maven-checklist.md` |
| 6 | Lab 10 Prep Checklist | 8–10 min | Checklist | [`exercise-06-lab10-prep-checklist.md`](exercise-06-lab10-prep-checklist.md) | `notes/lab10-prep-checklist.md` |

When all **six** Pass → OS how-to → [`../lab10/LAB-10-GUIDE.md`](../lab10/LAB-10-GUIDE.md).
