# Module 4 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 4 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 4:** [`../README.md`](../README.md)

**Module:** 4 — Memory Management and Performance  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab4/LAB-4-WINDOWS.md`](../lab4/LAB-4-WINDOWS.md) or [`../lab4/LAB-4-MACOS.md`](../lab4/LAB-4-MACOS.md) → [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md)

> **Gate for Lab 4:** All **seven** exercises must be Pass.  
> **JDK:** 21 · Practice: `examples/module-04-exercises/` · Lab: `examples/Lab4-MemoryManagement/`  
> Explain **patterns**, not exact MB numbers (machines differ).

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (115–118) | Ex 1–2 stack/heap + lifecycle | Learn → Practice |
| Checkpoint B (119–121) | Ex 3–5 GC observe + G1/ZGC flags | Learn → Practice |
| Checkpoint C (122–123) | Ex 6 retention sketch | Learn → Practice |
| Checkpoint D (124–126) | Ex 7 String vs StringBuilder | Learn → Practice |
| Checkpoint E (127–129) | Lab 4 | Practice → Lab |

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| JVM / bytecode / WORA | Module 1 |
| Stack vs heap sketch | Module 1 Ex 7 / Lab 1 |
| G1/ZGC names | Module 1 awareness slides |

Module 4 is **runtime evidence**: flags, logs, retention roots, allocation cost.

## Safety rules

- Use bounded object counts only.
- Do **not** intentionally trigger `OutOfMemoryError`.
- Do **not** commit heap dumps (`.hprof`).
- `System.gc()` is a **request**, not a guarantee.

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-04-exercises | Out-Null
cd examples\module-04-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-04-exercises && cd examples/module-04-exercises
```

Prefer copy from [`starter/`](starter/README.md). Ignore yellow *outside source root* banner.

## JVM flags used

| Flag | Easy meaning |
| ---- | ------------ |
| `-Xms16m` | Start heap ~16 MB |
| `-Xmx64m` | Max heap ~64 MB |
| `-Xlog:gc` | Print GC events |
| `-XX:+UseG1GC` | Select G1 |
| `-XX:+UseZGC` | Select ZGC |

Flags go **before** the class name: `java -Xmx64m -Xlog:gc GcObserve`

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Stack vs Heap | 12–15 min | TODO + sketch | [`exercise-01-stack-vs-heap.md`](exercise-01-stack-vs-heap.md) |
| 2 | Object Lifecycle | 12–15 min | TODO coding | [`exercise-02-lifecycle.md`](exercise-02-lifecycle.md) |
| 3 | GC in Action | 12–15 min | TODO + logs | [`exercise-03-gc-observe.md`](exercise-03-gc-observe.md) |
| 4 | G1 Flag | 8–10 min | Flags + notes | [`exercise-04-g1.md`](exercise-04-g1.md) |
| 5 | ZGC Flag | 8–10 min | Flags + notes | [`exercise-05-zgc.md`](exercise-05-zgc.md) |
| 6 | Retention Sketch | 12–15 min | TODO + debug | [`exercise-06-leak-sketch.md`](exercise-06-leak-sketch.md) |
| 7 | String vs StringBuilder | 12–15 min | TODO coding | [`exercise-07-string-vs-builder.md`](exercise-07-string-vs-builder.md) |

When all **seven** Pass → Day 4 OS how-to → [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md).
