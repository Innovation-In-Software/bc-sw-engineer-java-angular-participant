# Lab 17 starter — timed path (~45 minutes)

**Theme:** JUnit 5 service tests + parameterized transitions + JaCoCo ≥80%

## Activity card

| | |
| --- | --- |
| **Objective** | Complete CustomerServiceTests, CsvSource transitions, and JaCoCo gate |
| **Skills practiced** | AAA, meaningful asserts, parameterized tests, verify gate |
| **Expected outcome** | `mvn -B clean verify` → **Tests run: 19** + JaCoCo gate |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab17-crm/` copied from this starter |

**Boilerplate reduced:** Baseline CRM + test TODOs given — fill `// TODO`; always **clean verify** for JaCoCo.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-17-GUIDE.md`](../LAB-17-GUIDE.md)

**Honesty:** Mockito deep isolation is Lab 18. Review AI-generated tests before Pass.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab17-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab17-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab17-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab17-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab17-crm
cp -R starter/. ~/java-bootcamp/examples/lab17-crm/
cd ~/java-bootcamp/examples/lab17-crm
```

Full GUIDE: [`../LAB-17-GUIDE.md`](../LAB-17-GUIDE.md)

## 45-minute checklist

- [ ] Wire `CustomerServiceTests` @BeforeEach with fresh repo/validator/service
- [ ] Implement happy + negative tests (duplicate, illegal transition, not-found)
- [ ] Complete parameterized legal/illegal transition tests
- [ ] Confirm JaCoCo check on `com.northstar.crm.service` (≥0.80); optional deliberate 0.99 fail
- [ ] Fill `docs/junit-runbook.md`; run smoke test

## Smoke test

```bash
mvn -B clean test
mvn -B clean verify
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| CustomerServiceTests green | Pass / Fail |
| Parameterized transition tests green | Pass / Fail |
| mvn clean verify passes JaCoCo gate (≥80% on service package) | Pass / Fail |
| Runbook documents commands + evidence | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.

