# Module 23 — Acronym Cheatsheet

**Topic:** Spring Boot Auto-Configuration  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **30** curriculum slide diagram title(s) plus slide text for this module._

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Actuator** | Spring Boot Actuator | Production endpoints for health, metrics, and info. |
| **Auto-Configuration** | Spring Boot Auto-Configuration | Boot wires defaults based on classpath and properties. |
| **Profile** | Spring Profile | Environment-specific config (dev, test, prod). |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |
| **DI** | Dependency Injection | Providing a class its dependencies instead of it creating them (Module 22 concept, reused in best practices). |

---

## Config & IaC

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **YAML** | YAML Ain’t Markup Language | Human-friendly format for config and API docs. |
| **POM** | Project Object Model | Maven's pom.xml — declares dependencies, plugins, and build config; the Starter Parent manages its defaults. |
| **CI/CD** | Continuous Integration / Continuous Deployment | Automated build-test-release pipeline listed under production-readiness. |

---

## Build & packaging

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JAR** | Java ARchive | Packaged Java classes/libs in one file. |
| **WAR** | Web Application Archive | Traditional deployable package requiring an external server — Boot's embedded server avoids needing one. |
| **UTF-8** | Unicode Transformation Format – 8-bit | Default character encoding the Starter Parent configures for you. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Health Check** | — | Endpoint/probe that reports if a service is ready/alive. |
| **Metrics** | — | Numeric measurements over time (RPS, lag, error rate). |
| **JVM** | Java Virtual Machine | Runs your app; Actuator exposes JVM memory/thread metrics. |
| **GC** | Garbage Collection | JVM memory cleanup; /actuator/metrics/jvm.gc.pause tracks its pause time. |
| **CPU** | Central Processing Unit | Processor; system.cpu.usage is a common Actuator metric. |
| **JMX** | Java Management Extensions | Alternate way (besides HTTP) Actuator can expose operational data. |
| **SLA** | Service Level Agreement | Reliability commitment; metrics endpoints support SLA monitoring/tracking. |
| **ELK** | Elasticsearch, Logstash, Kibana | Log stack that Actuator/observability integrations can export to. |

---

## Web & API concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **REST** | Representational State Transfer | HTTP/JSON API style. Boot’s web starter builds MVC; Lab 24 owns `@RestController` mappings. |
| **OpenAPI** | — | REST contract language (Lab 13); not WSDL. |
| **MVC** | Model-View-Controller | Spring's web pattern; spring-boot-starter-web builds REST/MVC apps. |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind client requests handled by the embedded server. |
| **HTTPS** | Hypertext Transfer Protocol Secure | Encrypted HTTP; client requests can arrive over HTTP or HTTPS. |
| **URL** | Uniform Resource Locator | Web address; the Actuator endpoints table lists each endpoint's URL. |
| **JSON** | JavaScript Object Notation | Data format Jackson serializes for REST responses and Actuator output. |
| **JWT** | JSON Web Token | Token-based auth, explicitly deferred ("JWT login") to a later lab. |
| **DTO** | Data Transfer Object | Object used to move/validate request data, separate from JPA entities. |
| **CSS** | Cascading Style Sheets | Static web asset served from the src/main/resources/static folder. |

---

## Data & validation

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Jakarta Persistence API | ORM standard; spring-boot-starter-data-jpa auto-configures it. |
| **NoSQL** | Not Only SQL | Non-relational databases (e.g., MongoDB) shown as external systems alongside relational ones. |
| **RDBMS** | Relational Database Management System | Production-grade database recommended under production-readiness. |
| **JSR** | Java Specification Request | Formal Java standard; JSR-380 is the Bean Validation spec behind spring-boot-starter-validation. |
| **SOLID** | Single responsibility, Open/closed, Liskov substitution, Interface segregation, Dependency inversion | Five design principles the best-practices slide asks you to follow. |
| **AOP** | Aspect-Oriented Programming | Cross-cutting concerns layer shown in the Spring Framework Core box. |

---

## Tooling & platform

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDK** | Java Development Kit | Tools needed to build/run Java (lab prerequisite: JDK 21). |
| **CLI** | Command Line Interface | Text-based tool access shown for hitting Actuator endpoints (cURL/CLI). |
| **IDE** | Integrated Development Environment | Your editor/tooling — mentioned as a knowledge-check distractor. |
| **AWS** | Amazon Web Services | Cloud provider listed among Spring Boot's external cloud services. |
| **GCP** | Google Cloud Platform | Cloud provider listed among Spring Boot's external cloud services. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM, the running example this module's lab bootstraps as a Boot app. |

---

## One-line memory aid

> Focus first on: **Spring Boot** · **Auto-Configuration** · **Actuator** · **Profile** · **YAML**.

---

**Related:** [Module 23 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
