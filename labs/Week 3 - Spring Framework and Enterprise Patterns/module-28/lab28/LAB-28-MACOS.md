# Lab 28: Spring Security Basics — Northstar CRM JWT and Roles — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-28-GUIDE.md](LAB-28-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-28-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab28-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab28-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab28-crm
mvn -B test
mvn -B spring-boot:run
```

Verified (2026-08-04): **Tests run: 3** · **BUILD SUCCESS** (`SecurityPathTest`: `missingTokenIs401`, `agentCanReadCustomerButNotAdmin`, `adminCanPing`). Login JSON `{accessToken, tokenType}`; timed token is lab stub `lab.subject.role.sig` (not required `eyJ` HS256). Secret `northstar.security.jwt-secret` / env `JWT_SECRET`. Users via `CrmUserDetailsService`. Matcher-only admin (no `@PreAuthorize` required). health **200**; no-token customers **401**; agent → `/api/admin/ping` **403**; admin ping **200**. Permit `/error` so live Tomcat does not rewrite 403→401. starter ships failing TODO test stubs until Step 8. No `.env` committed.

## Do the lab

Complete every step in **[LAB-28-GUIDE.md](LAB-28-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab28-crm` as in [LAB-28-GUIDE.md](LAB-28-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
