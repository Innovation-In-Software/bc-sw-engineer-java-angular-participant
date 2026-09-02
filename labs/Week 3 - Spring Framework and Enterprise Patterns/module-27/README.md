# Module 27 — Start here

**Topic:** Transaction Management

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 27 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **137–146** (Checkpoint A) | [`exercise-01-acid-crm.md`](exercises/exercise-01-acid-crm.md) |
| B | After slides **147–151** (Checkpoint B) | [`exercise-02`](exercises/exercise-02-transaction-boundary.md) · [`exercise-03`](exercises/exercise-03-rollback-plan.md) |
| C | After slides **152–156a** (Checkpoint C) | [`exercise-04`](exercises/exercise-04-transfer-pseudocode.md) · [`exercise-05`](exercises/exercise-05-propagation-warnings.md) · [`exercise-06`](exercises/exercise-06-lab27-readiness.md) |
| D | After Exercises **1–6** Pass | **One** OS how-to: [`lab27/LAB-27-WINDOWS.md`](lab27/LAB-27-WINDOWS.md) **or** [`lab27/LAB-27-MACOS.md`](lab27/LAB-27-MACOS.md) |
| E | Lab (Checkpoint D) | [`lab27/LAB-27-GUIDE.md`](lab27/LAB-27-GUIDE.md) — timed path [`lab27/starter/`](lab27/starter/README.md) (~45 min) |
| F | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-27-exercises/`. Lab project under `examples/lab27-crm/`.

**Critical:** `@Transactional` on **TransferService** (not controller). Debit + credit + log = **one** unit of work. Prove rollback with **`ACC-FORCE-FAIL`**. ACID notes cite **evidence**. Reject AI drafts that swallow exceptions or put TX on controllers. JWT → Lab 28.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
