# Module 7 — Start here

**Topic:** Exception Handling and Error Management  

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 7 deck before coding. Practice at each checkpoint.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After prior labs | Stay in IntelliJ with `java-bootcamp` open |
| B1 | After slides **173–177** (Checkpoint A) | [`exercise-01-common-exceptions.md`](exercises/exercise-01-common-exceptions.md) |
| B2 | After slides **178–179** (Checkpoint B) | [`exercise-02-try-catch-finally.md`](exercises/exercise-02-try-catch-finally.md) |
| B3 | After slide **180** (Checkpoint C) | [`exercise-03-try-with-resources.md`](exercises/exercise-03-try-with-resources.md) |
| B4 | After slides **181–183** (Checkpoint D) | [`exercise-04`](exercises/exercise-04-throw-throws.md) · [`exercise-05`](exercises/exercise-05-custom-exception.md) · [`exercise-06`](exercises/exercise-06-propagation.md) |
| B5 | After slides **184–187** (Checkpoint E) | [`exercise-07`](exercises/exercise-07-error-strategies.md) · [`exercise-08`](exercises/exercise-08-logging-warmup.md) |
| C | After Exercises **1–8** Pass | **One** OS how-to: [`lab7/LAB-7-WINDOWS.md`](lab7/LAB-7-WINDOWS.md) **or** [`lab7/LAB-7-MACOS.md`](lab7/LAB-7-MACOS.md) |
| D | Lab (Checkpoint F) | [`lab7/LAB-7-GUIDE.md`](lab7/LAB-7-GUIDE.md) — timed path [`lab7/starter/`](lab7/starter/README.md) (~45 min) |
| E | Done | Mark Pass/Fail · Kahoot if scheduled · Week 1 review slide if scheduled |

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)

**Do not skip from slides straight to Lab 7.** Lab 7 assumes Exercises 1–8 are already Pass.

**Incremental build:** Exercises 1–8 → Lab 7 `com.academy.atm` (domain exceptions + ATM service + logging).

**Security habit:** Never use real PINs, passwords, or account secrets in logs or screenshots.

---

## Files in this module — ignore unless told

| File / folder | For you? |
| ------------- | -------- |
| `README.md` (this file) | **Yes — start** |
| `PACING.md` | **Yes** — checkpoint map |
| `exercises/EXERCISES-INDEX.md` + `exercise-0N-*.md` | **Yes** — practice at checkpoints |
| `exercises/starter/` | **Yes** — TODO skeletons |
| `lab7/LAB-7-WINDOWS.md` or `LAB-7-MACOS.md` | **Yes** — pick your OS |
| `lab7/LAB-7-GUIDE.md` | **Yes** — main steps |
---

## Workspace reminder

Code goes in **your** laptop folder, not inside this `labs/` clone:

- Exercises → `java-bootcamp/examples/module-07-exercises/` (flat files)
- Lab 7 → `java-bootcamp/examples/Lab7-ATMSystem/` (`src/` / `out/` packages; run from project root)

**IntelliJ tip for exercises:** create sources with **New → File** → `ClassName.java`, or copy from `exercises/starter/`. Details: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md).
