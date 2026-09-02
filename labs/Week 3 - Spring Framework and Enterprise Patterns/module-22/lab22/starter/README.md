# Lab 22 starter — timed path (~45 minutes)

**Theme:** Spring IoC — stereotypes, constructor DI, lifecycle, dependency graph

## Activity card

| | |
| --- | --- |
| **Objective** | Annotate CRM beans and wire CustomerService via constructor injection |
| **Skills practiced** | @Service/@Repository, constructor DI, @PostConstruct/@PreDestroy |
| **Expected outcome** | App starts · tests green · dependency-graph.md filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab22-crm/` copied from this starter |

**Boilerplate reduced:** Baseline CRM + `// TODO` for stereotypes/DI/lifecycle — no field `@Autowired` as primary.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-22-GUIDE.md`](../LAB-22-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab22-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab22-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab22-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab22-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab22-crm
cp -R starter/. ~/java-bootcamp/examples/lab22-crm/
cd ~/java-bootcamp/examples/lab22-crm
```

Full GUIDE: [`../LAB-22-GUIDE.md`](../LAB-22-GUIDE.md)

## 45-minute checklist

- [ ] Annotate repository/service stereotypes (`@Repository` / `@Service`)
- [ ] Wire `CustomerService` with constructor injection (`final` fields)
- [ ] Add `@PostConstruct` / `@PreDestroy` lifecycle logs on `CustomerService`
- [ ] Fill `docs/dependency-graph.md` bean edges
- [ ] Run smoke test; capture evidence for CUS-1001

## Smoke test

```bash
mvn -B test
mvn -B spring-boot:run
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| App starts; no missing-bean errors | Pass / Fail |
| POST/GET CUS-1001 works (or unit/IT green) | Pass / Fail |
| Constructor DI + stereotypes present (no `new` of collaborators in service) | Pass / Fail |
| dependency-graph.md names CustomerService → repository/notifier | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
