# Lab 21 — monitoring report

## Probes

| Probe | Expected when ready | Expected when lab toggle down |
| ----- | ------------------- | ----------------------------- |
| liveness | UP | UP |
| readiness | UP | OUT_OF_SERVICE / DOWN |

## Metrics

- `crm.customer.create` tag `result`
- `crm.customer.get` tag `result`
- Never tag `customerId` or correlation id

## Production note

Lab exposure of health+metrics+info is **not** production-safe — restrict endpoints later.

## TODO

Paste curl evidence for health / liveness / readiness / metrics after smoke test.
