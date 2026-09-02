# Lab 36 starter — timed path (~45 minutes)

**Theme:** Memory JWT session · auth interceptor · guarded customer routes · security notes

## Activity card

| | |
| --- | --- |
| **Objective** | Protect CRM UI calls without localStorage-as-best-practice |
| **Skills practiced** | Auth service, interceptor, CanActivate, XSS/CSRF notes |
| **Expected outcome** | Redirect → login → Authorization header → Amina/Ravi list |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab36-crm-ui/` + `examples/lab36-crm-api/` |

Full steps: [`../LAB-36-GUIDE.md`](../LAB-36-GUIDE.md)

## Copy into your workspace

This folder is a complete Angular 19 app (Lab 35 HttpClient UI plus auth TODOs). The Boot API lives in [`../crm-api/`](../crm-api/README.md) and requires `Authorization: Bearer lab-demo-token`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab36-crm-ui","$env:USERPROFILE\java-bootcamp\examples\lab36-crm-api" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab36-crm-ui\"
Copy-Item -Recurse -Force ".\crm-api\*" "$env:USERPROFILE\java-bootcamp\examples\lab36-crm-api\"
cd $env:USERPROFILE\java-bootcamp\examples\lab36-crm-ui
npm install
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab36-crm-ui ~/java-bootcamp/examples/lab36-crm-api
cp -R starter/. ~/java-bootcamp/examples/lab36-crm-ui/
cp -R crm-api/. ~/java-bootcamp/examples/lab36-crm-api/
cd ~/java-bootcamp/examples/lab36-crm-ui
npm install
```

Start the API **before** the UI smoke test:

```bash
cd ~/java-bootcamp/examples/lab36-crm-api
mvn -B spring-boot:run
```

## 45-minute checklist

- [ ] `AuthSessionService` with in-memory `accessToken` Signal
- [ ] Mock login sets `lab-demo-token`; logout clears it (**no** graded localStorage JWT)
- [ ] `authInterceptor` adds `Authorization: Bearer …` for the API origin only
- [ ] `authGuard` on `/customers`; `/login` public
- [ ] After login, list shows CUS-1001 / CUS-1002
- [ ] `docs/security-notes.md` — XSS, CSRF, memory/httpOnly preference, headers

## Smoke test

```bash
npx ng serve --open
# Cold open /customers → login → authorized Network call
npx ng build
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Guard redirects when logged out | Pass / Fail |
| Interceptor attaches Bearer token | Pass / Fail |
| Token not taught as localStorage best practice | Pass / Fail |
| Security notes complete | Pass / Fail |
| Seeded customers visible when authenticated | Pass / Fail |
