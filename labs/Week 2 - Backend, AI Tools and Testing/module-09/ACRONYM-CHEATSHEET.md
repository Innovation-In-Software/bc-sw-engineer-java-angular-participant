# Module 9 — Acronym Cheatsheet

**Topic:** Build and Dependency Management with Maven  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **39** curriculum slide diagram title(s) plus slide text for this module._

---

## Build & packaging

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **EAR** | Enterprise Application aRchive | Third packaging option named alongside JAR/WAR in the package phase (bundles multiple modules). |
| **GAV** | groupId : artifactId : version | The three coordinates that together uniquely identify every Maven project/artifact. |
| **JAR** | Java ARchive | Packaged Java classes/libs in one file. |
| **Maven** | — | Build tool that compiles, tests, packages, and manages dependencies. |
| **POM** | Project Object Model | Maven’s project config file (`pom.xml`). |
| **SNAPSHOT** | — | Version suffix (e.g. `1.0.0-SNAPSHOT`) meaning “still under active development; may change without a new version.” |
| **WAR** | Web Application Archive | Packaged web app for a servlet container. |

---

## Dependency management

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | Defined way one piece of code calls another; the deck’s scope examples are the Servlet API (provided) and the JDBC API (runtime). |
| **BOM** | Bill of Materials | A POM imported with `scope=import` in `<dependencyManagement>` to pin many versions (e.g. Spring Boot) from one place. |
| **JDBC** | Java Database Connectivity | Standard Java API for talking to databases — the module’s example for `runtime` scope (code compiles against JDBC, the driver loads at runtime). |
| **SLF4J** | Simple Logging Facade for Java | Logging library used as the worked example (`slf4j-api`) for pinning versions with `dependencyManagement` and for showing a version conflict in a dependency tree. |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Artifact** | — | Build output you publish (JAR, image, report). |
| **CI** | Continuous Integration | Automatically build/test on every change. |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **CVE** | Common Vulnerabilities and Exposures | Public catalog of known security flaws — the best-practices slide says to scan dependencies for CVEs to secure the supply chain. |

---

## Repositories

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Repository** | — | A place Maven stores/fetches artifacts: local cache (`~/.m2`), Maven Central, or a corporate/private repo (Nexus, Artifactory). |
| **URL** | Uniform Resource Locator | The address used to reach a repository, e.g. Maven Central’s `https://repo.maven.apache.org/maven2/`. |

---

## Tooling & environment

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CLI** | Command Line Interface | How developers and CI invoke Maven directly (`mvn ...` commands). |
| **IDE** | Integrated Development Environment | Your editor/tooling (IntelliJ IDEA primary, VS Code) — a Lab 9 prerequisite. |
| **JDK** | Java Development Kit | Java tooling you must have installed (JDK 21+ for Lab 9); also what supplies `provided`-scope APIs like the Servlet API. |
| **OS** | Operating System | Windows / macOS / Linux — any is fine for Lab 9. |

---

## Config & IaC

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **YAML** | YAML Ain’t Markup Language | Human-friendly format for config and API docs. |

---

## XML & project files

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **XML** | Extensible Markup Language | The markup format `pom.xml` and its `<dependency>`/`<plugin>` blocks are written in. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM — the business app (`customer-service` artifact) the Lab 8/Lab 9 skeleton builds toward. |

---

## One-line memory aid

> Focus first on: **Maven** · **POM** · **GAV** · **JAR** · **WAR** · **CI**.

---

**Related:** [Module 9 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
