# Module 22 — Start here

**Topic:** Spring Core and Inversion of Control (IoC)

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 22 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **1–13** (Checkpoint A) | [`exercise-01-ioc-vs-new.md`](exercises/exercise-01-ioc-vs-new.md) |
| B | After slides **14–18** (Checkpoint B) | [`exercise-02-constructor-injection.md`](exercises/exercise-02-constructor-injection.md) |
| C | After slides **19–23** (Checkpoint C) | [`exercise-03-lifecycle-notes.md`](exercises/exercise-03-lifecycle-notes.md) |
| D | After slides **24–28** (Checkpoint D) | [`exercise-04-stereotype-map.md`](exercises/exercise-04-stereotype-map.md) |
| E | After slides **29–31** (Checkpoint E) | [`exercise-05`](exercises/exercise-05-bean-graph-skeleton.md) · [`exercise-06`](exercises/exercise-06-lab22-readiness.md) |
| F | After Exercises **1–6** Pass | **One** OS how-to: [`lab22/LAB-22-WINDOWS.md`](lab22/LAB-22-WINDOWS.md) **or** [`lab22/LAB-22-MACOS.md`](lab22/LAB-22-MACOS.md) |
| G | Lab (Checkpoint F) | [`lab22/LAB-22-GUIDE.md`](lab22/LAB-22-GUIDE.md) — timed path [`lab22/starter/`](lab22/starter/README.md) (~45 min) |
| H | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-22-exercises/`. Lab project under `examples/lab22-crm/`.

**Critical:** Prefer **constructor injection** with `final` fields. **No** `new` of Spring-managed collaborators inside services. Stereotypes: `@Service` / `@Repository` / `@RestController`. Document the bean graph. Boot Initializr / profiles / REST hosting / Security → later labs.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
