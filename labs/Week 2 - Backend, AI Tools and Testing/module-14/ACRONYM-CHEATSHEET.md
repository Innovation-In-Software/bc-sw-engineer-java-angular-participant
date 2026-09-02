# Module 14 — Acronym Cheatsheet

**Topic:** DTOs, Validation and API Contracts  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **21** curriculum slide diagram title(s) plus slide text for this module._

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bean Validation** | Jakarta Bean Validation | Annotations like `@NotNull` to validate objects. |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **CRM** | Customer Relationship Management | Northstar's customer system — this module's DTOs are built for it. |

---

## REST & JSON

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JSON** | JavaScript Object Notation | Northstar REST payloads. Never send persistence entities over HTTP. |
| **XML** | Extensible Markup Language | Not the API contract in this course (REST/JSON). |
| **XSD** | XML Schema Definition | Not used as the API contract here (OpenAPI describes REST/JSON). |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | The protocol carrying API requests and responses. |
| **HTTP status** | — | Numeric result codes (200 OK, 404 Not Found, 500 Server Error). |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **OpenAPI** | — | Describes REST APIs (the contract Lab 13 sketches). |
| **REST** | Representational State Transfer | The HTTP-based API style this module's contracts follow. |
| **URI** | Uniform Resource Identifier | The endpoint path (e.g. `/api/v1/users`); also the basis of URI-based API versioning. |
| **HATEOAS** | Hypertext As The Engine Of Application State | Navigation links included in a response so clients can discover related actions. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **JSR** | Java Specification Request | Formal proposal number; Jakarta Validation was formerly known as JSR 380 (Bean Validation). |
| **MVC** | Model-View-Controller | The Spring pattern named in passing; this lab validates programmatically, without Spring MVC. |

---

## Persistence & mapping

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Java Persistence API | The ORM layer entities are typically tied to — never leaked into a DTO. |
| **ORM** | Object-Relational Mapping | Technique that maps entities to database rows; DTOs deliberately sit outside this layer. |

---

## Environment & tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDK** | Java Development Kit | JDK 21 is the required Java tooling for this lab (no Spring Boot). |
| **POM** | Project Object Model | Maven's project file; validation dependencies are added here. |

---

## Error handling, versioning & security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **RFC** | Request for Comments | RFC 9457 defines the "problem details" error response shape used in this module. |
| **Correlation ID** | — | Shared ID (e.g. `lab-request-001`) carried in headers/logs so a request can be traced end-to-end. |
| **EOL** | End of Life | When a deprecated API version is finally removed after its sunset date. |
| **SQL** | Structured Query Language | Named alongside HTML/URLs as an injection target to encode or parameterize at point of use. |
| **HTML** | Hypertext Markup Language | Named alongside SQL/URLs as an injection target to encode at point of use. |
| **TLD** | Top-Level Domain | The last part of an email address checked by `@Email` format validation. |
| **i18n** | Internationalization | Numeronym for "internationalization"; externalizing validation messages for multiple languages. |

---

## One-line memory aid

> Focus first on: **DTO** · **XSD** · **XML** · **JSON** · **API**.

---

**Related:** [Module 14 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
