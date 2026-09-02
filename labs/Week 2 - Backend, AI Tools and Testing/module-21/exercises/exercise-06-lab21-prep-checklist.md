# Exercise 6 — Lab 21 Prep Checklist

**Module 21** · Checkpoint D · Exercises 1–6 Pass then Lab 21

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 21 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab21-prep-checklist.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-21-exercises/` → notes/lab21-prep-checklist.md |
| **Checkpoint** | D (after slides 264–269) |

## What you will learn

- Gate Lab 21 on Ex 1–5 notes
- Cardinality + probe meanings clear
- Prod exposure caution internalized

**Enterprise context:** Teams that skip cardinality notes ship customerId tags and regret it in Prometheus.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab21-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 prep checklist

| File | Present? |
| ---- | -------- |
| notes/lab21-cardinality-antipatterns.md | yes |
| notes/lab21-actuator-allowlist.md | yes |
| notes/lab21-probes.md | yes |
| notes/lab21-metric-sketch-todos.md | yes |
| notes/lab21-alert-runbook.md | yes |

Lab exposure ≠ prod. Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 prep checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab21-cardinality-antipatterns.md | _____ |
| notes/lab21-actuator-allowlist.md | _____ |
| notes/lab21-probes.md | _____ |
| notes/lab21-metric-sketch-todos.md | _____ |
| notes/lab21-alert-runbook.md | _____ |

## Scope
Pre-lab only. Prod Actuator exposure? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist in `notes/lab21-prep-checklist.md`.

## Debug / design challenge

If cardinality notes still allow customerId labels, which exercise do you reopen?

## Predict the Output / Behavior

Which IT class will prove probes and metrics in the lab?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-prep-checklist.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 21 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-prep-checklist.md`
- [ ] Artifacts confirmed
- [ ] Prod caution noted
- [ ] Pass/Fail marked
