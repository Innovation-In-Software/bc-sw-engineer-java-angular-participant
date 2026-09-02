# Module 17 — Acronym Cheatsheet

**Topic:** JUnit Testing Fundamentals  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **21** curriculum slide diagram title(s) plus slide text for this module._

---

## Testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AAA** | Arrange-Act-Assert | Common unit-test structure: setup, call, check. |
| **JUnit** | — | Standard unit-testing framework for Java. |
| **SUT** | System Under Test | The class/component you are testing. |
| **TDD** | Test-Driven Development | Write a failing test first, then make it pass. |
| **CSV** | Comma-Separated Values | Row-per-line data format used by `@CsvSource` for parameterized tests. |
| **E2E** | End-to-End | The slowest, highest-level test-pyramid layer — validates the complete system. |
| **FIRST** | Fast, Independent, Repeatable, Self-Validating, Timely | Checklist qualities for judging whether any test is well-designed. |
| **UI** | User Interface | What a user sees/clicks; the layer UI-heavy systems balance testing around. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |
| **JDK** | Java Development Kit | The Java toolchain (e.g., JDK 21) needed to compile and run the lab. |
| **DB** | Database | Persistent data store — `@BeforeAll` should never open a live DB connection. |
| **I/O** | Input/Output | Slow, non-deterministic boundary (files, network, database) that gets mocked or faked, not tested directly in a unit test. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Domain context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM `CustomerService` scenario used throughout this module's examples and lab. |

---

## One-line memory aid

> Focus first on: **JUnit** · **AAA** · **SUT** · **TDD** · **AI**.

---

**Related:** [Module 17 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
