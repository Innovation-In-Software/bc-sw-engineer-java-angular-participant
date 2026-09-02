# Exercise 1 — Delivery vs Deployment

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **A** (after slides 122–127) |
| **Deliverable** | `notes/lab44-cd-vs-cdeploy.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 digest · no secrets in artifact |

### What you will learn

Distinguish continuous delivery (always releasable) from continuous deployment (auto to prod).

### Enterprise context

CRM releases need human/approval gates before production—CD ≠ auto-prod.

### Predict

Every main merge auto-deploys to prod with no approval — CD or CDeploy?

### Debug

Calling a green CI build 'released to prod' without promotion evidence — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Confusing CD with CDeploy | CD = releasable; CDeploy = auto prod |
| Real prod promote in pre-lab | Plan only; Lab 44 for evidence |

**Module 44** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-cd-vs-cdeploy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Delivery vs Deployment

## Reference

| Term | Meaning |
| --- | --- |
| Continuous delivery | Main stays releasable; promote with gates |
| Continuous deployment | Every green build may auto-prod |
| Immutable identity | Digest/checksum, not :latest |

## Step 1 — Definitions

Write two sentences: continuous delivery (always releasable) vs continuous deployment (auto-prod).

## Step 2 — Check the reference

This cohort emphasizes delivery with gates/approvals—not blind auto-prod.

## Step 3 — CRM example

Describe promoting `crm-api` digest that passed staging smoke for `CUS-1001`.

## Step 4 — Quiz yourself

Answer: if staging said GO on digest X, what must prod receive?

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-cd-vs-cdeploy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Delivery vs Deployment

## Reference

| Term | Meaning |
| --- | --- |
| Continuous delivery | Main stays releasable; promote with gates |
| Continuous deployment | Every green build may auto-prod |
| Immutable identity | Digest/checksum, not :latest |

## Step 1 — Definitions

Write two sentences: continuous delivery (always releasable) vs continuous deployment (auto-prod).

## Step 2 — Check the reference

This cohort emphasizes delivery with gates/approvals—not blind auto-prod.

## Step 3 — CRM example

Describe promoting `crm-api` digest that passed staging smoke for `CUS-1001`.

## Step 4 — Quiz yourself

Answer: if staging said GO on digest X, what must prod receive?

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear CD definitions with CRM promotion example in `notes/lab44-cd-vs-cdeploy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-cd-vs-cdeploy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-cd-vs-cdeploy.md`
- [ ] Both terms defined
- [ ] Gated delivery preferred
- [ ] Digest X answer correct

