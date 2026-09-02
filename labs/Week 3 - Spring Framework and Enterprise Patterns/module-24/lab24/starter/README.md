# Lab 24 starter — timed path (~45 minutes)

**Do this first:** numbered PowerShell steps in [`../STEPS.md`](../STEPS.md).

**Theme:** `@RestController` Customer mappings + MockMvc + Angular CORS note

## Activity card

| | |
| --- | --- |
| **Objective** | Implement GET/POST mappings with ResponseEntity; green MockMvc |
| **Skills practiced** | PathVariable, RequestBody, status codes, CORS for Angular |
| **Expected outcome** | GET CUS-1001/1002 · POST 201 · MockMvc green · cors doc |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab24-crm/` copied from this starter |

**Boilerplate reduced:** Boot app + seeded in-memory service + controller `// TODO` + MockMvc stubs.

Full steps: [`../LAB-24-GUIDE.md`](../LAB-24-GUIDE.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab24-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab24-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab24-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab24-crm
cp -R starter/. ~/java-bootcamp/examples/lab24-crm/
cd ~/java-bootcamp/examples/lab24-crm
```

## 45-minute checklist

- [ ] Complete `@GetMapping("/{id}")` with 200/404 `ResponseEntity`
- [ ] Complete `@PostMapping` create with 201 + `Location`
- [ ] Wire `X-Correlation-Id` default `lab-request-001`
- [ ] Finish `CustomerControllerMockMvcTest` TODOs
- [ ] Fill `docs/cors-angular.md` (Angular `:4200`)

## Smoke test

```bash
mvn -B test -Dtest=CustomerControllerMockMvcTest
mvn -B spring-boot:run
# GET /api/customers/CUS-1001 and CUS-1002
```

Commit to your GitHub repo (no screenshots)

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| GET seeded Amina/Ravi returns 200 | Pass / Fail |
| Missing id returns 404 | Pass / Fail |
| MockMvc tests green | Pass / Fail |
| CORS Angular note present (REST only) | Pass / Fail |

Continue remaining GUIDE steps (list filter, PUT/PATCH) as homework if needed.
