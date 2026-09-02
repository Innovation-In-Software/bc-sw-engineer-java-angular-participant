# Lab 35: Frontend to API Integration — macOS

**OS:** macOS  
**Primary IDE:** VS Code (Angular) + IntelliJ (Spring Boot)  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Angular HttpClient · Spring Boot REST · PostgreSQL (or mock) · CORS  
**Full lab steps:** [LAB-35-GUIDE.md](LAB-35-GUIDE.md)  
**Other OS:** [Windows guide](LAB-35-WINDOWS.md)

## Prerequisites (macOS)

- JDK 21 + Maven; Node 20 LTS
- A Customer REST API on `http://localhost:8080`

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| Angular UI | `~/java-bootcamp/examples/lab35-crm-ui` |
| Optional Boot API | `~/java-bootcamp/examples/lab35-crm-api` |

Prefer the course `starter/` and `crm-api/` (see [starter/README.md](starter/README.md)). If you already finished Lab 34:

```bash
cd ~/java-bootcamp
cp -R examples/lab34-crm-ui examples/lab35-crm-ui 2>/dev/null || true
cd examples/lab35-crm-ui
```

### Commands this lab typically uses

```bash
# API
cd ~/java-bootcamp/examples/lab35-crm-api
mvn -B spring-boot:run
curl -s http://localhost:8080/api/customers/CUS-1001
# UI
cd ~/java-bootcamp/examples/lab35-crm-ui
npx ng serve --open
```

## Do the lab

Complete **[LAB-35-GUIDE.md](LAB-35-GUIDE.md)**.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Boot GET CUS-1001 works | Pass / Fail |
| 2 | Angular list loads from HttpClient | Pass / Fail |
| 3 | CORS fixed for localhost:4200 | Pass / Fail |
| 4 | `docs/integration-notes.md` present | Pass / Fail |
