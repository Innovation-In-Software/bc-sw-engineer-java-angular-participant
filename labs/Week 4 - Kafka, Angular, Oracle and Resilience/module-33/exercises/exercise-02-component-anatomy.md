# Exercise 2 — Map Component Anatomy and Binding

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 24–40) |
| **Deliverable** | `notes/lab33-component-anatomy.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Name what @Component declares and give a worked example of each binding form with its data direction.

### Enterprise context

Binding direction is the first thing to establish when a value shows as undefined or refuses to update.

### Predict

You write `[value]="CUS-1001"` without quotes inside. What does Angular look for?

### Debug

The name renders as blank. Is that a class problem or a template problem, and how do you tell?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only interpolation given | Cover property, event, and two-way too |
| Direction not stated | Say class → view, view → class, or both |
| Brackets misused | [x] takes an expression, not a literal string |

**Module 33** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-component-anatomy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Map Component Anatomy and Binding

## Decorator Fields

selector, template or templateUrl, styles or styleUrls, and imports for standalone components.

## Binding Table

{{ customer.name }}; [disabled]="isLoading"; (click)="select(customer)"; [(ngModel)]="filterText".

## Render Amina

<h2>{{ customer.name }}</h2> renders Amina Khan from the component's customer field.

## Direction

Interpolation and property bind class → view; event binds view → class; ngModel binds both ways.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-component-anatomy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Map Component Anatomy and Binding

## Decorator Fields

_____

## Binding Table

_____

## Render Amina

_____

## Direction

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The decorator fields, four worked bindings, a rendered fixture line, and directions in `notes/lab33-component-anatomy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-component-anatomy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-component-anatomy.md`
- [ ] @Component fields listed
- [ ] All four binding forms exemplified
- [ ] Amina render line written
- [ ] Direction stated per form
