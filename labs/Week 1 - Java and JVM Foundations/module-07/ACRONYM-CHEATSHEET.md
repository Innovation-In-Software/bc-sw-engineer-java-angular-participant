# Module 7 — Acronym Cheatsheet

**Topic:** Exception Handling and Error Management  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **20** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Checked Exception** | — | Exception the compiler forces you to handle or declare. |
| **Stack** | — | Per-thread memory for method frames and local primitives. |
| **try-with-resources** | — | Auto-closes resources (files, connections) in a try block. |
| **Unchecked Exception** | — | RuntimeException/Error — not forced by the compiler. |
| **JDK** | Java Development Kit | The compiler/runtime install (JDK 21) used for the module. |
| **JVM** | Java Virtual Machine | Looks for a matching catch handler as an exception propagates; terminates the program if none is found. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Propagation** | Transaction Propagation | How nested calls join or start transactions. |
| **SQL** | Structured Query Language | Language to query and change relational data. |
| **DB** | Database | Persistent data store; an AutoCloseable resource example for try-with-resources. |

---

## Logging & diagnostics

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **SLF4J** | Simple Logging Facade for Java | A logging facade — your code logs against SLF4J's API, which delegates to a real framework (Logback, Log4j 2, JUL). |
| **JUL** | java.util.logging | Java's built-in logging framework; one of the possible SLF4J bindings. |
| **ELK** | Elasticsearch, Logstash, Kibana | Example centralized log stack used to search/analyze log output. |
| **MTTD** | Mean Time To Detect | How quickly an error/incident is noticed — lower is better. |
| **MTTR** | Mean Time To Resolution | How quickly an error/incident is fixed once detected — good logging reduces this. |
| **PII** | Personally Identifiable Information | Sensitive data (names, card numbers) that must never be logged in plain text. |
| **JSON** | JavaScript Object Notation | Structured log format recommended so entries are searchable/correlatable. |

---

## Lab & real-world context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **ATM** | Automated Teller Machine | The Lab 7 domain: a fault-tolerant ATM Banking System console app. |
| **PIN** | Personal Identification Number | Example login credential in the ATM lab (retry limits, never logged). |

---

## One-line memory aid

> Focus first on: **Checked Exception** · **Unchecked Exception** · **try-with-resources** · **API** · **Stack**.

---

**Related:** [Module 7 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
