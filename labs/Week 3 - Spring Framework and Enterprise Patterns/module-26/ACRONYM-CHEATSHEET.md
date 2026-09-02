# Module 26 — Acronym Cheatsheet

**Topic:** Spring Profiles and Configuration  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **22** curriculum slide diagram title(s) plus slide text for this module._

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Actuator** | Spring Boot Actuator | Production endpoints for health, metrics, and info. |
| **application.properties** | — | Default Spring Boot key=value config file. |
| **application.yml** | — | YAML form of Spring Boot configuration. |
| **Externalized Configuration** | — | Config outside the JAR (env vars, files, profiles) so the same build runs in many environments. |
| **Profile** | Spring Profile | Environment-specific config (dev, test, prod). |
| **Property Resolution** | — | Order Spring uses to decide which config value wins. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## Config & IaC

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration / Continuous Deployment | Automated pipelines; environment variables make the same build deployable to each stage. |
| **CLI** | Command Line Argument(s) | Highest-precedence config source (e.g. `--app.name=MyApp`), read before env vars and YAML. |
| **JNDI** | Java Naming and Directory Interface | Legacy lookup mechanism for config attributes (e.g. `java:comp/env`); low in the precedence order. |
| **OS** | Operating System | Source of environment variables used to configure the app per environment. |
| **UAT** | User Acceptance Testing | Example custom profile name for a pre-production/validation environment. |
| **YAML** | YAML Ain’t Markup Language | Human-friendly format for config and API docs. |

---

## Cloud & secrets management

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AWS** | Amazon Web Services | Cloud provider; AWS Secrets Manager/Parameter Store are example external config sources. |
| **IAM** | Identity and Access Management | AWS's permission system; Secrets Manager integrates with it to control who can read a secret. |

---

## Containers & Kubernetes

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Secret** | Kubernetes Secret | K8s object for sensitive config (still base64-encoded). |

---

## Databases & persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DB** | Database | Shorthand seen in warnings like "blank DB password" and `DB_USERNAME`/`DB_PASSWORD`. |
| **H2** | H2 Database | In-memory Java SQL database used for dev/test profiles (e.g. `jdbc:h2:mem:devdb`). |
| **JPA** | Java Persistence API | Standard Java API for object-relational persistence; has its own config section (`# JPA / Hibernate`). |
| **SQL** | Structured Query Language | Language for querying relational data; verbose SQL logging is a dev-only setting. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another (seen in `NORTHSTAR_API_KEY`). |
| **CRM** | Customer Relationship Management | Northstar CRM: the app whose config this module externalizes across dev/test/prod. |
| **IDE** | Integrated Development Environment | Your editor/tooling; one way to set active profiles is an "IDE Run Configuration". |

---

## One-line memory aid

> Focus first on: **Profile** · **YAML** · **Spring Boot** · **Actuator** · **application.properties**.

---

**Related:** [Module 26 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
