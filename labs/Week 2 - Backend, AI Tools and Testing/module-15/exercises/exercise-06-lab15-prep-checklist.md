# Exercise 6 — Lab 15 Prep Checklist

**Module 15** · Checkpoint D · Exercises 1–6 Pass then Lab 15

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 15 |
| **Skills practiced** | Readiness gate, fixture check |
| **Expected outcome** | notes/lab15-prep-checklist.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-15-exercises/` → notes/lab15-prep-checklist.md |
| **Checkpoint** | D (after slides 158–163) |

## What you will learn

- Gate Lab 15 on Ex 1–5 notes
- Fixtures: Amina ACTIVE, Ravi PROSPECT
- No HashMap in service; Lab 16 owns HTTP mapping

**Enterprise context:** Teams that skip the prep gate waste lab time rediscovering where transitions belong.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab15-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 prep checklist

| File | Present? |
| ---- | -------- |
| notes/lab15-layers.md | yes |
| notes/lab15-repo-boundary.md | yes |
| notes/lab15-transition-matrix.md | yes |
| notes/lab15-interface-ctor-sketch.md | yes |
| notes/lab15-activate-ravi-todos.md | yes |

Fixtures: CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT
Scope: pre-lab only; no full Lab 15 yet; no @ControllerAdvice yet.
Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 prep checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab15-layers.md | _____ |
| notes/lab15-repo-boundary.md | _____ |
| notes/lab15-transition-matrix.md | _____ |
| notes/lab15-interface-ctor-sketch.md | _____ |
| notes/lab15-activate-ravi-todos.md | _____ |

## Fixtures
CUS-1001 Amina _____ · CUS-1002 Ravi _____

## Scope
Pre-lab only. HTTP exception mapping lab: _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist with pre-lab-only scope in `notes/lab15-prep-checklist.md`.

## Debug / design challenge

If HashMap still lives in the service package plan, what failed the gate?

## Predict the Output / Behavior

Which fixture starts PROSPECT for the activate demo?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-prep-checklist.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 15 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-prep-checklist.md`
- [ ] Artifacts confirmed
- [ ] Fixtures correct
- [ ] Pre-lab-only statement present
