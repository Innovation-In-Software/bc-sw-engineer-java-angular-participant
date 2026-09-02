# Exercise 1 — Plan the API Service

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–22) |
| **Deliverable** | `notes/lab35-api-service.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Plan an injectable API service, where HttpClient is provided, and what the service must not do.

### Enterprise context

A service that also holds view state cannot be reused by a second component or tested without one.

### Predict

You inject HttpClient without calling `provideHttpClient()`. When does it fail, and how loudly?

### Debug

The service formats dates for display. Which component can no longer reuse it as-is?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| HttpClient not provided | Add provideHttpClient() to app.config.ts |
| Service holds selection state | State belongs to the component |
| Methods return subscriptions | Return Observables; let callers subscribe |

**Module 35** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-api-service.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Plan the API Service

## Provide HttpClient

provideHttpClient() goes in the providers array of app.config.ts.

## Service Shape

@Injectable({ providedIn: 'root' }) class CustomerApiService, injecting HttpClient only.

## Method List

list → GET /api/customers; get(id) → GET /api/customers/{id}; create → POST; update → PUT; remove → DELETE.

## Boundary

No template concerns, no display formatting, and no component state — it returns Observables and nothing else.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-api-service.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Plan the API Service

## Provide HttpClient

_____

## Service Shape

_____

## Method List

_____

## Boundary

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A provider location, an injectable service shape, a method list, and a stated boundary in `notes/lab35-api-service.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-api-service.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-api-service.md`
- [ ] provideHttpClient location named
- [ ] Service injectable and its dependency stated
- [ ] Five methods mapped to HTTP calls
- [ ] Service boundary written
