# Lab 21: Observability and Monitoring — Northstar CRM Actuator & Metrics — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-21-GUIDE.md](LAB-21-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-21-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Lab 21 solution under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab21-solution`: Actuator probes + readiness group (`readinessState,crmReadinessIndicator`) + Micrometer `crm.customer.create`/`get`. Surefire **includes `*IT.java`**. `ActuatorIT` (`healthAndProbesAreUp`, `readinessCanGoDownWhileLivenessStaysUp`, `createMetricAppearsAfterTraffic`) → `mvn -B clean test` → **Tests run: 3**, Failures: 0 · **BUILD SUCCESS**. Instructor walkthrough: `docs/instructor-participant-help/week-2/21-obs-exercises-and-lab21.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab21-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab21-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
mvn -B "-Dtest=ActuatorIT" test
mvn -B clean "-Dtest=ActuatorIT" test
# optional live probes:
# mvn -q -DskipTests spring-boot:run
# Invoke-RestMethod http://localhost:8080/actuator/health/liveness
# Invoke-RestMethod http://localhost:8080/actuator/health/readiness
# Invoke-RestMethod http://localhost:8080/actuator/metrics/crm.customer.create
```

Verified (2026-08-03): **Tests run: 3** · **BUILD SUCCESS**; live health/liveness/readiness UP; create metric increments after POST `CUS-2101`.

Full path (copy `lab20-crm`, 2026-08-11): `ActuatorIT` **Tests run: 3** on this laptop. Metrics wired through Lab 15 `DefaultCustomerService` + optional `CustomerMetrics` (unit tests keep 2-arg ctor). POST `CUS-2101` then `/actuator/metrics/crm.customer.create` 200.

## Do the lab

Complete every step in **[LAB-21-GUIDE.md](LAB-21-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab21-crm` as in [LAB-21-GUIDE.md](LAB-21-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |

