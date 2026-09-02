# Exercise 1 — Plan the Angular Workspace

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–22) |
| **Deliverable** | `notes/lab33-workspace-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Plan the CLI command, folder map, and bootstrap chain for the CRM Angular application.

### Enterprise context

A workspace laid out ad hoc during a build session grows a src/app folder nobody can navigate by week three.

### Predict

The browser renders a blank page with no console error. Which link in the bootstrap chain do you check first?

### Debug

A teammate puts every component directly in `src/app`. What breaks down at twenty components?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Command without flags | State routing and style choices explicitly |
| No feature folder | features/customers/ holds the customer UI |
| Bootstrap chain vague | index.html → main.ts → root component |

**Module 33** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-workspace-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Plan the Angular Workspace

## Create Command

ng new lab33-crm-ui --routing --style=scss with standalone components.

## Folder Map

src/app holds app.config.ts, app.routes.ts, features/customers/ for the feature, and shared/ for reusable pieces.

## Bootstrap Path

index.html contains <app-root>; main.ts calls bootstrapApplication(AppComponent); Angular renders into that tag.

## Scope

Plan only — no ng new run yet; Lab 33 Step 1 creates the project.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-workspace-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Plan the Angular Workspace

## Create Command

_____

## Folder Map

_____

## Bootstrap Path

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A CLI command, a folder map, and the bootstrap chain in `notes/lab33-workspace-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-workspace-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-workspace-plan.md`
- [ ] ng new command with flags
- [ ] Folder map including a feature folder
- [ ] Bootstrap chain traced
