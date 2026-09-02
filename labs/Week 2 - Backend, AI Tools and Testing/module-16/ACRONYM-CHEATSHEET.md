# Module 16 — Acronym Cheatsheet

**Topic:** Exception Handling in Distributed APIs  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **18** curriculum slide diagram title(s) plus slide text for this module._

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | How clients send web/API requests. |
| **HTTP status** | — | Numeric result codes (200 OK, 404 Not Found, 500 Server Error). |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTPS** | HTTP Secure | HTTP over TLS encryption. |
| **SSL** | Secure Sockets Layer | Older name for the transport encryption layer (e.g. "SSL handshake failed" as a network-error example). |
| **JWT** | JSON Web Token | Session/auth token type; `TokenExpiredException` fires when a JWT has expired. |
| **OAuth** | Open Authorization | Standard some APIs use for standardized authentication error fields. |
| **PII** | Personally Identifiable Information | Data (with passwords, tokens) that must never be logged — use non-sensitive stable IDs instead. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **Global Exception Handler** | — | Central place that turns exceptions into consistent API errors. |
| **RFC** | Request for Comments | RFC 9457 (and the earlier RFC 7807) Problem Details format for the standard error response. |
| **SQL** | Structured Query Language | Never allowed to leak into an error message — "no SQL/stack trace" in safe responses. |

---

## REST & JSON

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JSON** | JavaScript Object Notation | Northstar error bodies. Safe Fail JSON never includes SQL or stack traces. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Correlation ID** | — | Shared ID placed in logs so you can find one request end-to-end. |
| **Trace ID** | — | A distributed-tracing ID for one trace; related to, but not always identical to, the correlation ID. |
| **MDC** | Mapped Diagnostic Context | Thread-local map (`MDC.put`/`MDC.remove`) that carries the correlation ID onto every log line for a request. |
| **CLI** | Command Line Interface | The lab's error demos run as CLI demos proving 400/404/409 responses. |
| **DNS** | Domain Name System | Named as a typical network failure mode (DNS failures) in distributed systems. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## One-line memory aid

> Focus first on: **API** · **HTTP** · **HTTPS** · **REST** · **Global Exception Handler**.

---

**Related:** [Module 16 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
