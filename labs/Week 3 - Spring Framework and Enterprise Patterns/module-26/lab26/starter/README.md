# Lab 26 starter — timed path (~45 minutes)

**Theme:** Spring profiles — dev/test/prod YAML, ConfigProperties, secret hygiene

## Activity card

| | |
| --- | --- |
| **Objective** | Complete profile YAML + NorthstarIntegrationProperties; prove activation |
| **Skills practiced** | Profiles, override awareness, env placeholders, fail-fast prod |
| **Expected outcome** | dev smoke · prod refuses missing secrets · no secrets in Git |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab26-crm/` copied from this starter |

**Boilerplate reduced:** Profile stubs + `// TODO` — keep Lab 25 layering.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-26-GUIDE.md`](../LAB-26-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab26-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab26-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab26-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab26-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab26-crm
cp -R starter/. ~/java-bootcamp/examples/lab26-crm/
cd ~/java-bootcamp/examples/lab26-crm
```

Full GUIDE: [`../LAB-26-GUIDE.md`](../LAB-26-GUIDE.md)

## 45-minute checklist

- [ ] Complete base `application.yml` (`name: northstar-crm`, `api-base-url`, `connect-timeout-ms: 2000`) and three profile files (`lab26dev` / `lab26test` H2 URLs)
- [ ] Fill mutable `NorthstarIntegrationProperties` + `@ConfigurationProperties` binding
- [ ] Prove activation via `-Dspring.profiles.active` / env (`docs/profile-notes.md`)
- [ ] Ensure `.env.example` only (`DB_USERNAME` / `DB_PASSWORD` / `NORTHSTAR_API_KEY`) — no real secrets committed
- [ ] Add `ProfileBindingTest` (starter ships **0** tests; expect **Tests run: 1**)
- [ ] Smoke under `dev`: GET CUS-1001 still works

## Smoke test

```bash
# After adding ProfileBindingTest:
mvn -B test -Dspring.profiles.active=test
# Tests run: 1
# PowerShell: quote the -D argument
mvn -B spring-boot:run "-Dspring-boot.run.profiles=dev"
# Fail-fast check: mvn -B spring-boot:run "-Dspring-boot.run.profiles=prod"
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `dev` profile starts with H2-friendly settings | Pass / Fail |
| `prod` fails to start without env secrets / Postgres stack (see GUIDE Step 4) | Pass / Fail |
| Profile YAML files present for dev/test/prod | Pass / Fail |
| No real secrets in Git | Pass / Fail |
| CUS-1001 smoke under `dev` | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
