# Lab 18: Mockito and Mocking with AI Assistance — Northstar CRM Isolation Tests — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-18-GUIDE.md](LAB-18-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-18-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Timed path: Lab 18 `starter/` → `examples\lab18-crm` (or copy `lab17-crm` → `lab18-crm`). Completed starter stubs: `CustomerServiceMockitoTest` (`activateRaviUsesFindAndSave`, `notFoundNeverCallsSave`, `addCustomerCapturesSavedEntity`) + `CustomerServiceBddMockTest` (`givenProspectWhenActivateThenSavedActive`) alongside Lab 17 baseline `CustomerServiceTests` (2). Two consecutive `mvn -B test` → **Tests run: 6**, Failures: 0 · **BUILD SUCCESS**. Not-found path verifies `never().save`. Instructor walkthrough: `docs/instructor-participant-help/week-2/18-mockito-exercises-and-lab18.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab18-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab18-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab17-crm lab18-crm   # once
cd lab18-crm
mvn -q test "-Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest"
mvn -B clean test
mvn -q test   # second run for determinism
```

Verified (2026-08-03): **Tests run: 6**, Failures: 0 · **BUILD SUCCESS** (baseline 2 + Mockito 3 + BDD 1).

Full path (copy `lab17-crm`, 2026-08-11): `CustomerServiceMockitoTest` **5** + `CustomerServiceBddMockTest` **1**; two consecutive `mvn -B test` → **Tests run: 40**, Failures: 0 (Lab 17 suites retained). `dependency:tree -Dincludes=org.mockito*` → `mockito-core:5.11.0:test` + `mockito-junit-jupiter:5.11.0:test`. Unused `when(findAll)` → `UnnecessaryStubbingException`. GUIDE 4-arg `Customer` ctor does not match this tree’s 6-arg entity (phone + createdAt).

## Do the lab

Complete every step in **[LAB-18-GUIDE.md](LAB-18-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab18-crm` as in [LAB-18-GUIDE.md](LAB-18-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |

