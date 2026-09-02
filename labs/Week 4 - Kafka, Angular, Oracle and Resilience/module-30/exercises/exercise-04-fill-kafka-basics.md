# Exercise 4 — Fill Kafka Basics TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 9–14) |
| **Deliverable** | `notes/lab30-kafka-todos.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Define broker, topic, partition, offset, consumer group in CRM words.

### Enterprise context

Shared vocabulary before Compose and Java producer.

### Predict

Does offset mean 'message id' globally?

### Debug

Replica count 1 in lab vs prod — what changes?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Offset confusion | Offset is per-partition position, not global id |
| Group vs topic | Group shares partitions; topic is the channel |

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-30-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab30-kafka-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 30 — Fill Kafka Basics TODOs

## Step 1 — Copy the quiz

1. A (your note here) is a named stream of records.
2. A (your note here) is an ordered subset of a topic; offsets are per partition.
3. The (your note here) is the consumer's position in a partition.
4. Consumers in the same (your note here) compete for partitions; different groups each get a copy.

## Step 2 — Fill blanks

Replace each `(your note here)` with: topic / partition / offset / consumer group (one each).

## Step 3 — CRM example

Add one line: group `crm-notifications` shares partitions; group `crm-audit` reads all `CUS-1001`/`CUS-1002` events independently.

## Step 4 — Self-check

Compare to Step 2 answer key in your head: topic, partition, offset, consumer group.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-30-exercises/`, create `notes/` if needed, then create `notes/lab30-kafka-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 30 — Fill Kafka Basics TODOs

## Step 1 — Copy the quiz

1. A _____ is a named stream of records.
2. A _____ is an ordered subset of a topic; offsets are per partition.
3. The _____ is the consumer's position in a partition.
4. Consumers in the same _____ compete for partitions; different groups each get a copy.

## Step 2 — Fill blanks

Replace each `_____` with: topic / partition / offset / consumer group (one each).

## Step 3 — CRM example

Add one line: group `crm-notifications` shares partitions; group `crm-audit` reads all `CUS-1001`/`CUS-1002` events independently.

## Step 4 — Self-check

Compare to Step 2 answer key in your head: topic, partition, offset, consumer group.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Four blanks filled correctly with a CRM group example sentence in `notes/lab30-kafka-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab30-kafka-todos.md` |
| Confusing partition with consumer group | Partition = ordered log slice; group = load-sharing unit |
| Thinking offset is global per topic | Offsets are per partition (and tracked per group) |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab30-kafka-todos.md`
- [ ] All four terms filled
- [ ] CRM competing vs independent groups noted
- [ ] File saved under notes/

