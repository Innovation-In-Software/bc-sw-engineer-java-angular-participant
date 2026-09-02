# Lab 28 starter — timed path (~45 minutes)

**Theme:** SecurityFilterChain + JWT — AGENT/ADMIN CRM API protection

## Activity card

| | |
| --- | --- |
| **Objective** | Complete JWT/filter TODOs and prove 401 vs 403 vs 200 |
| **Skills practiced** | SecurityFilterChain, JwtService, role matchers, security notes |
| **Expected outcome** | Login token · Bearer CUS-1001 · agent admin 403 · no secrets in Git |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab28-crm/` copied from this starter |

**Boilerplate reduced:** Security stubs + `// TODO` — keep prior CRM layering.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-28-GUIDE.md`](../LAB-28-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab28-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab28-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab28-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab28-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab28-crm
cp -R starter/. ~/java-bootcamp/examples/lab28-crm/
cd ~/java-bootcamp/examples/lab28-crm
```

Full GUIDE: [`../LAB-28-GUIDE.md`](../LAB-28-GUIDE.md)

## 45-minute checklist

- [ ] Complete `SecurityFilterChain` matchers (login + health + `/error` permitAll; AGENT customers; ADMIN admin)
- [ ] Fill `JwtService` lab stub (`lab.subject.role.sig`) — real `eyJ` HS256 is full-path optional
- [ ] Wire `JwtAuthenticationFilter` into the chain; login returns `{accessToken, tokenType}`
- [ ] Prove login → Bearer GET CUS-1001; missing token → 401; agent on admin → 403
- [ ] Add `SecurityPathTest` (**Tests run: 3**) — starter ships failing TODO test stubs
- [ ] Note IdP/key-rotation in docs/security-notes.md (`JWT_SECRET`)

## Smoke test

```bash
# After adding SecurityPathTest:
mvn -B test
# Tests run: 3
mvn -B spring-boot:run
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| SecurityFilterChain bean present and stateless | Pass / Fail |
| Login endpoint issues a token stub | Pass / Fail |
| 401 vs 403 distinguished in notes or tests | Pass / Fail |
| Bearer GET CUS-1001 works for AGENT (or documented) | Pass / Fail |
| No real secrets committed | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
