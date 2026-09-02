# Module 30 — Acronym Cheatsheet

**Topic:** Event-Driven Architecture with Kafka  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **26** curriculum slide diagram title(s) plus slide text for this module._

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Broker** | Kafka Broker | A Kafka server that stores and serves topic data. |
| **Consumer** | Kafka Consumer | Application that reads messages from Kafka topics. |
| **Consumer Group** | — | Set of consumers that share work on a topic’s partitions. |
| **DLQ** | Dead Letter Queue | Sibling topic (e.g. `crm.customer-events.v1.dlq`) for records that fail processing instead of blocking the main topic. |
| **EDA** | Event-Driven Architecture | Services communicate by publishing/consuming events. |
| **ISR** | In-Sync Replicas | The subset of a partition's replicas fully caught up with the leader; only ISR members count toward durability/leader-election. |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **Offset** | — | Position of a consumer in a partition’s message log. |
| **Partition** | — | Slice of a topic for scale and ordering within the partition. |
| **Producer** | Kafka Producer | Application that writes messages to Kafka topics. |
| **Replication** | — | Keeping copies of data on multiple brokers for durability/HA. |
| **RF** | Replication Factor | Per-topic setting for how many broker copies of each partition exist (e.g. `RF=3`). |
| **Topic** | — | Named stream of related events in Kafka. |

---

## REST & data formats

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | Deck contrasts synchronous HTTP APIs (Labs 25-29) with asynchronous Kafka events. |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind the synchronous Customer API that events run alongside. |
| **JSON** | JavaScript Object Notation | Format for the versioned event envelopes (`eventType`, `payload`, etc.) producers publish. |
| **CRUD** | Create, Read, Update, Delete | Describes the CRM's existing synchronous REST operations, contrasted with Kafka's asynchronous fan-out. |
| **ISO 8601** | International Organization for Standardization, format 8601 | Standard timestamp format used for an event's `occurredAt` field. |

---

## Enterprise use cases & tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **BI** | Business Intelligence | Downstream system (dashboards/reporting) that consumes processed event data. |
| **ML** | Machine Learning | Downstream pipeline that consumes Kafka streams (e.g. fraud detection). |
| **ETL** | Extract, Transform, Load | Traditional batch data-integration pattern; Kafka replaces its "minutes-to-hours" latency with near real-time streaming. |
| **ORM** | Object-Relational Mapping | Category Hibernate/JPA belong to -- named as tools unrelated to Kafka streaming (a quiz distractor). |
| **JPA** | Java Persistence API | Named alongside Hibernate as an ORM tool, distinct from Kafka's streaming model. |
| **JVM** | Java Virtual Machine | "The producing JVM can be completely offline" -- illustrates that publishing and processing an event are decoupled. |
| **IoT** | Internet of Things | Example event source/use case (device telemetry ingestion and monitoring). |
| **CLI** | Command-Line Interface | Kafka's command-line tools for producing/consuming records directly (used in the lab's evidence capture). |

---

## One-line memory aid

> Focus first on: **EDA** · **Kafka** · **Broker** · **Topic** · **Partition**.

---

**Related:** [Module 30 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
