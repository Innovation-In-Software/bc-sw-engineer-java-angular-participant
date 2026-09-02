# Lab 50: Capstone Build — Angular Frontend and PostgreSQL Persistence — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Angular 19 · HttpClient · JWT interceptor · Spring Boot · PostgreSQL · Flyway  
**Full lab steps:** [LAB-50-GUIDE.md](LAB-50-GUIDE.md)  
**Other OS:** [macOS guide](LAB-50-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven, Node, Docker)
- Labs 48–49 plan/API available
- IntelliJ SDK **21**; `npx ng` (CLI need not be global)

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab50-capstone` |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab50-capstone
```

Capstone teams may merge `frontend/` + `backend/` into an existing `customer-management-platform` monorepo instead.

### Commands this lab typically uses

```powershell
Copy-Item .env.example .env -ErrorAction SilentlyContinue
docker compose -p lab50verify up -d
cd backend; mvn -B test
cd ..\frontend; npx ng build
```

Optional live UI: `npx ng serve` plus `mvn -B spring-boot:run` in `backend`. Demo Bearer is `lab-demo-token`.

Verified on this laptop (2026-08-28), Temurin 21.0.11, Maven 3.9.9, Node v24.18.0: solution **Tests run: 3** against Docker PostgreSQL 16; `npx ng build` succeeds when overlaid on the Lab 33 `node_modules` tree. Do **not** use `kubectl`/k3s. Angular is the taught UI — not React.

## Do the lab

Complete **[LAB-50-GUIDE.md](LAB-50-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` for `~/java-bootcamp`.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Project under `examples\lab50-capstone` | Pass / Fail |
| 2 | Angular + PostgreSQL GUIDE deliverables complete | Pass / Fail |
