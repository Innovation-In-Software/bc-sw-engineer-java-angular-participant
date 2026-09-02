# Module 41 — Acronym Cheatsheet

**Topic:** Containerization with Docker  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **30** curriculum slide diagram title(s) plus slide text for this module._

---

## Containers & Kubernetes

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Container** | — | Lightweight isolated process with its own filesystem/deps. |
| **Deployment** | — | K8s object that manages replica Pods and rolling updates. |
| **Docker** | — | Tool to package apps as portable container images. |
| **Dockerfile** | — | Recipe that builds a container image. |
| **GHCR** | GitHub Container Registry | GitHub-hosted place to store container images. |
| **Image** | Container Image | Immutable package used to create containers. |
| **Image Layer** | — | Cached filesystem layer in a container image. |
| **K8s** | Kubernetes | Numeronym (K + 8 letters + s) for the orchestration platform Lab 42 deploys this module's image to next. |
| **Multi-stage Build** | — | Dockerfile pattern: build in one stage, ship a slim runtime stage. |
| **Registry** | Container Registry | Store for images (GHCR, Docker Hub). |

---

## Build & packaging

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Editor/tooling folders (`.idea/`, `.vscode/`) that `.dockerignore` should exclude from the build context. |
| **JAR** | Java ARchive | Packaged Java classes/libs in one file. |
| **JDK** | Java Development Kit | Full compiler + runtime used in the Dockerfile's build stage (e.g., `maven:3.9-eclipse-temurin-21`) to compile the JAR. |
| **JRE** | Java Runtime Environment | Compiler-free Java runtime used as the lean final-stage base image (e.g., `eclipse-temurin:21-jre`). |
| **JVM** | Java Virtual Machine | Runs the packaged app; `JAVA_TOOL_OPTIONS` caps its memory as a percentage of the container's memory limit. |
| **WAR** | Web Application Archive | Packaged web-app archive format (alongside JAR) a Docker build context may include. |

---

## Docker architecture & interfaces

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | Defined way one program calls another; the Docker Daemon exposes a REST API every client uses. |
| **CLI** | Command Line Interface | Terminal way to talk to Docker -- one of three ways to reach the daemon (with Docker Desktop and the REST API). |
| **GUI** | Graphical User Interface | Point-and-click way to use Docker, e.g., Docker Desktop. |
| **JSON** | JavaScript Object Notation | Structured format `docker inspect` returns (image/container metadata, including `Config.User`). |
| **REST** | Representational State Transfer | API style the Docker Daemon exposes; every Docker Client command travels over this REST API. |
| **UI** | User Interface | Generic front end for a tool, e.g., confirming a push "landed in the registry (UI or CLI)." |

---

## OS-level isolation & resources

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **cgroups** | Control Groups | Kernel feature that limits/allocates CPU, memory, I/O, and network per container. |
| **CPU** | Central Processing Unit | Resource that cgroups and `--cpus` limit/allocate per container. |
| **I/O** | Input/Output | Disk and network throughput that cgroups limit and allocate per container. |
| **IPC** | Inter-Process Communication | Namespace that isolates a container's shared-memory/message-queue channel from other containers. |
| **OS** | Operating System | Layer containers share (the host OS kernel) instead of each bundling their own, as a VM would. |
| **PID** | Process ID | One of the resources a Linux namespace isolates per container -- its own private process-ID view. |
| **UTS** | UNIX Timesharing System | Namespace that isolates a container's hostname from the host and other containers. |
| **VM** | Virtual Machine | Heavier alternative to a container; bundles a full guest OS per instance instead of sharing the host kernel. |

---

## Runtime, networking & security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DNS** | Domain Name System | Docker's embedded resolver letting containers on the same network reach each other by name (e.g., `crm-postgres`). |
| **JDBC** | Java Database Connectivity | Java's database-driver API; `crm-api`'s JDBC URL points at the DB container by name, never `localhost`. |
| **SIGTERM / SIGKILL** | Unix termination signals | `docker stop` sends SIGTERM first (Spring Boot's shutdown hooks finish in-flight requests), then SIGKILL if it hasn't exited by the timeout. |
| **UID** | User ID | Fixed non-root numeric identity (e.g., `10001`) the runtime stage runs as -- the single most security-critical Dockerfile line. |

---

## Registries, cloud & versioning

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **ACR** | Azure Container Registry | Microsoft Azure's managed Docker registry option. |
| **AWS** | Amazon Web Services | Cloud provider whose managed registry (ECR) is one option for hosting images. |
| **ECR** | (Amazon) Elastic Container Registry | AWS's managed Docker registry option. |
| **GAR** | (Google) Artifact Registry | Google Cloud's managed Docker registry option. |
| **GCP** | Google Cloud Platform | Cloud provider whose managed registry (GAR) is one option for hosting images. |
| **IAM** | Identity and Access Management | Cloud-provider access control that managed registries (ECR/ACR/GAR) integrate with. |
| **SemVer** | Semantic Versioning | Stable `major.minor.patch` release tag (e.g., `1.0.0`) used alongside the Git SHA when tagging images. |
| **SHA** | Secure Hash Algorithm | Short Git commit hash appended to an image tag (e.g., `1.0.0-a1b2c3d`) for traceability back to source. |
| **YAML** | YAML Ain't Markup Language | Format Docker Compose files use to define multi-container applications. |

---

## Enterprise & delivery context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration / Continuous Delivery (Deployment) | Automated build-test-deploy pipeline that lightweight, fast-building images speed up. |
| **CRM** | Customer Relationship Management | NorthStar CRM, the Spring Boot `crm-api` backend this module containerizes. |
| **DB** | Database | Shorthand for the Postgres database `crm-api` depends on (e.g., "different DB version" across environments). |
| **JPA** | Java Persistence API | Java's ORM standard; `crm-api`'s Lab 39 data layer (JPA/PostgreSQL) is what gets containerized here. |
| **ROI** | Return on Investment | Financial payoff of running more containers per server than VMs (higher density, lower infrastructure cost). |
| **URL** | Uniform Resource Locator | Address format used for the JDBC connection string, `DB_URL`, and registry image references. |

---

## One-line memory aid

> Focus first on: **Docker** · **Container** · **Image** · **Dockerfile** · **Registry**.

---

**Related:** [Module 41 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
