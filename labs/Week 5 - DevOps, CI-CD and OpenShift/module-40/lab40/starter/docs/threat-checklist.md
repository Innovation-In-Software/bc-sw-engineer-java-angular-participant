# Lab 40 — Threat checklist (OWASP-aligned)

**Scope:** CRM API serving synthetic fixtures `CUS-1001` / `CUS-1002`.

## Surfaces

| Surface | OWASP theme | Risk note | Status |
| ------- | ----------- | --------- | ------ |
| Customer lookup by ID | Broken access control | TODO(lab40): object-level authz | Open |
| Search / filter params | Injection | TODO(lab40): parameterization | Open |
| Logs / error bodies | Sensitive data exposure | TODO(lab40): redact PII | Open |
| Dependencies | Vulnerable components | TODO(lab40): Dependency-Check | Open |
| Secrets in config | Security misconfiguration | TODO(lab40): env-only secrets | Open |

## Notes

- TODO(lab40): Map one confirmed finding to a row above with evidence path.
- Never paste NVD API keys, tokens, or real emails into this file.
