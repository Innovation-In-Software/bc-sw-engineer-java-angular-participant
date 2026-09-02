# Lab 19: Integration Testing and UI Test Automation — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Angular · PostgreSQL test strategy · Chrome · GitHub Actions  
**Full lab steps:** [LAB-19-GUIDE.md](LAB-19-GUIDE.md)  
**Other OS:** [macOS guide](LAB-19-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete
- IntelliJ **Project SDK 21**; Node LTS; Chrome/Chromium
- Docker Desktop optional (Testcontainers PostgreSQL)

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab19-crm` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab19-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
mvn -B test "-Dtest=CustomerApiIT"
# UI (separate terminals): ng serve --port 4200
mvn -B test "-Dtest=CustomerUiSeleniumIT"
```

## Do the lab

Complete **[LAB-19-GUIDE.md](LAB-19-GUIDE.md)**. Map `~/java-bootcamp` → `%USERPROFILE%\java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace open with SDK **21** | Pass / Fail |
| 2 | Project under `examples/lab19-crm` | Pass / Fail |
| 3 | GUIDE checkpoints complete | Pass / Fail |
| 4 | API IT and/or Selenium commands succeed as specified | Pass / Fail |
