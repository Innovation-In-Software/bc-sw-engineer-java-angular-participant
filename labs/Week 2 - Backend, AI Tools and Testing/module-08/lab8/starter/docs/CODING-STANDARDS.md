# Coding standards — Northstar CRM (Lab 8)

## Packages

- Root: `com.northstar.crm`
- Layers: `controller`, `service`, `repository`, `entity`, `dto`, `config`, `exception`

## TODO — dependency direction (hard rule)

```text
controller -> service -> repository -> entity
controller -> dto
service    -> dto, entity, exception
repository -> entity
entity     -> (nothing in other CRM layers)
```

## TODO — naming

- Classes: PascalCase (`CustomerService`)
- Methods: camelCase (`createCustomer`)
- Customer IDs: `CUS-1001`, `CUS-1002`
- Correlation: `lab-request-001`

## TODO — what must NOT live where

| Package | Must NOT own |
| ------- | ------------ |
| controller | SQL, business rules |
| service | HTTP headers, JDBC details |
| repository | REST mapping |
| entity | Request JSON shapes |
| dto | Persistence annotations (later JPA stays on entity) |

## Lab 8 ban

No Spring, JPA, or Kafka imports in stubs.
