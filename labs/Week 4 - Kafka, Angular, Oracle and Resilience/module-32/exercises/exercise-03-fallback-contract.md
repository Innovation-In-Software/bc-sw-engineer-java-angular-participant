# Exercise 2 — Fallback Contract

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **C** (after slides 65–67) |
| **Deliverable** | `notes/lab32-fallback-contract.md` |
| **Fixtures** | CUS-1001 Account Profile · instance `accountProfile` |

### What you will learn

Define AccountSummary.unavailable — available=false, never fake success.

### Enterprise context

UI must show degraded read honestly for CUS-1001.

### Predict

Fallback returns available=true with empty data — why is that wrong?

### Debug

Write operations using the same fallback — safe?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Fake 200 success | Degraded read only; never claim write succeeded |
| Missing customerId in fallback | Always echo requested customerId |

**Module 32** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab32-fallback-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Fallback Contract

## Step 1 — Fields kept

List fields still shown: customerId, displayName maybe, status UNKNOWN.

## Step 2 — Fields dropped

List fields omitted: balance, tier, lastLogin.

## Step 3 — API signal

Decide: HTTP 200 with `degraded=true` vs 503 — pick one and justify.

## Step 4 — User message

Draft one UI string: *Account details temporarily limited.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-fallback-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Fallback Contract

## Step 1 — Fields kept

List fields still shown: customerId, displayName maybe, status UNKNOWN.

## Step 2 — Fields dropped

List fields omitted: balance, tier, lastLogin.

## Step 3 — API signal

Decide: HTTP 200 with `degraded=true` vs 503 — pick one and justify.

## Step 4 — User message

Draft one UI string: *Account details temporarily limited.*

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A written degraded contract for CRM profile responses in `notes/lab32-fallback-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-fallback-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-fallback-contract.md`
- [ ] Kept vs dropped fields
- [ ] Status-code choice justified
- [ ] User-facing string drafted

