# Lab 15 — service layer notes

## Status transition table

| From | Allowed to |
| ---- | ---------- |
| PROSPECT | ACTIVE, CLOSED |
| ACTIVE | SUSPENDED, CLOSED |
| SUSPENDED | ACTIVE, CLOSED |
| CLOSED | (none) |

## Wiring

- Shared `InMemoryCustomerRepository` instance for `CustomerValidator` + `DefaultCustomerService`
- No `HashMap` / JDBC / `EntityManager` in the `service` package

## TODO

Fill after you complete the smoke demo (activate CUS-1002; illegal ACTIVE→PROSPECT leaves Amina ACTIVE).
