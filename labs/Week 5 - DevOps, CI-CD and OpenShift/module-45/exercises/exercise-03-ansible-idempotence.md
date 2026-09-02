# Exercise 3 — Ansible Idempotence Notes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 165–171) |
| **Deliverable** | `notes/lab45-ansible-idempotence.md` |
| **Fixtures** | CRM tags only · no PII in IaC · no tfstate/keys in Git |

### What you will learn

Sketch idempotent playbook responsibilities vs Terraform provisioning.

### Enterprise context

Second run should report no change when authorized—shell-only hacks often aren't idempotent.

### Predict

Terraform vs Ansible: who owns VM create vs package config?

### Debug

Playbook always 'changed' on second run — likely cause?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only raw shell tasks | Prefer modules with desired state |
| Real inventory IPs with secrets | Use inventory.example.yml |

**Module 45** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab45-ansible-idempotence.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Ansible Idempotence Notes

## Step 1 — Modules

Name modules/handlers you expect (package, service, copy/template, handler restart).

## Step 2 — Check the reference

Second run should be no-change when authorized; prove with lint/syntax first.

## Step 3 — Ownership/modes

Note file ownership/modes matter for app config files.

## Step 4 — Inventory

Commit only `inventory.example.yml`—never real host credentials.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-ansible-idempotence.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Ansible Idempotence Notes

## Step 1 — Modules

Name modules/handlers you expect (package, service, copy/template, handler restart).

## Step 2 — Check the reference

Second run should be no-change when authorized; prove with lint/syntax first.

## Step 3 — Ownership/modes

Note file ownership/modes matter for app config files.

## Step 4 — Inventory

Commit only `inventory.example.yml`—never real host credentials.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ansible idempotence and inventory hygiene notes in `notes/lab45-ansible-idempotence.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-ansible-idempotence.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-ansible-idempotence.md`
- [ ] Modules named
- [ ] Second-run expectation stated
- [ ] Example inventory only

