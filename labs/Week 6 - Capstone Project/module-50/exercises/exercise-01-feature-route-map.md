# Exercise 1 — Map Features and Routes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 12–18) |
| **Deliverable** | `notes/lab50-feature-route-map.md` |
| **Fixtures** | CUS-1001 Amina Khan (CRUD) · CUS-1002 Ravi Singh (list) · CUS-9999 not-found |

### What you will learn

Turn the Angular feature and routing architecture into a concrete folder and route map for the customer slice.

### Enterprise context

Feature structure decided ad hoc during a build session produces circular imports and a shared folder nobody can reason about.

### Predict

If create and edit are two separate components, what happens the first time the form gains a field?

### Debug

A status badge used only by the customer feature is placed in `shared/` — what goes wrong later?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Routes missing create or edit | Four routes: list, detail, create, edit |
| Everything placed in shared/ | Shared means a second feature uses it unchanged |
| Ran ng generate already | Paper plan only — Lab 50 Step 1 generates |

**Module 50** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-feature-route-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Map Features and Routes

## Feature Folders

customers/ with components/, services/, models/, and customers.routes.ts.

## Route Table

/customers (list), /customers/:id (detail), /customers/new (create), /customers/:id/edit (edit).

## Shared vs Feature

LoadingSpinner and ErrorBanner go in shared — an interactions feature would use both unchanged.

## Scope

Paper plan only — no ng generate, no component files created yet.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-feature-route-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Map Features and Routes

## Feature Folders

_____

## Route Table

_____

## Shared vs Feature

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A feature folder list, a four-row route table, and a justified shared/feature split in `notes/lab50-feature-route-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-feature-route-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-feature-route-map.md`
- [ ] Feature folders listed
- [ ] Four routes with path patterns
- [ ] Two shared components justified
