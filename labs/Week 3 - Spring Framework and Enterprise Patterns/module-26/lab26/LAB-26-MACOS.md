# Lab 26: Spring Profiles and Configuration — Northstar CRM Environments — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-26-GUIDE.md](LAB-26-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-26-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab26-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab26-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab26-crm
mvn -B test "-Dspring.profiles.active=test"
mvn -B spring-boot:run "-Dspring-boot.run.profiles=dev"
# After Started CrmApplication:
# Fail-fast: mvn -B spring-boot:run "-Dspring-boot.run.profiles=prod"   # expect APPLICATION FAILED TO START
```

Verified (2026-08-04): **Tests run: 1** (`ProfileBindingTest`) · **BUILD SUCCESS** under `test` (optional second run for determinism — still 1 test); `dev` active + H2 JDBC `jdbc:h2:mem:lab26dev;...MODE=PostgreSQL` (no `/h2-console` / JPA required) + GET `CUS-1001` **200**; `prod` **APPLICATION FAILED TO START**; `.env.example` has `DB_USERNAME` / `DB_PASSWORD` / `NORTHSTAR_API_KEY`; `.env` absent. App name `northstar-crm`.

Re-verified instructor laptop (2026-08-07, Windows PowerShell; same Boot 3.3.5 / H2-only classpath): with `prod` active and secrets unset, failure is **`Failed to load driver class org.postgresql.Driver`** (not always a “Could not resolve placeholder” line). YAML `${DB_PASSWORD}` / `${NORTHSTAR_API_KEY}` without defaults remain env-only; see GUIDE Step 4.

## Do the lab

Complete every step in **[LAB-26-GUIDE.md](LAB-26-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab26-crm` as in [LAB-26-GUIDE.md](LAB-26-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
