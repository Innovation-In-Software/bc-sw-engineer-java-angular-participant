# Module 47 — Acronym Cheatsheet

**Topic:** Professional Communication and Collaboration  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_This module is a documentation/communication lab, not a coding module — most of its vocabulary is process and role terminology rather than technical acronyms. A few earlier-module tools (Terraform, Ansible, Docker, Kubernetes, OpenShift, DAST/SAST, KPI/OKR/SMART, MVP, Canary, GitHub Actions) are **not** actually used anywhere in this deck's slide text, even though the Week 5 arc mentions them in passing — they were removed from this sheet. What remains below is grounded in the deck's real content: shared-fact-base discipline, incident updates, PR descriptions, stakeholder email, and Agile/Scrum roles carried over from the Module 46 incident scenario._

---

## Professional skills

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ADR** | Architecture Decision Record | Short note explaining an architecture choice and why. |
| **Agile** | — | Iterative delivery with frequent feedback. |
| **Kanban** | — | Visual workflow board limiting work in progress. |
| **Retrospective** | — | Team-only review of what went well and what to improve. |
| **RFC** | Request for Comments | Proposal document circulated for feedback before deciding. |
| **Scrum** | — | Agile framework with sprints, standups, and defined roles. |
| **Stakeholder** | — | Person/group who needs business impact and an ETA, without jargon. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Consumer Lag** | — | How far behind a consumer is; referenced here as one of the signals in the carried-over Module 46 incident. |
| **DLT** | Dead Letter Topic | Cited here as an example of jargon ("DLT, digest") that must be translated to plain language for stakeholders. |
| **Kafka** | Apache Kafka | Distributed event streaming platform; the crm.customer.events incident from Module 46 is this module's running scenario. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined contract between systems — API documentation should ship with tests and a rollback plan. |

---

## Incident & delivery communication

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration and Continuous Delivery | Pipeline evidence (from Labs 43-46) this module's packet links to, e.g. a CI digest or CI run. |
| **ETA** | Estimated Time of Arrival | The timeline stakeholders need alongside business impact — no jargon. |
| **HTTP** | Hypertext Transfer Protocol | Status code family; the incident's symptom is "agents see HTTP 503 opening customer profiles." |
| **CRM** | Customer Relationship Management | Northstar CRM — the platform whose SEV-2 incident (carried over from Module 46) this module's packet documents. |
| **PII** | Personally Identifiable Information | Real customer data — synthetic IDs (CUS-1001/CUS-1002) must replace it in every stakeholder-facing artifact. |
| **PR** | Pull Request | The change a PR description documents: why, what changed, verification, and an exact rollback plan. |
| **QA** | Quality Assurance | Team the Development Team coordinates with; also this module's metaphor — "peer review is the QA gate for words." |
| **SEV** | Severity (level) | Incident severity shorthand (e.g. SEV-2) that must stay identical across every document in the packet. |
| **UTC** | Coordinated Universal Time | Every incident timestamp uses UTC — no local-time ambiguity. |

---

## One-line memory aid

> Focus first on: **one shared fact base** · **ADR** · **RFC** · **SEV** · **UTC next-update time** · **PR description**.

---

**Related:** [Module 47 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
