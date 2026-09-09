# Participant setup — Java & Angular Fullstack

> **Practice only.** Labs and exercises are for your own GitHub repo. Nothing is submitted or graded. Do not take screenshots.

Install tools on **your laptop**. Shared Oracle, Kafka, and OpenShift are provided by the instructor.

## Laptop install (Lab 0 and before Week 4)

| Tool | Version / notes |
| ---- | --------------- |
| IntelliJ IDEA Community | Primary IDE |
| JDK | **21** (Eclipse Temurin) |
| Apache Maven | **3.9.x** |
| Git | Git for Windows / system Git |
| GitHub account | source control, **GitHub Actions**, GHCR, Copilot |
| Node.js | **22 LTS** (before Week 4 Angular labs) |
| Angular CLI | `npm install -g @angular/cli` (before Modules 33–36) |
| **Docker** (Desktop or Engine) | **Required.** Install in [Lab 0 Step 11](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md) ([Windows](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md#step-11--install-docker-desktop) · [macOS](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md#step-11--install-docker-desktop)). Finish before Week 4 if you skipped it in class. Needed for Labs 37–39 (`docker compose`) and Labs 41 / 51 (image builds). Install earlier if the laptop is locked down. |

## Before Week 5

| Tool | Notes |
| ---- | ----- |
| **oc** (OpenShift CLI) | Deploy into the shared OpenShift project the instructor assigns |

## Instructor provides (not in Git)

- Oracle username / password / JDBC URL (per-student schema)
- Kafka bootstrap address
- OpenShift `oc login` (or kubeconfig) and project name
- GitHub org / GHCR guidance and Copilot license as assigned

## Do not install locally

Oracle Database Server, a local Kafka cluster, or OpenShift Local / CRC — unless the instructor explicitly allows optional practice.

Full matrix: [SETUP-INSTRUCTIONS.md](SETUP-INSTRUCTIONS.md) · Shared env: [FINAL-SETUP-README.md](FINAL-SETUP-README.md)
