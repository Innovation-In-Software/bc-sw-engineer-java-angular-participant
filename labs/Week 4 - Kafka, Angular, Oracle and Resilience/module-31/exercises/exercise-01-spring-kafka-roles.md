# Exercise 1 — Spring Kafka Roles

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 27–32) |
| **Deliverable** | `notes/lab31-spring-kafka.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

Map KafkaTemplate / @KafkaListener to Lab 30 producer/consumer ideas.

### Enterprise context

CRM service both publishes customer events and consumes for notifications.

### Predict

Can one Spring Boot app be both producer and consumer?

### Debug

Putting KafkaTemplate only in a @RestController — seam risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Confused with raw KafkaProducer | Lab 31 uses Spring wrappers; Lab 30 was CLI/Java client |
| Forgot group id | Listener needs spring.kafka.consumer.group-id |

**Module 31** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-spring-kafka.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Spring Kafka Roles

## Reference

| Kafka idea | Spring Boot piece |
| --- | --- |
| Produce record | KafkaTemplate.send(...) |
| Consume record | @KafkaListener |
| Bootstrap servers | spring.kafka.bootstrap-servers |
| Group id | spring.kafka.consumer.group-id |

## Step 1 — Study table

Copy the reference table into `notes/lab31-spring-kafka.md`.

## Step 2 — CRM story

Write: after HTTP creates Amina, service calls `KafkaTemplate` to `crm.customer-events.v1` with key `CUS-1001`.

## Step 3 — Listener story

Write: notifications listener uses group `crm-notifications` and processes the JSON envelope.

## Step 4 — Gap check

List one question you still have about serializers (String/JSON) before lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-spring-kafka.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Spring Kafka Roles

## Reference

| Kafka idea | Spring Boot piece |
| --- | --- |
| Produce record | KafkaTemplate.send(...) |
| Consume record | @KafkaListener |
| Bootstrap servers | spring.kafka.bootstrap-servers |
| Group id | spring.kafka.consumer.group-id |

## Step 1 — Study table

Copy the reference table into `notes/lab31-spring-kafka.md`.

## Step 2 — CRM story

Write: after HTTP creates Amina, service calls `KafkaTemplate` to `crm.customer-events.v1` with key `CUS-1001`.

## Step 3 — Listener story

Write: notifications listener uses group `crm-notifications` and processes the JSON envelope.

## Step 4 — Gap check

List one question you still have about serializers (String/JSON) before lab.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Role mapping notes with a CRM produce/consume story in `notes/lab31-spring-kafka.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-spring-kafka.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-spring-kafka.md`
- [ ] Table copied
- [ ] Produce + listen stories written
- [ ] One serializer question listed

