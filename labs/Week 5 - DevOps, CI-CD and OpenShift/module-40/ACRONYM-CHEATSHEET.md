# Module 40 — Acronym Cheatsheet

**Topic:** Application Security Testing  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **30** curriculum slide diagram title(s) plus slide text for this module._

---

## Security testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CPE** | Common Platform Enumeration | Standard ID for a software/hardware product, used alongside CVE/CVSS in scan data. |
| **CVE** | Common Vulnerabilities and Exposures | Public ID for a known security flaw. |
| **CVSS** | Common Vulnerability Scoring System | 0.0–10.0 score (v3.1) used to rate severity as Critical/High/Medium/Low/Info. |
| **CWE** | Common Weakness Enumeration | Standard ID for a class of code weakness (e.g. CWE-89 = SQL Injection). |
| **DAST** | Dynamic Application Security Testing | Find security issues by attacking a running app. |
| **IAST** | Interactive Application Security Testing | Analyzes the app from the inside while it runs — a SAST/DAST hybrid. |
| **OWASP** | Open Worldwide Application Security Project | Community standards and top risks for app security. |
| **RASP** | Runtime Application Self-Protection | Monitors/protects the running application from inside during execution. |
| **SAST** | Static Application Security Testing | Find security issues by scanning source/binaries without running the app. |
| **SCA** | Software Composition Analysis | Scans open-source dependencies for known CVEs and license risk — what OWASP Dependency-Check does. |
| **Shift Left** | — | Find security/quality issues earlier in the lifecycle. |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration / Continuous Deployment | Automated build-test-release pipeline where security scans act as gates. |
| **DevSecOps** | — | Practice of embedding security into every DevOps stage, not bolting it on at the end. |
| **IaC** | Infrastructure as Code | Server/cloud config defined as code; scanned for misconfigurations before release. |
| **SDLC** | Software Development Life Cycle | Stages from idea → build → test → release → maintain. |
| **SSDLC** | Secure Software Development Life Cycle | The SDLC with security woven into every phase, not bolted on at the end. |

---

## Frontend & browser security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CSP** | Content Security Policy | Browser policy restricting what scripts/resources a page can load — an XSS mitigation. |
| **CSRF** | Cross-Site Request Forgery | Tricks a logged-in browser into unwanted requests. |
| **XSS** | Cross-Site Scripting | Attack that injects malicious scripts into pages. |

---

## Vulnerability classes

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDOR** | Insecure Direct Object Reference | Reading another user's data by changing an object ID (e.g. in a URL) with no ownership check. |
| **LFI / RFI** | Local File Inclusion / Remote File Inclusion | App is tricked into loading or executing a local or externally-hosted file. |
| **RCE** | Remote Code Execution | Attacker runs arbitrary code on the target system. |
| **SQLi / NoSQLi** | SQL Injection / NoSQL Injection | Untrusted input alters a database query's meaning (e.g. `id=10 OR 1=1--`). |
| **SSRF** | Server-Side Request Forgery | Attacker tricks the server into making requests to internal/unintended destinations. |

---

## Auth & access control

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Compact token carrying authenticated identity/claims between requests. |
| **MFA** | Multi-Factor Authentication | Requires more than a password to log in — a core fix for Broken Authentication. |
| **RBAC** | Role-Based Access Control | Access decisions based on a user's role; must be paired with object-level checks to stop IDOR. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Java Persistence API | Java standard for mapping objects to relational data. |
| **JPQL** | Jakarta Persistence Query Language | Object-oriented query language for JPA — safer than hand-built SQL strings. |
| **ORM** | Object-Relational Mapping | Maps Java objects to database tables/rows; use with bound parameters to avoid SQL injection. |
| **SQL** | Structured Query Language | Language to query and change relational data. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **WAF** | Web Application Firewall | Filters/monitors HTTP traffic to a web app; its presence can be detected by DAST scans. |
| **XXE** | XML External Entity | Attack where XML pulls unsafe external content — disable external entities. |

---

## Compliance & business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CMP** | Customer Management Platform | This module's running enterprise example: a PII- and payment-handling platform. |
| **CRM** | Customer Relationship Management | The Northstar CRM used as this module's real, gradable lab target. |
| **GDPR** | General Data Protection Regulation | EU data-privacy law cited as a compliance driver for security testing. |
| **ISO 27001** | International Organization for Standardization 27001 | International standard for information security management, cited as a compliance driver. |
| **PCI-DSS** | Payment Card Industry Data Security Standard | Compliance standard for handling payment-card data. |
| **PII** | Personally Identifiable Information | Customer data (name, contact, account info) security testing exists to protect. |
| **SLA** | Service Level Agreement | Contractual delivery guarantee; used as an example of transferring risk to a third party. |

---

## Deployment & environments

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **K8s** | Kubernetes | Container-orchestration platform; one of DAST's "containerized" deployment modes alongside Docker. |
| **QA** | Quality Assurance | Pre-production test environment where DAST scans are typically run. |
| **SaaS** | Software as a Service | Cloud-hosted deployment mode for security tools (e.g. a DAST scanner run as SaaS). |

---

## One-line memory aid

> Focus first on: **SAST** · **DAST** · **OWASP** · **CVE** · **CVSS** · **SCA** · **IDOR** · **SDLC**.

---

**Related:** [Module 40 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
