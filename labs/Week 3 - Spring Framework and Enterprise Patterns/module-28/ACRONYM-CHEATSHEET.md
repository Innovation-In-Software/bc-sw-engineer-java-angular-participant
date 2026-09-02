# Module 28 — Acronym Cheatsheet

**Topic:** Spring Security Fundamentals  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **26** curriculum slide diagram title(s) plus slide text for this module._

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Authentication (AuthN)** | — | Proving who you are (login / token). |
| **Authorization (AuthZ)** | — | What you are allowed to do after authentication. |
| **Filter Chain** | Spring Security Filter Chain | Ordered filters that secure HTTP requests. |
| **HTTPS** | HTTP Secure | HTTP over TLS encryption. |
| **JWT** | JSON Web Token | Compact signed token used for auth between systems. |
| **OAuth** | Open Authorization | Standard for delegated login / authorization. |
| **OIDC** | OpenID Connect | Identity layer on OAuth 2.0 (who the user is). |
| **Principle of Least Privilege** | — | Give only the permissions needed — nothing more. |
| **RBAC** | Role-Based Access Control | Permissions based on roles (admin, user, …). |
| **TLS** | Transport Layer Security | Encrypts data in transit (what HTTPS uses). |

---

## Web attack vectors

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CORS** | Cross-Origin Resource Sharing | Browser rule for which other origins may call your API; overly permissive CORS is a listed mistake. |
| **CSRF** | Cross-Site Request Forgery | Attack that tricks a logged-in browser into submitting an unwanted request; one of the attacks the Filter Chain protects against. |
| **DOM** | Document Object Model | The browser's in-memory page structure; DOM-based XSS injects malicious script directly into it. |
| **IDOR** | Insecure Direct Object Reference | Broken-access-control flaw: changing an ID in a request exposes another user's data. |
| **SSRF** | Server-Side Request Forgery | Attacker tricks the server into making requests to internal systems (e.g. internal APIs, cloud metadata). |
| **XSS** | Cross-Site Scripting | Malicious script runs in a victim's browser (stored, reflected, or DOM-based) to steal cookies/tokens or deface pages. |

---

## Security practices & compliance

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DAST** | Dynamic Application Security Testing | Security testing that probes a running application (paired with SAST). |
| **DDoS** | Distributed Denial of Service | Network attack that floods a system to disrupt access. |
| **DR** | Disaster Recovery | Backup/restore planning so the system survives major failures. |
| **GDPR** | General Data Protection Regulation | EU data-privacy regulation named as a compliance example. |
| **HIPAA** | Health Insurance Portability and Accountability Act | US health-data privacy regulation named as a compliance example. |
| **MFA** | Multi-Factor Authentication | Requiring more than a password (e.g. OTP, biometrics) to log in. |
| **OTP** | One-Time Password | Single-use code used as a second authentication factor. |
| **OWASP** | Open Web Application Security Project | Publishes the "OWASP Top 10" list of common web security risks referenced in the deck. |
| **PCI-DSS** | Payment Card Industry Data Security Standard | Compliance standard for handling card payment data. |
| **SAST** | Static Application Security Testing | Security testing that scans source code without running it (paired with DAST). |
| **SPA** | Single Page Application | Browser app style (e.g. Angular) that commonly stores and sends JWTs. |
| **SSO** | Single Sign-On | Authenticate once, access multiple applications without logging in again. |
| **VPN** | Virtual Private Network | Encrypted network tunnel; recommended for accessing production systems (bastion hosts/VPN). |
| **WAF** | Web Application Firewall | Filters malicious HTTP traffic in front of an application. |

---

## JWT & cryptography

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CSP** | Content Security Policy | Security header that restricts which scripts/resources a page may load. |
| **ECDSA** | Elliptic Curve Digital Signature Algorithm | Asymmetric JWT signing algorithm (ES256); smaller keys than RSA. |
| **HMAC** | Hash-based Message Authentication Code | Symmetric JWT signing: issuer and verifier share one secret key (HS256). |
| **HS256 / RS256 / ES256** | HMAC-SHA256 / RSA-SHA256 / ECDSA-SHA256 | The JWT header's `alg` values naming which signing algorithm (HMAC, RSA, or ECDSA) was used. |
| **HSTS** | HTTP Strict Transport Security | Security header/header policy that forces browsers to use HTTPS and blocks protocol downgrade. |
| **IDP** | Identity Provider | External system that authenticates users; production checklist calls for replacing lab users with a real IdP. |
| **MD5** | Message Digest 5 | Old, broken hashing algorithm — the deck explicitly warns never to use it for passwords. |
| **PBKDF2** | Password-Based Key Derivation Function 2 | Adaptive, standards-based password-hashing algorithm supported everywhere. |
| **RSA** | Rivest–Shamir–Adleman | Asymmetric signing algorithm: a private key signs, a public key verifies (RS256). |
| **SAML** | Security Assertion Markup Language | XML-based identity/authentication standard, alongside OAuth2 and LDAP as auth providers. |
| **SHA-1** | Secure Hash Algorithm 1 | Old hashing algorithm also considered broken — avoid for passwords, like MD5. |
| **SSL** | Secure Sockets Layer | Older encryption protocol named alongside TLS ("validate SSL/TLS certificates"); TLS is its modern successor. |
| **TTL** | Time To Live | How long a token stays valid; best practice is a short access-token TTL plus a refresh flow. |

---

## Persistence & Java tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DAO** | Data Access Object | `DaoAuthenticationProvider` loads user details via a DAO/`UserDetailsService`. |
| **H2** | H2 Database | In-memory database used for the lab's CRM persistence. |
| **JDBC** | Java Database Connectivity | Low-level Java API for talking to a relational database. |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |
| **JSON** | JavaScript Object Notation | Data format a JWT's header/payload are encoded from (then Base64Url-encoded). |
| **LDAP** | Lightweight Directory Access Protocol | Directory-service protocol; one of Spring Security's built-in authentication providers. |
| **MockMvc** | Spring MVC Test | Testing utility used to prove the 401/403/200 status matrix without a running server. |
| **MVC** | Model-View-Controller | Spring's web framework layer; the deck notes deep integration with Spring Boot, Spring MVC, and Spring Cloud. |
| **SQL** | Structured Query Language | Language for relational data; also names SQL Injection, a top web security risk. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another; also the target of many attacks (API Security). |
| **AWS** | Amazon Web Services | Cloud provider named alongside other identity/cloud threat examples. |
| **CRM** | Customer Relationship Management | Northstar CRM: the app this module secures with Spring Security and JWT. |
| **HTTP** | Hypertext Transfer Protocol | The request/response protocol the Filter Chain intercepts and secures. |
| **OS** | Operating System | Hardening target in "Secure Configuration" (harden server/OS configuration). |
| **REST** | Representational State Transfer | API style whose endpoints (e.g. `/api/admin/**`) are secured with roles/authorities. |
| **Angular** | — | SPA (Week 4) that will send JWTs; this lab secures the REST API first. |
| **URL** | Uniform Resource Locator | JWT is described as a "compact, URL-safe" token format. |

---

## One-line memory aid

> Focus first on: **Authentication** · **Authorization** · **JWT** · **RBAC** · **OAuth**.

---

**Related:** [Module 28 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
