# Lab 9 starter — timed path (~45 minutes)

**Theme:** Maven build, dependencies, plugins, profiles

## Activity card

| | |
| --- | --- |
| **Objective** | Fill POM TODOs + lifecycle/tree evidence for lab9-crm |
| **Skills practiced** | Scopes, compiler/Surefire/jar plugins, verify, dependency tree |
| **Expected outcome** | `mvn -B clean verify` + runnable JAR smoke path |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab9-crm/` copied from this starter |

**Boilerplate reduced:** Layer stubs from Lab 8 style are present — focus on Maven build TODOs and evidence docs.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-9-GUIDE.md`](../LAB-9-GUIDE.md)

**Flags:** Prefer full logs first; never `-q` with `dependency:tree`.

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab9-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab9-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab9-crm
cp -R starter/. ~/java-bootcamp/examples/lab9-crm/
cd ~/java-bootcamp/examples/lab9-crm
```

Full GUIDE: [`../LAB-9-GUIDE.md`](../LAB-9-GUIDE.md)

## 45-minute checklist

- [ ] Fill `pom.xml` TODOs (dependencies with scopes, compiler/Surefire/jar plugins)
- [ ] Confirm `PlaceholderTest` runs under Surefire
- [ ] Walk lifecycle phases; fill `docs/lifecycle-evidence.md`
- [ ] Capture `docs/dependency-tree.txt`
- [ ] Optional timed stretch: add `dev`/`prod` profiles
- [ ] Run smoke test

## Smoke test

```bash
mvn -B clean verify
mvn package
java -jar target/customer-service.jar
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `mvn -B verify` BUILD SUCCESS | Pass / Fail |
| JUnit is `test` scope; PlaceholderTest green | Pass / Fail |
| `target/customer-service.jar` runs Main | Pass / Fail |
| lifecycle-evidence.md has phase notes | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
