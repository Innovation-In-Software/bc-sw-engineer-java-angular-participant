# Lab 31 starter — timed path (~45 minutes)

**Theme:** Spring Kafka — publish, listen, DLT, idempotency

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Publish · listen-once · error/DLT config · `mvn test` ×2 |
| **Hard gate** | Pre-lab Pass · Kafka bootstrap or EmbeddedKafka |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab31-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab31-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab31-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab31-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab31-crm
cp -R starter/. ~/java-bootcamp/examples/lab31-crm/
cd ~/java-bootcamp/examples/lab31-crm
```

## 45-minute checklist

- [ ] Confirm Kafka bootstrap (Lab 30 compose or shared cluster)
- [ ] Complete `CustomerEvent` + publisher (`KafkaTemplate`, key=customerId)
- [ ] Implement `@KafkaListener` + `ProcessedEventStore` idempotency
- [ ] Wire `KafkaErrorConfig` (DefaultErrorHandler + DLT recoverer)
- [ ] Run `mvn -B test`; capture Amina event handled-once evidence

## Smoke test

```bash
mvn -B test
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Publisher sends keyed event to crm.customer-events.v1 | Pass / Fail |
| Listener handles once; replay ignored via ProcessedEventStore | Pass / Fail |
| Error handler / DLT config present | Pass / Fail |
| Integration test green twice | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Deser errors | Trusted packages / JsonDeserializer config |
| Listener silent | New group-id or publish new events |
| DLT empty | Wire DefaultErrorHandler + DeadLetterPublishingRecoverer |
| Duplicate notify | Mark ProcessedEventStore before side-effect |
