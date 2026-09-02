# Lab 11 starter — timed path (~45 minutes)

**Theme:** Copilot for tests + refactoring (JUnit 5 / Mockito)

## Activity card

| | |
| --- | --- |
| **Objective** | Complete real tests + notifier extract + AI review notes |
| **Skills practiced** | AAA asserts, Mockito verify sample, refactor compatibility ctor |
| **Expected outcome** | `mvn clean test` → 8 tests green; notes lab11-001–004 |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab11-crm/` copied from this starter |

**Boilerplate reduced:** Domain from Lab 10 style + test shells given — reject trivial asserts; finish notifier wiring.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-11-GUIDE.md`](../LAB-11-GUIDE.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab11-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab11-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab11-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab11-crm
cp -R starter/. ~/java-bootcamp/examples/lab11-crm/
cd ~/java-bootcamp/examples/lab11-crm
```

Full GUIDE: [`../LAB-11-GUIDE.md`](../LAB-11-GUIDE.md)

## 45-minute checklist

- [ ] Complete `CustomerTest` (2) + `CustomerServiceTest` (5 including `findByStatusReturnsOnlyMatchingCustomers`) + mock (1)
- [ ] Implement required `listAll()` + `findByStatus(...)` on `CustomerService`
- [ ] Flesh out `CustomerNotifier.notifyStatusChange`; wire into `updateStatus`; Mockito verify
- [ ] Extract duplicated validation helper
- [ ] Fill `copilot-notes/ai-test-refactor-notes.md` lab11-001–004
- [ ] Run smoke test → **Tests run: 8**

## Smoke test

```bash
mvn -B clean test
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `mvn test` → **Tests run: 8**, Failures: 0 | Pass / Fail |
| Mockito verifies notifier (or documented equivalent) | Pass / Fail |
| Notes show at least one rejected trivial test | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
