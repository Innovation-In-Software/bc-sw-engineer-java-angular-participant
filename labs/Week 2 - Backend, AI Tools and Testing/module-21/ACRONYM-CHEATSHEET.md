# Module 21 — Acronym Cheatsheet

**Topic:** API Observability and Monitoring  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **23** curriculum slide diagram title(s) plus slide text for this module._

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **APM** | Application Performance Monitoring | Tools that track latency, errors, and traces in apps. |
| **Health Check** | — | Endpoint/probe that reports if a service is ready/alive. |
| **Latency** | — | How long one request/message takes end-to-end. |
| **Metrics** | — | Numeric measurements over time (RPS, lag, error rate). |
| **Observability** | — | Ability to understand system health via logs, metrics, and traces. |
| **SLA** | Service Level Agreement | Contracted reliability promise to customers. |
| **SLI** | Service Level Indicator | Measured metric used to track an SLO. |
| **SLO** | Service Level Objective | Target reliability/latency goal you aim to meet. |
| **SRE** | Site Reliability Engineering | Ops practice focused on reliability, SLOs, and incident response. |
| **Throughput** | — | How much work/messages processed per unit time. |
| **Tracing** | — | Follow a request across services with span IDs. |
| **RPS** | Requests Per Second | Throughput metric shown on dashboards and request-rate charts. |
| **MTTR** | Mean Time To Restore/Resolve | Ambiguous term the deck warns against — use explicit variants instead (detect/acknowledge/restore/resolve). |
| **KPI** | Key Performance Indicator | Headline dashboard number (e.g., request rate, p95, error rate, availability). |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SDLC** | Software Development Life Cycle | Stages from idea → build → test → release → maintain. |
| **CI/CD** | Continuous Integration / Continuous Deployment | Automated build-test-release pipeline (previewed for Week 3). |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Actuator** | Spring Boot Actuator | Production endpoints for health, metrics, and info. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## Metrics internals

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **RED Method** | Rate, Errors, Duration | Core signals to track for request-driven services (how often, how many fail, how long). |
| **USE Method** | Utilization, Saturation, Errors | Core signals to track for infrastructure/resources (how busy, how maxed out, how many errors). |
| **JVM** | Java Virtual Machine | Runs your compiled Java code; JVM memory/GC metrics show its health. |
| **GC** | Garbage Collection | JVM process that frees unused memory; GC pause time is a key JVM metric. |
| **CPU** | Central Processing Unit | Processor; CPU usage is a core resource/saturation metric. |
| **JMX** | Java Management Extensions | Built-in Java mechanism for exposing management/monitoring data (listed as a metrics-collection option). |
| **SNMP** | Simple Network Management Protocol | Older network-device monitoring protocol, listed as a metrics-collection option. |
| **TSDB** | Time-Series Database | Storage optimized for timestamped metric data (e.g., Prometheus TSDB). |

---

## Web & data formats

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind API requests; HTTP status/request-rate show up throughout the metrics slides. |
| **JSON** | JavaScript Object Notation | Structured text format used for log entries and Actuator responses. |
| **SQL** | Structured Query Language | Database query language; raw SQL should never be logged with personal values. |
| **URI** | Uniform Resource Identifier | Identifies a resource; full URIs are a high-cardinality metric-label risk. |
| **URL** | Uniform Resource Locator | Web address; raw URLs with IDs are flagged as a cardinality anti-pattern. |
| **W3C** | World Wide Web Consortium | Standards body; its Trace Context spec defines how tracing IDs propagate across services. |

---

## Tooling & environment

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JDK** | Java Development Kit | Tools needed to build/run Java (lab prerequisite: JDK 21). |
| **CLI** | Command Line Interface | Text-based tool access; Actuator endpoints can be reached via CLI/scripts. |
| **AWS** | Amazon Web Services | Cloud provider; CloudWatch is AWS's native monitoring/export target. |
| **K8s** | Kubernetes | Container orchestrator; referenced alongside "Servers, Containers, K8s" in the monitoring architecture diagram. |

---

## Business & data context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM app this module's lab instruments. |
| **DB** | Database | Persistent data store; DB health/connectivity is a common health-check target. |
| **JPA** | Jakarta Persistence API | Java's standard ORM API for data access (previewed for Week 3). |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **UI** | User Interface | The user-facing part of an app; mentioned in the "test at every level" week recap. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## One-line memory aid

> Focus first on: **Observability** · **Metrics** · **Tracing** · **APM** · **SLO**.

---

**Related:** [Module 21 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
