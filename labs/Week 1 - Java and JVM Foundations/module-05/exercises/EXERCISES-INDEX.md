# Module 5 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 5 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 5:** [`../README.md`](../README.md)

**Module:** 5 — Java Collections Framework  
**Next (after all 7 Pass):** OS how-to → [`../lab5/LAB-5-WINDOWS.md`](../lab5/LAB-5-WINDOWS.md) or [`../lab5/LAB-5-MACOS.md`](../lab5/LAB-5-MACOS.md) → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)

> **Gate for Lab 5:** All **seven** exercises must be Pass.  
> **JDK:** 21 · Practice: `examples/module-05-exercises/` · Lab: `examples/Lab5-LibraryManagement/`  
> `HashSet` / `HashMap` iteration order is unspecified — do not hard-assert print order.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (131–136) | Ex 1 ArrayList | Learn → Practice |
| Checkpoint B (137–139) | Ex 2 Set | Learn → Practice |
| Checkpoint C (140–142) | Ex 3–4 Map / TreeMap | Learn → Practice |
| Checkpoint D (143–145) | Ex 5 Iterator | Learn → Practice |
| Checkpoint E (146–147) | Ex 6–7 choose + warm-up | Learn → Practice |
| Checkpoint F (148–150) | Lab 5 | Practice → Lab |

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Arrays and loops | Modules 1–2 |
| Classes / encapsulation | Module 3 |
| Memory / references | Module 4 |

## Collection decision guide

| Need | Interface | Typical implementation |
| ---- | --------- | ---------------------- |
| Ordered, indexed; duplicates OK | `List` | `ArrayList` |
| Unique values | `Set` | `HashSet` |
| Unique + sorted | `Set` | `TreeSet` |
| Key → value | `Map` | `HashMap` |
| Sorted keys | `Map` | `TreeMap` |

```java
List<String> titles = new ArrayList<>();
Set<String> ids = new HashSet<>();
Map<String, Integer> copies = new HashMap<>();
```

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-05-exercises | Out-Null
cd examples\module-05-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-05-exercises && cd examples/module-05-exercises
```

Prefer copy from [`starter/`](starter/README.md). Ignore yellow *outside source root* banner.

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Working with List | 12–15 min | TODO coding | [`exercise-01-arraylist.md`](exercise-01-arraylist.md) |
| 2 | Working with Set | 12–15 min | TODO coding | [`exercise-02-hashset.md`](exercise-02-hashset.md) |
| 3 | Working with Map | 12–15 min | TODO coding | [`exercise-03-hashmap.md`](exercise-03-hashmap.md) |
| 4 | Sorted TreeMap | 10–12 min | TODO coding | [`exercise-04-sorted-collections.md`](exercise-04-sorted-collections.md) |
| 5 | Safe Iteration | 12–15 min | TODO + debug | [`exercise-05-iteration.md`](exercise-05-iteration.md) |
| 6 | Choose Collection | 10–12 min | Analysis | [`exercise-06-choose-collection.md`](exercise-06-choose-collection.md) |
| 7 | Library Warm-up | 15–18 min | TODO coding | [`exercise-07-library-warmup.md`](exercise-07-library-warmup.md) |

When all **seven** Pass → OS how-to → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md).
