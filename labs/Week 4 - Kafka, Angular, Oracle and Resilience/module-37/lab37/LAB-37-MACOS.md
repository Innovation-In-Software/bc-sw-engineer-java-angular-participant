# Lab 37: PostgreSQL Database Fundamentals — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Docker · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-37-GUIDE.md](LAB-37-GUIDE.md)  
**Other OS:** [Windows guide](LAB-37-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete
- Docker running; IntelliJ SDK **21**

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab37-crm` |

```bash
cd ~/java-bootcamp
cd examples/lab37-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab37-crm
docker compose up -d
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/01_create_user.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/02_schema.sql
docker exec -i -e PGPASSWORD=change-me crm-postgres psql -U crm_app -d crm -v ON_ERROR_STOP=1 < database/03_seed.sql
docker exec -i -e PGPASSWORD=change-me crm-postgres psql -U crm_app -d crm -v ON_ERROR_STOP=1 < database/04_verify.sql
```

## Do the lab

Complete every step in **[LAB-37-GUIDE.md](LAB-37-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace open; project under `examples/lab37-crm` | Pass / Fail |
| 2 | Schema + seeds for CUS-1001 / CUS-1002 | Pass / Fail |
| 3 | Negative constraint proof | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
