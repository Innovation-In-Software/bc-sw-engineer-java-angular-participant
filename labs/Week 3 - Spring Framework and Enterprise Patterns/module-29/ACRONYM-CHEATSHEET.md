# Module 29 — Acronym Cheatsheet

**Topic:** Validation and Global Exception Handling  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **28** curriculum slide diagram title(s) plus slide text for this module._

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bean Validation** | Jakarta Bean Validation | Annotations like `@NotNull` to validate objects. |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **Global Exception Handler** | — | Central place that turns exceptions into consistent API errors. |
| **JSR** | Java Specification Request | Bean Validation is standardized as JSR 380 (Jakarta Bean Validation). |
| **JPA** | Jakarta Persistence API | The spec Hibernate implements; deck contrasts it with Bean Validation as "one implementation of a specification." |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **JVM** | Java Virtual Machine | Runs compiled Java; `Error` (vs. `Exception`) covers problems the JVM itself can't handle. |
| **UI** | User Interface | The screen/form a user interacts with (client-side validation lives here). |
| **UX** | User Experience | How good/clear the app feels to use; good error messages improve UX. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | How clients send web/API requests. |
| **HTTPS** | HTTP Secure | Encrypted HTTP; deck pairs it with rate limiting to protect data in transit. |
| **HTML** | HyperText Markup Language | What a framework-default error page renders as -- an API must never return this to a client. |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |
| **RFC** | Request for Comments | RFC 5322 is the email-format standard `@Email` validates against. |
| **ISO 8601** | International Organization for Standardization, format 8601 | Standard timestamp format used in the `ErrorResponse`'s `timestamp` field. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Auto-Configuration** | Spring Boot Auto-Configuration | Boot wires defaults based on classpath and properties. |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |
| **MVC** | Model-View-Controller | Bean Validation "integrates with Spring MVC/Boot to validate automatically." |

---

## Angular & REST

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Angular** | — | SPA that consumes the `ErrorResponse` JSON this module defines. |

---

## Security & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **XSS** | Cross-Site Scripting | Attack validation must block, alongside SQL injection, at the input boundary. |
| **SQL** | Structured Query Language | Deck warns against SQL injection and against leaking raw SQL fragments in error messages. |
| **PII** | Personally Identifiable Information | Never log or return this (or passwords/tokens) in a response or log line. |
| **JWT** | JSON Web Token | Mentioned alongside OAuth2 as how identity is verified before authorization checks run. |
| **OAuth2** | Open Authorization 2.0 | Delegated-login/authorization standard, paired with JWT for authentication. |
| **ELK** | Elasticsearch, Logstash, Kibana | Example log aggregator that can query structured, JSON-shaped log lines by field. |

---

## One-line memory aid

> Focus first on: **Bean Validation** · **Global Exception Handler** · **DTO** · **API** · **HTTP**.

---

**Related:** [Module 29 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
