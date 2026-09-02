# Lab 46 starter — timed path (~45 minutes)

**Theme:** Kafka resilience — DefaultErrorHandler, DLT, replay notes

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | ErrorHandler+DLT · not-retryable · dashboard · dry-run replay |
| **Hard gate** | Pre-lab Pass · Kafka path available |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy your **Lab 31 CRM** into `examples/lab46-crm` first, then overlay this `starter/` (Kafka error-handler stubs + docs).

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\lab46-crm"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force "$env:USERPROFILE\java-bootcamp\examples\lab31-crm\*" $dest -ErrorAction SilentlyContinue
Copy-Item -Recurse -Force ".\starter\*" $dest
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab46-crm
cp -R ~/java-bootcamp/examples/lab31-crm/. ~/java-bootcamp/examples/lab46-crm/ 2>/dev/null || true
cp -R starter/. ~/java-bootcamp/examples/lab46-crm/
cd ~/java-bootcamp/examples/lab46-crm
```

## 45-minute checklist

- [ ] Complete `KafkaConsumerConfig` TODOs (`DefaultErrorHandler` + DLT recoverer)
- [ ] Align topic names in `application.yml` (`crm.customer.events` / `.DLT`)
- [ ] Document dashboard signals in `docs/kafka-dashboard.md`
- [ ] Fill `docs/dlt-replay-runbook.md` (dry-run + rate limit)
- [ ] Note idempotency strategy for `CUS-1001` / `CUS-1002` events

## Smoke test

```bash
# After merging into a Spring CRM with Kafka on the classpath:
mvn -B test
```

Evidence under `~/java-bootcamp/notes/lab-46/` (redact PII).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Bounded retry + DLT recoverer configured | Pass / Fail |
| Not-retryable exceptions classified | Pass / Fail |
| Dashboard docs list lag + DLT rate | Pass / Fail |
| Replay runbook has dry-run step | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Config compiles but no DLT | Wire handler on listener container factory |
| Retries forever | Add not-retryable + max failures |
| Missing correlation on DLT | Preserve headers in recoverer |
| Empty dashboard doc | List lag + DLT rate + owner |
