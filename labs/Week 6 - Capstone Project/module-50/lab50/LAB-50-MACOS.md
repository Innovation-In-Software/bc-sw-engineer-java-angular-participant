# Lab 50: Capstone Build — Angular Frontend and PostgreSQL Persistence — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Angular 19 · HttpClient · JWT interceptor · Spring Boot · PostgreSQL · Flyway  
**Full lab steps:** [LAB-50-GUIDE.md](LAB-50-GUIDE.md)  
**Other OS:** [Windows guide](LAB-50-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven, Node, Docker)
- Labs 48–49 plan/API available
- IntelliJ SDK **21**; `npx ng` (CLI need not be global)

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab50-capstone` |

```bash
cd ~/java-bootcamp
cd examples/lab50-capstone
```

Capstone teams may merge `frontend/` + `backend/` into an existing `customer-management-platform` monorepo instead.

### Commands this lab typically uses

```bash
cp -n .env.example .env 2>/dev/null || true
docker compose -p lab50verify up -d
cd backend && mvn -B test
cd ../frontend && npx ng build
```

Optional live UI: `npx ng serve` plus `mvn -B spring-boot:run` in `backend`. Demo Bearer is `lab-demo-token`.

## Do the lab

Complete **[LAB-50-GUIDE.md](LAB-50-GUIDE.md)**.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Project under `examples/lab50-capstone` | Pass / Fail |
| 2 | Angular + PostgreSQL GUIDE deliverables complete | Pass / Fail |
