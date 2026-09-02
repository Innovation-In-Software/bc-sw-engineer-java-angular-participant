# Lab 24: REST Endpoints and Request Mapping — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · REST · Angular CORS  
**Full lab steps:** [LAB-24-GUIDE.md](LAB-24-GUIDE.md)  
**Other OS:** [Windows guide](LAB-24-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete
- IntelliJ **Project SDK 21**; Lab 23 Boot CRM preferred

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab24-crm` |

```bash
cd ~/java-bootcamp
cd examples/lab24-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab24-crm
mvn -B test -Dtest=CustomerControllerMockMvcTest
mvn -B spring-boot:run
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1001
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1002
```

## Do the lab

Complete **[LAB-24-GUIDE.md](LAB-24-GUIDE.md)**.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace open with SDK **21** | Pass / Fail |
| 2 | Project under `examples/lab24-crm` | Pass / Fail |
| 3 | GUIDE checkpoints complete | Pass / Fail |
| 4 | MockMvc + live GET commands succeed | Pass / Fail |
