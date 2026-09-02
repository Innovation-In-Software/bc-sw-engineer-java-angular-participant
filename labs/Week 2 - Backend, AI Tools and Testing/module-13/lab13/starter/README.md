# Lab 13 starter — timed path (~45 minutes)

**Do this first:** numbered PowerShell steps in [`../STEPS.md`](../STEPS.md).

**Theme:** Customer REST contract — OpenAPI + design notes (API-first)

## Activity card

| | |
| --- | --- |
| **Objective** | Complete OpenAPI Customer paths + URI/status/error/list-query notes |
| **Skills practiced** | Resource/URI design, HTTP semantics, OpenAPI schemas, correlation errors |
| **Expected outcome** | Valid YAML with CUS-1001/CUS-1002 examples · design notes filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab13-crm/` copied from this starter |

**Boilerplate reduced:** OpenAPI skeleton + note templates with `TODO:` — fill them; optional Boot stub is homework.

Pacing: Full steps → [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab13-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab13-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab13-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab13-crm
cp -R starter/. ~/java-bootcamp/examples/lab13-crm/
cd ~/java-bootcamp/examples/lab13-crm
```

Full GUIDE: [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

## 45-minute checklist

- [ ] Fill URI + method/status tables in `docs/rest-design-notes.md`
- [ ] Complete `ErrorResponse` + pagination/filter/sort sections
- [ ] Finish `openapi/northstar-crm-customers.yaml` (collection + item + examples)
- [ ] Confirm Amina ACTIVE / Ravi PROSPECT examples and `lab-request-001`
- [ ] Commit your work to your GitHub repo (no screenshots)

## Smoke test

```bash
# Open YAML in IDE schema validation; or:
# npx --yes @redocly/cli lint openapi/northstar-crm-customers.yaml
ls openapi docs
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| OpenAPI documents GET/POST collection and GET item | Pass / Fail |
| Examples include CUS-1001 and CUS-1002 | Pass / Fail |
| Error schema includes correlationId | Pass / Fail |
| List query design (page/size/status/sort) documented | Pass / Fail |
| Notes never teach Oracle/SOAP as the path | Pass / Fail |

Continue remaining GUIDE steps (optional Boot stub) as homework / full path if needed.
