# Lab 37 starter — timed path (~45 minutes)

**Theme:** PostgreSQL design — schema, constraints, seeds

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Tables+constraints · Amina/Ravi seed · negative check |
| **Hard gate** | Pre-lab Pass · compose/shared Postgres · `.env` secrets |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab37-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab37-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab37-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab37-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab37-crm
cp -R starter/. ~/java-bootcamp/examples/lab37-crm/
cd ~/java-bootcamp/examples/lab37-crm
```

## 45-minute checklist

- [ ] Start PostgreSQL (`compose.yaml`) or use shared instance
- [ ] Fill `01_create_user.sql` / `02_schema.sql` (customers, accounts, indexes)
- [ ] Complete seed for CUS-1001 ACTIVE + account; CUS-1002 PROSPECT
- [ ] Run verify + one negative check (duplicate email or bad status)
- [ ] Document decisions in `database/design-decisions.md`

## Smoke test

```bash
docker compose up -d
# then apply SQL with psql against crm DB (see GUIDE)
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Tables + named constraints exist | Pass / Fail |
| Seed SELECTs show Amina/Ravi | Pass / Fail |
| Negative constraint check fails as expected | Pass / Fail |
| Passwords only in .env (not Git) | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Name already exists | Run drop script before recreate |
| FK violation on seed | Insert CUSTOMER before ACCOUNT |
| Cannot connect | Check compose port / shared host sheet |
| Secrets in Git | Keep passwords in `.env` only |
