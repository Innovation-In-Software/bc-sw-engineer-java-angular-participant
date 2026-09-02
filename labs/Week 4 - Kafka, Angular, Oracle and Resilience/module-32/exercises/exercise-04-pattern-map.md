# Exercise 5 — Pattern Map

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 68–72) |
| **Deliverable** | `notes/lab32-pattern-map.md` |
| **Fixtures** | CUS-1001 Account Profile · instance `accountProfile` |

### What you will learn

Map Retry, CircuitBreaker, TimeLimiter, Fallback to AccountProfileService.

### Enterprise context

One outbound find() needs all four coordinated.

### Predict

Order of annotations — which wraps which conceptually?

### Debug

Retrying non-idempotent writes — park that pattern?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Patterns only on Kafka listeners | This lab targets AccountClient HTTP |
| No instance name | Use accountProfile everywhere |

**Module 32** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab32-pattern-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Pattern Map

## Reference

| Pattern | CRM use |
| --- | --- |
| Retry | Transient 503 from Account Profile |
| TimeLimiter | Fail fast if call exceeds N ms |
| CircuitBreaker | Stop calling when failure rate high |
| Fallback | Return cached/minimal profile for Amina |

## Step 2 — Add Ravi row

Add one example sentence for `CUS-1002` Ravi when circuit is open.

## Step 3 — Order idea

Propose decorator order in one line (e.g. TimeLimiter → CircuitBreaker → Retry → call).

## Step 4 — Boundary

Mark: do not apply circuit breaker to local in-memory map lookups.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-pattern-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Pattern Map

## Reference

| Pattern | CRM use |
| --- | --- |
| Retry | Transient 503 from Account Profile |
| TimeLimiter | Fail fast if call exceeds N ms |
| CircuitBreaker | Stop calling when failure rate high |
| Fallback | Return cached/minimal profile for Amina |

## Step 2 — Add Ravi row

Add one example sentence for `CUS-1002` Ravi when circuit is open.

## Step 3 — Order idea

Propose decorator order in one line (e.g. TimeLimiter → CircuitBreaker → Retry → call).

## Step 4 — Boundary

Mark: do not apply circuit breaker to local in-memory map lookups.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Pattern→CRM map with decorator order and a Ravi open-circuit example in `notes/lab32-pattern-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-pattern-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-pattern-map.md`
- [ ] Table present
- [ ] Ravi example
- [ ] Decorator order proposed

