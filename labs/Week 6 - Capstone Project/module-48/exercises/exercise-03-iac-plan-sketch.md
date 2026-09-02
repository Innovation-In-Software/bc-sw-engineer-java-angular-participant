# Exercise 3 — Scope Terraform and Ansible

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 20–23) |
| **Deliverable** | `notes/lab48-iac-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Draw the Terraform/Ansible ownership boundary and state the secrets and idempotence rules for the capstone.

### Enterprise context

Hand-edited infrastructure cannot be rebuilt after an outage. The ownership split is what makes the capstone environment reproducible.

### Predict

If Terraform and Ansible both manage the same route, which one wins on the next apply?

### Debug

An Ansible task appends a line to a config file every run — why is that not idempotent?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Both tools own the same resource | Give each resource exactly one owner |
| State location vague | Name the remote backend and say it is locked |
| Idempotence asserted, not shown | Name the module or guard that makes it safe |

**Module 48** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-iac-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Scope Terraform and Ansible

## Split the Work

Terraform provisions the OpenShift project, quotas, routes, and managed PostgreSQL. Ansible configures app settings, env vars, and DB users.

## State

Remote backend with state locking; never committed — state can contain resource identifiers and connection details.

## Idempotence

Creating the CRM DB user is declarative: the second run reports ok, not changed, because the desired state already matches.

## Secrets Rule

No secrets in HCL, YAML, or Git. Values are injected at run time from the platform secret store.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-iac-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Scope Terraform and Ansible

## Split the Work

_____

## State

_____

## Idempotence

_____

## Secrets Rule

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A one-line-per-tool ownership split, a named state location, one proven-idempotent task, and the secrets rule in `notes/lab48-iac-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-iac-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-iac-plan.md`
- [ ] Terraform and Ansible each own distinct resources
- [ ] Remote state named and kept out of Git
- [ ] One idempotent task explained
- [ ] No-secrets rule written
