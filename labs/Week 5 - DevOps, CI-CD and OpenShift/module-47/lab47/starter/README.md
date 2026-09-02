# Lab 47 starter — timed path (~45 minutes)

**Theme:** PR / peer-review / stakeholder / incident communication templates

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | shared facts · 4 files · consistency · secrecy scrub · peer rewrites |
| **Hard gate** | Pre-lab Pass · fact base first |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab47-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab47-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab47-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab47-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab47-crm
cp -R starter/. ~/java-bootcamp/examples/lab47-crm/
cd ~/java-bootcamp/examples/lab47-crm
```

## 45-minute checklist

- [ ] Fill `communications/shared-facts.md` (one consistent fact base)
- [ ] Complete incident update, PR description, stakeholder email, peer review
- [ ] Scrub secrets / real emails from all four artifacts
- [ ] Align severity, impact, and next update across docs
- [ ] Optional: link Labs 43–46 evidence paths

## Smoke test

```bash
# Consistency check — same version / severity / fixture IDs in every file:
# rg -n "1\\.4\\.0|CUS-1001|severity|TODO\\(lab47\\)" communications/
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Shared facts used consistently | Pass / Fail |
| Four communication files complete | Pass / Fail |
| No secrets or real customer data | Pass / Fail |
| Peer review has concrete rewrite notes | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Severity mismatch across files | Rebuild `shared-facts.md`; re-copy fields |
| Empty peer review | Add ≥2 concrete rewrite notes |
| Secret/token in markdown | Delete; rotate if real |
| Stakeholder email too technical | Rewrite impact in plain language |
