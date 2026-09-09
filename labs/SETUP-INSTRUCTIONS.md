# Setup instructions — Java & Angular Fullstack

Verified baseline for this **new** course folder. Shared services are **Oracle + Kafka + OpenShift**. CI/CD is **GitHub Actions**.

## Weeks 0–3 (laptop only)

Complete [Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md):

```text
java -version     # JDK 21
javac -version
mvn -version      # 3.9.x
git --version
```

IntelliJ Project SDK = 21. Workspace = `~/java-bootcamp` or `%USERPROFILE%\java-bootcamp`.

## Before Week 4

```text
node -v           # 22.x
npm -v
ng version        # Angular CLI
```

Instructor issues Oracle JDBC URL + Kafka bootstrap **before** Labs 30 / 37.

Example JDBC shape (host/service filled in by instructor):

```text
jdbc:oracle:thin:@//ORACLE_HOST:1521/ORACLE_SERVICE
```

Connect with your assigned schema. Do not use a different database for labs in this course.

## Docker Desktop (Lab 0 Step 11 — finish before Week 4)

Install steps live in the Lab 0 OS how-tos — do not wait until Lab 41:

- Windows: [LAB-0-WINDOWS.md — Step 11](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md#step-11--install-docker-desktop) · [docs.docker.com Windows](https://docs.docker.com/desktop/setup/install/windows-install/)
- macOS: [LAB-0-MACOS.md — Step 11](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md#step-11--install-docker-desktop) · [docs.docker.com Mac](https://docs.docker.com/desktop/setup/install/mac-install/)

Verify (must show a **Server** section, not Client-only):

```text
docker version
```

Needed for Week 4 `docker compose` (Labs 37–39) and Week 5 image builds (Labs 41, 51). Install during Lab 0 if the laptop may lose admin rights.

## Before Week 5

```text
docker version
oc version
oc whoami
oc project
```

Docker Desktop or Engine is **required** (Labs 37–39 compose; Lab 41 image builds and capstone). Install in Lab 0 Step 11. Deploy path: **build image → push GHCR → `oc apply` (or `oc new-app`) into your OpenShift project**.

GitHub Actions workflow lives in **your** `java-bootcamp` repo (`.github/workflows/`). Do not author `bitbucket-pipelines.yml`.

## Ports (laptop)

| What | Port |
| ---- | ---- |
| Spring Boot (typical) | 8080 |
| Angular `ng serve` | 4200 |

Shared Oracle / Kafka / OpenShift ports are on the instructor host, not localhost.

## If it fails

| Symptom | Check |
| ------- | ----- |
| Wrong Java | `JAVA_HOME` and IntelliJ SDK both 21 |
| `ng` not found | Node 22 on PATH; reopen the terminal |
| Oracle connection refused | allowlist / VPN; JDBC host from instructor sheet |
| `oc` unauthorized | expired token; re-run `oc login` |
| `docker` not found / engine down | Follow Lab 0 Step 11; start Docker Desktop; `docker version` must show **Server** before Lab 37 / Lab 41 |
| Actions not running | workflow in **your** repo, not the course clone |
