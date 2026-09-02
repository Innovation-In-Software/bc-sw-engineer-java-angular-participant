# Lab 27 starter — timed path (~45 minutes)

**Theme:** @Transactional TransferService — atomic debit/credit/log with rollback proof

## Activity card

| | |
| --- | --- |
| **Objective** | Complete transfer TX TODOs and prove ACC-FORCE-FAIL rollback |
| **Skills practiced** | Service @Transactional, TransactionLog, ACID evidence notes |
| **Expected outcome** | Happy MAIN→LOYALTY · forced-fail unchanged MAIN · acid-notes filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab27-crm/` copied from this starter |

**Boilerplate reduced:** Accounts + TransferService stubs + `// TODO` — review AI drafts for TX safety.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-27-GUIDE.md`](../LAB-27-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab27-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab27-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab27-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab27-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab27-crm
cp -R starter/. ~/java-bootcamp/examples/lab27-crm/
cd ~/java-bootcamp/examples/lab27-crm
```

Full GUIDE: [`../LAB-27-GUIDE.md`](../LAB-27-GUIDE.md)

## 45-minute checklist

- [ ] Add `@Transactional` on `TransferService.transfer` (service boundary)
- [ ] Implement debit/credit + `TransactionLog` write inside the TX (debit then force-fail is OK)
- [ ] Force rollback when destination is `ACC-FORCE-FAIL` → HTTP **500** (no ExceptionHandler)
- [ ] Controller returns HTTP **200** `{"status":"OK"}` (not 204)
- [ ] Complete tests: `forceFailRollsBack` + `happyPathMovesFunds` (**Tests run: 2**)
- [ ] Fill ACID table in `docs/acid-notes.md`
- [ ] Smoke: happy MAIN→LOYALTY; failure leaves MAIN unchanged

## Smoke test

```bash
mvn -B test
# Tests run: 2
mvn -B spring-boot:run
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Happy transfer updates both balances + log | Pass / Fail |
| Forced fail rolls back (no log row / MAIN unchanged) | Pass / Fail |
| `@Transactional` on service method (not controller) | Pass / Fail |
| ACID notes cite evidence | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
