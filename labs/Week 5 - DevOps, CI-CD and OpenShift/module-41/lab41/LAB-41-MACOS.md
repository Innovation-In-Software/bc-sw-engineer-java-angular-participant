# Lab 41: Containerize the Spring Boot CRM — Multi-Stage Dockerfile, Non-Root, Health — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven · Docker Desktop · PostgreSQL · IntelliJ  
**Full lab steps:** [LAB-41-GUIDE.md](LAB-41-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-41-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab41-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab41-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab41-crm
docker compose -p lab41verify up -d
docker build -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab41verify_default --memory=512m --env-file .env.example -p 8080:8080 crm-api:lab41
curl -fsS http://127.0.0.1:8080/actuator/health/readiness
docker exec crm-lab41 id
docker stop --time 20 crm-lab41
```

Copy Lab 40 into `~/java-bootcamp/examples/lab41-crm` and use isolated database **`crm_lab41`**. JDBC hostname is **`crm-postgres`**, not `localhost`.


## Do the lab

Complete every step in **[LAB-41-GUIDE.md](LAB-41-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab41-crm` as in [LAB-41-GUIDE.md](LAB-41-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
