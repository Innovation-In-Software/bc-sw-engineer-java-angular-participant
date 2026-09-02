# Lab 12: Coding Standards and Refactoring — Northstar CRM Cleanup — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-12-GUIDE.md](LAB-12-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-12-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: Lab 12 `starter/` → `examples\lab12-crm` (or copy `lab11-crm` → `lab12-crm` then insert messy baseline). Froze messy `doStuff` baseline as `CustomerService.before.java.txt`; refactored to `createCustomer` / `getCustomer` / `updateStatus` with `Map<String,Customer>`, exception + `lab-request-001` correlation messages, and validation helpers. Evidence under `docs\` (smells, before-after, AI review, standards checklist). `mvn -B clean test` and `mvn -B verify` → **Tests run: 8**, Failures: 0 · **BUILD SUCCESS**. `Main` demo prints create/get/update plus duplicate/unknown failures with correlation ID. Instructor walkthrough: `docs/instructor-participant-help/week-2/12-refactor-exercises-and-lab12.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab12-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab12-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab11-crm lab12-crm   # once
cd lab12-crm
# After refactor:
mvn -B clean test
mvn -B verify
java -cp target\classes com.northstar.crm.Main
```

Verified: **Tests run: 8**, Failures: 0 · **BUILD SUCCESS**. Main shows `CUS-1001` / `CUS-1002` plus `correlationId=lab-request-001` on duplicate/unknown errors.

## Do the lab

Complete every step in **[LAB-12-GUIDE.md](LAB-12-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab12-crm` as in [LAB-12-GUIDE.md](LAB-12-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |

