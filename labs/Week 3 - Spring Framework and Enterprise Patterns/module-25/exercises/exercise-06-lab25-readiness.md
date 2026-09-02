# Exercise 6 — Lab 25 Readiness Checklist

**Module 25** · Checkpoint C · Exercises 1–6 Pass then Lab 25

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 25 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab25-readiness.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-25-exercises/` → notes/lab25-readiness.md |
| **Checkpoint** | C (after slides 105–110a) |

## What you will learn

- Gate Lab 25 on Ex 1–5 notes
- Layer seams + AI policy clear
- No JPA/transaction detour planned

**Enterprise context:** Teams that skip boundary notes accept AI drafts that wire controllers to maps.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab25-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 readiness checklist

| File | Present? |
| ---- | -------- |
| notes/layers.md | yes |
| notes/package-tree.md | yes |
| notes/lab25-service-todo-skeleton.md | yes |
| notes/ai-review-policy.md | yes |
| notes/service-test-plan.md | yes |

Controller may import repository? no. Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/lab25-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 readiness checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/layers.md | _____ |
| notes/package-tree.md | _____ |
| notes/lab25-service-todo-skeleton.md | _____ |
| notes/ai-review-policy.md | _____ |
| notes/service-test-plan.md | _____ |

## Scope
Pre-lab only. Controller may import repository? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist in `notes/lab25-readiness.md`.

## Debug / design challenge

If layers.md still allows controller→repository, which exercise do you reopen?

## Predict the Output / Behavior

Is Lab 27 @Transactional required for Lab 25 timed-path Pass?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab25-readiness.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 25 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab25-readiness.md`
- [ ] Artifacts confirmed
- [ ] No controller→repo
- [ ] Pass/Fail marked
