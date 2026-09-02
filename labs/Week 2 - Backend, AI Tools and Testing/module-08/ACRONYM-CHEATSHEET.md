# Module 8 — Acronym Cheatsheet

**Topic:** Java Project Structure and Modularization  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **30** curriculum slide diagram title(s) plus slide text for this module._

---

## Build & packaging

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JAR** | Java ARchive | Packaged Java classes/libs in one file. |
| **Maven** | — | Build tool that compiles, tests, packages, and manages dependencies. |
| **WAR** | Web Application Archive | Packaged web app for a servlet container. |
| **POM** | Project Object Model | `pom.xml` — Maven's project config file (dependencies, plugins, build settings). |
| **UTF-8** | Unicode Transformation Format – 8-bit | Source encoding set in `pom.xml` so text displays correctly. |
| **EE** | Enterprise Edition | Jakarta EE — the enterprise Java platform mentioned alongside Spring for framework support. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **SOLID** | Single responsibility, Open-closed, Liskov substitution, Interface segregation, Dependency inversion | Five OOP design principles referenced for good package design. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **REST** | Representational State Transfer | API style used by the controller layer (REST controllers/endpoints). |
| **HTTP** | Hypertext Transfer Protocol | Protocol carrying client requests and server responses through the layers. |
| **SOAP** | Simple Object Access Protocol | Alternative API style mentioned alongside REST for external API calls. |
| **JSON** | JavaScript Object Notation | Common HTTP response body format (alongside HTML/XML). |
| **XML** | Extensible Markup Language | Structured config/response format (`pom.xml`, resource files, HTTP responses). |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRUD** | Create, Read, Update, Delete | Four basic data operations. |
| **DAO** | Data Access Object | Object that reads/writes persistence (DB) details. |
| **JPA** | Jakarta Persistence API | Standard for mapping Java objects to database tables (entities, repositories). |
| **DB** | Database | Persistent data store at the bottom of the layered architecture. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |
| **JDK** | Java Development Kit | The compiler/runtime install used to build and run the module. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Repository** | — | Layer/interface focused on data access. |
| **Service Layer** | — | Business logic layer between controllers/endpoints and persistence. |
| **MVC** | Model-View-Controller | Pattern behind the presentation layer (Spring MVC, `@RestController`). |
| **AOP** | Aspect-Oriented Programming | Handles cross-cutting concerns (logging, security) centrally, outside business logic. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Compact auth token used for securing requests (Security: OAuth2 / JWT). |
| **OAuth2** | Open Authorization 2.0 | Delegated login/authorization standard used alongside JWT. |
| **CORS** | Cross-Origin Resource Sharing | Browser security rule the web/MVC config layer must configure for cross-site requests. |

---

## Web & presentation

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JSP** | JavaServer Pages | Older server-rendered view technology shown in the presentation layer. |
| **UI** | User Interface | What the presentation layer is responsible for. |
| **HTML** | HyperText Markup Language | Web page markup produced by the presentation layer. |
| **CSS** | Cascading Style Sheets | Styling for the presentation layer's web pages. |
| **JS** | JavaScript | Client-side scripting shown alongside HTML/CSS in the presentation layer. |
| **IIS** | Internet Information Services | Example web server (alongside Apache/Nginx) that forwards requests to the servlet container. |
| **SMTP** | Simple Mail Transfer Protocol | Protocol behind the example external Email Service. |

---

## Enterprise & business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Business domain example used to map types to packages/classes. |
| **KYC** | Know Your Customer | Customer Management module responsibility in the banking-app example. |
| **AML** | Anti-Money Laundering | Compliance responsibility alongside KYC in Customer Management. |
| **UPI** | Unified Payments Interface | Example payment method handled by the Payment Gateway module. |
| **MIS** | Management Information System | Reports produced by the Reporting & Analytics module. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HA** | High Availability | Design so the system stays up despite failures. |
| **CI** | Continuous Integration | Automatically build/test code on every change (CI/CD pipeline). |
| **CD** | Continuous Delivery/Deployment | Automatically ship validated changes toward production (CI/CD pipeline). |

---

## One-line memory aid

> Focus first on: **JAR** · **WAR** · **API** · **DTO** · **DAO**.

---

**Related:** [Module 8 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
