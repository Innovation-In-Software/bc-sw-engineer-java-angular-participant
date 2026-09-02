# Exercise 5 — Fill Spring Kafka TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 33–36) |
| **Deliverable** | `notes/lab31-todos.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

List bootstrap, topic, serializer, and KafkaTemplate publish TODOs.

### Enterprise context

Externalize broker/topic names — no hard-coded secrets.

### Predict

JsonSerializer without trusted packages — what breaks on consume?

### Debug

Publish without key — partition/order impact?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Missing dependency | spring-kafka (+ test starter for EmbeddedKafka) |
| Hard-coded localhost only | Use application.yml + env override |

**Module 31** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Fill Spring Kafka TODOs

## Step 1 — Paste snippet

Create `notes/lab31-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Fill Spring Kafka TODOs

## Step 1 — Paste snippet

Create `notes/lab31-todos.md`:

```java
// application.yml ideas
spring.kafka.bootstrap-servers: _____
spring.kafka.consumer.group-id: _____

@Service
class CustomerEventPublisher {
  private final KafkaTemplate<String, String> template;
  void publishCreated(String customerId, String json) {
    template.send("_____", customerId, json); // topic
  }
}

@KafkaListener(topics = "_____", groupId = "crm-notifications")
void onEvent(String payload) { /* TODO: parse + idempotent handle */ }
```

## Step 2 — Fill blanks

Fill with: `localhost:9092` (or instructor bootstrap), `crm-notifications`, `crm.customer-events.v1` (twice).

## Step 3 — Key reminder

Add a comment: key argument must be `CUS-1001` / `CUS-1002`, not a random UUID.

## Step 4 — DLT blank

Add one line TODO: `// TODO Lab 31: route poison messages to crm.customer-events.v1.dlq`.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Pseudocode with topic/bootstrap/group filled and key/DLT reminders in `notes/lab31-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-todos.md` |
| Using null key on send | Always pass customerId as the Kafka key |
| Same groupId for notifications and audit | Use distinct groups for independent consumption |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-todos.md`
- [ ] All _____ replaced
- [ ] Customer ID key comment present
- [ ] DLT TODO line present

