# Lab 48 starter — timed path (~45 minutes)

**Theme:** Capstone architecture + delivery planning pack (no feature coding)

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Stack diagram · AI plan outline · Actions gates · env strategy · CAP-12 seed |
| **Hard gate** | Pre-lab Pass · docs-first before Lab 49 |

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab48-capstone-plan" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab48-capstone-plan\"
cd $env:USERPROFILE\java-bootcamp\examples\lab48-capstone-plan
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab48-capstone-plan
cp -R starter/. ~/java-bootcamp/examples/lab48-capstone-plan/
cd ~/java-bootcamp/examples/lab48-capstone-plan
```

## 45-minute checklist

- [ ] Complete TODOs in `docs/architecture.md` (Angular → REST → Boot → PostgreSQL; Kafka; OpenShift)
- [ ] Outline `docs/ai-usage-plan.md` and `docs/github-actions-plan.md`
- [ ] Sketch `docs/environment-strategy.md` + Terraform/Ansible bullets
- [ ] Seed `docs/backlog.md` with CAP-12 acceptance
- [ ] Export/screenshot one diagram to `notes/lab-48/`

## Smoke test

```powershell
# From lab48-capstone-plan — files exist and mention PostgreSQL + GitHub Actions + Angular
Get-ChildItem docs
Select-String -Path docs\*.md -Pattern 'PostgreSQL|Angular|GitHub Actions|OpenShift'
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Architecture uses mandatory stack (no Oracle/React/Bitbucket/SOAP path) | Pass / Fail |
| CAP-12 backlog seed present | Pass / Fail |
| Actions plan mentions Angular build/test | Pass / Fail |
| AI plan has verification + forbids | Pass / Fail |

Continue remaining GUIDE steps as homework.
