# Lab 50 — frontend + persistence demo (TODO)

## Stack

Angular → REST (JWT) → Spring Boot → PostgreSQL. Not React / Oracle / k3s.

## Happy path

- Customer: `CUS-1001`
- Correlation: `lab-request-001`
- Mock login token: `lab-demo-token` (memory only)

## Failure path

- `CUS-9999` → 404
- Missing Bearer → 401

## Verify

```powershell
docker compose -p lab50verify up -d
cd backend; mvn -B test
cd ..\frontend; npx ng build
```
