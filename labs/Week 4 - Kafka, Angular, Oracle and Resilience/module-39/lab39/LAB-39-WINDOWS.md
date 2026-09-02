# Lab 39: Spring Data JPA and PostgreSQL Integration — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-39-GUIDE.md](LAB-39-GUIDE.md)  
**Other OS:** [macOS guide](LAB-39-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- Labs 37–38 concepts; Docker Desktop; IntelliJ SDK **21**
- Copy `.env.example` → `.env` (never commit `.env`)

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab39-crm` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab39-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab39-crm
Copy-Item .env.example .env -ErrorAction SilentlyContinue
docker compose up -d
mvn -B test
mvn -B spring-boot:run
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing
```

## Do the lab

Complete **[LAB-39-GUIDE.md](LAB-39-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` for `~/java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Project under `examples\lab39-crm` | Pass / Fail |
| 2 | Flyway V1 + `ddl-auto=validate` | Pass / Fail |
| 3 | `mvn -B test` IT green on PostgreSQL | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
