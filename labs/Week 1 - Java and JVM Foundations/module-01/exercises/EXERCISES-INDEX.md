# Module 1 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 1 slide is finished. Work each checkpoint when the instructor pauses (see pacing below).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer copying from [`starter/`](starter/README.md) over typing blank files.  
> **Start here for Module 1:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 1 — JVM Architecture and Runtime Model  
**Instructor pacing:** [`../PACING.md`](../PACING.md) (Learn → Practice → Review)  
**Next (after all 8 Pass):** OS how-to → [`../lab1/LAB-1-WINDOWS.md`](../lab1/LAB-1-WINDOWS.md) or [`../lab1/LAB-1-MACOS.md`](../lab1/LAB-1-MACOS.md) → [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)

> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Practice code: `examples/module-01-exercises/` · Lab: `examples/jvm-compilation-lab/` (separate).  
> Replace every `_____` / `// TODO` / `UnsupportedOperationException("TODO")` with working code.

## Checkpoint map (interleaved with slides)

| When (after slides) | Do these exercises | Pattern |
| ------------------- | ------------------ | ------- |
| Checkpoint A (slides 1–9) | 1 Hello · 2 WORA | Learn → Practice |
| Checkpoint B (slides 10–16) | Predict activity in class (no file) | Learn → Review |
| Checkpoint C (slides 17–24) | 3 Control flow · 4 Class loading | Learn → Practice |
| Checkpoint D (slides 25–30) | 5 Variables · 6 Methods · 7 Objects | Learn → Practice |
| Checkpoints E–F (slides 31–41) | Discussion in class | Learn → Review |
| Checkpoint G (demos / lab brief) | 8 `javap` → Lab 1 | Practice → Lab |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace (open in IntelliJ) | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Pre-lab exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-01-exercises` | `~/java-bootcamp/examples/module-01-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the exercises folder (do once)

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-01-exercises | Out-Null
cd examples\module-01-exercises
pwd
```

**macOS:**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-01-exercises
cd examples/module-01-exercises
pwd
```

### How to create each `.java` file (IntelliJ)

1. Prefer: copy from [`starter/`](starter/README.md) into `module-01-exercises`
2. Or: right-click `module-01-exercises` → **New → File** → paste starter from the exercise md
3. Fill every TODO → save → `javac` / `java` from Terminal

**Do not** use **New → Java Class** or mark `module-01-exercises` as Sources Root (see earlier Module 1 notes).

## Exercise index

| # | Exercise | File | Est. time | Type |
| - | -------- | ---- | --------- | ---- |
| 1 | Hello World | [`exercise-01-hello-world.md`](exercise-01-hello-world.md) | 8–10 min | TODO coding |
| 2 | Platform Independence (WORA) | [`exercise-02-wora.md`](exercise-02-wora.md) | 10–12 min | Coding + debug |
| 3 | Control Flow | [`exercise-03-control-flow.md`](exercise-03-control-flow.md) | 12–15 min | TODO + debug |
| 4 | Watch Class Loading | [`exercise-04-class-loading.md`](exercise-04-class-loading.md) | 12–15 min | Observe + debug |
| 5 | Variables and Data Types | [`exercise-05-variables.md`](exercise-05-variables.md) | 8–10 min | TODO coding |
| 6 | Methods and Parameters | [`exercise-06-methods.md`](exercise-06-methods.md) | 10–12 min | TODO coding |
| 7 | Objects and Classes | [`exercise-07-objects.md`](exercise-07-objects.md) | 10–12 min | TODO (fields provided) |
| 8 | Inspect Bytecode | [`exercise-08-javap.md`](exercise-08-javap.md) | 10–12 min | `javap` analysis |

**Total practice (approx.):** 80–100 minutes across the day, interleaved with lecture — not one block after all slides.

When all eight Pass criteria are **Pass**, run the smoke checks in the OS how-to, then open [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md).

**Remember:** exercise code stays in `examples/module-01-exercises/`; Lab 1 uses `examples/jvm-compilation-lab/`.
