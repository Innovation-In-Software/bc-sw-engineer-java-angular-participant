# Module 19 — Start here

> **Pacing:** [PACING.md](PACING.md) — Learn→Practice checkpoints **A–E**. Then Lab 19.

**Topic:** Integration Testing and UI Test Automation

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | After slide checkpoints A–D | [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md) |
| A | After Module 19 deck (Boot IT · PostgreSQL test DB · Selenium on Angular · GHA) | Notes on pyramid + selector policy |
| B | Before coding | **One** OS how-to: [`lab19/LAB-19-WINDOWS.md`](lab19/LAB-19-WINDOWS.md) **or** [`lab19/LAB-19-MACOS.md`](lab19/LAB-19-MACOS.md) |
| C | Lab | [`lab19/LAB-19-GUIDE.md`](lab19/LAB-19-GUIDE.md) — timed path [`lab19/starter/`](lab19/starter/README.md) (~45 min) |
| D | Done | Mark Pass/Fail · Kahoot if scheduled |

**Lab project:** `examples/lab19-crm/` — Spring Boot `@SpringBootTest` / MockMvc, PostgreSQL test strategy, Selenium against **Angular**, GitHub Actions headless notes.

**Critical:** UI automation targets **Angular** (`data-testid`, explicit waits). Test database strategy is **PostgreSQL** (Testcontainers or dedicated test DB) — not Oracle. CI path is **GitHub Actions**, not Bitbucket. Fixtures: `CUS-1001` Amina Khan ACTIVE, `CUS-1002` Ravi Singh PROSPECT, correlation `lab-request-001`.

**Stack wording for this module:** Angular · REST · PostgreSQL · OpenShift · GitHub Actions.
