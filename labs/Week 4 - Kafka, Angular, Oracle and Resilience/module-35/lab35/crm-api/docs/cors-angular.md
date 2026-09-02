# CORS for Angular CRM

## Local dev

- Angular SPA: `http://localhost:4200`
- API: `http://localhost:8080`
- This solution uses `@CrossOrigin(origins = "http://localhost:4200")` on `CustomerController`
- Alternative: a global `WebMvcConfigurer` bean with `allowedOrigins("http://localhost:4200")`

## Headers Angular `HttpClient` may send

- `Content-Type: application/json`
- `X-Correlation-Id: lab-request-001`

## Production note

Prefer OpenShift / API-gateway CORS policy over `Access-Control-Allow-Origin: *` with credentials. This course is REST/JSON only.
