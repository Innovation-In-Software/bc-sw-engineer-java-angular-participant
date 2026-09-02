# Module 3 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 3 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md) for coding exercises.  
> **Start here for Module 3:** [`../README.md`](../README.md)

**Module:** 3 — Object-Oriented Programming in Java  
**Next (after Exercises 1–8 Pass):** OS how-to → [`../lab3/LAB-3-WINDOWS.md`](../lab3/LAB-3-WINDOWS.md) or [`../lab3/LAB-3-MACOS.md`](../lab3/LAB-3-MACOS.md) → [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)

> **Gate for Lab 3:** All **eight** exercises must be Pass.  
> **JDK:** 21 · Practice: `examples/module-03-exercises/` · Lab: `examples/Lab3-BankingSystem/`  
> Exercises 2–5 build on the **same** banking model — work in order.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (82–89) | Ex 1 domain entities | Learn → Design |
| Checkpoint B (90–92) | Ex 2 encapsulation | Learn → Practice |
| Checkpoint C (93–98) | Ex 3 inheritance + polymorphism | Learn → Practice |
| Checkpoint D (99–101) | Ex 4–5 abstract + interface | Learn → Practice |
| Checkpoint E (102–107) | Ex 6–7 SOLID | Learn → Practice |
| Checkpoint F (108–109) | Ex 8 UML | Learn → Design |
| Checkpoint G (110–114) | Lab 3 | Practice → Lab |

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Basic class/object | Module 1 Ex 7 |
| Methods, packages layout | Modules 1–2 / Lab 2 |
| Scanner / printf | Module 2 |

Module 3 is **design**: protect state, hierarchy, interfaces, SOLID spot-checks, UML.

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-03-exercises | Out-Null
cd examples\module-03-exercises
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-03-exercises && cd examples/module-03-exercises
```

Prefer copy from [`starter/`](starter/README.md). Ignore yellow *outside source root* banner.

## Exercise index

| # | Exercise | Est. | Type | File |
| - | -------- | ---- | ---- | ---- |
| 1 | Identify Entities | 10–12 min | Design notes | [`exercise-01-domain-entities.md`](exercise-01-domain-entities.md) |
| 2 | Encapsulation | 15–18 min | TODO + debug | [`exercise-02-encapsulation.md`](exercise-02-encapsulation.md) |
| 3 | Inheritance / Polymorphism | 18–20 min | TODO coding | [`exercise-03-inheritance.md`](exercise-03-inheritance.md) |
| 4 | Abstract Classes | 15–18 min | TODO coding | [`exercise-04-abstract-classes.md`](exercise-04-abstract-classes.md) |
| 5 | Interfaces | 12–15 min | TODO coding | [`exercise-05-interface.md`](exercise-05-interface.md) |
| 6 | SOLID: SRP | 10–12 min | Spot-check | [`exercise-06-solid-check.md`](exercise-06-solid-check.md) |
| 7 | SOLID: OCP/LSP/ISP/DIP | 15–18 min | Spot-check | [`exercise-07-solid-beyond-srp.md`](exercise-07-solid-beyond-srp.md) |
| 8 | Mini UML | 10–12 min | Design | [`exercise-08-uml-mini.md`](exercise-08-uml-mini.md) |

When all **eight** Pass → OS how-to → [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md).
