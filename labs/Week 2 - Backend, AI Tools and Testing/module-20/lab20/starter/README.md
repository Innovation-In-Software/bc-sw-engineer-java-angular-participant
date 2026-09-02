# Lab 20 starter — timed path (~45 minutes)

**Theme:** Structured logging — Logback pattern, CorrelationFilter MDC, PII-free service logs

## Activity card

| | |
| --- | --- |
| **Objective** | Complete CorrelationFilter, safe service logs, and CustomerLoggingIT |
| **Skills practiced** | MDC put/clear, %X pattern, PII-free INFO lines |
| **Expected outcome** | `CustomerLoggingIT` green · no Amina/email in logs |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab20-crm/` copied from this starter |

**Boilerplate reduced:** App + logging TODOs — fill `// TODO`; always clear MDC in finally.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-20-GUIDE.md`](../LAB-20-GUIDE.md)

**Honesty:** Actuator/Micrometer wait for Lab 21. Never log fullName/email.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab20-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab20-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab20-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab20-crm
cp -R starter/. ~/java-bootcamp/examples/lab20-crm/
cd ~/java-bootcamp/examples/lab20-crm
```

Full GUIDE: [`../LAB-20-GUIDE.md`](../LAB-20-GUIDE.md)

## 45-minute checklist

- [ ] Confirm `logback-spring.xml` pattern includes %X{corr}/%X{cust}/%X{op}
- [ ] Implement `CorrelationFilter` (MDC put + finally clear + header echo)
- [ ] Instrument `CustomerService` create/get (INFO; no fullName/email)
- [ ] Complete `CustomerLoggingIT` assertions
- [ ] Fill `docs/logging.md`; run smoke test

## Smoke test

```bash
mvn -B -Dtest=CustomerLoggingIT test
mvn -B clean verify
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| CustomerLoggingIT green | Pass / Fail |
| Logs include lab-request-001 and customer ids | Pass / Fail |
| Logs do not contain Amina / email PII | Pass / Fail |
| MDC cleared after request (no bleed across requests) | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
