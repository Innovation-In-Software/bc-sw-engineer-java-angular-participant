# Lab 40: Application Security Testing for the CRM — Dependency-Check, SAST, Remediation — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Docker PostgreSQL · OWASP Dependency-Check · IntelliJ  
**Full lab steps:** [LAB-40-GUIDE.md](LAB-40-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-40-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab40-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab40-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab40-crm
mvn -B test
mvn -B test "-Dtest=ObjectOwnershipSecurityTest"
mvn -B -Psecurity-scan dependency-check:check "-DdataDirectory=$pwd\dependency-check-data"
mvn -B clean verify
```

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, Dependency-Check **10.0.4**, PostgreSQL 16.14 in `crm-postgres`:

- Copy Lab 39 into `examples\lab40-crm` and use an isolated database **`crm_lab40`** (do not Flyway-migrate Lab 37/38 `crm` or Lab 39 `crm_lab39`).
- Quote Maven `-D…` in PowerShell (`"-Dtest=…"`). Unquoted `-Dtest=` is parsed as a lifecycle phase.
- First NVD populate **without** `NVD_API_KEY` downloaded 376,016 records and took **~36 minutes**. Do not kill mid-update. Later runs reuse `dependency-check-data\` (~45–55 s).
- Plugin 10.0.4 logged non-fatal `URL CHARACTER VARYING(1000)` errors on CVE-2026-6785 / CVE-2026-6786; the HTML/JSON reports still wrote.
- Sonatype OSS Index returned “Invalid credentials”; the profile can set `<ossindexAnalyzerEnabled>false</ossindexAnalyzerEnabled>` and still gate on NVD.
- Spring Boot **3.3.5** (Lab 39 parent) failed `failBuildOnCVSS=7` with **70** High/Critical rows (Tomcat 10.1.31, Spring 6.1.14, …). Last OSS 3.x parent **3.5.16** plus `tomcat.version=10.1.57` cleared reachable Highs. Do **not** lower `failBuildOnCVSS` to greenwash. CLI `-DfailBuildOnCVSS=1` does **not** override the profile XML — edit the pom, observe, restore **7**.
- HTML report is ~1 MB — keep it under `target\` / gitignore; commit CSV + sanitized excerpts under `notes\lab-40\`.

### If it fails

| Symptom | Fix |
| ------- | --- |
| NVD download extremely slow | Expected without an API key; wait. Put the key in the environment only. |
| Scan fails only on CVSS ≥ 7 | Triage/fix or time-bounded suppression — keep the profile. |
| PowerShell eats `-Dtest=` | Quote the whole `-D…` argument. |
| IT talks to the wrong database | Point datasource at `crm_lab40`, not `crm` / `crm_lab39`. |


## Do the lab

Complete every step in **[LAB-40-GUIDE.md](LAB-40-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab40-crm` as in [LAB-40-GUIDE.md](LAB-40-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
