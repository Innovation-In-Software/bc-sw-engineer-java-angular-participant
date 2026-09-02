# Exercise 3 — Shape Responses with ResponseEntity

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 31–39) |
| **Deliverable** | `notes/lab24-response-map.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Return the right ResponseEntity for each outcome, including 201 with Location and a bodyless 404.

### Enterprise context

Returning null gives the client a 200 with an empty body, which reads as success and hides the real outcome.

### Predict

`getOne` returns null for CUS-9999. What status and body does the client receive?

### Debug

Create returns 201 but the client cannot find the new resource. Which header is missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Create returns ok() | Use created(uri) for 201 plus Location |
| null returned for missing | Use notFound().build() |
| Media type unstated | Declare produces = application/json |

**Module 24** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-response-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Shape Responses with ResponseEntity

## Return Table

list and getOne return ok(body); create returns created(uri).body(dto); update returns ok(dto).

## Location Header

Location: /api/customers/CUS-1003, built from the id the service assigned.

## Not Found

getOne returns notFound().build() so the response is a 404 with no body at all.

## Media Type

application/json, declared once via produces on the class-level @RequestMapping.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-response-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Shape Responses with ResponseEntity

## Return Table

_____

## Location Header

_____

## Not Found

_____

## Media Type

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A per-handler return table with a Location header, a bodyless 404, and the media type in `notes/lab24-response-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-response-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-response-map.md`
- [ ] ResponseEntity named per handler
- [ ] Location header shown for create
- [ ] 404 returns no body
- [ ] Media type declared
