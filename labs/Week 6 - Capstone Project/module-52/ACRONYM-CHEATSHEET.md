# Module 52 — Acronym Cheatsheet

**Topic:** Capstone Final Defense and Retrospective  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Capstone / text module: terms taken from slide text and the module topic (few or no slide diagram PNGs)._

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Capstone** | — | Final multi-module project integrating the full stack. |
| **MVP** | Minimum Viable Product | Smallest useful version you can ship and learn from. |

---

## Professional skills

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ADR** | Architecture Decision Record | Short note explaining an architecture choice and why; decisions are defended live by citing the ADR number directly. |
| **Agile** | — | Iterative delivery with frequent feedback. |
| **KPI** | Key Performance Indicator | Metric that shows progress toward a business goal. |
| **Q&A** | Questions and Answers | The technical defense session; each answer follows the four-part claim/evidence/trade-off/next-step structure. |
| **Retrospective** | — | Team review of what went well and what to improve. |
| **SRE** | Site Reliability Engineering | One of the career paths (backend, full-stack, platform/DevOps, SRE-leaning) that draws directly on this capstone build. |
| **Stakeholder** | — | Person/group affected by or interested in the project. |

---

## Architecture & requirements

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **C4** | C4 model (Context, Containers, Components, Code) | The architecture-diagram notation cited from Module 48's docs when presenting the system's design. |
| **NFR** | Non-Functional Requirement | Measurable quality goal (latency, availability) cited with real numbers, not adjectives, during the review and defense. |

---

## Technology stack (recap)

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Angular** | — | Taught SPA (Lab 50). Interceptor attaches JWT; the **API** is the security boundary. |
| **API** | Application Programming Interface | The backend contract from Module 49, demoed live with a real 201/400/404 as evidence. |
| **CRM** | Customer Relationship Management | The Northstar CRM platform being defended: the whole delivery under review. |
| **JPA** | Java Persistence API | Cited when explaining the lazy-fetch trade-off (avoids N+1, costs an explicit timeline query). |
| **JSON** | JavaScript Object Notation | Format of the Kafka event payload shown live as proof the system reacted. |
| **JWT** | JSON Web Token | The auth mechanism demoed live: anonymous request returns 401, authenticated request returns 200. |
| **Kafka** | Apache Kafka | The event-streaming platform demoed live (`CustomerInteractionRecordedV1` on the topic), honestly described as at-least-once, not exactly-once. |
| **PostgreSQL** | — | The database whose SQL row is called "the single strongest piece of evidence" the demo can show. |
| **SQL** | Structured Query Language | The SELECT query proving Amina's interaction row is durably persisted and survives an API restart. |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline (GitHub Actions in this course). |
| **OpenShift** | — | Instructor-hosted cluster; demo ops use `oc` (not laptop k3s/`kubectl`). |
| **SHA** | Secure Hash Algorithm (git commit SHA) | Part of Module 51's frozen release-identity block (tag, digest, pipeline run, git SHA) cited, never rebuilt, during the defense. |
| **VPN** | Virtual Private Network | Named as a possible cause of a network timeout during the live SQL demo; a sanitized screenshot is pre-cached as fallback. |

---

## One-line memory aid

> Focus first on: **Capstone** · **Retrospective** · **KPI** · **Stakeholder** · **ADR** · **evidence-index.md**.

---

**Related:** [Module 52 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
