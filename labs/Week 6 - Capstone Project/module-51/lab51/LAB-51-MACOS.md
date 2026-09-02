# Lab 51: Capstone Security, CI/CD and Deployment — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code · GitHub web UI  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** GitHub Actions · Angular · Maven · OpenShift `oc` · digest promote  
**Full lab steps:** [LAB-51-GUIDE.md](LAB-51-GUIDE.md)  
**Other OS:** [Windows guide](LAB-51-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- Labs 48–50 planning/code available; GitHub repo with Actions enabled (for a live run)
- Node.js LTS; JDK 21; `gh` optional
- `npx ng` (CLI need not be global). `oc` is **not** required on the laptop.

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab51-capstone` |

```bash
cd ~/java-bootcamp
cd examples/lab51-capstone
```

Merge `.github/` into `lab50-capstone` if that monorepo already holds `frontend/` and `backend/`.

### Commands this lab typically uses

```bash
grep -E 'npx ng build|mvn -B clean verify|oc set image|environment:' .github/workflows/*.yml
grep -E 'mvn .*package' .github/workflows/capstone-cd.yml || true
```

## Do the lab

Complete **[LAB-51-GUIDE.md](LAB-51-GUIDE.md)**.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workflows under `.github/workflows/` | Pass / Fail |
| 2 | GUIDE deliverables complete | Pass / Fail |
