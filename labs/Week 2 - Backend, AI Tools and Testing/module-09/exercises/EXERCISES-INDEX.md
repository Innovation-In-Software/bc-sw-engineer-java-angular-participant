# Module 9 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 9 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 9:** [`../README.md`](../README.md)

**Module:** 9 — Build and Dependency Management with Maven  
**Next (after all 6 Pass):** OS how-to → [`../lab9/LAB-9-WINDOWS.md`](../lab9/LAB-9-WINDOWS.md) or [`../lab9/LAB-9-MACOS.md`](../lab9/LAB-9-MACOS.md) → [`../lab9/LAB-9-GUIDE.md`](../lab9/LAB-9-GUIDE.md)

> **Gate for Lab 9:** All **six** exercises must be Pass.  
> **JDK:** 21 · **Maven:** 3.9+ · Practice: `examples/module-09-exercises/` · Lab: `examples/lab9-crm/`  
> **Classroom order:** **1 → 3 → 4 → 5 → 2 → 6**

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (29–39) | Ex 1 coordinates | Learn → Practice |
| Checkpoint B (40–47) | Ex 3 lifecycle | Learn → Practice |
| Checkpoint C (48–51) | Ex 4–5 scopes + tree | Learn → Practice |
| Checkpoint D (52–53) | Ex 2 profiles · Ex 6 mini POM | Learn → Practice |
| Checkpoint E (54–56) | Lab 9 | Practice → Lab |

## Maven flags (read once)

| Flag | Meaning | When to use |
| ---- | ------- | ----------- |
| *(none)* | Full logs | **Default while learning** |
| `-q` | Quiet | Only after you already saw a successful full run |
| `-B` | Batch | CI-style: `mvn -B verify` |

**Never use `-q` with `mvn dependency:tree`.**

## Scope boundary

| Do now | Do not add yet |
| ------ | -------------- |
| POM coordinates and packaging | Spring Boot application code |
| Dependency scopes | JPA / Kafka / Angular |
| Lifecycle phases + mini POM | Remote `deploy` from laptops |
| Profiles vocabulary | Production secrets in Git |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-09-exercises\notes | Out-Null
cd examples\module-09-exercises
java -version
mvn -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-09-exercises/notes && cd examples/module-09-exercises
java -version && mvn -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | Guide | Notes file |
| - | -------- | ---- | ---- | ----- | ---------- |
| 1 | POM Coordinates | 10–12 min | Analysis | [`exercise-01-pom-coordinates.md`](exercise-01-pom-coordinates.md) | `notes/pom-coordinates-notes.md` |
| 2 | Build Profiles | 10–12 min | Analysis | [`exercise-02-profiles.md`](exercise-02-profiles.md) | `notes/profiles-notes.md` |
| 3 | Maven Lifecycle | 12–15 min | Analysis | [`exercise-03-lifecycle.md`](exercise-03-lifecycle.md) | `notes/lifecycle-notes.md` |
| 4 | Dependency Scopes | 10–12 min | Analysis | [`exercise-04-dependency-scopes.md`](exercise-04-dependency-scopes.md) | `notes/dependency-scopes-notes.md` |
| 5 | Dependency Tree | 12–15 min | Analysis + Maven | [`exercise-05-dependency-tree.md`](exercise-05-dependency-tree.md) | `notes/dependency-tree-notes.md` |
| 6 | Mini POM | 18–25 min | TODO Maven | [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md) | `notes/mini-maven-notes.md` |

When all **six** Pass → OS how-to → [`../lab9/LAB-9-GUIDE.md`](../lab9/LAB-9-GUIDE.md).
