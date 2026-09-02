# Module 25 — Acronym Cheatsheet

**Topic:** Service and Repository Layers  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **25** curriculum slide diagram title(s) plus slide text for this module._

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |
| **MVC** | Model-View-Controller | Spring's web layer pattern; a "full web/MVC test setup" means testing through the servlet stack instead of a plain unit test. |
| **Repository** | — | Layer/interface focused on data access. |
| **Service Layer** | — | Business logic layer between controllers/endpoints and persistence. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **HTTP** | Hypertext Transfer Protocol | The request/response protocol Controllers speak ("Controllers talk HTTP"). |
| **JSON** | JavaScript Object Notation | Lightweight data format Controllers typically return to clients. |
| **JWT** | JSON Web Token | Compact signed auth token; explicitly deferred here and covered fully in Module 28. |
| **REST** | Representational State Transfer | Style of API the Controller layer exposes (e.g. "Expose REST endpoints"). |
| **OpenAPI** | — | REST contract language (Lab 13). Module 24 is Spring MVC JSON mappings, not SOAP/WSDL. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRUD** | Create, Read, Update, Delete | Four basic data operations. |
| **DAO** | Data Access Object | Object that reads/writes persistence (DB) details. |
| **DB** | Database | Shorthand for the storage layer the Repository talks to in diagrams. |
| **JDBC** | Java Database Connectivity | Low-level Java API for talking to a relational database. |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables (what a later Repository implementation swaps in). |
| **JPQL** | Java Persistence Query Language | Object-oriented query language used in JPA `@Query` methods instead of raw SQL. |
| **ORM** | Object-Relational Mapping | Maps Java classes to database tables/rows (what JPA/Hibernate does). |
| **SQL** | Structured Query Language | Language used to query and change relational data. |
| **Transaction** | — | Unit of work that commits or rolls back together. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **CRM** | Customer Relationship Management | Northstar CRM: the customer-management app used throughout this module's lab and exercises. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools like Copilot that draft code; Lab 25 requires a logged, honest review of what the AI got right and wrong. |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |

---

## One-line memory aid

> Focus first on: **Service Layer** · **Repository** · **DTO** · **DI** · **DAO**.

---

**Related:** [Module 25 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
