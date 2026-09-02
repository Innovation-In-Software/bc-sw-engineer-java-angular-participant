# Exercise 5 — Lab 29 Readiness Checklist

**Module 29** · Checkpoint C · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 29 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab29-readiness.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/lab29-readiness.md |
| **Checkpoint** | C (after slides 205–210) |

## What you will learn

- Gate Lab 29 on Ex 1–4 and 6 notes
- Envelope + status map clear
- No stack-trace HTML planned

**Enterprise context:** Teams that skip the MockMvc body plan only assert statuses and ship broken envelopes.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab29-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 readiness checklist

| File | Present? |
| ---- | -------- |
| notes/dto-constraints.md | yes |
| notes/lab29-handler-todos.md | yes |
| notes/error-envelope.md | yes |
| notes/exception-status-map.md | yes |
| notes/mockmvc-body-plan.md | yes |

Stack traces to clients? no. Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/lab29-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 readiness checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/dto-constraints.md | _____ |
| notes/lab29-handler-todos.md | _____ |
| notes/error-envelope.md | _____ |
| notes/exception-status-map.md | _____ |
| notes/mockmvc-body-plan.md | _____ |

## Scope
Pre-lab only. Stack traces to clients? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

Readiness checklist in `notes/lab29-readiness.md`.

## Debug / design challenge

If mockmvc-body-plan is missing, which exercise do you reopen?

## Predict the Output / Behavior

Does Lab 29 replace Lab 28 SecurityFilterChain?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab29-readiness.md` |
| Marking Pass with blanks | Fill every yes/no |
| Using mockmvc-body-plan as readiness filename | Readiness is lab29-readiness.md |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab29-readiness.md`
- [ ] Artifacts confirmed
- [ ] No stack traces
- [ ] Pass/Fail marked
