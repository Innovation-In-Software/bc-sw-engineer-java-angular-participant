# Module 46 — Acronym Cheatsheet

**Topic:** Kafka Resilience and Observability  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **16** curriculum slide diagram title(s) plus slide text for this module._

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Broker** | Kafka Broker | A Kafka server that stores and serves topic data. |
| **Capacity Planning** | — | Sizing brokers/partitions/storage for expected load. |
| **Consumer** | Kafka Consumer | Application that reads messages from Kafka topics. |
| **Consumer Lag** | — | How far behind a consumer is from the latest messages. |
| **DLQ** | Dead Letter Queue | Place for messages that keep failing so they don’t block the pipeline. |
| **DLT** | Dead Letter Topic | The concrete Kafka topic (e.g. `crm.customer.events.DLT`) that implements the DLQ pattern in this module. |
| **ISR** | In-Sync Replicas | Replicas that are caught up with the leader. |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **Message Backlog** | — | Queue of unprocessed messages waiting for consumers. |
| **Producer** | Kafka Producer | Application that writes messages to Kafka topics. |
| **Replication** | — | Keeping copies of data on multiple brokers for durability/HA. |
| **Topic** | — | Named stream of related events in Kafka. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Fault Tolerance** | — | System continues correctly when parts fail. |
| **HA** | High Availability | Design so the system stays up despite failures. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Latency** | — | How long one request/message takes end-to-end. |
| **Metrics** | — | Numeric measurements over time (RPS, lag, error rate). |
| **Observability** | — | Ability to understand system health via logs, metrics, and traces. |
| **Throughput** | — | How much work/messages processed per unit time. |
| **JMX** | Java Management Extensions | Exporter that collects broker/JVM metrics for Prometheus. |

---

## Infrastructure & security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CPU** | Central Processing Unit | Broker resource tracked for bottlenecks and capacity headroom. |
| **JVM** | Java Virtual Machine | Per-broker health metric tracked alongside disk and network. |
| **AZ** | Availability Zone | Data-center zone; cross-AZ traffic issues are a named failure category. |
| **TLS** | Transport Layer Security | Encrypts Kafka traffic in transit — part of the production readiness checklist. |
| **SASL** | Simple Authentication and Security Layer | Kafka client authentication mechanism checked before go-live. |
| **ACL** | Access Control List | Rules controlling which clients can read/write which topics. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | Downstream service calls inside consumer logic that can add latency or cause backlogs. |
| **CRM** | Customer Relationship Management | Northstar CRM — the customer platform whose crm.customer.events pipeline is this module's running scenario. |
| **DB** | Database | Shorthand used for one of the named consumer-failure categories (validation, deserialization, timeout, DB, authz). |
| **PII** | Personally Identifiable Information | Real customer data that must never appear in logs/metrics — only synthetic fixtures (CUS-1001/CUS-1002) are used. |
| **SLA** | Service Level Agreement | Uptime/latency commitment put at risk when lag or backlogs grow unchecked. |

---

## One-line memory aid

> Focus first on: **Kafka** · **Consumer Lag** · **DLQ** · **Replication** · **ISR**.

---

**Related:** [Module 46 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
