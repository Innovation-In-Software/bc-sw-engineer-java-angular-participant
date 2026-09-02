# Exercise 1 — Build Shared Fact Base

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 205–210) |
| **Deliverable** | `notes/lab47-fact-base.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · one fact base · no secrets |

### What you will learn

Collect one consistent SEV-2 CRM fact base: version, impact, fixtures, next update.

### Enterprise context

All four artifacts must agree—contradictory severity fails the lab.

### Predict

What happens if incident says SEV-2 and email says SEV-1?

### Debug

Starting four drafts with different root causes — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No shared-facts first | Write fact base before other docs |
| Inventing conflicting RC | One assumed cause; label assumptions |

**Module 47** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-47-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab47-fact-base.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 47 — Build Shared Fact Base

## Reference

| Audience | Needs |
| --- | --- |
| Responders | Symptoms, impact, next update time |
| Engineers | Change, evidence, rollback |
| Reviewers | PR verify + risk |
| Stakeholders | Business impact, ETA, no jargon pile-up |

## Step 1 — Lab scenario

Use: SEV-2, some agents HTTP 503 opening profiles, start time UTC placeholder, suspected `crm-api` 1.4.0, fixtures `CUS-1001`/`CUS-1002`, correlation `lab-request-001`.

## Step 2 — Check the reference

Separate confirmed / assumed / unknown in three lists.

## Step 3 — Mitigation stub

Note rollback toward 1.3.2 digest + watch readiness/Kafka lag (from prior labs).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-47-exercises/`, create `notes/` if needed, then create `notes/lab47-fact-base.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 47 — Build Shared Fact Base

## Reference

| Audience | Needs |
| --- | --- |
| Responders | Symptoms, impact, next update time |
| Engineers | Change, evidence, rollback |
| Reviewers | PR verify + risk |
| Stakeholders | Business impact, ETA, no jargon pile-up |

## Step 1 — Lab scenario

Use: SEV-2, some agents HTTP 503 opening profiles, start time UTC placeholder, suspected `crm-api` 1.4.0, fixtures `CUS-1001`/`CUS-1002`, correlation `lab-request-001`.

## Step 2 — Check the reference

Separate confirmed / assumed / unknown in three lists.

## Step 3 — Mitigation stub

Note rollback toward 1.3.2 digest + watch readiness/Kafka lag (from prior labs).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Fact base with confirmed/assumed/unknown split in `notes/lab47-fact-base.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab47-fact-base.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 47 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab47-fact-base.md`
- [ ] SEV and symptom stated
- [ ] Three lists present
- [ ] Fixtures consistent

