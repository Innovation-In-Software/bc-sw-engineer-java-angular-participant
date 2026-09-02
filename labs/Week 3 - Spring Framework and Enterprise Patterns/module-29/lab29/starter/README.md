# Lab 29 starter — timed path (~45 minutes)

**Theme:** @Valid + GlobalExceptionHandler + ErrorResponse envelopes (Lab 28 security already included)

## Activity card

| | |
| --- | --- |
| **Objective** | Complete DTO constraints and advice TODOs; prove 400/404/409 envelopes |
| **Skills practiced** | Bean Validation, @RestControllerAdvice, ErrorResponse, correlation, Bearer |
| **Expected outcome** | Bad email 400 · CUS-9999 404 · duplicate 409 · happy GET with Bearer |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab29-crm/` copied from this starter |

**Boilerplate reduced:** Validation/advice `// TODO` only. **Lab 28 security is included** (JWT login, Bearer on `/api/customers/**`) — do not rebuild it. `ErrorResponse` is already shaped — implement handler TODOs against the existing fields.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-29-GUIDE.md`](../LAB-29-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab29-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab29-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab29-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab29-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab29-crm
cp -R starter/. ~/java-bootcamp/examples/lab29-crm/
cd ~/java-bootcamp/examples/lab29-crm
```

Full GUIDE: [`../LAB-29-GUIDE.md`](../LAB-29-GUIDE.md)

## 45-minute checklist

- [ ] Add Bean Validation annotations on `CustomerRequest` (`@NotBlank` / `@Email`)
- [ ] Put `@Valid` on controller create method
- [ ] Implement `GlobalExceptionHandler` TODOs for 400/404/409 (+ safe 500) against existing `ErrorResponse`
- [ ] Add `ErrorEnvelopeTest` (**Tests run: 4**) with login + Bearer (starter ships failing TODO test stubs)
- [ ] Smoke with Bearer: bad email → 400; CUS-9999 → 404; duplicate CUS-1001 → 409

## Smoke test

```bash
# login
curl -s -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"agent1","password":"agent1"}'
# then Authorization: Bearer <accessToken> on customer calls

mvn -B test
mvn -B spring-boot:run
```

Evidence under `~/java-bootcamp/notes/lab-29/` (redact secrets/tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Invalid POST returns 400 with violations (Bearer) | Pass / Fail |
| Missing customer returns 404 envelope (Bearer) | Pass / Fail |
| Duplicate returns 409 (Bearer) | Pass / Fail |
| Happy GET CUS-1001 / CUS-1002 still 200 (Bearer) | Pass / Fail |
| Error envelope includes correlation when provided | Pass / Fail |
| Missing token still 401 (security retained) | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
