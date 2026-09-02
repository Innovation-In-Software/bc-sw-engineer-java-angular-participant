# Exercise 4 — Choose Stable Selectors

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 34–50) |
| **Deliverable** | `notes/lab19-selectors.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · lab-request-001 |

### What you will learn

Select elements by a dedicated test attribute and explain why positional and generated selectors break.

### Enterprise context

A UI suite bound to DOM structure fails on every refactor, and the team learns to ignore red builds.

### Predict

Someone wraps the list in a new flex container. Which of your selectors survive?

### Debug

A selector using `._ngcontent-abc-12` worked yesterday and fails today. What changed?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Positional CSS paths | Bind to a stable attribute instead |
| Angular generated classes used | They change on every build |
| No hook in the template | Add data-testid as part of the contract |

**Module 19** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-selectors.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Choose Stable Selectors

## Selector Table

List: [data-testid='customer-list']; row: [data-testid='customer-row-CUS-1001']; button: [data-testid='save-customer'].

## Why Not CSS Paths

Any inserted wrapper element shifts the positions, so the selector matches nothing or the wrong node.

## Angular Classes

Angular's _ngcontent and _nghost attributes are regenerated per build, so they are unstable by design.

## Add the Hook

The team adds data-testid to every element the tests touch, and treats it as part of the component's public contract.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-selectors.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Choose Stable Selectors

## Selector Table

_____

## Why Not CSS Paths

_____

## Angular Classes

_____

## Add the Hook

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A selector per element, the fragility argument, and the team's test-hook attribute in `notes/lab19-selectors.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-selectors.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-selectors.md`
- [ ] Selector given for list, row, and button
- [ ] Positional-selector failure explained
- [ ] Generated attributes ruled out
- [ ] data-testid convention stated
