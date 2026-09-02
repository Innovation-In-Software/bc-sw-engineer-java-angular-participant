# Lab 26: Spring Profiles and Configuration — Northstar CRM Environments — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-26-GUIDE.md](LAB-26-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-26-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab26-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab26-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab26-crm
mvn -B test "-Dspring.profiles.active=test"
mvn -B spring-boot:run "-Dspring-boot.run.profiles=dev"
# After Started CrmApplication:
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -Headers @{"X-Correlation-Id"="lab-request-001"} -UseBasicParsing
# Fail-fast: mvn -B spring-boot:run "-Dspring-boot.run.profiles=prod"   # expect APPLICATION FAILED TO START
```

Verified (2026-08-04): **Tests run: 1** (`ProfileBindingTest`) · **BUILD SUCCESS** under `test` (optional second run for determinism — still 1 test); `dev` active + H2 JDBC `jdbc:h2:mem:lab26dev;...MODE=PostgreSQL` (no `/h2-console` / JPA required) + GET `CUS-1001` **200**; `prod` **APPLICATION FAILED TO START**; `.env.example` has `DB_USERNAME` / `DB_PASSWORD` / `NORTHSTAR_API_KEY`; `.env` absent. App name `northstar-crm`.

Re-verified (2026-08-07, PowerShell): `mvn spring-boot:run "-Dspring-boot.run.profiles=prod"` with secrets unset → active profile **`prod`**, then **APPLICATION FAILED TO START** with `Failed to load driver class org.postgresql.Driver` (H2-only classpath; Boot does not always throw “Could not resolve placeholder” for YAML `${DB_PASSWORD}` / `${NORTHSTAR_API_KEY}`). Unquoted `-Dspring-boot.run.profiles=prod` → Maven `Unknown lifecycle phase ".run.profiles=prod"`. Plain `mvn spring-boot:run` uses default **`dev`** and starts.

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.

## Do the lab

Complete every step in **[LAB-26-GUIDE.md](LAB-26-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab26-crm` as in [LAB-26-GUIDE.md](LAB-26-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
