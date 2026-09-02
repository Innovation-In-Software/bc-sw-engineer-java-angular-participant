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

## Before Week 5

```text
oc version
oc whoami
oc project
```

Deploy path: **build image → push GHCR → `oc apply` (or `oc new-app`) into your OpenShift project**.

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
| Actions not running | workflow in **your** repo, not the course clone |
