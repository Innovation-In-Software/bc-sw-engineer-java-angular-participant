# Lab 38 starter — timed path (~45 minutes)

**Theme:** SQL performance — plans, indexes, keyset paging

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Baseline EXPLAIN · indexes re-measured · report.md |
| **Hard gate** | Pre-lab Pass · Lab 37 DDL available |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab38-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab38-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab38-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab38-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab38-crm
cp -R starter/. ~/java-bootcamp/examples/lab38-crm/
cd ~/java-bootcamp/examples/lab38-crm
```

## 45-minute checklist

- [ ] Apply `database/ddl/` (Lab 37 tables) if Postgres is empty
- [ ] Complete `01_generate_data.sql` (≥ synthetic customers; keep CUS-1001 / CUS-1002)
- [ ] Capture baseline plan in `02_baseline.sql`; add indexes in `03`
- [ ] Rewrite DATE_TRUNC filters as ranges; implement keyset vs OFFSET
- [ ] Fill `performance/report.md` with plan notes / buffers / time

## Smoke test

```bash
# apply scripts with psql in order 01→05; paste EXPLAIN into report.md
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Baseline EXPLAIN captured before indexes | Pass / Fail |
| Email/status indexes added and re-measured | Pass / Fail |
| Keyset paging script present | Pass / Fail |
| report.md has experiment ids lab38-001+ | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Index not used | Fix sargable predicate; ANALYZE |
| Fixtures missing after load | Re-seed CUS-1001 / CUS-1002 |
| No before plan | Capture baseline before CREATE INDEX |
| Deep OFFSET slow | Implement keyset paging |
