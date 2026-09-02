# Exercise 5 — Design Three Probes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 38–57) |
| **Deliverable** | `notes/lab42-probe-design.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Distinguish the three probes and give readiness a dependency-aware endpoint.

### Enterprise context

If liveness checks the database, a brief outage restarts every pod and turns a blip into an outage.

### Predict

Liveness points at a database-backed endpoint and the database blips. What happens to every pod?

### Debug

Readiness fails but liveness passes. Is the pod restarted, and does it receive traffic?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| All three on one endpoint | Readiness must reflect real dependencies |
| Liveness checks the database | That turns a blip into a restart storm |
| No startup probe | Slow boots get killed by liveness without one |

**Module 42** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-probe-design.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Design Three Probes

## Definitions

Startup covers a slow boot; readiness says whether the pod can take traffic; liveness restarts a wedged process.

## Check the Reference

Readiness points at a check that includes the database; liveness stays shallow so a dependency blip cannot cause restarts.

## Paths

startup and liveness on /actuator/health/liveness, readiness on /actuator/health/readiness, both on 8080.

## Failure Story

The pod stays running but is removed from the Service endpoints, so users are routed to healthy pods instead.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-probe-design.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Design Three Probes

## Definitions

_____

## Check the Reference

_____

## Paths

_____

## Failure Story

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three probe definitions, dependency-aware readiness, proposed paths, and a failure story in `notes/lab42-probe-design.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-probe-design.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-probe-design.md`
- [ ] Three probes defined distinctly
- [ ] Readiness reflects dependencies
- [ ] Paths and ports proposed
- [ ] Failure behaviour described
