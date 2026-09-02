# Exercise 1 — Why Async for CRM

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** (after slides 1–8) |
| **Deliverable** | `notes/lab30-prelab-eda.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Contrast sync HTTP fan-out vs event publish for CRM side effects.

### Enterprise context

Notifications/audit must not block customer create.

### Predict

If Notification is down, does create fail under sync vs event?

### Debug

Team wants REST-only — what coupling risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Cannot name a fan-out consumer | List notifications, audit, search — Lab 30 topics feed them |
| Confused with Lab 31 | This lab is concepts + Compose; Spring Kafka is next |

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-30-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab30-prelab-eda.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 30 — Why Async for CRM

## Step 1 — List sync pain

Customer service creates `CUS-1001` Amina Khan over HTTP with correlation `lab-request-001`. List **three** problems if it also calls email, audit, and analytics synchronously in the same request thread.

## Step 2 — Event idea

In one sentence, describe publishing a `CustomerCreated` event so other teams consume independently.

## Step 3 — Coupling check

Mark true/false: *The Customer JVM must be up for the Audit consumer to process an already-published event.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-30-exercises/`, create `notes/` if needed, then create `notes/lab30-prelab-eda.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 30 — Why Async for CRM

## Step 1 — List sync pain

Customer service creates `CUS-1001` Amina Khan over HTTP with correlation `lab-request-001`. List **three** problems if it also calls email, audit, and analytics synchronously in the same request thread.

## Step 2 — Event idea

In one sentence, describe publishing a `CustomerCreated` event so other teams consume independently.

## Step 3 — Coupling check

Mark true/false: *The Customer JVM must be up for the Audit consumer to process an already-published event.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A short note contrasts sync fan-out with Kafka publish-and-forget for CRM in `notes/lab30-prelab-eda.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab30-prelab-eda.md` |
| Treating Kafka as a request/response RPC bus | Use events for async fan-out; keep HTTP for queries |
| Forgetting correlation IDs | Carry `lab-request-001` (or similar) in the envelope |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab30-prelab-eda.md`
- [ ] Three sync pain points named
- [ ] One clear event-driven sentence
- [ ] True/false answered with a one-line reason

