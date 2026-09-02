# Module 36 — Start here

> **Pacing:** [PACING.md](PACING.md) — Learn→Practice checkpoints **A–E**. Then Lab 36.

**Topic:** Secure Frontend Communication

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | After slide checkpoints A–D | [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md) |
| A | After Module 36 slides (JWT discipline, interceptors, XSS/CSRF, guards) | Sketch: where the access token lives |
| B | Ready for lab | [`lab36/LAB-36-WINDOWS.md`](lab36/LAB-36-WINDOWS.md) **or** [`lab36/LAB-36-MACOS.md`](lab36/LAB-36-MACOS.md) |
| C | Timed path | [`lab36/starter/README.md`](lab36/starter/README.md) (~45 min) |
| D | Full path | [`lab36/LAB-36-GUIDE.md`](lab36/LAB-36-GUIDE.md) |
| E | Done | Mark Pass/Fail |

**Stack:** Angular · Spring Boot **REST** · **PostgreSQL** · GitHub Actions · Northstar `CUS-1001` / `CUS-1002` / `lab-request-001`.

**Critical:** Prefer **memory** access tokens and/or **httpOnly** cookies — **not** `localStorage` JWT as the recommended pattern. Guards + interceptors on the client; **API must still authorize**. No React/SOAP/Oracle participant path.

**Lab project:** `examples/lab36-crm-ui/`
