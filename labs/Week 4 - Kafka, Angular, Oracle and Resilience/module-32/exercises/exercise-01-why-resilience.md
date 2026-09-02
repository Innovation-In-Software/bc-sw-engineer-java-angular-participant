# Exercise 1 — Why Resilience

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 51–56) |
| **Deliverable** | `notes/lab32-resilience.md` |
| **Fixtures** | CUS-1001 Account Profile · instance `accountProfile` |

### What you will learn

Explain why sync Account Profile enrichment must not hang CRM.

### Enterprise context

Amina/Ravi pages call an outbound dependency that can be slow or 503.

### Predict

If Account API hangs 30s with no timeout — what happens to CRM threads?

### Debug

Team retries POST create forever — what duplicate risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Thinking Kafka replaces this | Lab 32 is HTTP outbound; Kafka is Lab 30/31 |
| Only listing 'retry' | Also name CB, timeout, truthful fallback |

**Module 32** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab32-resilience.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Why Resilience

## Step 1 — Scenario

Customer detail for `CUS-1001` Amina calls Account Profile. The dependency hangs 30s. List three user-visible or thread-pool effects.

## Step 2 — Pattern names

Write the four Resilience4j ideas: retry, circuit breaker, time limiter, fallback.

## Step 3 — Not a substitute

One sentence: resilience wraps calls; it does not fix a permanently wrong URL.

## Step 4 — Notes file


## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-resilience.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Why Resilience

## Step 1 — Scenario

Customer detail for `CUS-1001` Amina calls Account Profile. The dependency hangs 30s. List three user-visible or thread-pool effects.

## Step 2 — Pattern names

Write the four Resilience4j ideas: retry, circuit breaker, time limiter, fallback.

## Step 3 — Not a substitute

One sentence: resilience wraps calls; it does not fix a permanently wrong URL.

## Step 4 — Notes file


## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A scenario analysis plus named Resilience4j patterns in `notes/lab32-resilience.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-resilience.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-resilience.md`
- [ ] Three hang effects
- [ ] Four patterns named
- [ ] Limitation sentence written

