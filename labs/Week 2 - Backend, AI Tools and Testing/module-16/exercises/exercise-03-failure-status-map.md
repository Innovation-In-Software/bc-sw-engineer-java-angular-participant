# Exercise 3 — Failure to Status Map

**Module 16** · Checkpoint C · Exercises 1–6 Pass then Lab 16

## Activity card

| | |
| --- | --- |
| **Objective** | Map Northstar failures to client-facing status classes |
| **Skills practiced** | HTTP status selection, conflict policy |
| **Expected outcome** | notes/lab16-status-map.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-16-exercises/` → notes/lab16-status-map.md |
| **Checkpoint** | C (after slides 175–177) |

## What you will learn

- 404 for CUS-9999
- 400 for validation
- 409 (or documented 422) for illegal activate
- Never 200 with an error payload

**Enterprise context:** Partners automate retries based on status — 200-with-error and 500-for-conflict both break them.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab16-status-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Failure to Status Map

| Failure | Status |
| --- | --- |
| CUS-9999 not found | 404 |
| Activate Amina illegal | 409 (or 422 — pick one) |
| Validation blank/email | 400 |
| Unexpected bug | 500 |

Never return 200 with an error payload.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-status-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Failure to Status Map

| Failure | Status |
| --- | --- |
| CUS-9999 not found | _____ |
| Illegal activate (Amina) | _____ |
| Validation blank/email | _____ |
| Unexpected bug | _____ |

## Conflict choice reason
_____

## Never
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Status map with conflict choice in `notes/lab16-status-map.md`.

## Debug / design challenge

If you choose 422 instead of 409, where must that be documented for graders?

## Predict the Output / Behavior

Does not-found return 400 or 404 when the id format is valid but unknown?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-status-map.md` |
| Using 200 for Fail | Replace with 4xx/5xx |
| Mapping illegal transition to 500 | Use 409/422 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-status-map.md`
- [ ] Four rows filled
- [ ] Conflict choice noted
- [ ] Never-200 rule present
