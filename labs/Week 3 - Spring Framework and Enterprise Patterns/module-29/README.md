# Module 29 — Start here

**Topic:** Validation and Global Exception Handling

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 29 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **187–197** (Checkpoint A) | [`exercise-01-dto-constraints.md`](exercises/exercise-01-dto-constraints.md) |
| B | After slides **198–204** (Checkpoint B) | [`exercise-02`](exercises/exercise-02-handler-todos.md) · [`exercise-03`](exercises/exercise-03-error-envelope.md) |
| C | After slides **205–210** (Checkpoint C) | [`exercise-04`](exercises/exercise-04-exception-status-map.md) · [`exercise-06`](exercises/exercise-06-mockmvc-body-assertions.md) · [`exercise-05`](exercises/exercise-05-lab29-readiness.md) |
| D | After Exercises **1–6** Pass | **One** OS how-to: [`lab29/LAB-29-WINDOWS.md`](lab29/LAB-29-WINDOWS.md) **or** [`lab29/LAB-29-MACOS.md`](lab29/LAB-29-MACOS.md) |
| E | Lab (Checkpoint D) | [`lab29/LAB-29-GUIDE.md`](lab29/LAB-29-GUIDE.md) — timed path [`lab29/starter/`](lab29/starter/README.md) (~45 min) |
| F | Done | Mark Pass/Fail · Kahoot if scheduled · optional Week 3 review slides 215–220 |

**Classroom practice order:** **1 → 2 → 3 → 4 → 6 → 5**

**Pre-lab vs lab:** Notes under `examples/module-29-exercises/`. Lab project under `examples/lab29-crm/`.

**Critical:** Annotate DTOs + **`@Valid`**. Global **`@RestControllerAdvice`** returns stable **`ErrorResponse`**. Map **400 / 404 / 409**. Keep **`lab-request-001`** on errors. Assert status **and** body. No stack-trace HTML. Keep Lab 28 JWT/security. Unifies Lab 14/16 into Boot.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
