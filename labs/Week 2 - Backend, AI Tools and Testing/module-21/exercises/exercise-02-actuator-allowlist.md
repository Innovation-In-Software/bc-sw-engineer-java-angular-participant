# Exercise 2 — Actuator Allow-List

**Module 21** · Checkpoint B · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Draft which Actuator endpoints may be exposed in lab vs locked down |
| **Skills practiced** | Management endpoint security mindset |
| **Expected outcome** | notes/lab21-actuator-allowlist.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-actuator-allowlist.md |
| **Checkpoint** | B (after slides 261–262) |

## What you will learn

- Candidates: health, info, metrics, prometheus
- Lab may allow health/metrics; lock env/beans/configprops
- Prod needs auth/network controls

**Enterprise context:** Open `/actuator/env` on the public internet is a credential leak waiting to happen.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-actuator-allowlist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Actuator Allow-List

Candidates: health, info, metrics, prometheus.
Lab allow: health (+ metrics for demos); lock env/beans/configprops.
Prod: authenticate/network-restrict management port.
Lab exposure ≠ production exposure.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-actuator-allowlist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Actuator Allow-List

## Candidates
_____

## Lab allow
_____

## Lock / deny
_____

## Prod auth note
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Allow-list with lab vs prod caution in `notes/lab21-actuator-allowlist.md`.

## Debug / design challenge

Should /actuator/beans be on the lab allow-list for the graded demo?

## Predict the Output / Behavior

What happens if exposure.include=* in production YAML?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-actuator-allowlist.md` |
| Allowing env in lab casually | Lock env/beans/configprops |
| No prod caution | Write auth/network note |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-actuator-allowlist.md`
- [ ] Candidates listed
- [ ] Lab allow stated
- [ ] Prod caution present
