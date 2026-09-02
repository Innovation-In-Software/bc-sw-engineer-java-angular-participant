# Module 16 — Start here

**Topic:** Exception Handling in Distributed APIs

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 16 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · [`HTTP-STATUS-CODES.md`](HTTP-STATUS-CODES.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **168–173** (Checkpoint A) | [`exercise-01-catch-order.md`](exercises/exercise-01-catch-order.md) |
| B | After slide **174** (Checkpoint B) | [`exercise-02-errorresponse-json.md`](exercises/exercise-02-errorresponse-json.md) |
| C | After slides **175–177** (Checkpoint C) | [`exercise-03-failure-status-map.md`](exercises/exercise-03-failure-status-map.md) |
| D | After slides **178–181** (Checkpoint D) | [`exercise-04`](exercises/exercise-04-fill-message-hygiene-todos.md) · [`exercise-05`](exercises/exercise-05-correlation-always.md) · [`exercise-06`](exercises/exercise-06-lab16-prep-checklist.md) |
| E | After Exercises **1–6** Pass | **One** OS how-to: [`lab16/LAB-16-WINDOWS.md`](lab16/LAB-16-WINDOWS.md) **or** [`lab16/LAB-16-MACOS.md`](lab16/LAB-16-MACOS.md) |
| F | Lab (Checkpoint E) | [`lab16/LAB-16-GUIDE.md`](lab16/LAB-16-GUIDE.md) — timed path [`lab16/starter/`](lab16/starter/README.md) (~45 min) |
| G | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-16-exercises/notes/`. Lab project under `examples/lab16-crm/`.

**Critical:** Catch **BusinessException before Exception**. Every Fail JSON includes `correlationId` (`lab-request-001`). No stack traces / SQL / PII in client messages. Demo **400 / 404 / 409**.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
