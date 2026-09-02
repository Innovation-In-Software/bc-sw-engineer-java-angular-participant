# Lab 34: State and Event Management in Angular — Windows

**OS:** Windows  
**Primary IDE:** VS Code  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** Windows PowerShell  
**Stack hint:** Node 20 · Angular Signals · Reactive Forms · RxJS contrast  
**Full lab steps:** [LAB-34-GUIDE.md](LAB-34-GUIDE.md)  
**Other OS:** [macOS guide](LAB-34-MACOS.md)

## Prerequisites (Windows)

- Lab 33 preferred (`lab33-crm-ui`) or fresh CLI app
- Node.js **20 LTS** on PATH

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab34-crm-ui` |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Copy from Lab 33 if present:
Copy-Item -Recurse -Force examples\lab33-crm-ui examples\lab34-crm-ui -ErrorAction SilentlyContinue
cd examples\lab34-crm-ui
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab34-crm-ui
npx ng serve --open
# Filter ACTIVE → Amina only; PROSPECT → Ravi only; empty filter experiment
npx ng build
```

## Do the lab

Complete **[LAB-34-GUIDE.md](LAB-34-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` wherever the GUIDE shows `~/java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `examples/lab34-crm-ui` exists | Pass / Fail |
| 2 | Signals + computed filter show CUS-1001 / CUS-1002 correctly | Pass / Fail |
| 3 | Loading and empty or error UI proven | Pass / Fail |
| 4 | `docs/state-notes.md` present | Pass / Fail |
