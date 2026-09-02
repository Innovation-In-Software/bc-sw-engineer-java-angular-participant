# Module 21 — Start here

**Topic:** API Observability and Monitoring

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 21 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **255–260** (Checkpoint A) | [`exercise-01-cardinality-antipatterns.md`](exercises/exercise-01-cardinality-antipatterns.md) |
| B | After slides **261–262** (Checkpoint B) | [`exercise-02-actuator-allowlist.md`](exercises/exercise-02-actuator-allowlist.md) |
| C | After slide **263** (Checkpoint C) | [`exercise-03-liveness-vs-readiness.md`](exercises/exercise-03-liveness-vs-readiness.md) |
| D | After slides **264–269** (Checkpoint D) | [`exercise-04`](exercises/exercise-04-fill-metric-sketch-todos.md) · [`exercise-05`](exercises/exercise-05-alert-from-failure-total.md) · [`exercise-06`](exercises/exercise-06-lab21-prep-checklist.md) |
| E | After Exercises **1–6** Pass | **One** OS how-to: [`lab21/LAB-21-WINDOWS.md`](lab21/LAB-21-WINDOWS.md) **or** [`lab21/LAB-21-MACOS.md`](lab21/LAB-21-MACOS.md) |
| F | Lab (Checkpoint E) | [`lab21/LAB-21-GUIDE.md`](lab21/LAB-21-GUIDE.md) — timed path [`lab21/starter/`](lab21/starter/README.md) (~45 min) |
| G | Done | Mark Pass/Fail · Kahoot if scheduled · optional Week 2 review slide 274 |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-21-exercises/notes/`. Lab project under `examples/lab21-crm/`.

**Critical:** **Low-cardinality** metric tags only. **Liveness ≠ readiness**. Actuator **allow-list** — lab exposure is not production. Correlate alerts with **logs** (`lab-request-001`), not customerId labels.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
