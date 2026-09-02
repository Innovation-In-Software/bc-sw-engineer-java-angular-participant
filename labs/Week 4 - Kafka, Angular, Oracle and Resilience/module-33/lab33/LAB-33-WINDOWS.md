# Lab 33: Angular Component Architecture — Northstar CRM UI Shell — Windows

**OS:** Windows  
**Primary IDE:** VS Code (Angular Language Service)  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** Windows PowerShell  
**Stack hint:** Node 20 LTS · npm · Angular CLI · standalone components  
**Full lab steps:** [LAB-33-GUIDE.md](LAB-33-GUIDE.md)  
**Other OS:** [macOS guide](LAB-33-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (Git, workspace)
- Node.js **20 LTS** on PATH (`node -v`, `npm -v`)
- VS Code with Angular Language Service recommended

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab33-crm-ui` |
| Shell | Windows PowerShell |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab33-crm-ui
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab33-crm-ui
node -v
npm -v
npx ng version
npx ng serve --open
# Browser: http://localhost:4200 — list shows CUS-1001 Amina Khan, CUS-1002 Ravi Singh
npx ng build
```

Verified intent: standalone smart list page + presentational list item; seeds **CUS-1001** / **CUS-1002**; `docs/component-notes.md`; no React/SOAP/Oracle path.

## Do the lab

Complete every step in **[LAB-33-GUIDE.md](LAB-33-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open; Node 20 available | Pass / Fail |
| 2 | Lab project under `examples/lab33-crm-ui` | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | `ng serve` shows CUS-1001 and CUS-1002 | Pass / Fail |
