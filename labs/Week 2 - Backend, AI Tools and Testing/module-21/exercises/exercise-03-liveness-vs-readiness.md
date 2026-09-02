# Exercise 3 — Liveness vs Readiness

**Module 21** · Checkpoint C · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Explain when orchestrators should restart vs stop sending traffic |
| **Skills practiced** | Probe semantics |
| **Expected outcome** | notes/lab21-probes.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-probes.md |
| **Checkpoint** | C (after slides 263) |

## What you will learn

- Liveness fail → restart process
- Readiness fail → keep process, remove from LB
- Wrong mix: restarting on DB blip causes death spirals

**Enterprise context:** Restarting every pod because the database blinked removes capacity exactly when you need it.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-probes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Liveness vs Readiness

Liveness: process stuck → restart (e.g., deadlocked threads).
Readiness: dependency down → not ready, keep process.
Wrong mix: restarting on transient DB outage.
Lab: toggle CrmReadinessIndicator OUT_OF_SERVICE; liveness stays UP.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-probes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Liveness vs Readiness

## Liveness
_____

## Readiness
_____

## Wrong mix
_____

## Lab expectation
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Probe contrast in `notes/lab21-probes.md`.

## Debug / design challenge

If readiness is DOWN and liveness UP, should Kubernetes kill the pod?

## Predict the Output / Behavior

Map CrmReadinessIndicator OUT_OF_SERVICE to which probe?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-probes.md` |
| Swapping meanings | Restart = liveness; shed traffic = readiness |
| No wrong-mix note | Call out DB-blip restarts |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-probes.md`
- [ ] Liveness defined
- [ ] Readiness defined
- [ ] Wrong mix noted
