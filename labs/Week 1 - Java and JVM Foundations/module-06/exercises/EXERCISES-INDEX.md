# Module 6 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 6 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 6:** [`../README.md`](../README.md)

**Module:** 6 — Streams and Functional Programming  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab6/LAB-6-WINDOWS.md`](../lab6/LAB-6-WINDOWS.md) or [`../lab6/LAB-6-MACOS.md`](../lab6/LAB-6-MACOS.md) → [`../lab6/LAB-6-GUIDE.md`](../lab6/LAB-6-GUIDE.md)

> **Gate for Lab 6:** Exercises **1–7** must be Pass. Exercise 8 is recommended stretch (Checkpoint E).  
> **JDK:** 21 · Practice: `examples/module-06-exercises/` · Lab: `examples/Lab6-EmployeeAnalytics/`  
> Do **not** reuse a `Stream` after a terminal operation — create a new stream from the source list.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (152–157) | Ex 1 lambda / FI | Learn → Practice |
| Checkpoint B (158–159) | Ex 2–3 filter + map | Learn → Practice |
| Checkpoint C (160–162) | Ex 4–5 min/max + raise | Learn → Practice |
| Checkpoint D (163–166) | Ex 6–7 grouping + pipeline | Learn → Practice |
| Checkpoint E (167–168) | Ex 8 parallel *(stretch)* | Learn → Practice |
| Checkpoint F (169–171) | Lab 6 | Practice → Lab |

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Classes, records, methods, interfaces | Modules 2–3 |
| `List` and collection iteration | Module 5 |
| Collection choice and mutability | Module 5 exercises |

Module 6 focuses on **declarative data processing**: describe what to select, transform, aggregate, or group while the Streams API handles iteration.

## Stream pipeline vocabulary

| Term | Easy meaning | Example |
| ---- | ------------ | ------- |
| Source | Data the stream reads | `EmployeeData.sample().stream()` |
| Intermediate operation | Builds the pipeline; lazy until a terminal operation | `filter`, `map`, `sorted` |
| Terminal operation | Executes the pipeline and produces a result | `toList`, `count`, `max` |
| Stateless lambda | Uses only its input; safe and predictable | `e -> e.salary() > 60_000` |
| Reduction | Combines many values into one result | `count`, `min`, `max`, `reduce` |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-06-exercises | Out-Null
cd examples\module-06-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-06-exercises && cd examples/module-06-exercises
```

Prefer copy from [`starter/`](starter/README.md). Ignore yellow *outside source root* banner. Work **in order** — Ex 1 creates the shared dataset.

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Lambda + Functional Interface | 15–18 min | TODO coding | [`exercise-01-lambda-functional-interface.md`](exercise-01-lambda-functional-interface.md) |
| 2 | Filter by Salary | 12–15 min | TODO coding | [`exercise-02-filter-salary.md`](exercise-02-filter-salary.md) |
| 3 | Map to Names | 10–12 min | TODO coding | [`exercise-03-list-names.md`](exercise-03-list-names.md) |
| 4 | Highest / Lowest Salary | 12–15 min | TODO coding | [`exercise-04-minmax.md`](exercise-04-minmax.md) |
| 5 | Map a 10% Raise | 12–15 min | TODO coding | [`exercise-05-map-raise.md`](exercise-05-map-raise.md) |
| 6 | Count by Department | 12–15 min | TODO coding | [`exercise-06-group-count.md`](exercise-06-group-count.md) |
| 7 | HR Department Names | 12–15 min | TODO coding | [`exercise-07-hr-names.md`](exercise-07-hr-names.md) |
| 8 | `parallelStream` Bonus | 10–15 min | Stretch | [`exercise-08-parallel-bonus.md`](exercise-08-parallel-bonus.md) |

When Exercises **1–7** Pass → OS how-to → [`../lab6/LAB-6-GUIDE.md`](../lab6/LAB-6-GUIDE.md).
