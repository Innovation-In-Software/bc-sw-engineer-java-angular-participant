# Lab 11: GitHub Copilot for Testing and Refactoring — Northstar CRM — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-11-GUIDE.md](LAB-11-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-11-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: Lab 11 `starter/` → `examples\lab11-crm` (or copy `lab10-crm` → `lab11-crm`). Mockito (`mockito-core` + `mockito-junit-jupiter` **5.11.0**, test scope); `CustomerNotifier.notifyStatusChange` + `validateCustomerId`; tests `CustomerTest` (2) / `CustomerServiceTest` (5) / `CustomerNotifierMockTest` (1); notes `copilot-notes\ai-test-refactor-notes.md`. `mvn clean test` → **Tests run: 8**, Failures: 0 · **BUILD SUCCESS** (twice, deterministic). `Main` still shows `CUS-1001` ACTIVE + `CUS-1002` PROSPECT → ACTIVE. Skipping notifier → Mockito **Wanted but not invoked**. JDK 21 may log Byte Buddy dynamic-agent warnings during Mockito — ignore if Surefire is green. Instructor walkthrough: `docs/instructor-participant-help/week-2/11-testing-exercises-and-lab11.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab11-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab11-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab10-crm lab11-crm   # once
cd lab11-crm
mvn -q clean test
# Expected: Tests run: 8, Failures: 0 (2 entity + 5 service + 1 Mockito) — BUILD SUCCESS
mvn -q -DskipTests compile
java -cp target\classes com.northstar.crm.Main
```


## Do the lab

Complete every step in **[LAB-11-GUIDE.md](LAB-11-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab11-crm` as in [LAB-11-GUIDE.md](LAB-11-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |

