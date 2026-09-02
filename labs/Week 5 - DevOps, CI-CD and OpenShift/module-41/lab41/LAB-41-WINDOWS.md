# Lab 41: Containerize the Spring Boot CRM — Multi-Stage Dockerfile, Non-Root, Health — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Docker Desktop · PostgreSQL · IntelliJ  
**Full lab steps:** [LAB-41-GUIDE.md](LAB-41-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-41-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab41-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab41-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab41-crm
docker build --pull -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab41verify_default --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
curl.exe -fsS http://127.0.0.1:8080/actuator/health/readiness
docker exec crm-lab41 id
docker stop --time 20 crm-lab41
```

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, Docker Desktop 4.26.1 / Engine 24.0.7, PostgreSQL 16.14 in `crm-postgres`:

- Copy Lab 40 into `examples\lab41-crm` and use isolated database **`crm_lab41`**. Do not Flyway-migrate Lab 39/40 DBs.
- JDBC from another container: hostname **`crm-postgres`** on network **`lab41verify_default`** (`docker compose -p lab41verify up -d`). `localhost` inside the CRM container is the container itself.
- `.env.example` has an empty `CRM_DB_PASSWORD`. Copy to **`.env.local`** (gitignored). Do not `--env-file .env.example` if the password is blank.
- First `docker build --pull` downloaded `maven:3.9-eclipse-temurin-21` + `eclipse-temurin:21-jre` (~several minutes). Image `crm-api:lab41` **404 MB**, `Config.User=10001`, id `sha256:1968b9213c51…`. `RepoDigests` empty until push — record Image Id for Lab 42.
- Add `spring-boot-starter-actuator` and permit `/actuator/health/**` only (not `env`/`beans`). JRE image has no curl — HEALTHCHECK uses `/dev/tcp`.
- Port **8080** may still be held by a leftover `mvn spring-boot:run` (Lab 36). `netstat -ano | findstr :8080` then stop that PID before `docker run -p 8080:8080`.
- Docker Desktop “WSL drive missing” on this laptop was transient — Engine was already healthy (`crm-postgres` / `crm-kafka` Up). Do **not** `wsl --unregister docker-desktop-data` unless the engine is actually down (that deletes containers).
- Smoke: POST/GET `CUS-1001` with Basic `admin:change-me` and `X-Correlation-Id: lab-request-001` → **201/200**. Anon GET → **401**.
- `docker stop --time 20` → Tomcat `Graceful shutdown complete` in **~1.2 s**. Bad `CRM_DB_HOST=no-such-host` → Flyway `UnknownHostException`, container **exited / unhealthy**.

### If it fails

| Symptom | Fix |
| --- | --- |
| `bind: Only one usage of … port 8080` | Kill leftover Java on 8080; `docker rm -f crm-lab41` |
| Readiness never UP | Join `lab41verify_default` and set `CRM_DB_HOST=crm-postgres` |
| Health 401 | Permit `/actuator/health/**` in `SecurityConfig` |
| WSL drive missing dialog | Confirm `docker version` Server; unregister data distro only if Engine is dead |

## Do the lab

Complete every step in **[LAB-41-GUIDE.md](LAB-41-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab41-crm` as in [LAB-41-GUIDE.md](LAB-41-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
