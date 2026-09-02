# AI Thread — AI Across the Full Stack

**Week 4** · Java & Angular Fullstack Bootcamp

This section is **new** in the Angular outline. Integrate it **alongside** Modules 30–39. Do not replace Labs.

Each AI Thread covers three angles from the course outline:

1. **AI best practices and governance/security**
2. **AI's impact on this week's domain**
3. **Agentic tools in use**

---

## Classroom segment (15–20 minutes)

### A. Best practices and governance/security

- Generated Kafka producers must keep **`acks=all`** and **idempotence** — reject “fire-and-forget” snippets that drop keys.
- Never paste broker passwords, cloud API keys, or real customer payloads into a prompt.
- Angular snippets this week must be **standalone components / Signals / HttpClient** — not React hooks or SOAP clients from another course.

**Discussion prompt:** Copilot generated a producer with no record key and `acks=1`. What would break for Amina (`CUS-1001`) ordering and for a failed broker ACK?

### B. Impact on messaging, Angular, and data

- Faster Compose YAML and `@KafkaListener` stubs — you still own topic names, keys, consumer groups, and DLQ hand-off (Labs 30–31).
- Risk: React `useState` / SOAP examples leaking into Labs 33–36, or Oracle SQL dialect leaking when the authored SQL labs use PostgreSQL.
- Benefit: asking the assistant to *explain* a consumer-lag describe after you have produced CUS-1001 yourself.

### C. Agentic tools in use

- Copilot for producer properties and event JSON fixtures; you keep Northstar keys (`CUS-1001` / `CUS-1002`).
- Optional: Copilot Chat to draft `docs/kafka-notes.md` — you still fill partition/offset evidence from a real produce.
- Log one accept / one reject of generated Kafka or Angular code in `java-bootcamp/notes/`.

---

## What is not a Week 4 extra lab

Evidence stays with Labs 30–39. Standing checkpoint: “Did the assistant invent React, SOAP, or a missing record key when this week is Kafka, Angular, and keyed CRM events?”
