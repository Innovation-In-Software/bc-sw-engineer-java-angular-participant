# Module 4 — Start here

**Topic:** Memory Management and Performance  

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 4 deck before coding. Practice at each checkpoint.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After prior labs | Stay in IntelliJ with `java-bootcamp` open |
| B1 | After slides **115–118** (Checkpoint A) | [`exercise-01`](exercises/exercise-01-stack-vs-heap.md) · [`exercise-02`](exercises/exercise-02-lifecycle.md) |
| B2 | After slides **119–121** (Checkpoint B) | [`exercise-03`](exercises/exercise-03-gc-observe.md) · [`exercise-04`](exercises/exercise-04-g1.md) · [`exercise-05`](exercises/exercise-05-zgc.md) |
| B3 | After slides **122–123** (Checkpoint C) | [`exercise-06-leak-sketch.md`](exercises/exercise-06-leak-sketch.md) |
| B4 | After slides **124–126** (Checkpoint D) | [`exercise-07-string-vs-builder.md`](exercises/exercise-07-string-vs-builder.md) |
| C | After Exercises **1–7** Pass (Day 4) | **One** OS how-to: [`lab4/LAB-4-WINDOWS.md`](lab4/LAB-4-WINDOWS.md) **or** [`lab4/LAB-4-MACOS.md`](lab4/LAB-4-MACOS.md) |
| D | Lab (Checkpoint E) | [`lab4/LAB-4-GUIDE.md`](lab4/LAB-4-GUIDE.md) — timed path [`lab4/starter/`](lab4/starter/README.md) (~45 min) |
| E | Done | Mark Pass/Fail · Kahoot if scheduled |

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)

**Do not skip from slides straight to Lab 4.** Day 3 Lab 4 “briefing” is setup only — GUIDE Steps wait until Exercises 1–7 Pass.

**Builds on Module 1:** stack/heap/GC awareness → Module 4 adds flags, retention roots, and measured demos.

---

## Files in this module — ignore unless told

| File / folder | For you? |
| ------------- | -------- |
| `README.md` (this file) | **Yes — start** |
| `PACING.md` | **Yes** — checkpoint map |
| `exercises/EXERCISES-INDEX.md` + `exercise-0N-*.md` | **Yes** — practice at checkpoints |
| `exercises/starter/` | **Yes** — TODO skeletons |
| `lab4/LAB-4-WINDOWS.md` or `LAB-4-MACOS.md` | **Yes** — pick your OS |
| `lab4/LAB-4-GUIDE.md` | **Yes** — main steps |
---

## Workspace reminder

Code goes in **your** laptop folder, not inside this `labs/` clone:

- Exercises → `java-bootcamp/examples/module-04-exercises/` (flat files)
- Lab 4 → `java-bootcamp/examples/Lab4-MemoryManagement/` (flat files — **separate** folder)

**Safety:** bounded allocations only; no intentional OOM; never commit `.hprof` dumps.

**IntelliJ tip for exercises:** create sources with **New → File** → `ClassName.java`, or copy from `exercises/starter/`. Details: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md).
