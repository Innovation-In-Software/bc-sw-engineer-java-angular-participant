# Module 12 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 12 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 12:** [`../README.md`](../README.md)

**Module:** 12 — Java Coding Standards and Best Practices  
**Next (after all 6 Pass):** OS how-to → [`../lab12/LAB-12-WINDOWS.md`](../lab12/LAB-12-WINDOWS.md) or [`../lab12/LAB-12-MACOS.md`](../lab12/LAB-12-MACOS.md) → [`../lab12/LAB-12-GUIDE.md`](../lab12/LAB-12-GUIDE.md)

> **Gate for Lab 12:** All **six** exercises must be Pass.  
> **JDK:** 21 · Practice notes: `examples/module-12-exercises/` · Lab: `examples/lab12-crm/`  
> **Classroom order:** **1 → 2 → 3 → 4 → 5 → 6**

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (94–99) | Ex 1–2 API + SOLID scope | Learn → Practice |
| Checkpoint B (100–104) | Ex 3–4 smells + equals | Learn → Practice |
| Checkpoint C (105–107) | Ex 5–6 correlation + prep | Learn → Practice |
| Checkpoint D (108–110) | Lab 12 | Practice → Lab |

## Scope boundary

| Do now | Do not add yet |
| ------ | -------------- |
| Six `notes/lab12-*.md` files | Full Lab 12 refactor in pre-lab |
| Smell bingo + equals habit | REST/OpenAPI contracts (Lab 13) |
| Target API sketch | Spring Boot / @ControllerAdvice |
| SOLID apply vs defer list | Rewrite entire CRM |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-12-exercises\notes | Out-Null
cd examples\module-12-exercises
java -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-12-exercises/notes && cd examples/module-12-exercises
java -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | Guide | Notes file |
| - | -------- | ---- | ---- | ----- | ---------- |
| 1 | Target API Sketch | 10–12 min | Architecture | [`exercise-01-target-api-sketch.md`](exercise-01-target-api-sketch.md) | `notes/lab12-target-api-sketch.md` |
| 2 | SOLID Apply vs Defer | 10–12 min | Docs | [`exercise-02-solid-apply-defer.md`](exercise-02-solid-apply-defer.md) | `notes/lab12-solid-scope.md` |
| 3 | Smell Bingo | 12–15 min | Analysis | [`exercise-03-smell-bingo.md`](exercise-03-smell-bingo.md) | `notes/lab12-smell-bingo.md` |
| 4 | Equals vs == | 10–12 min | Analysis | [`exercise-04-equals-vs-eqeq.md`](exercise-04-equals-vs-eqeq.md) | `notes/lab12-equals-vs-eqeq.md` |
| 5 | Correlation TODOs | 10–12 min | Hands-on | [`exercise-05-fill-correlation-oneliner-todos.md`](exercise-05-fill-correlation-oneliner-todos.md) | `notes/lab12-correlation-todos.md` |
| 6 | Lab 12 Prep Checklist | 8–10 min | Checklist | [`exercise-06-lab12-prep-checklist.md`](exercise-06-lab12-prep-checklist.md) | `notes/lab12-prep-checklist.md` |

When all **six** Pass → OS how-to → [`../lab12/LAB-12-GUIDE.md`](../lab12/LAB-12-GUIDE.md).
