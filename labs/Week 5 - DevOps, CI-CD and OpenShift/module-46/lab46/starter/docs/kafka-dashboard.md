# Lab 46 — Kafka dashboard notes

## Signals

| Signal | Why it matters | Alert sketch |
| ------ | -------------- | ------------ |
| Consumer lag | Partition stuck / slow handler | TODO(lab46) |
| DLT message rate | Poison / contract break | TODO(lab46) |
| Retry count | Transient vs permanent | TODO(lab46) |
| Processing latency | SLA risk | TODO(lab46) |

## False confidence

Lag = 0 while DLT is growing still means customer events are failing — TODO(lab46): call this out in ops notes.

## Fixtures

Synthetic only: `CUS-1001`, `CUS-1002`, correlation `lab-request-001`. Redact emails from metric tags.
