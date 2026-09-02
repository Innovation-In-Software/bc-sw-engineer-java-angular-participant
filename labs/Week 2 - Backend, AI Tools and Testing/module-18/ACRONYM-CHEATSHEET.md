# Module 18 — Acronym Cheatsheet

**Topic:** Mockito for Test Isolation  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **18** curriculum slide diagram title(s) plus slide text for this module._

---

## Testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AAA** | Arrange-Act-Assert | Common unit-test structure: setup, call, check. |
| **JUnit** | — | Standard unit-testing framework for Java. |
| **Mockito** | — | Library to create test doubles (mocks/stubs) for isolation. |
| **SUT** | System Under Test | The class/component you are testing — never mock it, only its collaborators. |
| **TDD** | Test-Driven Development | Development style the mocking infographic lists as a benefit of test doubles. |
| **BDD** | Behavior-Driven Development | `given()/then().should()` style used in `CustomerServiceBddMockTest`. |
| **DTO** | Data Transfer Object | A plain value object — mocking these is a common mocking mistake; use real instances. |
| **I/O** | Input/Output | Slow, non-deterministic boundary (e.g., `CustomerRepository`) that gets mocked, not exercised for real. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |
| **Service Layer** | — | Business logic layer between controllers/endpoints and persistence. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## External boundaries

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SDK** | Software Development Kit | A vendor's client library (Stripe, PayPal) — mock your own gateway interface, never the SDK directly. |
| **HTTP** | Hypertext Transfer Protocol | Protocol behind REST/third-party calls; mock the app-owned boundary, not the protocol details. |
| **REST** | Representational State Transfer | Style used by partner/internal APIs mocked through an application-owned gateway interface. |
| **SMS** | Short Message Service | A notification channel (with email/push) whose vendor client gets wrapped in an app-owned port. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app — IntelliJ IDEA is this lab's tech-stack choice. |

---

## Domain context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM `DefaultCustomerService` scenario used throughout this module's examples and lab. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |

---

## One-line memory aid

> Focus first on: **Mockito** · **JUnit** · **SUT** · **AAA** · **DI**.

---

**Related:** [Module 18 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
