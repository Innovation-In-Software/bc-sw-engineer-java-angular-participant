# Module 11 — Acronym Cheatsheet

**Topic:** GitHub Copilot for Testing and Refactoring  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **21** curriculum slide diagram title(s) plus slide text for this module._

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |
| **Copilot** | GitHub Copilot | AI pair programmer in the IDE. |
| **ML** | Machine Learning | Models that learn from data; used here for defect prediction (flagging likely-bug areas) in the AI-assisted testing hub diagram. |

---

## Testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AAA** | Arrange-Act-Assert | Common unit-test structure: setup, call, check. |
| **JUnit** | — | Standard unit-testing framework for Java. |
| **SUT** | System Under Test | The class/component you are testing. |
| **TDD** | Test-Driven Development | Write a failing test first, then make it pass. |
| **JaCoCo** | Java Code Coverage | Coverage tool referenced in the knowledge check and coverage-gap exercises ("JaCoCo gates deepen in Lab 17"). |
| **I/O** | Input/Output | Real side effects (console prints, email/network calls) that make code hard to unit-test unless isolated behind an interface like `CustomerNotifier`. |

---

## Design & refactoring principles

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SOLID** | Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion | Five OOP design principles the "Also Remember" refactoring slide tells you to follow. |
| **DRY** | Don't Repeat Yourself | Avoid duplicated logic; extract shared code into one place instead of repeating it. |
| **SRP** | Single Responsibility Principle | A class/method should do one thing; large classes get split by applying this rule. |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **GitHub Actions** | — | CI/CD workflows that run on GitHub events. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Service Layer** | — | Business logic layer between controllers/endpoints and persistence. |

---

## Tooling & lab context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your code editor/tooling (IntelliJ IDEA, VS Code) where Copilot runs. |
| **JDK** | Java Development Kit | Java version required for the lab (JDK 21+). |
| **POM** | Project Object Model | Maven's project file (`pom.xml`) listing dependencies like JUnit and Mockito; refactors shouldn't add dependencies not already in it. |
| **API** | Application Programming Interface | Defined way components/tests call each other; refactors must keep public APIs unchanged. |
| **SMTP** | Simple Mail Transfer Protocol | Email-sending protocol referenced in a mocked notifier-failure example ("SMTP down"). |
| **CRM** | Customer Relationship Management | Northstar CRM — the sample enterprise app whose `CustomerService` students test and refactor in Lab 11. |

---

## One-line memory aid

> Focus first on: **AI** · **Copilot** · **JUnit** · **TDD** · **AAA**.

---

**Related:** [Module 11 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
