# Module 31 — Acronym Cheatsheet

**Topic:** Kafka Integration with Spring Boot  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **24** curriculum slide diagram title(s) plus slide text for this module._

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Consumer** | Kafka Consumer | Application that reads messages from Kafka topics. |
| **Consumer Group** | — | Set of consumers that share work on a topic’s partitions. |
| **DLQ** | Dead Letter Queue | The `.dlq`-suffixed sibling topic name (from Lab 30) that Lab 31 assumes and routes poison messages into. |
| **DLT** | Dead Letter Topic | Spring Kafka's term for the same concept -- `DeadLetterPublishingRecoverer` publishes unrecoverable records here instead of losing them. |
| **EOS** | Exactly-Once Semantics | Strongest delivery guarantee (idempotent producer + transactions); Lab 31 deliberately uses At-Least-Once + app-level idempotency instead. |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **Offset** | — | Position of a consumer in a partition’s message log. |
| **Producer** | Kafka Producer | Application that writes messages to Kafka topics. |
| **RF** | Replication Factor | Per-topic broker-copy count; deck recommends `RF >= 3` for production reliability. |
| **Topic** | — | Named stream of related events in Kafka. |
| **UUID** | Universally Unique Identifier | Used for correlation/event IDs; deck warns the partition *key* must be `customerId`, never a random UUID. |
| **JMS** | Java Message Service | Traditional point-to-point queue API, contrasted with Kafka's publish/subscribe model (a message is consumed once vs. once per consumer group). |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind the synchronous Customer API that triggers the Kafka publish. |
| **API** | Application Programming Interface | The existing synchronous REST API (Modules 22-29) that now also publishes events. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SASL** | Simple Authentication and Security Layer | Client/broker authentication mechanism (e.g. `SASL/OAUTHBEARER`) named in the security best-practices checklist. |
| **TLS** | Transport Layer Security | Encrypts Kafka traffic in transit and at rest, alongside SASL authentication. |
| **SSL** | Secure Sockets Layer | Named alongside TLS (`TLS/SSL`) as the encryption option for client/broker traffic. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **PostgreSQL** | — | Relational database used in Week 4 SQL labs (Labs 37–39). |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDK** | Java Development Kit | Deck notes Lab 31 uses JDK 21 + Maven with the `spring-kafka` dependency. |
| **IDE** | Integrated Development Environment | Pre-lab exercises are explicitly "no IDE, no compiling" -- paper/planning only. |

---

## One-line memory aid

> Focus first on: **Kafka** · **Spring Boot** · **Producer** · **Consumer** · **Topic**.

---

**Related:** [Module 31 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
