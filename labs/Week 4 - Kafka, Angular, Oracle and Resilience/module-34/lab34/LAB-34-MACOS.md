# Lab 34: State and Event Management in Angular — macOS

**OS:** macOS  
**Primary IDE:** VS Code  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Node 20 · Angular Signals · Reactive Forms · RxJS contrast  
**Full lab steps:** [LAB-34-GUIDE.md](LAB-34-GUIDE.md)  
**Other OS:** [Windows guide](LAB-34-WINDOWS.md)

## Prerequisites (macOS)

- Lab 33 preferred (`lab33-crm-ui`) or fresh CLI app
- Node.js **20 LTS** on PATH

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab34-crm-ui` |

```bash
cd ~/java-bootcamp
cp -R examples/lab33-crm-ui examples/lab34-crm-ui 2>/dev/null || true
cd examples/lab34-crm-ui
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab34-crm-ui
npx ng serve --open
npx ng build
```

## Do the lab

Complete **[LAB-34-GUIDE.md](LAB-34-GUIDE.md)**.

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
