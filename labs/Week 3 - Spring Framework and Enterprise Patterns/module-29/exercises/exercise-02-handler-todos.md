# Exercise 2 — GlobalExceptionHandler TODOs

**Module 29** · Checkpoint B · Practice order **1 → 2 → 3 → 4 → 6 → 5** then Lab 29

## Activity card

| | |
| --- | --- |
| **Objective** | List @ExceptionHandler methods the advice must implement |
| **Skills practiced** | Global handler design |
| **Expected outcome** | notes/lab29-handler-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-29-exercises/` → notes/lab29-handler-todos.md |
| **Checkpoint** | B (after slides 198–204) |

## What you will learn

- MethodArgumentNotValidException → 400
- Not-found → 404
- Duplicate → 409
- Safe 500 fallback

**Enterprise context:** Without a global handler, each controller invents different error JSON and Angular breaks.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab29-handler-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — GlobalExceptionHandler TODOs

@RestControllerAdvice class GlobalExceptionHandler
- handleMethodArgumentNotValid → 400
- handleNotFound → 404
- handleDuplicate → 409
- handleIllegalTransition → 400/422
- handleGeneric → 500 (no stack trace body)

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/lab29-handler-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — GlobalExceptionHandler TODOs

## Advice annotation
_____

## Handlers (list)
_____

## 500 rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, not-found `CUS-9999`, correlation `lab-request-001`. Replace every `_____` before Pass. **Never put secrets or stack traces in client envelopes.**

## Expected result

Handler TODOs in `notes/lab29-handler-todos.md`.

## Debug / design challenge

Should CustomerNotFoundException be handled before Exception?

## Predict the Output / Behavior

Where must the advice class live for component scanning?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab29-handler-todos.md` |
| Only a generic handler | List specific types |
| Stack trace in 500 body | Forbid it |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab29-handler-todos.md`
- [ ] Advice type
- [ ] 400/404/409
- [ ] Safe 500
