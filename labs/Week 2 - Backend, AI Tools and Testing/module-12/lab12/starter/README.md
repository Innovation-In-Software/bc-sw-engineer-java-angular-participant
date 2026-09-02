# Lab 12 starter — timed path (~45 minutes)

**Theme:** Coding standards — smell catalog + refactor messy service

## Activity card

| | |
| --- | --- |
| **Objective** | Freeze baseline, catalog smells, refactor to create/get/updateStatus |
| **Skills practiced** | Naming, equals/Map, evidence docs, green tests |
| **Expected outcome** | 8 tests green + `docs/smells.md` / before-after filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab12-crm/` copied from this starter |

**Boilerplate reduced:** Messy baseline + test shells given — focus on smell catalog and target API refactor.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-12-GUIDE.md`](../LAB-12-GUIDE.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab12-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab12-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab12-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab12-crm
cp -R starter/. ~/java-bootcamp/examples/lab12-crm/
cd ~/java-bootcamp/examples/lab12-crm
```

Full GUIDE: [`../LAB-12-GUIDE.md`](../LAB-12-GUIDE.md)

## 45-minute checklist

- [ ] Confirm `CustomerService.before.java.txt` frozen
- [ ] Fill `docs/smells.md` (≥8 smells)
- [ ] Refactor to `createCustomer` / `getCustomer` / `updateStatus` (remove `doStuff`)
- [ ] Make `CustomerServiceTest` TODOs green
- [ ] Note before/after in `docs/before-after.md`
- [ ] Run smoke test

## Smoke test

```bash
mvn -B test
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| No `doStuff` remains; clean API present | Pass / Fail |
| Tests green for CUS-1001 / unknown / duplicate | Pass / Fail |
| smells.md has ≥8 items | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
