# Module 44 — Acronym Cheatsheet

**Topic:** Continuous Delivery and Release Management  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **25** curriculum slide diagram title(s) plus slide text for this module._

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Artifact** | — | Build output you publish (JAR, image, report). |
| **Blue/Green** | Blue/Green Deployment | Two environments; switch traffic to the new one when ready. |
| **Canary** | Canary Deployment | Send a small % of traffic to the new version first. |
| **CD** | Continuous Delivery / Deployment | Automatically prepare or ship releases. |
| **CI** | Continuous Integration | Automatically build, test, and package on every commit (Modules 42-43); CD picks up from here. |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **Pipeline** | — | Automated sequence: build → test → package → deploy. |
| **Rollback** | — | Return to a previous good version after a bad deploy. |

---

## Environments & testing

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **UAT** | User Acceptance Testing | Business/end-user environment that validates real workflows before Production. |
| **QA** | Quality Assurance | The team/discipline that tests and validates release quality. |
| **E2E** | End-to-End | Testing a full workflow start to finish, not just one component. |
| **UI** | User Interface | The screens/interactions UAT checks for usability and correctness. |

---

## Deployment & infrastructure

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **IaC** | Infrastructure as Code | Environments (like the Testing tier) defined and versioned as code, not hand-configured. |
| **DNS** | Domain Name System | One of the ways Blue-Green switches traffic (routes a name to a new environment). |
| **OS** | Operating System | Layer patched by "Standard" change requests (e.g., an OS patch). |
| **CPU** | Central Processing Unit | A metric (with memory, latency, errors) monitored during a Rolling Deployment. |
| **DB** | Database | Data layer; schema changes can force a Recreate Deployment or complicate rollback. |

---

## Disaster recovery & governance

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **DR** | Disaster Recovery | Restoring critical systems/data after a major disruptive event. |
| **RTO** | Recovery Time Objective | Max acceptable time to restore systems (example in deck: RTO = 4 hours). |
| **RPO** | Recovery Point Objective | Max acceptable data loss, measured in time (example in deck: RPO = 15 minutes). |
| **CAB** | Change Advisory Board | Group that reviews and approves changes, including final production go/no-go. |
| **SLA** | Service Level Agreement | Reliability/performance commitment Production must meet; a bad release risks an SLA breach. |
| **SAST** | Static Application Security Testing | Automated security scan used as a promotion gate before release. |
| **SEV** | Severity (incident) | Incident severity level named in a rollback runbook, with an owner authorized to declare it. |

---

## Artifact identity & data formats

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **SemVer** | Semantic Versioning | Version numbering scheme (e.g., 1.4.0-rc.1) recorded in the artifact manifest. |
| **SHA** | Secure Hash Algorithm | Checksum/hash (e.g., SHA-256) used to prove the artifact is exactly what was tested. |
| **JAR** | Java ARchive | Packaged Java build output; its SHA-256 checksum anchors artifact identity. |
| **JSON** | JavaScript Object Notation | Format used for artifact-manifest.json and its digest/version fields. |
| **URL** | Uniform Resource Locator | Address recorded as evidence for a gate (e.g., a pipeline run URL). |
| **API** | Application Programming Interface | Interface style of the services (e.g., crm-api) being released and smoke-tested. |

---

## Containers & OpenShift

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Deployment** | — | Object that manages replica Pods and rolling updates (same API on OpenShift). |
| **Docker** | — | Tool to package apps as portable container images. |
| **Kubernetes** | — | Container orchestration API OpenShift builds on (often abbreviated K8s). |
| **OpenShift** | — | Instructor-hosted cluster (Projects + Routes). Use `oc`, not local k3s. |
| **Route** | — | OpenShift object that exposes a Service (Lab 42). CD smoke uses the Route hostname. |
| **oc** | OpenShift CLI | Client for `set image`, `rollout`, and `apply`. |

---

## Business context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM: the module's running example, a Customer Management Platform (crm-api). |

---

## One-line memory aid

> Focus first on: **CD** · **CI/CD** · **Pipeline** · **Blue/Green** · **Canary**.

---

**Related:** [Module 44 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
