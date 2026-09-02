# Module 49 — Acronym Cheatsheet

**Topic:** Capstone Backend and Messaging  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Capstone / text module: terms taken from slide text and the module topic (few or no slide diagram PNGs)._

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Consumer** | Kafka Consumer | Application that reads messages from Kafka topics. |
| **DLT** | Dead Letter Topic | Where a message lands after bounded retries fail, so a poison message never blocks the consumer forever. |
| **EDA** | Event-Driven Architecture | Services communicate by publishing/consuming events. |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **Producer** | Kafka Producer | Application that writes messages to Kafka topics. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | The protocol carrying REST requests/responses, status codes, and headers. |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |

---

## Not this course's API style

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SOAP** | Simple Object Access Protocol | XML RPC style — comparison-only. This bootcamp uses **REST** + JSON. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | The validated REST interface (controller layer) that lets clients create/read interactions. |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **JSON** | JavaScript Object Notation | Format for Problem Details error bodies and event/DTO payloads. |
| **UI** | User Interface | The Angular frontend (built in Lab 50) that consumes this module's API contract. |
| **UUID** | Universally Unique Identifier | Type used for `eventId`, `customerId`, and `interactionId` fields. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDBC** | Java Database Connectivity | Low-level database API the service layer must avoid touching directly — that is the repository's job. |
| **JPA** | Java Persistence API | Used for repository/entity mapping to PostgreSQL via Spring Data. |
| **SQL** | Structured Query Language | Used in the Flyway migration files and inspected as generated queries. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Bearer-token credential validated by the resource server; stubbed with `@PreAuthorize` in this module, fully enforced in Lab 51. |
| **OIDC** | OpenID Connect | Identity layer alongside JWT — an external identity provider issues tokens, this app's resource server only validates them. |
| **PII** | Personally Identifiable Information | Real customer data; fixtures like CUS-1001/Amina are synthetic and never real PII. |
| **RBAC** | Role-Based Access Control | AGENT/MANAGER role model enforced via `@PreAuthorize` annotations rather than per-person exceptions. |

---

## Testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IT** | Integration Test | A test exercising multiple layers together (e.g., "Kafka IT" verifies the real publish/consume path), distinct from a unit test. |
| **MockMvc** | — | Spring's tool for testing controller/HTTP behavior (status codes, JSON body) without starting a real server; the deck also shorthands this as "MVC tests". |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI** | Continuous Integration | Automated build/test environment (e.g., H2 or Testcontainers used in CI vs. PostgreSQL locally). |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AC** | Acceptance Criteria | Numbered pass/fail conditions from CAP-12 (Module 48) that the test suite must be cross-checked against. |
| **ADR** | Architecture Decision Record | Written record of an architecture choice and its rationale from Module 48; this module's code must follow those decisions faithfully. |
| **Capstone** | — | Final multi-module project integrating the full stack. |
| **DoD** | Definition of Done | Explicit checklist (API works, migration applied, event versioned, tests green, no secrets) including at least one failing-path proof. |
| **NFR** | Non-Functional Requirement | A measurable quality goal from Module 48 (e.g., "unauthenticated /api/** -> 401") the implementation must satisfy. |
| **PR** | Pull Request | Code change reviewed with a why/what-changed/verification/risk-rollback description before merge. |

---

## One-line memory aid

> Focus first on: **Kafka** · **Spring Boot** · **REST** · **DTO** · **JWT/RBAC** · **ADR/NFR**.

---

**Related:** [Module 49 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
