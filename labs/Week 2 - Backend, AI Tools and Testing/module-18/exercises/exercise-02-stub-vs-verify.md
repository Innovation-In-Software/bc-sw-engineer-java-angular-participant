# Exercise 2 — Stub vs Verify

**Module 18** · Checkpoint B · Exercises 1–6 Pass then Lab 18

## Activity card

| | |
| --- | --- |
| **Objective** | Explain stubbing return values versus verifying calls for activate |
| **Skills practiced** | when/thenReturn vs verify |
| **Expected outcome** | notes/lab18-stub-verify.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-18-exercises/` → notes/lab18-stub-verify.md |
| **Checkpoint** | B (after slides 208–209) |

## What you will learn

- Stub findById arranges input
- verify(save) asserts collaboration
- Stubs feed inputs; verifies prove side effects

**Enterprise context:** A green test that only stubs and never verifies can miss a missing save in production.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab18-stub-verify.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Stub vs Verify

Stub: when(repo.findById("CUS-1002")).thenReturn(raviProspect)
Verify: verify(repo).save(…)
Both: stubs feed inputs; verifies prove side-effect calls.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-stub-verify.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Stub vs Verify

## Stub (arrange)
_____

## Verify (assert collaboration)
_____

## One sentence — both roles
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Stub vs verify contrast in `notes/lab18-stub-verify.md`.

## Debug / design challenge

For CUS-9999 not-found, which verify proves the bug is fixed: save or never().save?

## Predict the Output / Behavior

Is thenReturn alone enough to prove activate persisted ACTIVE?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-stub-verify.md` |
| Treating stub as assert | Add an explicit verify example |
| Skipping the both sentence | Write stubs vs verifies roles |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-stub-verify.md`
- [ ] Stub example
- [ ] Verify example
- [ ] Both-roles sentence
