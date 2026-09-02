# Exercise 4 — Plan the Deployment Stages

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 24–30) |
| **Deliverable** | `notes/lab51-deploy-stage-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Sequence promotion, infrastructure, configuration, deploy, and verify with one immutable artifact throughout.

### Enterprise context

If the deploy stage rebuilds instead of promoting, every scan result from earlier in the pipeline describes a different artifact.

### Predict

Ansible fails after Terraform succeeded. What is serving traffic right now?

### Debug

The deploy job runs `docker build` again — what did the security stage actually prove?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Stages out of order | Infrastructure before configuration before deploy |
| Rebuild in the deploy stage | Promote the same digest end to end |
| Ownership differs from Lab 48 | Match your own earlier Terraform/Ansible split |

**Module 51** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-deploy-stage-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Plan the Deployment Stages

## Stage Order

promote the digest → terraform apply → ansible configure → oc deploy → verify readiness.

## Ownership

Terraform owns the Project, quotas, routes, and managed PostgreSQL; Ansible owns app config, env vars, and DB users.

## Same Artifact

The digest promoted from the image stage is the digest deployed — no rebuild anywhere downstream.

## Failure Stop

Any stage failing stops the pipeline; the previous deployment keeps serving because deploy never ran.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-deploy-stage-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Plan the Deployment Stages

## Stage Order

_____

## Ownership

_____

## Same Artifact

_____

## Failure Stop

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An ordered five-stage plan with tool ownership, one immutable digest, and a failure-stop rule in `notes/lab51-deploy-stage-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-deploy-stage-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-deploy-stage-plan.md`
- [ ] Five stages in order
- [ ] Terraform and Ansible ownership matches Lab 48
- [ ] Same digest promoted and deployed
- [ ] Failure-stop behaviour stated
