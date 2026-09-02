# Module 22 — Acronym Cheatsheet

**Topic:** Spring Core and Inversion of Control (IoC)  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **35** curriculum slide diagram title(s) plus slide text for this module._

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AOP** | Aspect-Oriented Programming | Cross-cutting concerns (logging, tx) as reusable aspects. |
| **Bean** | Spring Bean | Object managed by the Spring container. |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |
| **IoC** | Inversion of Control | Framework calls your code and wires dependencies for you. |
| **Repository** | — | Layer/interface focused on data access. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |
| **SpEL** | Spring Expression Language | Expression language used to configure and query Spring beans at runtime (shown in the ecosystem diagram). |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **POJO** | Plain Old Java Object | A simple Java class without framework magic. |
| **UI** | User Interface | The presentation layer users interact with (e.g., "Web UI, REST Controllers"). |

---

## Data access & persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDBC** | Java Database Connectivity | Low-level Java API for talking to relational databases (used by JdbcTemplate). |
| **JPA** | Jakarta Persistence API | Standard Java ORM API; Spring Data JPA builds repositories on top of it. |
| **ORM** | Object-Relational Mapping | Maps Java objects to database tables (e.g., Spring ORM with Hibernate/JPA). |
| **DAO** | Data Access Object | Pattern/annotation (@Repository) for the class that talks to the database. |
| **DTO** | Data Transfer Object | Plain object used to move data between layers, separate from domain entities. |
| **CRUD** | Create, Read, Update, Delete | The four basic data operations a repository/data-access layer supports. |
| **NoSQL** | Not Only SQL | Non-relational data stores (MongoDB, Redis) contrasted with SQL databases. |
| **SQL** | Structured Query Language | Query language for relational databases; used in the @Repository example. |
| **UUID** | Universally Unique Identifier | Randomly generated unique ID, used for prototype-scoped bean instances in the example. |

---

## Web, messaging & security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind web requests; request/session bean scopes are tied to it. |
| **REST** | Representational State Transfer | API style implemented by @RestController and @Controller classes. |
| **MVC** | Model-View-Controller | Spring's web pattern; @Controller works with Spring MVC to route requests. |
| **XML** | Extensible Markup Language | Alternative (legacy) way to declare Spring beans and wire dependencies. |
| **JWT** | JSON Web Token | Token format used with Spring Security for stateless authentication (ecosystem diagram). |
| **AMQP** | Advanced Message Queuing Protocol | Messaging protocol Spring Integration can use to connect systems. |
| **JMS** | Java Message Service | Java API for messaging/queues, listed alongside Kafka and AMQP. |

---

## Java platform & cross-cutting concerns

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JVM** | Java Virtual Machine | Runs compiled Java bytecode; underlies every bean the container creates. |
| **JDK** | Java Development Kit | Tools needed to build/run Java (lab prerequisite: JDK 21). |
| **PII** | Personally Identifiable Information | Data that must never appear in lifecycle logs (Module 20 rule reused here). |
| **i18n** | Internationalization | Enterprise feature ApplicationContext adds over a basic BeanFactory. |
| **SLF4J** | Simple Logging Facade for Java | Logging abstraction shown in the enterprise architecture's cross-cutting concerns. |
| **CRM** | Customer Relationship Management | Northstar CRM, the running example refactored throughout this module's exercises and lab. |

---

## One-line memory aid

> Focus first on: **IoC** · **DI** · **Bean** · **Spring Boot** · **API**.

---

**Related:** [Module 22 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
