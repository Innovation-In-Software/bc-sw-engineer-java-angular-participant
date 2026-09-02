# Lab 32 starter — timed path (~45 minutes)

**Theme:** Resilience4j — retry, circuit breaker, time limiter

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | available=true · fallback false · OPEN/timeout tests |
| **Hard gate** | Pre-lab Pass · instance `accountProfile` |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab32-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab32-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab32-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab32-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab32-crm
cp -R starter/. ~/java-bootcamp/examples/lab32-crm/
cd ~/java-bootcamp/examples/lab32-crm
```

## 45-minute checklist

- [ ] Review `application.yml` Resilience4j instances named `accountProfile`
- [ ] Annotate `AccountProfileService.find` (CB + Retry + TimeLimiter)
- [ ] Implement truthful `fallback` → `AccountSummary.unavailable`
- [ ] Complete WireMock-based `AccountProfileResilienceTest` scenarios
- [ ] Run `mvn -B test`; note OPEN fails-fast behavior

## Smoke test

```bash
mvn -B test
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Healthy stub returns available=true for CUS-1001 | Pass / Fail |
| Fallback returns available=false (not fake success) | Pass / Fail |
| OPEN / timeout scenarios covered in test | Pass / Fail |
| resilience-notes.md mentions instance name accountProfile | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Annotations ignored | Add starter-aop; avoid self-invocation |
| TimeLimiter no effect | Return CompletableFuture |
| CB never opens | Match instance name `accountProfile` |
| Fake success | Fallback must set available=false |
