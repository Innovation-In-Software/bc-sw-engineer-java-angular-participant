# Module 20 — Acronym Cheatsheet

**Topic:** Logging Frameworks and Diagnostics  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **19** curriculum slide diagram title(s) plus slide text for this module._

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Correlation ID** | — | Shared ID placed in logs so you can find one request end-to-end. |
| **Logback** | — | Popular SLF4J implementation for Java logging. |
| **MDC** | Mapped Diagnostic Context | Per-request key/value context attached to log lines. |
| **Observability** | — | Ability to understand system health via logs, metrics, and traces. |
| **SLF4J** | Simple Logging Facade for Java | Logging API facade; pick Logback/Log4j underneath. |
| **PII** | Personally Identifiable Information | Data (name, email, phone) that must never appear in a log line — the lab's zero-PII objective. |
| **JSON** | JavaScript Object Notation | Structured log format with named fields, preferred over free-form text for search/analysis. |
| **XML** | Extensible Markup Language | Format of `logback.xml` / `logback-spring.xml` configuration files. |
| **SRE** | Site Reliability Engineering | Team that typically owns log collection/transport and storage/retention in the pipeline-ownership table. |
| **TTL** | Time To Live | Automated expiry for a temporary runtime log-level change so a DEBUG override doesn't outlive an incident. |
| **SLO** | Service Level Objective | Burn-rate signal recommended as a better alert source than alerting on every single ERROR log. |
| **JFR** | Java Flight Recorder | Production-safe deep-diagnostics tool (with heap/thread dumps) used after logs, not instead of them. |
| **ISO8601** | International Organization for Standardization 8601 | Standard timestamp format (`%d{ISO8601}`) used in the Logback pattern layout. |
| **TLS/SSL** | Transport Layer Security / Secure Sockets Layer | Secure transport used when shipping logs to a centralized platform. |
| **TCP/UDP** | Transmission Control Protocol / User Datagram Protocol | Network transport options listed for shipping logs to remote destinations. |
| **ELK** | Elasticsearch, Logstash, Kibana | Common open-source stack for storing, shipping, and visualizing centralized logs. |
| **MTTR** | Mean Time To Resolution | Metric centralized logging and correlation IDs help reduce during incidents. |
| **HTTP** | Hypertext Transfer Protocol | Protocol whose method/route/status get logged for each request — never the raw URL. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |

---

## Domain context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM events (Ravi/Amina) used in the log-level and PII exercises. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## One-line memory aid

> Focus first on: **SLF4J** · **Logback** · **MDC** · **Correlation ID** · **API**.

---

**Related:** [Module 20 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
