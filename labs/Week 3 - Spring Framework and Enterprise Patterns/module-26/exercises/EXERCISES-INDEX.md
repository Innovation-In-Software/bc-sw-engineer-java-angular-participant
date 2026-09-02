# Module 26 — Pre-Lab Exercises

> **Start here for Module 26:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 26 — Spring Profiles and Configuration  
**Next:** [`../lab26/LAB-26-WINDOWS.md`](../lab26/LAB-26-WINDOWS.md) or [`../lab26/LAB-26-MACOS.md`](../lab26/LAB-26-MACOS.md) → [`../lab26/LAB-26-GUIDE.md`](../lab26/LAB-26-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-26-exercises/` — **notes files**, not the lab.  
> Lab 26 is the graded consolidation. Do **not** finish Lab 26 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/profiles.md` | Profile Purposes | A |
| 2 | `notes/lab26-profile-yaml-todos.md` | Profile YAML TODOs | A |
| 3 | `notes/northstar-props.md` | ConfigurationProperties Sketch | B |
| 4 | `notes/override-order.md` | Property Override Order | B |
| 5 | `notes/activation-commands.md` | Activation Command Drill | C |
| 6 | `notes/lab26-readiness.md` | Lab 26 Readiness Checklist | C |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Split config into base + `dev` / `test` / `prod` profile files | `@Transactional` transfer demos (Lab 27) |
| Activate profiles via `-D` and `SPRING_PROFILES_ACTIVE` | JWT SecurityFilterChain (Lab 28) |
| Explain property override order | Terraform/Ansible secret injection (Week 5) |
| Plan `@ConfigurationProperties` binding for Northstar settings | Kafka topic config (Week 4) |
| Keep secrets in env vars / `.env.example` placeholders only | Committing real `DB_PASSWORD` values |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-26-exercises` | `~/java-bootcamp/examples/module-26-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-26-exercises\notes | Out-Null
cd examples\module-26-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-26-exercises/notes
cd examples/module-26-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 26 uses `examples/lab26-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 115–125 (A) | Profile Purposes | `notes/profiles.md` | [`exercise-01-profile-purposes.md`](exercise-01-profile-purposes.md) |
| 2 | 115–125 (A) | Profile YAML TODOs | `notes/lab26-profile-yaml-todos.md` | [`exercise-02-profile-yaml-todos.md`](exercise-02-profile-yaml-todos.md) |
| 3 | 126–128 (B) | ConfigurationProperties Sketch | `notes/northstar-props.md` | [`exercise-03-config-properties-sketch.md`](exercise-03-config-properties-sketch.md) |
| 4 | 126–128 (B) | Property Override Order | `notes/override-order.md` | [`exercise-04-override-order.md`](exercise-04-override-order.md) |
| 5 | 129–132 (C) | Activation Command Drill | `notes/activation-commands.md` | [`exercise-05-activation-drill.md`](exercise-05-activation-drill.md) |
| 6 | 129–132 (C) | Lab 26 Readiness Checklist | `notes/lab26-readiness.md` | [`exercise-06-lab26-readiness.md`](exercise-06-lab26-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 26 OS guide.
