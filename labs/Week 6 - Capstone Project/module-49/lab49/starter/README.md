# Lab 49 starter — session block (~45 minutes)

**Theme:** Capstone backend interaction slice (service stub package)

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | service TODOs · compile · CUS-1001 fixtures · event V1 sketch |
| **Hard gate** | Pre-lab Pass · Lab 48 story |

**Target:** `%USERPROFILE%\java-bootcamp\examples\lab49-crm` (macOS: `~/java-bootcamp/examples/lab49-crm`)

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

Capstone teams with an existing `customer-management-platform` monorepo may copy only `backend/` into that repo.

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\lab49-crm"
New-Item -ItemType Directory -Force -Path "$dest" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dest\
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab49-crm
cp -R starter/. ~/java-bootcamp/examples/lab49-crm/
cd ~/java-bootcamp/examples/lab49-crm
```

## 45-minute session checklist

- [ ] Open starter under IntelliJ; JDK 21 SDK
- [ ] Fill `// TODO` in `InteractionService` (validate customer, persist, publish)
- [ ] Fill `CreateInteractionRequest` validation annotations
- [ ] Wire controller → service; return 201 shape for `CUS-1001`
- [ ] Sketch event fields in `CustomerInteractionRecordedV1`
- [ ] Run build smoke (`mvn -B -f backend/pom.xml test`)

## Build / smoke checklist

```powershell
cd backend
mvn -B test
```

Expect failures until TODOs are filled, then both `InteractionServiceTest` methods green. Angular UI is Lab 50 — do not start it here.

Evidence under `~/java-bootcamp/notes/lab-49/`.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Service TODOs filled (no `UnsupportedOperationException`) | Pass / Fail |
| Compile succeeds | Pass / Fail |
| At least one unit test for create-interaction path green (or documented baseline) | Pass / Fail |
| Fixtures `CUS-1001` / `lab-request-001` appear in code or test | Pass / Fail |

Full path (multi-day): Flyway migration, Kafka IT, Problem Details, consumer/DLT, `docs/backend-demo.md` — see GUIDE.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| UnsupportedOperationException left | Fill InteractionService TODOs |
| Validation missing | Annotate CreateInteractionRequest |
| Wrong module path | Copy into `examples/lab49-crm` |
| Tests red until TODOs | Expected; then green session tests |
