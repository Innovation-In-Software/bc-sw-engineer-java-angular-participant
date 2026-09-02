# Lab 9: Maven Build and Dependencies — Northstar CRM Build Lab — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-9-GUIDE.md](LAB-9-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-9-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Sunday, August 2, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: copy Lab 9 `starter/` → `examples\lab9-crm` (or full path: copy `lab8-crm` → `lab9-crm` then expand POM). Expanded POM includes Spring/JUnit placeholders, Surefire, jar `Main-Class`, `dev`/`test`/`prod` profiles (`dev` active by default). Lifecycle `validate`→`install` and `mvn -B verify` → **BUILD SUCCESS**; `PlaceholderTest` Tests run: **1**, Failures: **0**; `java -jar target\customer-service.jar` prints the Lab 8 CRM skeleton banner; artifact under `~\.m2\repository\com\northstar\customer-service\0.1.0-SNAPSHOT\`. Instructor walkthrough: `docs/instructor-participant-help/week-2/09-maven-exercises-and-lab9.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab9-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab9-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
# First-time / evidence runs — full logs (no -q)
mvn validate
mvn test
mvn clean package
java -jar target\customer-service.jar
mvn -B verify
mvn dependency:tree
mvn help:active-profiles

# Optional quieter rebuild later (hides Surefire detail — do not use with dependency:tree)
# mvn -q test
# mvn -q clean package
```


## Do the lab

Complete every step in **[LAB-9-GUIDE.md](LAB-9-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab9-crm` as in [LAB-9-GUIDE.md](LAB-9-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
