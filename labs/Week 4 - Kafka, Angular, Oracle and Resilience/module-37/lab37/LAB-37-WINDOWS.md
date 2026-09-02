# Lab 37: PostgreSQL Database Fundamentals — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Docker · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-37-GUIDE.md](LAB-37-GUIDE.md)  
**Other OS:** [macOS guide](LAB-37-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete
- Docker Desktop running; IntelliJ SDK **21**

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab37-crm` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab37-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab37-crm
docker compose up -d
# PowerShell: pipe SQL (no POSIX < redirect)
Get-Content .\database\01_create_user.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\02_schema.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\03_seed.sql -Raw | docker exec -i -e PGPASSWORD=change-me crm-postgres psql -U crm_app -d crm -v ON_ERROR_STOP=1
Get-Content .\database\04_verify.sql -Raw | docker exec -i -e PGPASSWORD=change-me crm-postgres psql -U crm_app -d crm -v ON_ERROR_STOP=1
```

## Do the lab

Complete every step in **[LAB-37-GUIDE.md](LAB-37-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` wherever the GUIDE shows `~/java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace open; project under `examples\lab37-crm` | Pass / Fail |
| 2 | Schema + seeds for CUS-1001 / CUS-1002 | Pass / Fail |
| 3 | Negative constraint proof | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
