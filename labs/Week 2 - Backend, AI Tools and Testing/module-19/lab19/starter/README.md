# Lab 19 starter — timed path (~45 minutes)

**Theme:** Boot Customer IT + Selenium on Angular selectors with PostgreSQL strategy notes

Follow **[../STEPS.md](../STEPS.md)** first (numbered PowerShell steps). Then use this checklist.

## Activity card

| | |
| --- | --- |
| **Objective** | Green `CustomerApiIT` + one Selenium flow + strategy docs |
| **Skills practiced** | MockMvc IT, explicit waits, `data-testid`, GHA headless notes |
| **Expected outcome** | GET CUS-1001 IT green · UI asserts Amina · docs filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab19-crm/` copied from this starter |

**Boilerplate reduced:** Working Boot API + HTML/Angular selector stubs. You fill `// TODO` in the tests and `data-testid` hooks.

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder (`lab19/`):

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab19-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab19-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab19-crm
cp -R starter/. ~/java-bootcamp/examples/lab19-crm/
cd ~/java-bootcamp/examples/lab19-crm
```

## Folder map (after copy)

```text
lab19-crm/
  pom.xml
  src/main/java/...          working GET/POST API (seeded Amina/Ravi)
  src/test/java/...          CustomerApiIT + CustomerUiSeleniumIT (TODOs)
  src/main/resources/static/  page Boot serves for Selenium
  ui/                        same markup + Angular component stub
  docs/                      postgres + GHA notes
```

## 45-minute checklist

- [ ] Fill `docs/postgres-test-strategy.md`
- [ ] Complete `CustomerApiIT` TODOs (GET Amina, 404, POST)
- [ ] Add `data-testid` hooks on the HTML + Angular stub
- [ ] Complete Selenium test with `WebDriverWait`
- [ ] Draft `docs/github-actions-ui-tests.md`

## Smoke test

```powershell
mvn -B test -Dtest=CustomerApiIT
mvn -B test -Dtest=CustomerUiSeleniumIT
```

Commit to your GitHub repo (no screenshots)

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `CustomerApiIT` green for CUS-1001 | Pass / Fail |
| PostgreSQL strategy doc present | Pass / Fail |
| Selenium uses explicit wait + stable selector | Pass / Fail |
| GitHub Actions notes mention headless (not Bitbucket) | Pass / Fail |

Continue remaining GUIDE steps as homework if needed.
