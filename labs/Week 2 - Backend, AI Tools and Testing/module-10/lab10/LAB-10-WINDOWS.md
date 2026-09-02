# Lab 10: GitHub Copilot Fundamentals for Java Developers — Northstar CRM — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-10-GUIDE.md](LAB-10-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-10-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Sunday, August 2, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: Lab 10 `starter/` → `examples\lab10-crm` (or full path: copy `lab9-crm` → `lab10-crm`). Filled `CustomerStatus`, plain-Java `Customer` (no JPA), in-memory `CustomerService` (`addCustomer` / `findByCustomerId` / `updateStatus`), `Main` harness, and `copilot-notes\ai-review-notes.md` (`lab10-001`–`lab10-004`). `mvn clean compile` → **BUILD SUCCESS**; `java -cp target\classes com.northstar.crm.Main` prints both sample customers via `findByCustomerId`, then ACTIVE after `updateStatus` on `CUS-1002`. Blank/duplicate/unknown ID rules verified (`IllegalArgumentException` / `IllegalStateException`). Instructor walkthrough: `docs/instructor-participant-help/week-2/10-service-exercises-and-lab10.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab10-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab10-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab9-crm lab10-crm   # once
cd lab10-crm
mvn clean compile
java -cp target\classes com.northstar.crm.Main
Amina: Optional[Customer{customerId='CUS-1001', fullName='Amina Khan', status=ACTIVE}]
Ravi before: Optional[Customer{customerId='CUS-1002', fullName='Ravi Singh', status=PROSPECT}]
After activation: Optional[Customer{customerId='CUS-1002', fullName='Ravi Singh', status=ACTIVE}]
```


## Do the lab

Complete every step in **[LAB-10-GUIDE.md](LAB-10-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab10-crm` as in [LAB-10-GUIDE.md](LAB-10-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
