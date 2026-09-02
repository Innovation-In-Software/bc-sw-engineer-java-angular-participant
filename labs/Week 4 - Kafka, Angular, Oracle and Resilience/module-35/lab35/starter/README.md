# Lab 35 starter — timed path (~45 minutes)

**Theme:** HttpClient + typed Customer API + CORS to Spring Boot REST

## Activity card

| | |
| --- | --- |
| **Objective** | Load CUS-1001 / CUS-1002 from Boot into Angular |
| **Skills practiced** | HttpClient, DTO types, env base URL, CORS |
| **Expected outcome** | Network JSON list · integration notes · no SOAP |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab35-crm-ui/` + `examples/lab35-crm-api/` |

Full steps: [`../LAB-35-GUIDE.md`](../LAB-35-GUIDE.md)

## Copy into your workspace

This folder is a complete Angular 19 app (Lab 34 Signals UI plus HttpClient TODOs). The Boot API lives in [`../crm-api/`](../crm-api/README.md).

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab35-crm-ui","$env:USERPROFILE\java-bootcamp\examples\lab35-crm-api" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab35-crm-ui\"
Copy-Item -Recurse -Force ".\crm-api\*" "$env:USERPROFILE\java-bootcamp\examples\lab35-crm-api\"
cd $env:USERPROFILE\java-bootcamp\examples\lab35-crm-ui
npm install
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab35-crm-ui ~/java-bootcamp/examples/lab35-crm-api
cp -R starter/. ~/java-bootcamp/examples/lab35-crm-ui/
cp -R crm-api/. ~/java-bootcamp/examples/lab35-crm-api/
cd ~/java-bootcamp/examples/lab35-crm-ui
npm install
```

Start the API **before** the UI smoke test:

```bash
cd ~/java-bootcamp/examples/lab35-crm-api   # or %USERPROFILE%\java-bootcamp\examples\lab35-crm-api
mvn -B spring-boot:run
```

## 45-minute checklist

- [ ] `provideHttpClient(withInterceptors([correlationInterceptor]))` in `app.config.ts`
- [ ] `environment.apiBaseUrl = 'http://localhost:8080'`
- [ ] `CustomerApiService` with typed `getAll` / `getById` / `create`
- [ ] List page uses API (not `SEED_CUSTOMERS`) — shows Amina + Ravi
- [ ] CORS enabled on Boot for `http://localhost:4200` (already on the course API)
- [ ] `docs/integration-notes.md` — Angular → Spring Boot → PostgreSQL

## Smoke test

```bash
curl -s http://localhost:8080/api/customers/CUS-1001
npx ng serve --open
# DevTools Network: GET /api/customers returns JSON array
npx ng build
```

On Windows without `curl`, use `Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing`.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| GET list/detail via HttpClient | Pass / Fail |
| CUS-1001 and CUS-1002 visible from API data | Pass / Fail |
| CORS working | Pass / Fail |
| Environment base URL used | Pass / Fail |
| Integration notes present | Pass / Fail |
