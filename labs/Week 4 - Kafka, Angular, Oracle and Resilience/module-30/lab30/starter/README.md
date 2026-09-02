# Lab 30 starter — timed path (~45 minutes)

**Theme:** Kafka EDA — topics, keys, producer

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Broker · 3-partition topic + DLQ · keyed produce · acks=all |
| **Hard gate** | Pre-lab Pass · Docker/shared bootstrap |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab30-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab30-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab30-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab30-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab30-crm
cp -R starter/. ~/java-bootcamp/examples/lab30-crm/
cd ~/java-bootcamp/examples/lab30-crm
```

## 45-minute checklist

- [ ] Start KRaft broker (`compose.yaml`) or use instructor shared bootstrap
- [ ] Create topics `crm.customer-events.v1` (3 partitions) + `.dlq`
- [ ] Complete event JSON samples for CUS-1001 / CUS-1002
- [ ] Fill `CustomerEventProducer` TODOs (acks=all, idempotence, key=customerId)
- [ ] Run smoke produce; note partition/offset; fill `docs/kafka-notes.md`

## Smoke test

```bash
docker compose up -d
# then: mvn -B -q package && mvn -B exec:java -Dexec.mainClass=com.northstar.crm.event.CustomerEventProducer
```

Commit to your GitHub repo. Do not take screenshots. Do not commit secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Broker up; topics describe (3 partitions on events) | Pass / Fail |
| Keyed produce for CUS-1001 / CUS-1002 succeeds | Pass / Fail |
| Producer uses acks=all + enable.idempotence | Pass / Fail |
| kafka-notes.md has produce→consume + keying notes | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Port 9092 in use | Stop other Kafka or use instructor bootstrap |
| Empty consume | `--from-beginning` + correct topic |
| Always partition 0 | Set key = customerId |
