# Lab 22: Spring IoC and Dependency Injection — Northstar CRM Bean Graph — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-22-GUIDE.md](LAB-22-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-22-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab22-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab22-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab22-crm
# Timed path (starter has unit test only until Step 7 homework):
mvn -B "-Dtest=CustomerServiceTest" test
# Full verify after you add CustomerServiceSpringTest (homework Step 7):
mvn -B "-Dtest=CustomerServiceTest,CustomerServiceSpringTest" test
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal / PowerShell):
# $headers = @{ "X-Correlation-Id" = "lab-request-001"; "Content-Type" = "application/json" }
# Invoke-WebRequest http://localhost:8080/api/customers -Method POST -Headers $headers -Body '{"id":"CUS-1001","name":"Amina Khan","email":"amina.khan@example.com","status":"ACTIVE"}' -UseBasicParsing
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing
```

Verified (2026-08-03): **Timed:** `CustomerServiceTest` only — **Tests run: 1**. **Full / homework:** `CustomerServiceTest` + `CustomerServiceSpringTest` via `-Dtest=…` — **Tests run: 2** · **BUILD SUCCESS**. Live POST **201** / GET **200** for `CUS-1001` with `lab-request-001`; log `CustomerService ready` + `customer.created id=CUS-1001 correlationId=lab-request-001`; graceful stop shows `CustomerService shutting down`. (`CustomerController` is **provided** in starter — verify, do not rewrite.)

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.
## Do the lab

Complete every step in **[LAB-22-GUIDE.md](LAB-22-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab22-crm` as in [LAB-22-GUIDE.md](LAB-22-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
