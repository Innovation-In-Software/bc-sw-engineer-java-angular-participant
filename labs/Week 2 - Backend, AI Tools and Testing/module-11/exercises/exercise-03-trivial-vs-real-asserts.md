# Exercise 3 — Trivial vs Real Asserts

**Module 11** · Checkpoint C · Exercises 1–6 Pass then Lab 11

## Activity card

| | |
| --- | --- |
| **Objective** | Reject trivial asserts (assertTrue(true)) in favor of behavior asserts |
| **Skills practiced** | Reviewing AI test suggestions |
| **Expected outcome** | notes/lab11-prelab-asserts.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-11-exercises/` → notes/lab11-prelab-asserts.md |
| **Checkpoint** | C (after slides 88) |

## What you will learn

- Trivial asserts make green builds that prove nothing
- Real asserts check status, id, or exception behavior
- Reject/edit weak Copilot assertions immediately

**Enterprise context:** CI green with assertTrue(true) is a false sense of safety.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab11-prelab-asserts.md` |

## Northstar fixtures

| ID | Name | Status |
| -- | ---- | ------ |
| `CUS-1001` | Amina Khan | `ACTIVE` |
| `CUS-1002` | Ravi Singh | `PROSPECT` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 11 pre-lab — trivial vs real asserts

## Trivial (reject these — false confidence)
1. assertNotNull(customer);
2. assertTrue(true);

Why weak: they pass even if status, id, or business rules are wrong.

## Meaningful (prefer these)
1. assertEquals(CustomerStatus.ACTIVE, amina.getStatus());  // CUS-1001 Amina
2. assertEquals(CustomerStatus.PROSPECT, ravi.getStatus()); // CUS-1002 Ravi

## Review rule (one sentence)
Reject AI tests that never mention domain values (CUS-1001/CUS-1002, ACTIVE/PROSPECT) or outcomes.

## Scope
Pre-lab only — do not finish Lab 11.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/lab11-prelab-asserts.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 11 pre-lab — trivial vs real asserts

## Trivial (reject these — false confidence)
1. assertNotNull(customer);
2. assertTrue(true);

Why weak: they pass even if status, id, or business rules are wrong.

## Meaningful (prefer these)
1. assertEquals(CustomerStatus.ACTIVE, amina.getStatus());  // CUS-1001 Amina
2. assertEquals(CustomerStatus.PROSPECT, ravi.getStatus()); // CUS-1002 Ravi

## Review rule (one sentence)
Reject AI tests that never mention domain values (CUS-1001/CUS-1002, ACTIVE/PROSPECT) or outcomes.

## Scope
Pre-lab only — do not finish Lab 11.
```

### Step 3 — Self-check

Amina = ACTIVE; Ravi = PROSPECT. Do not swap.

## Expected result

`notes/lab11-prelab-asserts.md` with two trivial asserts, two meaningful asserts, and a reject rule.


## Debug / design challenge

Rewrite assertTrue(true) into assertEquals(ACTIVE, customer.getStatus()).

## Predict the Output / Behavior

Does assertNotNull(service) alone prove activate worked?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| Only listing trivial asserts | Add the two ACTIVE/PROSPECT asserts |
| Swapping Amina/Ravi | Amina ACTIVE (`CUS-1001`); Ravi PROSPECT (`CUS-1002`) |
| Wrong file name | Must be `notes/lab11-prelab-asserts.md` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-prelab-asserts.md` | Pass / Fail |
| 2 | Two trivial + two meaningful asserts written | Pass / Fail |
| 3 | Review rule + correct fixtures | Pass / Fail |
