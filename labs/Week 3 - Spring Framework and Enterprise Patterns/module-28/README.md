# Module 28 — Start here

**Topic:** Spring Security Fundamentals

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 28 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **161–166** (Checkpoint A) | [`exercise-01-authn-vs-authz.md`](exercises/exercise-01-authn-vs-authz.md) |
| B | After slides **167–175** (Checkpoint B) | [`exercise-02-filter-chain-sketch.md`](exercises/exercise-02-filter-chain-sketch.md) |
| C | After slides **176–179** (Checkpoint C) | [`exercise-03`](exercises/exercise-03-jwt-login-todos.md) · [`exercise-04`](exercises/exercise-04-mockmvc-matrix.md) |
| D | After slides **180–182** (Checkpoint D) | [`exercise-05`](exercises/exercise-05-production-checklist.md) · [`exercise-06`](exercises/exercise-06-lab28-readiness.md) |
| E | After Exercises **1–6** Pass | **One** OS how-to: [`lab28/LAB-28-WINDOWS.md`](lab28/LAB-28-WINDOWS.md) **or** [`lab28/LAB-28-MACOS.md`](lab28/LAB-28-MACOS.md) |
| F | Lab (Checkpoint E) | [`lab28/LAB-28-GUIDE.md`](lab28/LAB-28-GUIDE.md) — timed path [`lab28/starter/`](lab28/starter/README.md) (~45 min) |
| G | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-28-exercises/`. Lab project under `examples/lab28-crm/`.

**Critical:** **Authn ≠ authz**. Stateless **SecurityFilterChain** + **JWT**. Roles **AGENT** / **ADMIN**. Prove **401** vs **403**. Login `permitAll`; protect customers/admin differently. **Never commit JWT secrets**. Correlation `lab-request-001` is not authentication. Lab 29 adds validation polish.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
