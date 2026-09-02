# Lab 40 starter — timed path (~45 minutes)

**Theme:** AppSec — OWASP Dependency-Check, triage, remediation stubs

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | security-scan profile · CSV triage · residual risk |
| **Hard gate** | Pre-lab Pass · Lab 39 CRM merge target |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy your **Lab 39 CRM** into `examples/lab40-crm` first, then overlay this `starter/` (docs, suppressions, `pom-security-scan-snippet.xml`). Merge the snippet into `pom.xml` — do not replace the whole POM with the snippet file.

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\lab40-crm"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force "..\..\..\Week 4 - Kafka, Angular, Oracle and Resilience\module-39\lab39\starter\*" $dest
Copy-Item -Recurse -Force ".\starter\*" $dest
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab40-crm
cp -R ../../../Week\ 4\ -\ Kafka,\ Angular,\ Oracle\ and\ Resilience/module-39/lab39/starter/. ~/java-bootcamp/examples/lab40-crm/
cp -R starter/. ~/java-bootcamp/examples/lab40-crm/
cd ~/java-bootcamp/examples/lab40-crm
```

## 45-minute checklist

- [ ] Merge `pom-security-scan-snippet.xml` into your CRM `pom.xml` (`-Psecurity-scan`)
- [ ] Use isolated Postgres **`crm_lab40`** (`starter/compose.yaml` overlay)
- [ ] Complete `dependency-check-suppressions.xml` policy header (CVE / owner / expiry)
- [ ] Fill `docs/threat-checklist.md` (OWASP-aligned surfaces for CRM)
- [ ] Run Dependency-Check once; triage one finding into `docs/security-findings.csv`
- [ ] Draft residual risks in `docs/security-assessment.md` (no secrets)

## Smoke test

```bash
# From your CRM project root after merging the profile:
./mvnw -B -Psecurity-scan dependency-check:check
# or: mvn -B -Psecurity-scan dependency-check:check
```

Evidence under `~/java-bootcamp/notes/lab-40/` (sanitize HTML/JSON reports).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `-Psecurity-scan` profile present with pinned plugin version | Pass / Fail |
| Suppressions file exists with policy note | Pass / Fail |
| At least one CSV row with classification | Pass / Fail |
| Assessment names residual risk + owner | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| NVD download slow/fails | Instructor cache; API key in env |
| Unpinned plugin | Pin dependency-check.version |
| Build red only on scan | Triage/fix — keep the profile |
| Bulky HTML in Git | gitignore; keep JSON/CSV excerpts |
