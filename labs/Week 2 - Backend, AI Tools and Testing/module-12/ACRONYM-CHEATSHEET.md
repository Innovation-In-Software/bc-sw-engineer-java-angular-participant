# Module 12 — Acronym Cheatsheet

**Topic:** Java Coding Standards and Best Practices  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **19** curriculum slide diagram title(s) plus slide text for this module._

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **OOP** | Object-Oriented Programming | Design with objects that hold data and behavior. |
| **SOLID** | Single responsibility, Open-closed, Liskov substitution, Interface segregation, Dependency inversion | Five design principles for maintainable object-oriented code. |
| **SRP** | Single Responsibility Principle | A class should have one reason to change. |
| **DIP** | Dependency Inversion Principle | Depend on abstractions, not concretions; the deck defers "DIP wiring frameworks" work to Labs 13+. |
| **ISP** | Interface Segregation Principle | Prefer several small, specific interfaces over one large one; large REST resource interfaces are deferred to later labs. |
| **DRY** | Don't Repeat Yourself | Avoid duplicated code — extract common logic into one reusable method instead of copy-pasting it. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |
| **JDK** | Java Development Kit | The Java version/toolchain referenced for newer language behavior (e.g., "JDK 21: prefer enum if closed set"). |
| **JavaDoc** | Java Documentation (comment format) | Structured comments on public APIs that explain what a class/method does for other developers. |
| **SCA** | Static Code Analysis | Automated scanning of code without running it — the practice behind Checkstyle/PMD/SpotBugs/SonarQube and CI/CD quality gates. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **REST** | Representational State Transfer | This course’s API style; excluded from Module 12’s cleanup and deferred to Module 13 (OpenAPI). |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DI** | Dependency Injection | Dependencies are provided to a class instead of created inside it. |

---

## Security testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **OWASP** | Open Worldwide Application Security Project | Community standards and top risks for app security. |
| **PII** | Personally Identifiable Information | Sensitive data (e.g., a raw email address) that must never be written to logs. |
| **SQL** | Structured Query Language | Database query language; SQL injection is one of the vulnerability types static analysis flags. |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SDLC** | Software Development Life Cycle | Stages from idea → build → test → release → maintain. |
| **CI/CD** | Continuous Integration / Continuous Delivery | Pipeline that runs builds, tests, and static analysis automatically, failing the build on quality violations. |
| **PR** | Pull Request | The reviewed unit of change (GitHub/GitLab) that should stay small, explain intent/risk, and be approved before merging. |

---

## Lab & business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The legacy Northstar `CustomerService` class Lab 12 refactors to bring up to enterprise standard. |

---

## One-line memory aid

> Focus first on: **API** · **OOP** · **SOLID** · **IDE** · **SRP**.

---

**Related:** [Module 12 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
