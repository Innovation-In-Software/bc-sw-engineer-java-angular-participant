# Module 27 — Acronym Cheatsheet

**Topic:** Transaction Management  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **25** curriculum slide diagram title(s) plus slide text for this module._

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AOP** | Aspect-Oriented Programming | How `@Transactional` works: Spring wraps the bean in a proxy that starts/commits/rolls back around the method call. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **@Transactional** | — | Spring annotation that starts/joins a DB transaction. |
| **ACID** | Atomicity, Consistency, Isolation, Durability | Guarantees for reliable database transactions. |
| **DAO** | Data Access Object | Object that reads/writes persistence details; data access happens via Repository/DAO. |
| **DB** | Database | Shorthand for the data store in diagrams (e.g. Order DB, Payment DB). |
| **H2** | H2 Database | In-memory database used for the lab's dev/test persistence and durability demos. |
| **Isolation Level** | — | How much concurrent transactions can see of each other. |
| **JDBC** | Java Database Connectivity | Low-level Java API a `DataSourceTransactionManager` manages transactions over. |
| **JMS** | Java Message Service | Java async-messaging API; one example of another `TransactionManager` type Spring can coordinate. |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |
| **JTA** | Java Transaction API | Manager type for distributed transactions spanning multiple resources (`JtaTransactionManager`). |
| **MVCC** | Multi-Version Concurrency Control | How SNAPSHOT isolation gives a consistent view via row versioning instead of locking reads. |
| **ORM** | Object-Relational Mapping | Maps classes to tables (e.g., Hibernate). |
| **Propagation** | Transaction Propagation | How nested calls join or start transactions. |
| **SQL** | Structured Query Language | Language to query and change relational data. |
| **Transaction** | — | Unit of work that commits or rolls back together. |
| **WAL** | Write-Ahead Logging | How durability is achieved: changes are written to a log on disk before being applied/committed. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another (e.g. calls inside a transaction that can cause timeouts). |
| **CRM** | Customer Relationship Management | Northstar CRM: the app this module's transfer lab is built around. |

---

## Security preview

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Compact signed auth token; explicitly deferred here — securing the transfer routes with JWT waits for Lab 28. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools like Copilot that draft transaction code; the deck requires rejecting AI drafts that swallow exceptions inside `@Transactional` methods. |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |

---

## One-line memory aid

> Focus first on: **ACID** · **Transaction** · **Isolation Level** · **Propagation** · **@Transactional**.

---

**Related:** [Module 27 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
