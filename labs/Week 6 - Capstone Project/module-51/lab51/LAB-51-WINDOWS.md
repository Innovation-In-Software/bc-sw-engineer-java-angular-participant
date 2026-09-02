# Lab 51: Capstone Security, CI/CD and Deployment — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code · GitHub web UI  
**Shell:** Windows PowerShell  
**Stack hint:** GitHub Actions · Angular · Maven · OpenShift `oc` · digest promote  
**Full lab steps:** [LAB-51-GUIDE.md](LAB-51-GUIDE.md)  
**Other OS:** [macOS guide](LAB-51-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- Labs 48–50 planning/code available; GitHub repo with Actions enabled (for a live run)
- Node.js LTS; JDK 21; `gh` optional
- `npx ng` (CLI need not be global). `oc` is **not** required on the laptop.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab51-capstone` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab51-capstone
```

Merge `.github/` into `lab50-capstone` if that monorepo already holds `frontend/` and `backend/`.

### Commands this lab typically uses

```powershell
Select-String -Path .github\workflows\*.yml -Pattern 'npx ng build|mvn -B clean verify|oc set image|environment:'
Select-String -Path .github\workflows\capstone-cd.yml -Pattern 'mvn .*package'
```

Verified on this laptop (2026-08-28): **no local OpenShift** (instructor-hosted Project). Timed-path Pass is workflow + runbook lint. Live `oc set image` / Route smoke is homework. Do **not** rebuild with `mvn package` on the CD job. Do **not** substitute k3s/`kubectl`. Bitbucket is comparison-only.

Optional local mirrors (Lab 50 tree): `npx ng build --configuration=production` in `frontend/`; `mvn -B test` in `backend/` against PostgreSQL.

## Do the lab

Complete **[LAB-51-GUIDE.md](LAB-51-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` for `~/java-bootcamp`.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workflows under `.github\workflows\` | Pass / Fail |
| 2 | GUIDE deliverables complete | Pass / Fail |
