# Module 37 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Lab:** [`../lab37/LAB-37-GUIDE.md`](../lab37/LAB-37-GUIDE.md)

**Module:** 37 — PostgreSQL Database Fundamentals
**Next:** [`../lab37/LAB-37-WINDOWS.md`](../lab37/LAB-37-WINDOWS.md) or [`../lab37/LAB-37-MACOS.md`](../lab37/LAB-37-MACOS.md) → [`../lab37/LAB-37-GUIDE.md`](../lab37/LAB-37-GUIDE.md)

Complete **in order 1 → 2 → 3 → 4 → 5 → 6**, at the slide checkpoints — not all slides first.
Notes live under `examples/module-37-exercises/` — these are **notes files**, not the lab.

## Practice order

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Choose Column Types Deliberately](exercise-01-type-choices.md) | **A** | `notes/lab37-type-choices.md` |
| 2 | [Plan Keys and Constraints](exercise-02-constraint-plan.md) | **B** | `notes/lab37-constraints.md` |
| 3 | [Model the CRM Relationships](exercise-03-relationship-model.md) | **B** | `notes/lab37-er-notes.md` |
| 4 | [Plan Indexes for Real Queries](exercise-04-index-plan.md) | **C** | `notes/lab37-indexes.md` |
| 5 | [Plan the Role and Connection](exercise-05-role-and-connection.md) | **C** | `notes/lab37-role-connection.md` |
| 6 | [Lab 37 Readiness Self-Check](exercise-06-lab37-readiness.md) | **D** | `notes/lab37-readiness.md` |

Then **checkpoint E** → Lab 37.

## Scope boundary — do not build later technology yet

| Do now | Do not yet |
| --- | --- |
| Design the CRM schema, keys, constraints, and indexes on paper | Do not run CREATE TABLE in this pre-lab |
| Choose column types deliberately and justify them | Do not use JPA or Hibernate yet — that is Module 39 |
| Plan a least-privilege application role | Do not put a password in any file you commit |
| Use the synthetic Amina and Ravi fixtures | Do not connect to a shared or production database |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-37-exercises` | `~/java-bootcamp/examples/module-37-exercises` |
| Notes | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-37-exercises\notes | Out-Null
cd examples\module-37-exercises
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-37-exercises/notes
cd examples/module-37-exercises
```

## Done when

All six notes files listed above exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` where used, and the Exercise 6 self-mark is **Pass**. Then open the Lab 37 OS guide.
