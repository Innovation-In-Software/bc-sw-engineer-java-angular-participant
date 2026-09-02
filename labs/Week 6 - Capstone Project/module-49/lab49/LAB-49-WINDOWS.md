# Lab 49: Capstone Backend and Messaging — Northstar CRM Interaction Slice — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Spring Boot REST · Kafka (full path) · PostgreSQL (full path) · Angular deferred to Lab 50  
**Full lab steps:** [LAB-49-GUIDE.md](LAB-49-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-49-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- Lab 48 planning pack available (CAP-12)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab49-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab49-crm
```

Capstone teams may merge `backend/` into an existing `customer-management-platform` monorepo instead.

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab49-crm\backend
mvn -B test
```

Verified on this laptop (2026-08-28), Temurin 21.0.11, Maven 3.9.9: solution **Tests run: 2** (`create_forAmina_returnsCreatedShape`, `create_unknownCustomer_fails`). In-memory session store — no Docker, Kafka broker, PostgreSQL, or OpenShift required for the timed path. Do **not** use `kubectl`/k3s. Angular UI is Lab 50.

## Do the lab

Complete every step in **[LAB-49-GUIDE.md](LAB-49-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab49-crm` as in [LAB-49-GUIDE.md](LAB-49-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
