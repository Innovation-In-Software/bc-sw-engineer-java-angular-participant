# Lab 44 starter — timed path (~45 minutes)

**Theme:** CD pipeline sketch — promote immutable artifact, gates, rollback

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | manifest identity · plan/checklist · rollback digest · no plaintext secrets |
| **Hard gate** | Pre-lab Pass · Lab 43 digest |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy your **Lab 43 CRM** into `examples/lab44-crm` first, then overlay this `starter/` (manifest, `docs/`, `.github/workflows/cd.yml`).

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\lab44-crm"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force "$env:USERPROFILE\java-bootcamp\examples\lab43-crm\*" $dest
Copy-Item -Recurse -Force ".\starter\*" $dest
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab44-crm
cp -R ~/java-bootcamp/examples/lab43-crm/. ~/java-bootcamp/examples/lab44-crm/
cp -R starter/. ~/java-bootcamp/examples/lab44-crm/
cd ~/java-bootcamp/examples/lab44-crm
```

## 45-minute checklist

- [ ] Fill `artifact-manifest.json` with commit + SHA-256 / image digest (no secrets)
- [ ] Complete `docs/release-plan.md` (test → staging → prod gates)
- [ ] Draft `docs/release-checklist.md` go/no-go items
- [ ] Write `docs/rollback-runbook.md` naming known-good digest
- [ ] Sketch CD workflow TODOs in `.github/workflows/cd.yml`

## Smoke test

```bash
# Validate JSON shape:
# python -c "import json; json.load(open('artifact-manifest.json'))"
# Or PowerShell:
# Get-Content artifact-manifest.json | ConvertFrom-Json | Out-Null
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Manifest has immutable identity fields | Pass / Fail |
| Release plan separates env config from artifact | Pass / Fail |
| Rollback names known-good digest | Pass / Fail |
| CD workflow has no plaintext deploy secrets | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Invalid JSON manifest | Fix commas/quotes; validate with ConvertFrom-Json |
| Only :latest in manifest | Paste Lab 43 SHA-256 / image digest |
| Rollback with no prior digest | Add priorKnownGoodDigest before promote |
| Secrets in cd.yml | Use Actions secrets / env vars |
