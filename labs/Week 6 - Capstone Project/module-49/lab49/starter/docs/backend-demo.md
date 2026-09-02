# Lab 49 — backend demo notes (TODO)

## Endpoint

`POST /api/v1/interactions`

## Happy path

- Customer: `CUS-1001` (Amina Khan)
- Correlation: `lab-request-001`
- Expected: 201 with generated `id`

## Failure path

- Customer: `CUS-9999` → unknown customer

## Verify

```powershell
cd backend
mvn -B test
```

## Full path (homework)

Flyway, Kafka topic `crm.customer.interactions.v1`, Angular client in Lab 50.
