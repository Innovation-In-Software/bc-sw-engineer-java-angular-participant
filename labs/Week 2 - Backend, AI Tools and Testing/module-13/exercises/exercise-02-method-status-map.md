# Exercise 2 — Map Methods to Status Codes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 36–47) |
| **Deliverable** | `notes/lab13-method-status-map.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT · CUS-9999 not found |

### What you will learn

Map each method on each URI to its exact success and failure status codes, with safety and idempotence marked.

### Enterprise context

Status codes are the API's error language. A create that returns 200 with no Location makes every client guess.

### Predict

A POST times out and the client retries. What might exist in the database afterwards?

### Debug

Your create returns 200 with the body only. What does the client not know?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Create returns 200 | 201 plus a Location header pointing at the new item |
| Everything returns 200 | Map 404 for CUS-9999 and 400 for a bad body |
| Safe and idempotent conflated | Safe = no change; idempotent = same state on repeat |

**Module 13** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-method-status-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Map Methods to Status Codes

## Method Table

GET on collection and item; POST on the collection; PUT and DELETE on the item.

## Success Codes

GET 200, POST 201 with Location: /api/customers/CUS-1003, PUT 200, DELETE 204 with no body.

## Failure Codes

GET /api/customers/CUS-9999 returns 404; a malformed create body returns 400.

## Safe vs Idempotent

GET safe and idempotent; PUT and DELETE idempotent but not safe; POST neither.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-method-status-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Map Methods to Status Codes

## Method Table

_____

## Success Codes

_____

## Failure Codes

_____

## Safe vs Idempotent

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A per-method status map covering success and failure, with safety and idempotence marked, in `notes/lab13-method-status-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-method-status-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-method-status-map.md`
- [ ] Methods listed per URI
- [ ] Exact success codes including 201 + Location
- [ ] 404 and 400 cases mapped
- [ ] Safe/idempotent marked per method
