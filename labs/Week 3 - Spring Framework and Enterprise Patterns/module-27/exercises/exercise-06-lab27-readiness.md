# Exercise 6 — Lab 27 Readiness Checklist

**Module 27** · Checkpoint C · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 27 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab27-readiness.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/lab27-readiness.md |
| **Checkpoint** | C (after slides 152–156a) |

## What you will learn

- Gate Lab 27 on Ex 1–5 notes
- Service TX + rollback plan clear
- No JWT/XA detour planned

**Enterprise context:** Teams that skip rollback plans cannot show ACC-FORCE-FAIL evidence during grading.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab27-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 readiness checklist

| File | Present? |
| ---- | -------- |
| notes/acid-crm.md | yes |
| notes/tx-boundary.md | yes |
| notes/rollback-plan.md | yes |
| notes/lab27-transfer-pseudocode.md | yes |
| notes/propagation-warnings.md | yes |

@Transactional on controller? no. Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/lab27-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 readiness checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/acid-crm.md | _____ |
| notes/tx-boundary.md | _____ |
| notes/rollback-plan.md | _____ |
| notes/lab27-transfer-pseudocode.md | _____ |
| notes/propagation-warnings.md | _____ |

## Scope
Pre-lab only. @Transactional on controller? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist in `notes/lab27-readiness.md`.

## Debug / design challenge

If tx-boundary still puts TX on the controller, which exercise do you reopen?

## Predict the Output / Behavior

Is Kafka saga required for Lab 27 timed-path Pass?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab27-readiness.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 27 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab27-readiness.md`
- [ ] Artifacts confirmed
- [ ] No controller TX
- [ ] Pass/Fail marked
