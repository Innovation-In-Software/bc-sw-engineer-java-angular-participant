# Lab 41 — Container runbook

## Build

```bash
# TODO(lab41): Record exact command + image id / digest
docker build -t crm-api:lab41 .
```

## Run

```bash
# TODO(lab41): Memory limits, --env-file, port mapping
docker run --rm --name crm-lab41 --env-file .env.example -p 8080:8080 crm-api:lab41
```

## Verify

- Readiness: `TODO(lab41): curl …/actuator/health/readiness`
- CRM smoke: create/get `CUS-1001` with correlation `lab-request-001`
- User inside container: `TODO(lab41): docker exec … id` → expect UID 10001

## Stop / graceful shutdown

```bash
docker stop crm-lab41
```

## Registry (notes only — no credentials)

TODO(lab41): Tagging scheme, digest pin for Lab 42, where auth lives (not Git).
