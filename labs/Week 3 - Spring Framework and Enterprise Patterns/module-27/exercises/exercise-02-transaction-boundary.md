# Exercise 2 — Transaction Boundary Placement

**Module 27** · Checkpoint B · Exercises 1–6 Pass then Lab 27

## Activity card

| | |
| --- | --- |
| **Objective** | Decide where @Transactional belongs for CRM transfers |
| **Skills practiced** | TX boundary design |
| **Expected outcome** | notes/tx-boundary.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-27-exercises/` → notes/tx-boundary.md |
| **Checkpoint** | B (after slides 147–151) |

## What you will learn

- On TransferService.transfer
- Not on TransferController
- Public method on a Spring bean

**Enterprise context:** Controller-owned transactions couple HTTP to persistence and break reuse from other adapters.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/tx-boundary.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Transaction Boundary Placement

Place: TransferService.transfer(...) with @Transactional
Avoid: @Transactional on controller
Why: proxy on Spring service bean; HTTP stays thin
Self-invocation warning: this.transfer() inside same class skips proxy

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/tx-boundary.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Transaction Boundary Placement

## Place annotation on
_____

## Avoid
_____

## Why (one sentence)
_____

## Self-invocation risk
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`, Ravi `CUS-1002`, accounts `ACC-1001-MAIN` / `ACC-1001-LOYALTY`, force id `ACC-FORCE-FAIL`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Boundary notes in `notes/tx-boundary.md`.

## Debug / design challenge

Does a private @Transactional method participate in Spring AOP?

## Predict the Output / Behavior

Should every REST adapter call the same transactional TransferService?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/tx-boundary.md` |
| Putting TX on controller | Move to service |
| No self-invocation note | Call out proxy skip |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/tx-boundary.md`
- [ ] Service placement
- [ ] Controller avoided
- [ ] Self-invocation noted
