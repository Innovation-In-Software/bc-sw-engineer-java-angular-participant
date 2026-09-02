# Module 17 — Start here

**Topic:** JUnit Testing Fundamentals

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 17 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **186–190** (Checkpoint A) | [`exercise-01-aaa-service-tests-plan.md`](exercises/exercise-01-aaa-service-tests-plan.md) |
| B | After slides **191–192** (Checkpoint B) | [`exercise-02-meaningful-asserts.md`](exercises/exercise-02-meaningful-asserts.md) |
| C | After slide **193** (Checkpoint C) | [`exercise-03-csvsource-table.md`](exercises/exercise-03-csvsource-table.md) |
| D | After slides **194–198** (Checkpoint D) | [`exercise-04`](exercises/exercise-04-test-names.md) · [`exercise-05`](exercises/exercise-05-fill-jacoco-gate-todos.md) · [`exercise-06`](exercises/exercise-06-lab17-prep-checklist.md) |
| E | After Exercises **1–6** Pass | **One** OS how-to: [`lab17/LAB-17-WINDOWS.md`](lab17/LAB-17-WINDOWS.md) **or** [`lab17/LAB-17-MACOS.md`](lab17/LAB-17-MACOS.md) |
| F | Lab (Checkpoint E) | [`lab17/LAB-17-GUIDE.md`](lab17/LAB-17-GUIDE.md) — timed path [`lab17/starter/`](lab17/starter/README.md) (~45 min) |
| G | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-17-exercises/notes/`. Lab project under `examples/lab17-crm/`.

**Critical:** Meaningful asserts (id/status/`BusinessException`). JaCoCo gate on `com.northstar.crm.service` ≥ **0.80** via `mvn clean verify`. Mockito deep dive is **Lab 18**. Review AI-generated tests — do not ship `assertTrue(true)`.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
