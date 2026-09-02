# Lab 27: Transaction Management with AI Assistance — Northstar CRM Transfers — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-27-GUIDE.md](LAB-27-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-27-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab27-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab27-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab27-crm
mvn -B test
mvn -B spring-boot:run
```

Verified (2026-08-04): **Tests run: 2** (`forceFailRollsBack` + `happyPathMovesFunds`) · **BUILD SUCCESS**; force-fail `ACC-FORCE-FAIL` → `IllegalStateException` / HTTP **500** (no ExceptionHandler), MAIN unchanged at **1000.00**; happy `POST /api/transfers` → **200** `{"status":"OK"}`; unit happy path uses amount **5.00** (curl demo may use **50.00** → MAIN **950.00** / LOYALTY **100.00**). H2 `jdbc:h2:mem:lab27`. Seeds `ACC-MAIN-1001` / `ACC-LOYALTY-1001` only. `@Transactional` on `TransferService` only. Insufficient-funds check is full-path optional (not in solution).

## Do the lab

Complete every step in **[LAB-27-GUIDE.md](LAB-27-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab27-crm` as in [LAB-27-GUIDE.md](LAB-27-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
