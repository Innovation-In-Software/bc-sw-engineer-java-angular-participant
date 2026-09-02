# Module 10 — Acronym Cheatsheet

**Topic:** GitHub Copilot Fundamentals for Java Developers  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **21** curriculum slide diagram title(s) plus slide text for this module._

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |
| **LLM** | Large Language Model | AI model that generates/understands text and code. |
| **GPT** | Generative Pre-trained Transformer | One of the foundation model families (with OpenAI Codex) that powers Copilot's suggestions, hosted via Microsoft Azure. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |
| **JDK** | Java Development Kit | The Java version Lab 10 requires (JDK 21) — verify with `java -version` since Copilot can't see what's actually first on your PATH. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **DTO** | Data Transfer Object | A plain class that carries data between layers (e.g., `CreateCustomerRequest`) — no business logic, kept separate from the domain entity. |
| **JSON** | JavaScript Object Notation | The response format Copilot-generated endpoints return (e.g., `GET /users/{id}` returning JSON). |

---

## Java enterprise & data access

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Jakarta Persistence API | The persistence framework Lab 10 deliberately excludes — reject any Copilot-suggested `@Entity`/`@Table` since there's no JPA dependency yet. |
| **SQL** | Structured Query Language | The query language behind the SQL-injection review example; use `PreparedStatement` with parameters, not string concatenation. |
| **SOLID** | Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion | Five OOP design principles named in the code-review "Check Quality & Best Practices" checklist. |

---

## API styles & integration

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **REST** | Representational State Transfer | This course’s API style. Copilot may scaffold a REST controller; you still review it. Labs 13 and 24 own the real contract. |
| **SOAP** | Simple Object Access Protocol | Not taught here. Reject Copilot WSDL/SOAP suggestions. |
| **CI/CD** | Continuous Integration / Continuous Deployment | Pipelines Copilot can help automate under Cloud & DevOps Automation. |
| **IaC** | Infrastructure as Code | Automated deployment scripts Copilot can help generate (Cloud & DevOps Automation). |
| **ETL** | Extract, Transform, Load | Data-engineering scripts Copilot can help generate (Data Engineering & Integration). |

---

## Business & risk context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM is the running business scenario — Lab 10 scaffolds its Customer domain. |
| **IP** | Intellectual Property | Risk that Copilot may reproduce copyrighted code — review unusually distinctive blocks and check license compatibility. |

---

## One-line memory aid

> Focus first on: **AI** · **LLM** · **Copilot** · **IDE** · **API** · **DTO** · **JPA**.

---

**Related:** [Module 10 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
