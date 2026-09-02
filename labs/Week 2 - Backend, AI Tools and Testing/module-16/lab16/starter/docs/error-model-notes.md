# Lab 16 — error model notes

| Status | Code | When |
| ------ | ---- | ---- |
| 400 | VALIDATION_FAILED | Bean Validation on request DTO |
| 404 | CUSTOMER_NOT_FOUND | Unknown customer id |
| 409 | BUSINESS_CONFLICT | Illegal status transition / duplicate |

Correlation id: `lab-request-001`

## TODO

Document why 409 (not 422) for illegal transitions after you finish the demos.
