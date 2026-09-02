# Lab 38: SQL and Query Performance with PostgreSQL — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Docker · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-38-GUIDE.md](LAB-38-GUIDE.md)  
**Other OS:** [Windows guide](LAB-38-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- Lab 37 schema available; Docker running
- IntelliJ SDK **21**

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab38-crm` |

```bash
cd ~/java-bootcamp
cd examples/lab38-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab38-crm
cp -n .env.example .env 2>/dev/null || true
docker compose up -d
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/01_create_user.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/02_schema.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/03_seed.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 \
  < database/performance/01_generate_data.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 \
  < database/performance/02_baseline.sql
# then 03_indexes.sql → 04_optimized.sql; paste EXPLAIN into report.md
```

## Do the lab

Complete **[LAB-38-GUIDE.md](LAB-38-GUIDE.md)**.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Project under `examples/lab38-crm` | Pass / Fail |
| 2 | Baseline + after-index EXPLAIN captured | Pass / Fail |
| 3 | Keyset vs OFFSET noted in report | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
