# Lab 18 starter — timed path (~45 minutes)

**Theme:** Mockito isolation — stub / verify / never / ArgumentCaptor + BDDMockito

## Activity card

| | |
| --- | --- |
| **Objective** | Complete Mockito + BDDMockito suites with real validator and mock repo |
| **Skills practiced** | Stubbing, verify/never, ArgumentCaptor, isolation policy |
| **Expected outcome** | `mvn -B clean test` green twice · not-found never saves |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab18-crm/` copied from this starter |

**Boilerplate reduced:** Baseline CRM + mock test TODOs — fill `// TODO`; do **not** mock the SUT.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-18-GUIDE.md`](../LAB-18-GUIDE.md)

**Honesty:** Keep validator real. Selenium is Lab 19. Review AI mock suggestions.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab18-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab18-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab18-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab18-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab18-crm
cp -R starter/. ~/java-bootcamp/examples/lab18-crm/
cd ~/java-bootcamp/examples/lab18-crm
```

Full GUIDE: [`../LAB-18-GUIDE.md`](../LAB-18-GUIDE.md)

## 45-minute checklist

- [ ] Wire `CustomerServiceMockitoTest` with `@Mock` repo + real validator
- [ ] Implement activate stub/verify; not-found `never().save`; ArgumentCaptor on add
- [ ] Complete `CustomerServiceBddMockTest` with given/then/should
- [ ] Fill `docs/isolation-policy.md`
- [ ] Run smoke test twice (full suite green)

## Smoke test

```bash
mvn -B clean test
mvn -B test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Mockito suite green (stub/verify/captor) | Pass / Fail |
| BDDMockito suite green | Pass / Fail |
| not-found path never calls save | Pass / Fail |
| isolation-policy.md filled | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
