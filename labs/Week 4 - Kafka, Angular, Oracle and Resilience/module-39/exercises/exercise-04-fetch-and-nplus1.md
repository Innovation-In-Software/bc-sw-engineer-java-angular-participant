# Exercise 4 — Choose Fetch Strategy and Kill N+1

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 54–70) |
| **Deliverable** | `notes/lab39-fetch-strategy.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

State the fetch defaults, diagnose N+1, and fix it per query rather than by switching to EAGER.

### Enterprise context

Switching to EAGER does not fix N+1 — it spreads the cost to every query that loads the entity.

### Predict

You mark accounts EAGER to stop an N+1 on the list screen. What happens to the detail screen?

### Debug

Listing 200 customers issues 201 queries. Which association is being lazily initialised?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| EAGER used as the fix | Use join fetch or @EntityGraph per query |
| Defaults assumed symmetric | to-one is EAGER, to-many is LAZY |
| Paging done in memory | Return Page<T> and let the database limit |

**Module 39** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-fetch-strategy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Choose Fetch Strategy and Kill N+1

## Defaults

@ManyToOne and @OneToOne default to EAGER; @OneToMany and @ManyToMany default to LAZY.

## N+1 Cause

The list query loads customers, then touching each customer's accounts triggers one query per customer.

## The Fix

Use join fetch or @EntityGraph on that query; EAGER would load accounts on every query touching a customer.

## Pageable

Page<CustomerEntity> findByStatus(String status, Pageable pageable).
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-fetch-strategy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Choose Fetch Strategy and Kill N+1

## Defaults

_____

## N+1 Cause

_____

## The Fix

_____

## Pageable

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Fetch defaults, the N+1 cause, a per-query fix, and a Pageable signature in `notes/lab39-fetch-strategy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-fetch-strategy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-fetch-strategy.md`
- [ ] Defaults stated for both sides
- [ ] N+1 cause explained
- [ ] Fix is per-query, not EAGER
- [ ] Pageable signature written
