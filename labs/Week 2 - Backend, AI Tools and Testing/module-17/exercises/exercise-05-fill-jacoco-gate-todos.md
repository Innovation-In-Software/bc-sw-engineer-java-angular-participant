# Exercise 5 — Fill JaCoCo Gate Narrative TODOs

**Module 17** · Checkpoint D · Exercises 1–6 Pass then Lab 17

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for a JaCoCo gate narrative (no live report required) |
| **Skills practiced** | Coverage gate literacy |
| **Expected outcome** | notes/lab17-jacoco-gate-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-17-exercises/` → notes/lab17-jacoco-gate-todos.md |
| **Checkpoint** | D (after slides 194–198) |

## What you will learn

- Tool JaCoCo; phase verify; LINE ≥ ~80%
- Package com.northstar.crm.service
- Mockito depth = no in this pre-lab

**Enterprise context:** CI gates on service coverage stop silent deletions of transition tests.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab17-jacoco-gate-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — Fill JaCoCo Gate Narrative TODOs

Tool: JaCoCo
Maven phase: verify (clean verify)
Target LINE %: 80 (0.80)
Package: com.northstar.crm.service
Gap example: rare branch still missed
Mockito depth in this pre-lab? no

AAA service tests planned; collaborators real or simple fakes until Lab 18.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-jacoco-gate-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — Fill JaCoCo Gate Narrative TODOs

Tool: _____
Maven phase idea: _____
Target line coverage % (lab goal): _____
Package to measure: _____
Gap you still expect: _____
Mockito depth in this pre-lab? _____

## AAA line
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled JaCoCo narrative in `notes/lab17-jacoco-gate-todos.md`.

## Debug / design challenge

Why does mvn test alone sometimes skip the JaCoCo check rule?

## Predict the Output / Behavior

If include package is wrong, what ratio do you often see?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-jacoco-gate-todos.md` |
| Claiming Mockito required now | Answer no for Mockito depth |
| Omitting package name | Use com.northstar.crm.service |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-jacoco-gate-todos.md`
- [ ] All _____ replaced
- [ ] Package named
- [ ] Mockito = no
