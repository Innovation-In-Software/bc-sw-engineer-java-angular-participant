# Module 1 — Start here

**Topic:** JVM Architecture and Runtime Model  
**Do not open every file in this folder.** Follow this order only.

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 1 deck before coding. Practice at each checkpoint.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After Lab 0 is done | Stay in IntelliJ with `java-bootcamp` open |
| B1 | After slides **1–9** (Checkpoint A) | [`exercises/exercise-01`](exercises/exercise-01-hello-world.md) + [`exercise-02`](exercises/exercise-02-wora.md) |
| B2 | After slides **10–16** (Checkpoint B) | In-class Predict the Output (instructor-led) |
| B3 | After slides **17–24** (Checkpoint C) | [`exercise-03`](exercises/exercise-03-control-flow.md) + [`exercise-04`](exercises/exercise-04-class-loading.md) |
| B4 | After slides **25–30** (Checkpoint D) | [`exercise-05`](exercises/exercise-05-variables.md) … [`exercise-07`](exercises/exercise-07-objects.md) |
| B5 | After slides **31–41** (Checkpoints E–F) | Short discussions (no new files) |
| B6 | After demos / lab brief (Checkpoint G) | [`exercise-08`](exercises/exercise-08-javap.md) |
| C | After Exercises 1–8 Pass | **One** OS how-to: [`lab1/LAB-1-WINDOWS.md`](lab1/LAB-1-WINDOWS.md) **or** [`lab1/LAB-1-MACOS.md`](lab1/LAB-1-MACOS.md) |
| D | Lab | [`lab1/LAB-1-GUIDE.md`](lab1/LAB-1-GUIDE.md) — timed path [`lab1/starter/`](lab1/starter/README.md) (~45 min) |
| E | Done | Mark Pass/Fail in your notes · Kahoot if scheduled |

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)  
Instructor pacing (for facilitators): [`PACING.md`](PACING.md)

**Do not skip from Lab 0 or “all slides done” straight to Lab 1.** Lab 1 assumes Exercises 1–8 are already Pass.

---

## How Lab 1 is performed (smooth path)

You use **two places** — do not mix them:

| Place | What lives there | What you do |
| ----- | ---------------- | ----------- |
| **This course clone** (Java & Angular Fullstack bootcamp) | Guides: this README, exercises, `LAB-1-*.md` | **Read** steps; never write graded code here |
| **Your workspace** `%USERPROFILE%\java-bootcamp` (Windows) / `~/java-bootcamp` (macOS) | Your code under `examples/` | **Write / compile / run** in IntelliJ Terminal |

**Day-of workflow (verified on Windows + IntelliJ PowerShell):**

1. Keep **IntelliJ** open on `java-bootcamp`.
2. Keep **guides** open beside it (browser or second window on this clone).
3. At each checkpoint → code in `examples/module-01-exercises/` (starters in `exercises/starter/`).
4. Then OS how-to → GUIDE → code in `examples/jvm-compilation-lab/`.

**IntelliJ Terminal rule:** Before every `javac` / `java` / `javap`, `cd` into the folder that holds the `.java` file.

```powershell
# Exercises
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises

# Lab 1
cd $env:USERPROFILE\java-bootcamp\examples\jvm-compilation-lab
```

---

## Files in this module — ignore unless told

| File / folder | For you? |
| ------------- | -------- |
| `README.md` (this file) | **Yes — start** |
| `exercises/EXERCISES-INDEX.md` + `exercise-0N-*.md` | **Yes** — practice at checkpoints |
| `exercises/starter/` | **Yes** — TODO skeletons to copy |
| `lab1/LAB-1-WINDOWS.md` or `LAB-1-MACOS.md` | **Yes** — pick your OS |
| `lab1/LAB-1-GUIDE.md` | **Yes** — main graded steps |
---

## Workspace reminder

| Work | Folder |
| ---- | ------ |
| Exercises | `java-bootcamp/examples/module-01-exercises/` |
| Lab 1 | `java-bootcamp/examples/jvm-compilation-lab/` |
| GitHub | Commit Lab 1 sources to your private `java-bootcamp` repo |

**IntelliJ tip:** create sources with **New → File** → `ClassName.java`, or copy from `exercises/starter/`. Do **not** use **New → Java Class** or mark exercise/lab folders as Sources Root.
