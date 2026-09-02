# Lab 29: Validation and Exception Handling — Northstar CRM Error Contracts — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-29-GUIDE.md](LAB-29-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-29-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab29-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab29-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab29-crm
mvn -B test
mvn -B spring-boot:run
# Login first (security is in starter):
# TOKEN=$(curl -s -X POST http://localhost:8080/api/auth/login \
#   -H "Content-Type: application/json" \
#   -d '{"username":"agent1","password":"agent1"}' | jq -r .accessToken)
# Then Authorization: Bearer $TOKEN on customer calls
```

Verified (2026-08-04): **Tests run: 4** · **BUILD SUCCESS** (`ErrorEnvelopeTest`: 400/404/409 + no-token **401**). Lab 28 security **included in starter** — login `agent1`/`agent1` then Bearer for customer curls. GET `CUS-1001`/`CUS-1002` **200** with Bearer; `CUS-9999` **404**; bad email **400** with `violations[{field,message}]`; duplicate `CUS-1001` **409**. `ErrorResponse` has no `path` field. No `StatusUpdateRequest`/PATCH in timed path. Notes: `docs/error-contract.md`. Correlation `lab-request-001`. Starter DTO class fields `id`/`name`/`email`/`status`.

## Do the lab

Complete every step in **[LAB-29-GUIDE.md](LAB-29-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab29-crm` as in [LAB-29-GUIDE.md](LAB-29-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
