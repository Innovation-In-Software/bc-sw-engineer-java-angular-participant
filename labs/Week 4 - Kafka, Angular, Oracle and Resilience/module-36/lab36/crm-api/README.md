# Lab 36 — Northstar Customer REST API (demo Bearer)

In-memory Spring Boot 3.3 API. Persistence story is PostgreSQL later.

**Demo auth (not production):** `Authorization: Bearer lab-demo-token` is required on `/api/**`. CORS origin: `http://localhost:4200`.

Copy to `%USERPROFILE%\java-bootcamp\examples\lab36-crm-api` (or `~/java-bootcamp/examples/lab36-crm-api`):

```bash
mvn -B test
mvn -B spring-boot:run
```

| Method | Path | Notes |
| ------ | ---- | ----- |
| GET | `/api/customers` | 401 without Bearer; 200 with demo token |
| GET | `/api/customers/{id}` | 200 or 404 |
| POST | `/api/customers` | 201 + `Location` |

Also send `X-Correlation-Id: lab-request-001`.
