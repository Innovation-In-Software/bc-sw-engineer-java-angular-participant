# Exercise 1 — Map CRM Attack Surfaces

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** (after slides 1–8) |
| **Deliverable** | `notes/lab40-owasp-surface-map.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Map CRM APIs/auth/data paths to OWASP-aligned risks.

### Enterprise context

Release gate before containers (Lab 41) needs a written surface map.

### Predict

Is Dependency-Check enough without looking at authz paths?

### Debug

Only listing XSS — what about broken access control on CUS-1001?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Skipping Lab 39 baseline | App must already verify green |
| Docker urge | No images yet — Lab 41 |

**Module 40** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-owasp-surface-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Map CRM Attack Surfaces

## Reference

| Surface | OWASP theme | Example |
| --- | --- | --- |
| Customer GET/PUT API | Broken access control | Agent reads CUS-1001 |
| Search query params | Injection | Name/email filters |
| pom.xml deps | Vulnerable components | Transitive CVE |
| application.yml secrets | Security misconfiguration | DB password in Git |
| Actuator endpoints | Security misconfiguration | Unprotected /env |

## Step 1 — Inventory touchpoints

In notes, list at least five surfaces for the Spring CRM that serves agents looking up `CUS-1001` (Amina Khan) and `CUS-1002` (Ravi Singh): HTTP APIs, JWT/RBAC, SQL/JPA, file/log sinks, and (later) Kafka. Mark which hold PII vs IDs.

## Step 2 — Check the reference

Compare your list to OWASP themes: injection, broken access control, security misconfiguration, vulnerable components, logging/monitoring failures.

## Step 3 — Rank top three

Pick the three highest-risk surfaces for a release gate before containers. Write one sentence of business impact per item.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-owasp-surface-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Map CRM Attack Surfaces

## Reference

| Surface | OWASP theme | Example |
| --- | --- | --- |
| Customer GET/PUT API | Broken access control | Agent reads CUS-1001 |
| Search query params | Injection | Name/email filters |
| pom.xml deps | Vulnerable components | Transitive CVE |
| application.yml secrets | Security misconfiguration | DB password in Git |
| Actuator endpoints | Security misconfiguration | Unprotected /env |

## Step 1 — Inventory touchpoints

In notes, list at least five surfaces for the Spring CRM that serves agents looking up `CUS-1001` (Amina Khan) and `CUS-1002` (Ravi Singh): HTTP APIs, JWT/RBAC, SQL/JPA, file/log sinks, and (later) Kafka. Mark which hold PII vs IDs.

## Step 2 — Check the reference

Compare your list to OWASP themes: injection, broken access control, security misconfiguration, vulnerable components, logging/monitoring failures.

## Step 3 — Rank top three

Pick the three highest-risk surfaces for a release gate before containers. Write one sentence of business impact per item.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A ranked surface map exists with OWASP themes and no real customer data in `notes/lab40-owasp-surface-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-owasp-surface-map.md` |
| Scanning without a surface map | Map trust boundaries first |
| Using real emails in notes | Use @example.test fixtures |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-owasp-surface-map.md`
- [ ] At least five surfaces listed
- [ ] Top three ranked with business impact
- [ ] Synthetic fixtures only

