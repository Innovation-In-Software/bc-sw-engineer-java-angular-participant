# Demo script — Northstar CRM final defense

**Total target:** ~10–12 minutes live (+ 1 deny/failover beat)  
**Fixtures:** `CUS-1001` Amina · `CUS-1002` Ravi · `lab-request-001`  
**Roles:** Driver (UI) · Narrator · Verifier (API/SQL/logs)

## Pre-flight (T-5 min)

- [ ] UI URL: `http://localhost:4200` (Angular)
- [ ] API health: _____
- [ ] Auth token ready (do not paste into slides)
- [ ] Fallback notes (curl/output) in `notes/lab-52/fallback/` — no screenshots

## Happy path

| Min | Beat | Who | Say / do | Pass signal |
| --- | ---- | --- | -------- | ----------- |
| 0:00 | Hook | Narrator | Business outcome in one sentence | Panel nods |
| 0:30 | Search | Driver | Search Amina `CUS-1001` | Profile opens |
| 1:30 | Timeline | Driver | Show existing interactions | List renders |
| 2:30 | Create | Driver | Record interaction; correlation `lab-request-001` | 201 / UI success |
| 4:00 | Persist | Verifier | SQL or admin proof of row | Row exists |
| 5:00 | Event | Verifier | Kafka / log shows event + correlation | Message visible |
| 6:30 | Secondary | Driver | Brief Ravi `CUS-1002` mention | Optional |
| 7:30 | Release | Narrator | Cite image digest + pipeline | Digest on slide |

## Deny / failure beat (required)

| Min | Beat | Who | Say / do | Pass signal |
| --- | ---- | --- | -------- | ----------- |
| 8:30 | Unauthorized | Verifier | Call API without token | **401** |
| 9:00 | Forbidden | Verifier | Wrong role (if available) | **403** |
| 9:30 | Recovery | Narrator | If live fails → open fallback notes/curl output; be transparent | Continuity |

## Close

- Residual risks owned: _____
- What we would do with one more week: _____

## Script notes / TODOs

- Exact curl commands: _____
- SQL snippet: _____
- Topic name: _____
