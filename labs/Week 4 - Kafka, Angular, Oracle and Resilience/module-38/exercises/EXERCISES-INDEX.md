# Module 38 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab38/LAB-38-GUIDE.md`](../lab38/LAB-38-GUIDE.md)

**Module:** 38 — SQL and Query Performance with PostgreSQL
**Next:** [`../lab38/LAB-38-WINDOWS.md`](../lab38/LAB-38-WINDOWS.md) or [`../lab38/LAB-38-MACOS.md`](../lab38/LAB-38-MACOS.md) → [`../lab38/LAB-38-GUIDE.md`](../lab38/LAB-38-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-38-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Write the Reporting Queries](exercise-01-join-and-aggregate.md) | **A** | `notes/lab38-queries.md` |
| 2 | [Reason About Index Selectivity](exercise-02-index-selectivity.md) | **B** | `notes/lab38-index-selectivity.md` |
| 3 | [Read an Execution Plan](exercise-03-read-the-plan.md) | **B** | `notes/lab38-read-plan.md` |
| 4 | [Fix Sargability and N+1](exercise-04-sargable-and-nplus1.md) | **C** | `notes/lab38-antipatterns.md` |
| 5 | [Compare Offset and Keyset Paging](exercise-05-pagination-performance.md) | **C** | `notes/lab38-pagination.md` |
| 6 | [Plan the Tuning Evidence](exercise-06-lab38-readiness.md) | **D** | `notes/lab38-readiness.md` |

Then **checkpoint E** → Lab 38.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Write queries and predict their plans on paper | Do not tune indexes without measuring first |
| Plan EXPLAIN evidence before and after each change | Do not add indexes speculatively |
| Design sargable predicates and keyset pagination | Do not fix an N+1 by adding a cache |
| Preserve the Amina and Ravi fixtures in volume data | Do not load real customer data for volume testing |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-38-exercises` | `~/java-bootcamp/examples/module-38-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-38-exercises\notes | Out-Null
cd examples\module-38-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-38-exercises/notes
cd examples/module-38-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 38 OS guide.
