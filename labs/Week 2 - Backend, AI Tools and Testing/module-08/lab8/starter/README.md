# Lab 8 starter — timed path (~45 minutes)

**Theme:** Maven layered project structure (Northstar CRM skeleton)

## Activity card

| | |
| --- | --- |
| **Objective** | Fill layer stubs + Main banner in the CRM Maven skeleton |
| **Skills practiced** | Packages, entity/DTO, service/repository/controller stubs, docs |
| **Expected outcome** | Smoke test prints Lab 8 banner + seven packages + sample IDs |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab8-crm/` copied from this starter |

**Boilerplate reduced:** `pom.xml`, package folders, and stub class shells are given — fill `// TODO`s; no Spring/JPA.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-8-GUIDE.md`](../LAB-8-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab8-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab8-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab8-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab8-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab8-crm
cp -R starter/. ~/java-bootcamp/examples/lab8-crm/
cd ~/java-bootcamp/examples/lab8-crm
```

Full GUIDE path (homework / extended): [`../LAB-8-GUIDE.md`](../LAB-8-GUIDE.md)

## 45-minute checklist

- [ ] Confirm seven layer packages under `com.northstar.crm` (no Spring/JPA imports)
- [ ] Fill `// TODO` on entity, DTOs, repository, service, controller, config, exception
- [ ] Complete `Main` banner lines (packages + `CUS-1001` / `CUS-1002`)
- [ ] Fill `docs/layer-flow.md` and `docs/CODING-STANDARDS.md` TODOs
- [ ] Run smoke test; commit your work to GitHub. Ignore the old path `notes/lab-8/`

## Smoke test

```powershell
mvn -q clean compile
java -cp target\classes com.northstar.crm.Main
```

**macOS / Linux:**

```bash
mvn -q clean compile
java -cp target/classes com.northstar.crm.Main
```

Expected snippet: `Northstar CRM skeleton — Lab 8` plus seven packages and sample customer IDs.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `mvn clean compile` succeeds | Pass / Fail |
| `Main` prints skeleton banner + packages + CUS-1001/CUS-1002 | Pass / Fail |
| Seven layer packages present; no Spring/JPA/Kafka in stubs | Pass / Fail |
| `docs/layer-flow.md` + `docs/CODING-STANDARDS.md` filled | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
