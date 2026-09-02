# Lab 25: Service and Repository Layers with AI Assistance — Northstar CRM Layering — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-25-GUIDE.md](LAB-25-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-25-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab25-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab25-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab25-crm
mvn -B test
# Expected: Tests run: 2 — getSeededCus1001, duplicateCreateRejected
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal):
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1002 -UseBasicParsing
# POST create CUS-1003 — no GET /api/customers list endpoint in starter/solution
# List = service.list() / unit test (optional full-path: add GET list)
```

Verified: **Tests run: 2** · **BUILD SUCCESS** (`CustomerServiceTest`: `getSeededCus1001`, `duplicateCreateRejected`); live GET seeded CUS-1001/CUS-1002; create via HTTP; list via **service** (not HTTP list); duplicate create throws `IllegalStateException`; controller + repository **interface** **provided**; implement InMemory repo + service + tests; AI notes in **`docs/lab25-001.md` only**. (PATCH activate / HTTP list / 409 mapping = full-path extras.)

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.
## Do the lab

Complete every step in **[LAB-25-GUIDE.md](LAB-25-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab25-crm` as in [LAB-25-GUIDE.md](LAB-25-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
