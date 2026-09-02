# Module 7 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 7 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 7:** [`../README.md`](../README.md)

**Module:** 7 — Exception Handling and Error Management  
**Next (after all 8 Pass):** OS how-to → [`../lab7/LAB-7-WINDOWS.md`](../lab7/LAB-7-WINDOWS.md) or [`../lab7/LAB-7-MACOS.md`](../lab7/LAB-7-MACOS.md) → [`../lab7/LAB-7-GUIDE.md`](../lab7/LAB-7-GUIDE.md)

> **Gate for Lab 7:** All **eight** exercises must be Pass.  
> **JDK:** 21 · Practice: `examples/module-07-exercises/` · Lab: `examples/Lab7-ATMSystem/`  
> Prefer **specific** catch types. Never log PINs or secrets.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (173–177) | Ex 1 common exceptions | Learn → Practice |
| Checkpoint B (178–179) | Ex 2 try/catch/finally | Learn → Practice |
| Checkpoint C (180) | Ex 3 try-with-resources | Learn → Practice |
| Checkpoint D (181–183) | Ex 4–6 throw / custom / propagate | Learn → Practice |
| Checkpoint E (184–187) | Ex 7–8 strategies + logging | Learn → Practice |
| Checkpoint F (188–190) | Lab 7 | Practice → Lab |

## Already covered — do not redo

Modules 1–6 covered normal program flow, OOP, collections, and streams. Module 7 focuses on **failure contracts and recovery**: identify exceptions, catch at a useful boundary, close resources, propagate checked failures, and preserve diagnostic context.

## Checked vs unchecked

| Type | Compiler rule | Example | Typical use |
| ---- | ------------- | ------- | ----------- |
| Checked (`Exception`, excluding `RuntimeException`) | Catch or declare | `IOException` | Recoverable external failure |
| Unchecked (`RuntimeException`) | Catch/declare not required | `IllegalArgumentException` | Invalid argument or programming defect |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-07-exercises | Out-Null
cd examples\module-07-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-07-exercises && cd examples/module-07-exercises
```

Prefer copy from [`starter/`](starter/README.md). Ignore yellow *outside source root* banner.

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Common Unchecked Exceptions | 12–15 min | TODO coding | [`exercise-01-common-exceptions.md`](exercise-01-common-exceptions.md) |
| 2 | try-catch-finally | 12–15 min | TODO coding | [`exercise-02-try-catch-finally.md`](exercise-02-try-catch-finally.md) |
| 3 | Try-With-Resources | 12–15 min | TODO coding | [`exercise-03-try-with-resources.md`](exercise-03-try-with-resources.md) |
| 4 | throw vs throws | 12–15 min | TODO coding | [`exercise-04-throw-throws.md`](exercise-04-throw-throws.md) |
| 5 | Custom Checked Exception | 15–18 min | TODO coding | [`exercise-05-custom-exception.md`](exercise-05-custom-exception.md) |
| 6 | Exception Propagation | 12–15 min | TODO coding | [`exercise-06-propagation.md`](exercise-06-propagation.md) |
| 7 | Error Handling Strategies | 12–15 min | TODO coding | [`exercise-07-error-strategies.md`](exercise-07-error-strategies.md) |
| 8 | Logging Warm-up | 12–15 min | TODO coding | [`exercise-08-logging-warmup.md`](exercise-08-logging-warmup.md) |

When all **eight** Pass → OS how-to → [`../lab7/LAB-7-GUIDE.md`](../lab7/LAB-7-GUIDE.md).
