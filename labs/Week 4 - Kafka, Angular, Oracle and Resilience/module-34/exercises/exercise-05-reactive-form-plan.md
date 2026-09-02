# Exercise 5 — Plan the Reactive Filter Form

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 60–70) |
| **Deliverable** | `notes/lab34-form-plan.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Plan a reactive filter form and wire its value changes into the signal that drives the list.

### Enterprise context

A form whose model lives only in the template cannot be unit tested without rendering the component.

### Predict

`valueChanges` updates the filter on every keystroke with no debounce. What does the list do?

### Debug

The form value changes but the list does not. Which connection is missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Template-driven chosen by default | Reactive keeps the model testable in the class |
| No debounce | Add debounceTime before setting the signal |
| Validator without a message | Every validator needs user-visible text |

**Module 34** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-form-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Plan the Reactive Filter Form

## Controls

filterForm: FormGroup with name: FormControl<string> and status: FormControl<string> defaulting to ALL.

## Validation

Validators.maxLength(50) on name; the message reads 'Keep the search under 50 characters.'

## Wire to State

filterForm.valueChanges.pipe(debounceTime(300)) then filter.set(value) — the computed list follows.

## Reactive vs Template

Reactive forms keep the model in the class, so a unit test can set values without rendering the template.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-form-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Plan the Reactive Filter Form

## Controls

_____

## Validation

_____

## Wire to State

_____

## Reactive vs Template

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A FormGroup definition, one validator with its message, the signal wiring, and the reactive rationale in `notes/lab34-form-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-form-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-form-plan.md`
- [ ] FormGroup and controls named
- [ ] Validator with user message
- [ ] valueChanges wired to the signal
- [ ] Reactive choice justified
