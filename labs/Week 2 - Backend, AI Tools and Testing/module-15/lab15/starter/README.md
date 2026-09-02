# Lab 15 starter — timed path (~45 minutes)

**Theme:** Service layer + CustomerValidator status transitions (no persistence leak)

## Activity card

| | |
| --- | --- |
| **Objective** | Implement repo, validator ALLOWED matrix, DefaultCustomerService, and demos |
| **Skills practiced** | Ctor DI, validate-before-mutate, illegal-transition proof |
| **Expected outcome** | `mvn -B clean test` green · activate CUS-1002 · reject ACTIVE→PROSPECT |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab15-crm/` copied from this starter |

**Boilerplate reduced:** Baseline CRM + TODOs given — fill `// TODO`; keep Map out of `service`.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-15-GUIDE.md`](../LAB-15-GUIDE.md)

**Honesty:** No `@ControllerAdvice` / Spring MVC error mapping in Lab 15 (Lab 16).

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab15-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab15-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab15-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab15-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab15-crm
cp -R starter/. ~/java-bootcamp/examples/lab15-crm/
cd ~/java-bootcamp/examples/lab15-crm
```

Full GUIDE: [`../LAB-15-GUIDE.md`](../LAB-15-GUIDE.md)

## 45-minute checklist

- [ ] Implement `InMemoryCustomerRepository` (private Map)
- [ ] Fill `CustomerValidator` ALLOWED transitions + validateNew / validateTransition
- [ ] Implement `DefaultCustomerService` constructor DI + changeStatus (validate before mutate)
- [ ] Main: activate CUS-1002; reject ACTIVE→PROSPECT on CUS-1001; prove status unchanged
- [ ] Finish `CustomerValidatorTest`; fill `docs/service-layer-notes.md`
- [ ] Run smoke test

## Smoke test

```bash
mvn -B clean test
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Validator tests green (legal + illegal + duplicate) | Pass / Fail |
| Main activates CUS-1002 to ACTIVE | Pass / Fail |
| Illegal transition leaves CUS-1001 ACTIVE; message includes lab-request-001 | Pass / Fail |
| No HashMap / JDBC in service package | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
