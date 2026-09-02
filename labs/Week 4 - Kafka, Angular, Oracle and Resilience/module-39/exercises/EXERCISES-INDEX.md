# Module 39 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab39/LAB-39-GUIDE.md`](../lab39/LAB-39-GUIDE.md)

**Module:** 39 — Spring Data JPA and PostgreSQL Integration
**Next:** [`../lab39/LAB-39-WINDOWS.md`](../lab39/LAB-39-WINDOWS.md) or [`../lab39/LAB-39-MACOS.md`](../lab39/LAB-39-MACOS.md) → [`../lab39/LAB-39-GUIDE.md`](../lab39/LAB-39-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-39-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Decide Who Owns the Schema](exercise-01-datasource-and-schema-owner.md) | **A** | `notes/lab39-schema-owner.md` |
| 2 | [Map the Customer Entity](exercise-02-entity-mapping.md) | **A** | `notes/lab39-entity-mapping.md` |
| 3 | [Design the Repository Queries](exercise-03-repository-queries.md) | **B** | `notes/lab39-repository.md` |
| 4 | [Choose Fetch Strategy and Kill N+1](exercise-04-fetch-and-nplus1.md) | **B** | `notes/lab39-fetch-strategy.md` |
| 5 | [Plan Transactions and Migrations](exercise-05-transactions-and-migrations.md) | **C** | `notes/lab39-transactions-migrations.md` |
| 6 | [Plan Repository Tests and Self-Check](exercise-06-lab39-readiness.md) | **D** | `notes/lab39-readiness.md` |

Then **checkpoint E** → Lab 39.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Plan entities, repositories, and migrations on paper | Do not let Hibernate own the schema (ddl-auto) |
| Decide fetch strategies and prove the N+1 fix | Do not fetch everything eagerly to avoid an exception |
| Plan repository tests against real PostgreSQL | Do not test JPA mappings against H2 |
| Keep the Amina and Ravi fixtures | Do not commit datasource passwords |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-39-exercises` | `~/java-bootcamp/examples/module-39-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-39-exercises\notes | Out-Null
cd examples\module-39-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-39-exercises/notes
cd examples/module-39-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 39 OS guide.
