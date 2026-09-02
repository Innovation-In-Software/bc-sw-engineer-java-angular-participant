# Exercise 1 — Deployment YAML TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 16–21) |
| **Deliverable** | `notes/lab42-yaml-todos.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Complete a Deployment skeleton with non-root security, a pinned digest, probes, and resource bounds.

### Enterprise context

A Deployment without resource limits can starve every other workload on the same node.

### Predict

You deploy with `:latest` and the tag is repointed next week. Which image is running?

### Debug

The pod runs as root. Which two fields were left blank?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Blanks left unfilled | Every _____ must be replaced |
| Image by tag only | Pin the sha256 digest |
| No resources block | Add requests and limits |

**Module 42** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-yaml-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Deployment YAML TODOs

## Core Fields

replicas: 2, runAsNonRoot: true, runAsUser: 10001, containerPort: 8080.

## Image Digest

image: crm-api@sha256:<digest from Lab 41> — the tag alone is not an identity.

## Readiness

readinessProbe httpGet path /actuator/health/readiness on port 8080.

## Resources

resources.requests cpu 200m memory 512Mi; limits cpu 1 memory 1Gi.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-yaml-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Deployment YAML TODOs

## Core Fields

_____

## Image Digest

_____

## Readiness

_____

## Resources

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A completed Deployment skeleton with no remaining blanks in `notes/lab42-yaml-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-yaml-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-yaml-todos.md`
- [ ] Replicas, non-root, UID, and port filled
- [ ] Image pinned by digest
- [ ] Readiness path and port filled
- [ ] Resources block added
