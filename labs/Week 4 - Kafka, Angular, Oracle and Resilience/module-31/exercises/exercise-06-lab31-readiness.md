# Exercise 6 — Lab 31 Readiness

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 45–46) |
| **Deliverable** | `notes/lab31-prep-checklist.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · `crm.customer-events.v1` |

### What you will learn

Confirm Lab 30 topics, Spring deps plan, and no Resilience4j yet.

### Enterprise context

Hard gate before publisher/listener coding.

### Predict

Can Lab 31 pass without a broker (EmbeddedKafka only)?

### Debug

Starting Lab 32 circuit breakers early — park them?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No Lab 30 topics | Create crm.customer-events.v1 + DLQ first |
| Fixtures wrong | CUS-1001 / CUS-1002 + correlation lab-request-001 |

**Module 31** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab31-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab31-spring-kafka.md | (your note here) |
| notes/lab31-listener-sketch.md | (your note here) |
| notes/lab31-todos.md | (your note here) |
| notes/lab31-error-dlt-notes.md | (your note here) |
| notes/lab31-idempotency-plan.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 31 now.

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab31-spring-kafka.md | _____ |
| notes/lab31-listener-sketch.md | _____ |
| notes/lab31-todos.md | _____ |
| notes/lab31-error-dlt-notes.md | _____ |
| notes/lab31-idempotency-plan.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 31 now.

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness note linking Lab 30 topics to Spring Kafka lab goals in `notes/lab31-prep-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-prep-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-prep-checklist.md`
- [ ] Topic dependency stated
- [ ] JDK 21/Maven note
- [ ] Pass/Fail self-mark

