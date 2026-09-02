# Module 2 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 2 slide is finished. Work each checkpoint when the instructor pauses (see [`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer copying from [`starter/`](starter/README.md).  
> **Start here for Module 2:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 2 — Java Syntax and Core Constructs  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab2/LAB-2-WINDOWS.md`](../lab2/LAB-2-WINDOWS.md) or [`../lab2/LAB-2-MACOS.md`](../lab2/LAB-2-MACOS.md) → [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)

> **Core gate for Lab 2:** Exercises **1–7** must be Pass. Exercises **8–9** are challenge/bonus.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Practice: `examples/module-02-exercises/` · Lab: `examples/Lab2-JavaSyntax/` (separate).

## Checkpoint map (interleaved with slides)

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (49–52) | Scenario discussion | Learn → Review |
| Checkpoint B (53–60) | Ex 1 Calculator | Learn → Practice |
| Checkpoint C (61–66) | Ex 2–3 Decisions + Loops | Learn → Practice |
| Checkpoint D (67–69) | Ex 4 Methods | Learn → Practice |
| Checkpoint E (70–72) | Packages discussion | Learn → Review |
| Checkpoint F (73–76) | Ex 5–7 (+8–9) | Learn → Practice |
| Checkpoint G (77–81) | Lab 2 | Practice → Lab |

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| `Hello` / `main` / `println` | Lab 0 · Module 1 Ex 1 |
| Hard-coded control flow | Module 1 Ex 3 |
| Hard-coded variables / methods | Module 1 Ex 5–6 |

Module 2 is **new**: `Scanner`, leftover newline, `Math.PI`, `printf`, overloading, then Lab 2 packages.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-02-exercises` | `~/java-bootcamp/examples/module-02-exercises` |

### Setup (do once)

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-02-exercises | Out-Null
cd examples\module-02-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-02-exercises && cd examples/module-02-exercises
```

### How to create each `.java` file

1. Prefer copy from [`starter/`](starter/README.md)
2. Or **New → File** → paste starter from the exercise md
3. Fill TODOs → `javac` / `java` from Terminal

Ignore yellow *outside source root* banner. Do not mark `module-02-exercises` as Sources Root.

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Calculations | 10–12 min | TODO coding | [`exercise-01-calculator.md`](exercise-01-calculator.md) |
| 2 | Decision Making | 12–15 min | TODO + debug | [`exercise-02-decision-making.md`](exercise-02-decision-making.md) |
| 3 | Loops | 12–15 min | TODO + debug | [`exercise-03-loops.md`](exercise-03-loops.md) |
| 4 | Methods | 12–15 min | TODO coding | [`exercise-04-methods.md`](exercise-04-methods.md) |
| 5 | Personal Details | 12–15 min | TODO + debug | [`exercise-05-personal-details.md`](exercise-05-personal-details.md) |
| 6 | Product Information | 10–12 min | TODO coding | [`exercise-06-product-info.md`](exercise-06-product-info.md) |
| 7 | Area of Circle | 8–10 min | TODO coding | [`exercise-07-circle-area.md`](exercise-07-circle-area.md) |
| 8 | Bill Summary | 10–12 min | Challenge | [`exercise-08-bill-summary.md`](exercise-08-bill-summary.md) |
| 9 | Personal Profile | 10–12 min | Bonus | [`exercise-09-profile-bonus.md`](exercise-09-profile-bonus.md) |

When **1–7** are Pass → OS how-to → [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md).
