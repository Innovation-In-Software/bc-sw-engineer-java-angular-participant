# Lab 39 starter — timed path (~45 minutes)

**Theme:** Spring Data JPA + Flyway + PostgreSQL

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Flyway · @Version · 409 · Postgres IT |
| **Hard gate** | Pre-lab Pass · `.env` · compose/shared Postgres |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab39-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab39-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab39-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab39-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab39-crm
cp -R starter/. ~/java-bootcamp/examples/lab39-crm/
cd ~/java-bootcamp/examples/lab39-crm
```

## 45-minute checklist

- [ ] Start PostgreSQL; copy `.env.example` → `.env`
- [ ] Complete `V1__crm_schema.sql` aligned with Lab 37/38 columns
- [ ] Map `CustomerEntity` / `AccountEntity` with `@Version`
- [ ] Implement repository + transactional service + bounded paging
- [ ] Run `mvn -B test` (IT against PostgreSQL — not H2-as-Postgres)

## Smoke test

```bash
docker compose up -d
mvn -B test
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Flyway applies V1 on startup/test | Pass / Fail |
| Create CUS-1001 path works | Pass / Fail |
| Duplicate email → 409 mapping | Pass / Fail |
| CustomerRepositoryIT green | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Flyway checksum | Add V2; avoid editing applied V1 |
| LazyInitializationException | Fetch inside TX / join fetch |
| IT on H2 only | Force PostgreSQL / Testcontainers |
| Duplicate → 500 | Map integrity violation to 409 |
