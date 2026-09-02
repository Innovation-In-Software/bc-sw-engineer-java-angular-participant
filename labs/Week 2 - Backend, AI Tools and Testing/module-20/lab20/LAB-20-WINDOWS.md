# Lab 20: Structured Logging — Northstar CRM Traceable Operations — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-20-GUIDE.md](LAB-20-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-20-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Lab 20 solution under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab20-solution`: Logback pattern `corr=%X{corr} cust=%X{cust} op=%X{op}`, `CorrelationFilter` MDC + finally clear, PII-free service logs. Surefire **includes `*IT.java`** (Spring Boot parent would otherwise skip it). `mvn -B clean test` → **Tests run: 1**, Failures: 0 · **BUILD SUCCESS**. Sample line: `corr=lab-request-001 cust=CUS-1001 op=get` with no Amina/email. Instructor walkthrough: `docs/instructor-participant-help/week-2/20-logging-exercises-and-lab20.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab20-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab20-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
mvn -q dependency:tree | findstr /i "logback slf4j"
mvn -B "-Dtest=CustomerLoggingIT" test
mvn -B clean "-Dtest=CustomerLoggingIT" test
# optional: mvn spring-boot:run  then curl with X-Correlation-Id: lab-request-001
```

Verified (2026-08-04): **Tests run: 1** · **BUILD SUCCESS**; logs include `lab-request-001` + customer ids + `op=get`/`op=create`; no Amina/email PII.

## Do the lab

Complete every step in **[LAB-20-GUIDE.md](LAB-20-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab20-crm` as in [LAB-20-GUIDE.md](LAB-20-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
