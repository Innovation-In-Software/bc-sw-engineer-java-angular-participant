# Lab 48: Capstone Architecture and Planning — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Angular · Spring Boot · PostgreSQL · Kafka · OpenShift · GitHub Actions · Terraform/Ansible  
**Full lab steps:** [LAB-48-GUIDE.md](LAB-48-GUIDE.md)  
**Other OS:** [macOS guide](LAB-48-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- Lab 0 complete; prior week concepts available
- Markdown editor; Mermaid preview optional

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab48-capstone-plan` |

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab48-capstone-plan
Get-ChildItem docs\*.md
Select-String -Path docs\*.md -Pattern 'PostgreSQL|Angular|GitHub Actions|OpenShift|CAP-12'
```

Verified on this laptop (2026-08-28): solution pack hits **Angular**, **PostgreSQL**, **GitHub Actions**, **OpenShift**, and **CAP-12**. Bitbucket/Oracle/React/SOAP appear only as rejected non-goals. Markdown-only — no Maven or cluster required. Do **not** use k3s/`kubectl` as the runtime path.

## Do the lab

Complete **[LAB-48-GUIDE.md](LAB-48-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` wherever the GUIDE shows `~/java-bootcamp`.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Planning pack under `examples\lab48-capstone-plan` | Pass / Fail |
| 2 | GUIDE deliverables complete | Pass / Fail |
