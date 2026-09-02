# Exercise 2 — ErrorResponse JSON Draft

**Module 16** · Checkpoint B · Exercises 1–6 Pass then Lab 16

## Activity card

| | |
| --- | --- |
| **Objective** | Draft JSON fields for a not-found error including correlation |
| **Skills practiced** | Error envelope design, hygiene |
| **Expected outcome** | notes/lab16-errorresponse-json.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-16-exercises/` → notes/lab16-errorresponse-json.md |
| **Checkpoint** | B (after slides 174) |

## What you will learn

- Fields: status, error/code, message, correlationId (+ optional path/timestamp/errors)
- CUS-9999 sample with lab-request-001
- No stack traces or SQL in the message

**Enterprise context:** Support cannot triage partner tickets without a correlationId on every Fail JSON.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab16-errorresponse-json.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — ErrorResponse JSON Draft

Fields: timestamp, status, error, message, path, correlationId.

Sample CUS-9999 not found with correlationId lab-request-001.
Message must not include stack traces or SQL.
Paper draft only — handler wiring is lab-time.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-errorresponse-json.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — ErrorResponse JSON Draft

## Fields
_____

## Sample (CUS-9999)
```json
{ "status": _____, "message": _____, "correlationId": _____ }
```

## Hygiene
Forbidden in message: _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Not-found ErrorResponse sketch with correlation in `notes/lab16-errorresponse-json.md`.

## Debug / design challenge

Someone puts e.getMessage() with a JDBC URL into JSON — rewrite the client message.

## Predict the Output / Behavior

Is correlationId required on success responses too, or only Fail? (Lab insists on Fail always.)

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-errorresponse-json.md` |
| Missing correlationId | Add lab-request-001 |
| Including stack trace in sample | Remove; keep safe message only |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-errorresponse-json.md`
- [ ] Fields listed
- [ ] CUS-9999 sample present
- [ ] Hygiene noted
