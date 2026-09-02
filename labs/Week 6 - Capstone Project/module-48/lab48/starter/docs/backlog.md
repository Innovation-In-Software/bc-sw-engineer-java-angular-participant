# Capstone backlog — TODO (Lab 48)

## CAP-12 — Record customer interaction
**As** an agent **I want** to POST an interaction for `CUS-1001`  
**So that** the note persists in PostgreSQL and emits a versioned Kafka event.

**Acceptance**
1. `201` with correlation `lab-request-001`
2. Row visible in PostgreSQL
3. Event `CustomerInteractionRecordedV1` (or equivalent) published
4. `CUS-9999` → `404`

## Additional seeds
- CAP-?? Angular list/detail for interactions — TODO
- CAP-?? JWT login shell — TODO
- CAP-?? Actions PR gate (Angular + Maven) — TODO
- CAP-?? OpenShift smoke via Route — TODO
