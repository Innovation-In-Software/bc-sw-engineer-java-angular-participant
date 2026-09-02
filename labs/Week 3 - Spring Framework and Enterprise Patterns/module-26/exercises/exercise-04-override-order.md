# Exercise 4 — Property Override Order

**Module 26** · Checkpoint B · Exercises 1–6 Pass then Lab 26

## Activity card

| | |
| --- | --- |
| **Objective** | State Boot property-source precedence for the lab |
| **Skills practiced** | Override-order analysis |
| **Expected outcome** | notes/override-order.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-26-exercises/` → notes/override-order.md |
| **Checkpoint** | B (after slides 126–128) |

## What you will learn

- CLI > env > profile YAML > base YAML
- Prove with a measurable property in the lab
- Document winners in notes

**Enterprise context:** On-call wastes hours when someone “fixed YAML” but a CLI flag still wins.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/override-order.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Property Override Order

Highest → lowest:
1. Command-line args (-D / --)
2. Environment variables
3. application-{profile}.yml
4. application.yml
5. Code defaults

Lab: measure one property across sources.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/override-order.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Property Override Order

## Highest to lowest
1. _____
2. _____
3. _____
4. _____
5. _____

## Property you will measure in lab
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab26-001` / `lab-request-001`. Replace every `_____` before Pass. **Never write real passwords.**

## Expected result

Override order in `notes/override-order.md`.

## Debug / design challenge

If env sets logging.level.root=INFO and profile YAML sets DEBUG, who wins?

## Predict the Output / Behavior

Where do code `@Value` defaults sit relative to application.yml?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/override-order.md` |
| Putting base YAML above CLI | CLI wins |
| No measurement plan | Name a property to prove |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/override-order.md`
- [ ] Ordered list
- [ ] Measurement property
