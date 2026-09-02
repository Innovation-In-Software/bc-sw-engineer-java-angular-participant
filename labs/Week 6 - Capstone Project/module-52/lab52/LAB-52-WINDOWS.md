# Lab 52: Capstone Final Defense — Northstar CRM Presentation and Technical Defense — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Angular · REST · PostgreSQL · Kafka · GitHub Actions · OpenShift `oc` · defense markdown  
**Full lab steps:** [LAB-52-GUIDE.md](LAB-52-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-52-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- Labs 48–51 evidence available (gaps labeled)
- IntelliJ or VS Code for Markdown

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab52-capstone` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab52-capstone
```

Capstone teams may copy `defense/` into an existing Lab 50/51 monorepo instead.

### Commands this lab typically uses

```powershell
Get-ChildItem defense\*.md
Select-String -Path defense\*.md -Pattern 'CUS-1001|lab-request-001|401|Angular'
```

Verified on this laptop (2026-08-28): solution pack hits **CUS-1001**, **lab-request-001**, **401**, **Angular**. Markdown-only timed path — no Maven, Docker, or cluster. Do **not** use `kubectl`/k3s. Live `oc` / Route demo is optional homework on the instructor-hosted Project.

## Do the lab

Complete **[LAB-52-GUIDE.md](LAB-52-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` for `~/java-bootcamp`.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Project under `examples\lab52-capstone` | Pass / Fail |
| 2 | GUIDE deliverables / checkpoints complete | Pass / Fail |
