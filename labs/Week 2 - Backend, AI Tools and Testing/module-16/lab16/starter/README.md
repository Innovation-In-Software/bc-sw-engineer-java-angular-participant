# Lab 16 starter — timed path (~45 minutes)

**Theme:** API exception handling — ErrorResponse + GlobalExceptionHandler + correlation

## Activity card

| | |
| --- | --- |
| **Objective** | Implement ErrorResponse, BusinessException factories, handler, and 400/404/409 demos |
| **Skills practiced** | Catch order, Fail JSON, correlationId, safe messages |
| **Expected outcome** | `mvn -B clean test` green · Fail JSON includes `lab-request-001` |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab16-crm/` copied from this starter |

**Boilerplate reduced:** Baseline CRM + TODOs given — fill `// TODO`; catch BusinessException **before** Exception.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-16-GUIDE.md`](../LAB-16-GUIDE.md) · Codes: [`../../HTTP-STATUS-CODES.md`](../../HTTP-STATUS-CODES.md)

**Honesty:** Prefer **409** for illegal transitions (document 422 if chosen). No stack traces to clients.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab16-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab16-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab16-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab16-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab16-crm
cp -R starter/. ~/java-bootcamp/examples/lab16-crm/
cd ~/java-bootcamp/examples/lab16-crm
```

Full GUIDE: [`../LAB-16-GUIDE.md`](../LAB-16-GUIDE.md)

## 45-minute checklist

- [ ] Implement `ErrorResponse` (+ toJson always includes errors)
- [ ] Complete `BusinessException.notFound` / `conflict` factories
- [ ] Implement `GlobalExceptionHandler` (business / validation / unexpected)
- [ ] Wire facade create/get/changeStatus to return `ApiResult` (catch BusinessException before Exception)
- [ ] Refactor validator/service to throw BusinessException; demo 400/404/409 in Main
- [ ] Finish `GlobalExceptionHandlerTest`; run smoke test

## Smoke test

```bash
mvn -B clean test
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Handler tests green (404 / 409 / generic 500) | Pass / Fail |
| Facade Fail JSON includes correlationId lab-request-001 | Pass / Fail |
| 400 validation / 404 not-found / 409 conflict demonstrated | Pass / Fail |
| Illegal transition leaves CUS-1001 ACTIVE | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
