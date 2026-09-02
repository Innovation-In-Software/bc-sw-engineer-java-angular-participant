# Lab 16: API Exception Handling — Northstar CRM Error Model — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-16-GUIDE.md](LAB-16-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-16-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Monday, August 3, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Copied `examples\lab15-crm` → `examples\lab16-crm`; added `ErrorResponse` / `BusinessException` factories / `GlobalExceptionHandler` / `ApiResult`; facade returns Ok/Fail; service/validator throw typed business exceptions. Timed starter `GlobalExceptionHandlerTest` (`mapsNotFoundTo404`, `mapsConflictTo409`, `unexpectedIsGeneric500`) → **Tests run: 3**, Failures: 0 · **BUILD SUCCESS**. Main (Maven runtime classpath) prints 400/404/409 JSON with `lab-request-001` and leaves `CUS-1001` ACTIVE after illegal transition. Instructor walkthrough: `docs/instructor-participant-help/week-2/16-errors-exercises-and-lab16.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab16-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab16-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab15-crm lab16-crm   # once
cd lab16-crm
mvn -q test "-Dtest=GlobalExceptionHandlerTest"
mvn -B clean test
mvn -q -DskipTests compile
mvn -q -DincludeScope=runtime dependency:build-classpath "-Dmdep.outputFile=target\cp.txt"
java -cp "target\classes;$(Get-Content target\cp.txt -Raw)" com.northstar.crm.Main
```

Verified (re-confirmed 2026-08-03): **Tests run: 3** · **BUILD SUCCESS** (`GlobalExceptionHandlerTest`). Main with dependency classpath shows 400 validation, 404 not-found, 409 conflict JSON with `correlationId=lab-request-001`; `CUS-1001 still: ACTIVE`.

## Do the lab

Complete every step in **[LAB-16-GUIDE.md](LAB-16-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab16-crm` as in [LAB-16-GUIDE.md](LAB-16-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
