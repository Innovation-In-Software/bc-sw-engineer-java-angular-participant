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

## Before Week 5

| Tool | Notes |
| ---- | ----- |
| **oc** (OpenShift CLI) | Deploy into the shared OpenShift project the instructor assigns |
| Docker (optional) | Only for labs that build and push an image to GHCR |

## Instructor provides (not in Git)

- Oracle username / password / JDBC URL (per-student schema)
- Kafka bootstrap address
- OpenShift `oc login` (or kubeconfig) and project name
- GitHub org / GHCR guidance and Copilot license as assigned

## Do not install locally

Oracle Database Server, a local Kafka cluster, or OpenShift Local / CRC — unless the instructor explicitly allows optional practice.

Full matrix: [SETUP-INSTRUCTIONS.md](SETUP-INSTRUCTIONS.md) · Shared env: [FINAL-SETUP-README.md](FINAL-SETUP-README.md)
