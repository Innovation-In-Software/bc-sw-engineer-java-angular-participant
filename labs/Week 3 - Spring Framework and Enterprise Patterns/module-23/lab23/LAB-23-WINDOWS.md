# Lab 23: Spring Boot Setup and Auto-Configuration — Northstar CRM First Boot App — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-23-GUIDE.md](LAB-23-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-23-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab23-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab23-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab23-crm
# Timed path (starter has CrmApplicationTests only):
mvn -B "-Dtest=CrmApplicationTests" test
# Full path after you add CustomerControllerHttpTest (Step 8 homework):
mvn -B test
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal):
# Invoke-RestMethod http://localhost:8080/actuator/health
# Invoke-RestMethod http://localhost:8080/actuator/info
# $headers = @{ "X-Correlation-Id" = "lab-request-001"; "Content-Type" = "application/json" }
# Invoke-WebRequest http://localhost:8080/api/customers -Method POST -Headers $headers -Body '{"id":"CUS-1001","name":"Amina Khan","email":"amina.khan@example.com","status":"ACTIVE"}' -UseBasicParsing
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-MISSING -UseBasicParsing   # timed: 500
# Profile teaser: mvn -B spring-boot:run "-Dspring-boot.run.profiles=dev"
# Packaged JAR name: target\lab23-crm-0.0.1-SNAPSHOT.jar
```

Verified (2026-08-03): **Timed:** `CrmApplicationTests` — **Tests run: 1**. **Full / homework:** `CrmApplicationTests` + `CustomerControllerHttpTest` — **Tests run: 2** · **BUILD SUCCESS**. Live health **UP**; POST **201** / GET **200** for `CUS-1001` with request header `lab-request-001` (header **read**, not echoed); `CUS-MISSING` → **500** (Boot default; no `@ControllerAdvice` in starter/solution); profile `dev` teaser; `/actuator/info` shows `northstar-crm` when `info.*` + `management.info.env.enabled=true`. (`CustomerController` **provided** — verify/call, do not rewrite.)

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.
## Do the lab

Complete every step in **[LAB-23-GUIDE.md](LAB-23-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab23-crm` as in [LAB-23-GUIDE.md](LAB-23-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
