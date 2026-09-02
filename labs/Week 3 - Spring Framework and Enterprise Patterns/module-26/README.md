# Module 26 — Start here

**Topic:** Spring Profiles and Configuration

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 26 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **115–125** (Checkpoint A) | [`exercise-01`](exercises/exercise-01-profile-purposes.md) · [`exercise-02`](exercises/exercise-02-profile-yaml-todos.md) |
| B | After slides **126–128** (Checkpoint B) | [`exercise-03`](exercises/exercise-03-config-properties-sketch.md) · [`exercise-04`](exercises/exercise-04-override-order.md) |
| C | After slides **129–132** (Checkpoint C) | [`exercise-05`](exercises/exercise-05-activation-drill.md) · [`exercise-06`](exercises/exercise-06-lab26-readiness.md) |
| D | After Exercises **1–6** Pass | **One** OS how-to: [`lab26/LAB-26-WINDOWS.md`](lab26/LAB-26-WINDOWS.md) **or** [`lab26/LAB-26-MACOS.md`](lab26/LAB-26-MACOS.md) |
| E | Lab (Checkpoint D) | [`lab26/LAB-26-GUIDE.md`](lab26/LAB-26-GUIDE.md) — timed path [`lab26/starter/`](lab26/starter/README.md) (~45 min) |
| F | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-26-exercises/`. Lab project under `examples/lab26-crm/`.

**Critical:** Split **dev / test / prod** YAML. Activate via **`-D`** and **`SPRING_PROFILES_ACTIVE`**. Know override order. Bind with **`@ConfigurationProperties`**. **Never commit real secrets** — `.env.example` placeholders only. `prod` fails fast when required env vars are missing. Keep CRM fixtures working under `dev`.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
