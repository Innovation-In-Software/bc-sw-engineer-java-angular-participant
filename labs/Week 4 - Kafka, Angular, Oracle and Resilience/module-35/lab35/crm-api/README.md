# Lab 35 — Northstar Customer REST API

In-memory Spring Boot 3.3 API for the Angular HttpClient lab. Persistence story is PostgreSQL later; this stub seeds **CUS-1001** Amina Khan and **CUS-1002** Ravi Singh.

Copy to `%USERPROFILE%\java-bootcamp\examples\lab35-crm-api` (or `~/java-bootcamp/examples/lab35-crm-api`) and run:

```bash
mvn -B test
mvn -B spring-boot:run
```

| Method | Path | Notes |
| ------ | ---- | ----- |
| GET | `/api/customers` | List (optional `?status=`) |
| GET | `/api/customers/{id}` | 200 or 404 (`CUS-9999`) |
| POST | `/api/customers` | 201 + `Location`; send `X-Correlation-Id: lab-request-001` |

CORS origin: `http://localhost:4200`. See `docs/cors-angular.md`.
