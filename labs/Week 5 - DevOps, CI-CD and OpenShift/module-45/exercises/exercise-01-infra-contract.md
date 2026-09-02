# Exercise 1 — Draft Infra Contract

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** (after slides 148–153) |
| **Deliverable** | `notes/lab45-infra-contract.md` |
| **Fixtures** | CRM tags only · no PII in IaC · no tfstate/keys in Git |

### What you will learn

Write a bounded non-prod infra contract: env, region, network, DB, tags, cost, forbidden public exposure.

### Enterprise context

AI drafts must stay inside the contract—public DB still fails even if HCL validates.

### Predict

Should CRM customer PII appear in Terraform tags or variables?

### Debug

Contract allows 0.0.0.0/0 on DB port — reject or accept?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Vague 'make CRM infra' | Bound env/region/cost/exposure |
| PII in .tf | Tags like application=crm only |

**Module 45** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab45-infra-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Draft Infra Contract

## Reference

| Allowed in IaC | Forbidden in IaC |
| --- | --- |
| Network/runtime sketches | Real cloud keys |
| tfvars.example | terraform.tfstate |
| inventory.example.yml | Customer PII |
| Tags/labels | Unreviewed public DB |

## Step 1 — Contract fields

env names (`crm-dev`/`crm-test`), region, network, runtime, DB, tags, cost limits, forbidden public exposure.

## Step 2 — Check the reference

Syntactically valid Terraform that opens a public DB still fails the lab.

## Step 3 — Tags

Propose tags: `application=crm`, `environment=dev`, `owner=(your note here)`.

## Step 4 — Data rule

State: fixtures `CUS-1001`/`CUS-1002` stay in app labs—not IaC state.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-infra-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Draft Infra Contract

## Reference

| Allowed in IaC | Forbidden in IaC |
| --- | --- |
| Network/runtime sketches | Real cloud keys |
| tfvars.example | terraform.tfstate |
| inventory.example.yml | Customer PII |
| Tags/labels | Unreviewed public DB |

## Step 1 — Contract fields

env names (`crm-dev`/`crm-test`), region, network, runtime, DB, tags, cost limits, forbidden public exposure.

## Step 2 — Check the reference

Syntactically valid Terraform that opens a public DB still fails the lab.

## Step 3 — Tags

Propose tags: `application=crm`, `environment=dev`, `owner=_____`.

## Step 4 — Data rule

State: fixtures `CUS-1001`/`CUS-1002` stay in app labs—not IaC state.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Infra contract with forbidden exposures documented in `notes/lab45-infra-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-infra-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-infra-contract.md`
- [ ] Contract fields present
- [ ] Public DB forbidden
- [ ] Fixture rule stated

