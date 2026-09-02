# Lab 46 — DLT replay runbook

## When to replay

Poison messages on `crm.customer.events.DLT` after root cause is fixed.

## Dry-run first

1. Inspect DLT records (headers: correlation `lab-request-001`, exception class).
2. TODO(lab46): Command to peek without producing to main topic.
3. Confirm idempotent handler will not double-apply side effects for `CUS-1001` / `CUS-1002`.

## Limited replay

1. Rate-limit: TODO(lab46) messages/sec
2. Replay N messages → verify CRM side effects once
3. Stop on unexpected errors; escalate

## Evidence

TODO(lab46): Screenshot/path of DLT inspection + successful limited replay (no secrets/PII).
