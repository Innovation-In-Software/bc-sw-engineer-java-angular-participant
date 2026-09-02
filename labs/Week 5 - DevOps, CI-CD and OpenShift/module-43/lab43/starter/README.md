# Lab 43 starter — timed path (~45 minutes)

**Theme:** GitHub Actions CI — verify, reports, package-once checksum

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | triggers · no skipTests · package SHA · secrets location in runbook |
| **Hard gate** | Pre-lab Pass · local Maven verify |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy your **Lab 41 CRM** into `examples/lab43-crm` first, then overlay this `starter/` (`.github/workflows/ci.yml`, `docs/ci-runbook.md`).

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\lab43-crm"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force "..\..\module-41\lab41\starter\*" $dest
Copy-Item -Recurse -Force ".\starter\*" $dest
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab43-crm
cp -R ../../module-41/lab41/starter/. ~/java-bootcamp/examples/lab43-crm/
cp -R starter/. ~/java-bootcamp/examples/lab43-crm/
cd ~/java-bootcamp/examples/lab43-crm
```

## 45-minute checklist

- [ ] Complete TODOs in `.github/workflows/ci.yml` (PR vs main/tag gates)
- [ ] Wire Maven cache + `clean verify` (no silent `-DskipTests` on verify)
- [ ] Upload Surefire reports; package-once JAR + SHA-256 on main/tags
- [ ] Optional: add `-Psecurity-scan` step (document residual risk if skipped)
- [ ] Fill `docs/ci-runbook.md` (rerun policy, secrets location)

## Smoke test

```bash
# Local YAML sanity (optional):
# actionlint .github/workflows/ci.yml
# Push to a branch with Actions enabled and open a PR — expect verify green/red with reports.
```

Evidence under `~/java-bootcamp/notes/lab-43/` (redact tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Workflow triggers on PR and push | Pass / Fail |
| Verify job runs without skipTests | Pass / Fail |
| Package job gated to main/tags | Pass / Fail |
| Runbook explains secret storage | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Workflow never runs | Enable Actions; check `on:` events |
| Verify skips tests | Remove `-DskipTests` |
| Package on every PR | Gate package job to main/tags |
| Token in YAML | Move to Actions secrets |
