# CORS for Angular CRM (TODO)

## Local dev

- Angular: `http://localhost:4200`
- API: `http://localhost:8080`
- Option: `@CrossOrigin(origins = "http://localhost:4200")` on `CustomerController`
- Or global `WebMvcConfigurer` allowed origins

## Headers Angular may send

- `Content-Type: application/json`
- `X-Correlation-Id: lab-request-001`

## Production note

Prefer OpenShift / gateway CORS policy over `*` with credentials. REST only — no SOAP endpoint path in this course.
