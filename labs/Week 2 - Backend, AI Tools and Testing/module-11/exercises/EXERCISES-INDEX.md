# Module 11 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 11 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 11:** [`../README.md`](../README.md)

**Module:** 11 — GitHub Copilot for Testing and Refactoring  
**Next (after all 6 Pass):** OS how-to → [`../lab11/LAB-11-WINDOWS.md`](../lab11/LAB-11-WINDOWS.md) or [`../lab11/LAB-11-MACOS.md`](../lab11/LAB-11-MACOS.md) → [`../lab11/LAB-11-GUIDE.md`](../lab11/LAB-11-GUIDE.md)

> **Gate for Lab 11:** All **six** exercises must be Pass.  
> **JDK:** 21 · Practice notes: `examples/module-11-exercises/` · Lab: `examples/lab11-crm/`  
> **Classroom order:** **1 → 2 → 3 → 4 → 5 → 6**  
> Pre-lab is **notes-only** — do not finish Lab 11 here.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (78–83) | Ex 1 AAA template | Learn → Practice |
| Checkpoint B (84–87) | Ex 2 notifier extract | Learn → Practice |
| Checkpoint C (88) | Ex 3–4 asserts + acceptance | Learn → Practice |
| Checkpoint D (89) | Ex 5–6 gaps + prep | Learn → Practice |
| Checkpoint E (90–92) | Lab 11 | Practice → Lab |

## Scope boundary

| Do now | Do not add yet |
| ------ | -------------- |
| Six `notes/lab11-*.md` files | Full Lab 11 Maven suite in pre-lab |
| AAA for Ravi activate | Deep Mockito curriculum (Lab 18) |
| Reject trivial asserts | Claim 100% coverage from Copilot |
| Coverage gaps map | Spring/Kafka notifiers |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-11-exercises\notes | Out-Null
cd examples\module-11-exercises
java -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-11-exercises/notes && cd examples/module-11-exercises
java -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | Guide | Notes file |
| - | -------- | ---- | ---- | ----- | ---------- |
| 1 | AAA Template | 10–12 min | Docs | [`exercise-01-aaa-template.md`](exercise-01-aaa-template.md) | `notes/lab11-aaa-template.md` |
| 2 | Notifier Extract Plan | 12–15 min | Architecture | [`exercise-02-notifier-extract.md`](exercise-02-notifier-extract.md) | `notes/lab11-notifier-extract-plan.md` |
| 3 | Trivial vs Real Asserts | 10–12 min | Analysis | [`exercise-03-trivial-vs-real-asserts.md`](exercise-03-trivial-vs-real-asserts.md) | `notes/lab11-prelab-asserts.md` |
| 4 | Acceptance Checklist TODOs | 10–12 min | Hands-on | [`exercise-04-fill-acceptance-checklist-todos.md`](exercise-04-fill-acceptance-checklist-todos.md) | `notes/lab11-acceptance-todos.md` |
| 5 | Coverage Gaps Map | 8–10 min | Analysis | [`exercise-05-coverage-gaps.md`](exercise-05-coverage-gaps.md) | `notes/lab11-coverage-gaps.md` |
| 6 | Lab 11 Prep Checklist | 8–10 min | Checklist | [`exercise-06-lab11-prep-checklist.md`](exercise-06-lab11-prep-checklist.md) | `notes/lab11-prep-checklist.md` |

When all **six** Pass → OS how-to → [`../lab11/LAB-11-GUIDE.md`](../lab11/LAB-11-GUIDE.md).
