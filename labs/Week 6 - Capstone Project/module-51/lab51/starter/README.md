# Lab 51 starter — timed path (~45 minutes)

**Theme:** Fullstack GitHub Actions gates + OpenShift deploy discipline

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | PR workflow TODOs · Angular npm job · Maven verify · secrets hygiene notes |
| **Hard gate** | Lab 50 tree or this stub · GitHub Actions enabled |

**Target:** `%USERPROFILE%\java-bootcamp\examples\lab51-capstone`

Prefer merging `.github/` + `docs/` into your Lab 50 `lab50-capstone` monorepo if that tree already has `frontend/` and `backend/`.

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab51-capstone" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab51-capstone\"
cd $env:USERPROFILE\java-bootcamp\examples\lab51-capstone
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab51-capstone
cp -R starter/. ~/java-bootcamp/examples/lab51-capstone/
cd ~/java-bootcamp/examples/lab51-capstone
```

## 45-minute checklist

- [ ] Complete `.github/workflows/capstone-ci.yml` TODOs (PR triggers, jobs)
- [ ] Angular job: `npm ci` + `npx ng build`
- [ ] Backend job: `mvn -B clean verify` (postgres service)
- [ ] Fill `capstone-cd.yml` `oc set image` (no Maven package)
- [ ] Document secret **names** only in `docs/capstone-cicd-runbook.md`
- [ ] Push a branch when a GitHub repo is available; capture Actions screenshot (redact)

## Smoke test (laptop, no cluster)

```powershell
Select-String -Path .github\workflows\*.yml -Pattern 'npx ng build|mvn -B clean verify|oc set image'
```

GitHub only auto-runs workflows from the **repository root**.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Workflow YAML defines Angular and Maven jobs | Pass / Fail |
| CD promote does not rebuild with Maven | Pass / Fail |
| No secrets hardcoded in YAML | Pass / Fail |
| Runbook smoke/rollback section outlined | Pass / Fail |

Continue remaining GUIDE steps as homework / multi-day.
