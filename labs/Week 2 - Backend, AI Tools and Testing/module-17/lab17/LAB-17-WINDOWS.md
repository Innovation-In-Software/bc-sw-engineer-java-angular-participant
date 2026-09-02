# Lab 17: JUnit Testing with AI Assistance — Northstar CRM Service Tests — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-17-GUIDE.md](LAB-17-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-17-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: Lab 17 `starter/` → `examples\lab17-crm` (or copy `lab16-crm` → `lab17-crm`). JaCoCo **0.8.12** check on `com.northstar.crm.service` (≥0.80 LINE); completed `CustomerServiceTests` (6) + `GlobalExceptionHandlerTest` (2) + `CustomerValidatorParameterizedTest` (11; ACTIVE→PROSPECT illegal). Two consecutive `mvn -q test` green; `mvn -B clean verify` → **Tests run: 19**, Failures: 0 · **BUILD SUCCESS** (service coverage ≈ **0.97**). Deliberate `minimum=0.99` failed with `lines covered ratio is 0.97, but expected minimum is 0.99`; restored **0.80**. Instructor walkthrough: `docs/instructor-participant-help/week-2/17-junit-exercises-and-lab17.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab17-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab17-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab16-crm lab17-crm   # once
cd lab17-crm
mvn -q test "-Dtest=CustomerServiceTests"
mvn -q test "-Dtest=CustomerValidatorParameterizedTest"
mvn -q test
mvn -B clean verify
```

Verified: **Tests run: 19** (6 + 2 + 11), Failures: 0 · **BUILD SUCCESS**; service LINE coverage ≈ **0.97** (≥ 0.80).

## Do the lab

Complete every step in **[LAB-17-GUIDE.md](LAB-17-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab17-crm` as in [LAB-17-GUIDE.md](LAB-17-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |

