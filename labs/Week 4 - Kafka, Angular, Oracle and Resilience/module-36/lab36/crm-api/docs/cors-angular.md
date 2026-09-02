# CORS for Angular CRM

## Local dev

- Angular SPA: `http://localhost:4200`
- API: `http://localhost:8080`
- `@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = {"Authorization", "Content-Type", "X-Correlation-Id"})`
- `DemoBearerFilter` skips OPTIONS so preflight is not blocked by 401

## Headers Angular `HttpClient` may send

- `Content-Type: application/json`
- `X-Correlation-Id: lab-request-001`
- `Authorization` (Lab 36)
- `Authorization: Bearer lab-demo-token` (demo only)

## Production note

Prefer OpenShift / API-gateway CORS policy over `Access-Control-Allow-Origin: *` with credentials. This course is REST/JSON only.
