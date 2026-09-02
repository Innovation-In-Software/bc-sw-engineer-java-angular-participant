# Exercise 2 — Align Typed Models to the API

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 24–38) |
| **Deliverable** | `notes/lab35-typed-models.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · lab-request-001 correlation |

### What you will learn

Define TypeScript interfaces that match the Java DTO exactly, including the paged list envelope.

### Enterprise context

TypeScript types are erased at runtime, so a mismatch with the API shows up as undefined in the UI, not a compile error.

### Predict

`createdAt` is typed as `Date` but arrives as an ISO string. When does that surface?

### Debug

The list renders nothing and the console shows no error. What shape did you assume the response had?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Types guessed | Read them off the Java DTO |
| status typed as string | Use a union so invalid values fail to compile |
| Bare array assumed | The list returns a paging envelope |

**Module 35** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-typed-models.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Align Typed Models to the API

## Customer Interface

id: string, name: string, email: string, status: 'ACTIVE' | 'PROSPECT', createdAt: string.

## Typed Call

http.get<Customer>(`${base}/api/customers/${id}`) — the generic types the response.

## Drift Risk

createdAt: Java sends an ISO-8601 string; typing it as Date compiles but breaks at runtime.

## Paged Response

interface Page<T> { content: T[]; page: number; size: number; totalElements: number }.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-typed-models.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Align Typed Models to the API

## Customer Interface

_____

## Typed Call

_____

## Drift Risk

_____

## Paged Response

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A fixture-accurate Customer interface, a typed call, a named drift risk, and a Page type in `notes/lab35-typed-models.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-typed-models.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-typed-models.md`
- [ ] Customer interface matches the DTO
- [ ] Generic type argument shown
- [ ] One drift risk named
- [ ] Paged wrapper defined
