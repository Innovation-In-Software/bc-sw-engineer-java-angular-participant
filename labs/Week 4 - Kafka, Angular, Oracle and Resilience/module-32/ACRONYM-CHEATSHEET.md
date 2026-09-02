# Module 32 — Acronym Cheatsheet

**Topic:** Resilience and Fault Tolerance  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **26** curriculum slide diagram title(s) plus slide text for this module._

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Backoff** | — | Wait longer between retries to reduce load. |
| **Bulkhead** | — | Isolate failures so one area doesn’t sink the whole system. |
| **Circuit Breaker** | — | Stops calling a failing dependency temporarily to recover. |
| **Fault Tolerance** | — | System continues correctly when parts fail. |
| **HA** | High Availability | Design so the system stays up despite failures. |
| **Idempotent** | Idempotency | Doing the same operation twice has the same effect as once. |
| **Resilience4j** | — | Java library for circuit breaker, retry, rate limiter, and more. |
| **Retry** | — | Try again after a failure (often with backoff). |
| **Timeout** | — | Give up after a time limit instead of waiting forever. |
| **AOP** | Aspect-Oriented Programming | Resilience4j's annotations (`@Retry`, `@CircuitBreaker`) work via Spring AOP proxies -- calling a method from inside the same class bypasses them. |
| **MTBF** | Mean Time Between Failures | Availability metric: how often things break in the first place. |
| **MTTR** | Mean Time To Recover | Availability metric: how fast the system recovers -- the metric resilience patterns most directly improve. |
| **SLA** | Service Level Agreement | Uptime-percentage commitment that HA architectures and metrics track against. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DLQ** | Dead Letter Queue | Place for messages that keep failing so they don’t block the pipeline. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | The downstream Account Profile API that Resilience4j protects outbound calls to. |
| **HTTP** | Hypertext Transfer Protocol | Deck weighs returning HTTP 200 (degraded) vs. HTTP 503 from a fallback response. |
| **REST** | Representational State Transfer | Style of the external APIs being called and protected. |
| **URL** | Uniform Resource Locator | Resilience patterns wrap a call but can't fix a permanently wrong URL or bad config. |

---

## Tooling & UX

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **YAML** | YAML Ain’t Markup Language | Config format for Resilience4j's retry/circuit-breaker/timeout settings in `application.yml`. |
| **IDE** | Integrated Development Environment | Readiness checkpoints confirm understanding before students "open an IDE." |
| **UI** | User Interface | The CRM page/button whose behavior degrades gracefully during a failure. |
| **UX** | User Experience | Fallbacks and fast failures exist to give users a quick, honest result instead of a long silent wait. |
| **DNS** | Domain Name System | Named as a common network-failure cause (DNS resolution failure) alongside latency and packet loss. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **PostgreSQL** | — | Relational database used in Week 4 SQL labs (Labs 37–39). |

---

## One-line memory aid

> Focus first on: **Circuit Breaker** · **Retry** · **Backoff** · **Bulkhead** · **Timeout**.

---

**Related:** [Module 32 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
