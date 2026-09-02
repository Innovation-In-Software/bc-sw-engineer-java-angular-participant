# Module 15 — Acronym Cheatsheet

**Topic:** Business Logic and Service Layer Design  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **20** curriculum slide diagram title(s) plus slide text for this module._

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRUD** | Create, Read, Update, Delete | Four basic data operations. |
| **DAO** | Data Access Object | Object that reads/writes persistence (DB) details. |
| **Transaction** | — | Unit of work that commits or rolls back together. |
| **ACID** | Atomicity, Consistency, Isolation, Durability | Properties a transaction boundary guarantees; the database enforces ACID. |
| **JDBC** | Java Database Connectivity | Lower-level persistence detail the repository hides from the service layer. |
| **JPA** | Java Persistence API | Persistence detail (alongside JDBC) the repository hides; Spring Data JPA example shown. |
| **SQL** | Structured Query Language | Query language the repository hides — the service works with domain objects, not SQL. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |
| **Repository** | — | Layer/interface focused on data access. |
| **Service Layer** | — | Business logic layer between controllers/endpoints and persistence. |
| **CTOR** | Constructor | Shorthand for constructor, as in "ctor injection" — the preferred way to wire dependencies. |
| **JDK** | Java Development Kit | The plain-Java (no Spring) style used for this module's "JDK-style ctor injection" sketch. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **POJO** | Plain Old Java Object | A simple Java class without framework magic. |
| **SOLID** | Single responsibility, Open-closed, Liskov substitution, Interface segregation, Dependency inversion | Five design principles for maintainable object-oriented code. |
| **SRP** | Single Responsibility Principle | A class should have one reason to change. |
| **OOP** | Object-Oriented Programming | Constructor injection is a plain OOP technique, not a Spring-only concept. |
| **JUnit** | — | Java testing framework; the lab's fake-repository unit tests use JUnit 5. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## Service communication (awareness-level)

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | Protocol carrying a request into the layered architecture from the client. |
| **REST** | Representational State Transfer | This course’s HTTP/JSON API style. Service-layer rules stay the same whether called from REST or a batch job. |
| **gRPC** | gRPC Remote Procedure Calls | Typed internal protocol, previewed as contrast — not a Lab 15 deliverable. |
| **AMQP** | Advanced Message Queuing Protocol | Messaging protocol (with Kafka) used for asynchronous, event-driven communication. |

---

## One-line memory aid

> Focus first on: **DTO** · **DAO** · **Service Layer** · **DI** · **API**.

---

**Related:** [Module 15 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
