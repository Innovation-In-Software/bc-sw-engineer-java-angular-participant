# Lab 17 — JUnit / JaCoCo runbook

## Commands

```bash
mvn -B test
mvn -B clean verify
```

## Coverage gate

- Package: `com.northstar.crm.service`
- Minimum line ratio: **0.80**
- Deliberately fail once with `0.99`, then restore `0.80`

## TODO

Paste Surefire + JaCoCo evidence paths after a green `verify`.
