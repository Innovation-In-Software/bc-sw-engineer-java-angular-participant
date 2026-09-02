# Exercise 1 — Sketch Context Diagram

**Module 48** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Identify users, external systems, and trust boundaries for Northstar CRM.

## Reference

| Artifact | Purpose |
| --- | --- |
| docs/architecture/context.md | Users and external systems |
| docs/architecture/container.md | Deployable units |
| docs/nfrs.md | Measurable NFRs |
| docs/adrs/ | Decisions |
| docs/backlog.md | Vertical stories |
| docs/risk-register.md | Risks with owners |

## Steps

### Step 1 — Actors

Service agents, admins; IdP/email/Kafka as needed.

### Step 2 — Containers

Angular UI, Spring Boot API, PostgreSQL, Kafka, OpenShift.

### Step 3 — Trust

JWT at API; DB and Kafka across trust zones.

### Step 4 — Fixtures

CUS-1001/CUS-1002 are demo data — not external systems.

## Expected result

Context sketch names Angular → REST → PostgreSQL → OpenShift.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Actors listed | Pass / Fail |
| 2 | Taught containers named | Pass / Fail |
| 3 | Fixtures distinguished | Pass / Fail |
