# Module 8 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 8 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 8:** [`../README.md`](../README.md)

**Module:** 8 — Java Project Structure and Modularization  
**Next (after all 6 Pass):** OS how-to → [`../lab8/LAB-8-WINDOWS.md`](../lab8/LAB-8-WINDOWS.md) or [`../lab8/LAB-8-MACOS.md`](../lab8/LAB-8-MACOS.md) → [`../lab8/LAB-8-GUIDE.md`](../lab8/LAB-8-GUIDE.md)

> **Gate for Lab 8:** All **six** exercises must be Pass.  
> **JDK:** 21 · **Maven:** 3.9+ · Practice: `examples/module-08-exercises/` · Lab: `examples/lab8-crm/`  
> **Classroom order:** **1 → 2 → 4 → 3 → 5 → 6**

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (1–8) | Ex 1 Maven layout | Learn → Practice |
| Checkpoint B (9) | Ex 2 package plan | Learn → Practice |
| Checkpoint C (10–14) | Ex 4 layer responsibilities | Learn → Practice |
| Checkpoint D (15–21) | Ex 3 entity vs DTO | Learn → Practice |
| Checkpoint E (22–24) | Ex 5–6 flow + dependency direction | Learn → Practice |
| Checkpoint F (25–27) | Lab 8 | Practice → Lab |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| ------ | -------------- |
| Maven directory vocabulary | Spring Boot dependencies |
| Layer/package responsibilities | Controllers with HTTP annotations |
| Plain Java entity and DTO stubs | JPA entities/database mappings |
| Dependency-direction reasoning | PostgreSQL, Kafka, Angular |
| Request-flow documentation | Real customer persistence |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-08-exercises | Out-Null
cd examples\module-08-exercises
java -version
mvn -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-08-exercises && cd examples/module-08-exercises
java -version && mvn -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Maven Layout | 10–12 min | Analysis | [`exercise-01-maven-layout.md`](exercise-01-maven-layout.md) |
| 2 | Package Plan | 10–12 min | Analysis | [`exercise-02-package-plan.md`](exercise-02-package-plan.md) |
| 3 | Entity vs DTO | 15–20 min | TODO coding | [`exercise-03-entity-vs-dto.md`](exercise-03-entity-vs-dto.md) |
| 4 | Layer Responsibilities | 12–15 min | Analysis | [`exercise-04-layer-responsibilities.md`](exercise-04-layer-responsibilities.md) |
| 5 | Request Flow | 10–12 min | Analysis | [`exercise-05-request-flow.md`](exercise-05-request-flow.md) |
| 6 | Dependency Direction | 10–12 min | Analysis | [`exercise-06-dependency-direction.md`](exercise-06-dependency-direction.md) |

When all **six** Pass → OS how-to → [`../lab8/LAB-8-GUIDE.md`](../lab8/LAB-8-GUIDE.md).
