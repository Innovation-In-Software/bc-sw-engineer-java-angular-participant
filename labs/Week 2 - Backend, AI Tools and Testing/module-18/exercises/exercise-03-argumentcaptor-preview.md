# Exercise 3 — ArgumentCaptor Preview

**Module 18** · Checkpoint C · Exercises 1–6 Pass then Lab 18

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch ArgumentCaptor steps for saved Customer without running tests yet |
| **Skills practiced** | ArgumentCaptor workflow |
| **Expected outcome** | notes/lab18-argumentcaptor-preview.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-18-exercises/` → notes/lab18-argumentcaptor-preview.md |
| **Checkpoint** | C (after slides 210–213) |

## What you will learn

- Declare ArgumentCaptor<Customer>
- verify(repo).save(captor.capture())
- Assert status ACTIVE for Ravi

**Enterprise context:** verify(save) alone does not prove the entity carried ACTIVE — captors close that gap.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab18-argumentcaptor-preview.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — ArgumentCaptor Preview

Declare ArgumentCaptor<Customer>.
verify(repo).save(captor.capture()).
Assert captor.getValue().getStatus() == ACTIVE for Ravi.
Prepare for Lab 18; do not complete full suite now.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-argumentcaptor-preview.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — ArgumentCaptor Preview

## Declare
_____

## Verify + capture
_____

## Assert
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Captor preview steps in `notes/lab18-argumentcaptor-preview.md`.

## Debug / design challenge

Would any(Customer.class) without a captor catch a PROSPECT left unchanged?

## Predict the Output / Behavior

Where do you place the captor relative to the service.activate call?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-argumentcaptor-preview.md` |
| Only verifying save without capture | Add status assert on captor value |
| Running full Lab 18 here | Paper preview only |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-argumentcaptor-preview.md`
- [ ] Declare step
- [ ] Capture verify
- [ ] Status assert
