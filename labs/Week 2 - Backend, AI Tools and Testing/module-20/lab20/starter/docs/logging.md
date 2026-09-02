# Lab 20 — logging contract

## MDC keys

| Key | Meaning |
| --- | ------- |
| corr | X-Correlation-Id |
| cust | customerId |
| op | create / get |

## Rules

- Never log fullName or email
- Always `MDC.clear()` in filter `finally`

## TODO

Paste sample INFO lines for CUS-1001 / CUS-1002 after smoke test.
