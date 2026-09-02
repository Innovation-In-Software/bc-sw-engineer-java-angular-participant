# Lab 27: Transaction Management with AI Assistance — Northstar CRM Transfers — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-27-GUIDE.md](LAB-27-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-27-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab27-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab27-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab27-crm
mvn -B test
mvn -B spring-boot:run
```

Verified (2026-08-04): **Tests run: 2** (`forceFailRollsBack` + `happyPathMovesFunds`) · **BUILD SUCCESS**; force-fail `ACC-FORCE-FAIL` → `IllegalStateException` / HTTP **500** (no ExceptionHandler), MAIN unchanged at **1000.00**; happy `POST /api/transfers` → **200** `{"status":"OK"}`; unit happy path uses amount **5.00** (curl demo may use **50.00** → MAIN **950.00** / LOYALTY **100.00**). H2 `jdbc:h2:mem:lab27`. Seeds `ACC-MAIN-1001` / `ACC-LOYALTY-1001` only. `@Transactional` on `TransferService` only. Insufficient-funds check is full-path optional (not in solution).

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.

**Windows PowerShell + curl JSON (verified 2026-08-11):** do **not** pass `{\"fromAccountId\":...}` on the `curl.exe -d` line — PowerShell leaves the backslashes and Tomcat returns **400** `HttpMessageNotReadableException` (`Unexpected character '\'`). Write the body to a file and use `--data-binary "@$env:TEMP\lab27\happy.json"` (or `Invoke-RestMethod -ContentType application/json`). Incremental full-path copy `lab26-crm` → `lab27-crm` plus `spring-boot-starter-data-jpa` also **BUILD SUCCESS**; isolated `TransferServiceTest` **Tests run: 2**. Live `POST /api/transfers` happy **50.00** → **200** `{"status":"OK"}`; `ACC-FORCE-FAIL` → **500**.

## Do the lab

Complete every step in **[LAB-27-GUIDE.md](LAB-27-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab27-crm` as in [LAB-27-GUIDE.md](LAB-27-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
