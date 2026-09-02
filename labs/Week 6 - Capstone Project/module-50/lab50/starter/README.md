# Lab 50 starter — timed path (~45 minutes)

**Theme:** Angular feature + JWT interceptor + PostgreSQL persistence smoke

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Route + service TODO · interceptor · migration TODO · one CRUD smoke |
| **Hard gate** | Pre-lab Pass · Lab 48/49 inputs · Node + PostgreSQL |

**Target:** `%USERPROFILE%\java-bootcamp\examples\lab50-capstone`

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

Capstone teams with an existing `customer-management-platform` monorepo may copy `frontend/` and `backend/` into that repo.

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab50-capstone" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab50-capstone\"
cd $env:USERPROFILE\java-bootcamp\examples\lab50-capstone
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab50-capstone
cp -R starter/. ~/java-bootcamp/examples/lab50-capstone/
cd ~/java-bootcamp/examples/lab50-capstone
```

## 45-minute checklist

- [ ] Fill `auth.interceptor.ts` Bearer TODO
- [ ] Fill `InteractionApiService` HttpClient TODOs
- [ ] Fill `InteractionService` persist/list TODOs
- [ ] Confirm Flyway `V1__crm_schema.sql` (PostgreSQL, not Oracle)
- [ ] Smoke create/list for `CUS-1001`
- [ ] Start `docs/frontend-persistence-demo.md` outline

## Smoke test

```powershell
Copy-Item .env.example .env -ErrorAction SilentlyContinue
docker compose -p lab50verify up -d
cd backend; mvn -B test
cd ..\frontend; npx ng build
```

`ng` is not required on PATH — use `npx ng`. Angular UI is Lab 50; OpenShift deploy is Lab 51.

Evidence under `notes/lab-50/`.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Angular route reaches interactions UI | Pass / Fail |
| HttpClient call authenticated via interceptor | Pass / Fail |
| PostgreSQL row exists after create (or documented seed+read) | Pass / Fail |
| Demo doc outline started | Pass / Fail |

Continue remaining GUIDE steps as homework / multi-day.
