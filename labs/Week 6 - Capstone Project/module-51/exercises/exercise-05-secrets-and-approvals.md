# Exercise 5 — Plan Secrets and Approvals

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 32–36) |
| **Deliverable** | `notes/lab51-secrets-approvals.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Map GitHub Environments to triggers, define the production approval, and use OIDC rather than stored keys.

### Enterprise context

A long-lived cloud key in CI is a standing risk; an OIDC token is minted per run and expires by itself.

### Predict

A workflow log is accidentally made public. What does an attacker get under stored keys versus OIDC?

### Debug

Your notes file contains an actual token value — what has to happen now?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No approver named | Name the reviewer and the evidence they see |
| Long-lived keys planned | Prefer OIDC federation with short-lived tokens |
| A real value written down | Names only — rotate anything you wrote |

**Module 51** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-secrets-approvals.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Plan Secrets and Approvals

## Environment Map

staging receives main pushes with no approval; production receives v* tags only.

## Approval Gate

The release owner approves production after seeing a green staging smoke run and the scan summary.

## OIDC over Secrets

OIDC mints a short-lived, scoped token per run, so there is no standing credential to leak or rotate.

## Names Only

Notes list names such as OPENSHIFT_SERVER and REGISTRY_USER only — no values anywhere.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-secrets-approvals.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Plan Secrets and Approvals

## Environment Map

_____

## Approval Gate

_____

## OIDC over Secrets

_____

## Names Only

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An environment-to-trigger map, a named approver with evidence, an OIDC rationale, and names-only secrets in `notes/lab51-secrets-approvals.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-secrets-approvals.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-secrets-approvals.md`
- [ ] Environments mapped to triggers
- [ ] Approver and required evidence named
- [ ] OIDC rationale written
- [ ] No secret values present
