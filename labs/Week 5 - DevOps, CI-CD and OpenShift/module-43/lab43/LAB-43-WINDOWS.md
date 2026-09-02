# Lab 43: GitHub CI/CD Pipeline for the CRM — Northstar Delivery Gates — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · GitHub Actions · Docker PostgreSQL · IntelliJ  
**Full lab steps:** [LAB-43-GUIDE.md](LAB-43-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-43-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab43-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab43-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab43-crm
docker compose -p lab43verify up -d
mvn -B clean verify
mvn -B "-DskipTests" package
Get-FileHash .\target\lab43-crm-0.0.1-SNAPSHOT.jar -Algorithm SHA256
docker compose -p lab43verify down -v
```

Verified on this laptop (2026-08-28), Temurin 21.0.11, Maven 3.9.9, PostgreSQL 16.14 `crm_lab43`:

- Copy Lab 41 → `lab43-crm`. Isolated DB **`crm_lab43`**. ITs read `SPRING_DATASOURCE_URL` so GitHub Actions can point at a **postgres:16** service.
- `mvn -B test` twice → **Tests run: 7**. Do **not** use `-DskipTests` on verify.
- Package SHA-256 (this laptop): `4B2E02E7E59C5A1648240A2C7672B2BE7E9177F338F6B2FD2A8E41168A8804DD`.
- Workflow file is `examples/lab43-crm/.github/workflows/ci.yml`. GitHub only auto-runs workflows from the **repository root** — promote/copy to a CRM-only repo or add a root workflow with `working-directory` to get a live Actions run.
- Quote Maven `-D…` in PowerShell.

## Do the lab

Complete every step in **[LAB-43-GUIDE.md](LAB-43-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab43-crm` as in [LAB-43-GUIDE.md](LAB-43-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
