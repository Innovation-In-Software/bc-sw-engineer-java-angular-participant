# Exercise 4 — Expressive Test Names

**Module 17** · Checkpoint D · Exercises 1–6 Pass then Lab 17

## Activity card

| | |
| --- | --- |
| **Objective** | Propose three method names that encode fixture and outcome |
| **Skills practiced** | Naming conventions |
| **Expected outcome** | notes/lab17-test-names.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-17-exercises/` → notes/lab17-test-names.md |
| **Checkpoint** | D (after slides 194–198) |

## What you will learn

- methodName_state_expectedOutcome style
- Names for Amina reject, Ravi success, CUS-9999 not found
- Reject test1 / testActivate

**Enterprise context:** Failure lists in CI are triage tools — `test1` wastes minutes every build.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab17-test-names.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — Expressive Test Names

Pattern: methodName_state_expectedOutcome

Examples:
activate_raviProspect_becomesActive
activate_aminaActive_rejectsIllegalTransition
get_unknownCus9999_throwsNotFound

Anti-names: test1, testActivate

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-test-names.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — Expressive Test Names

## Pattern
_____

## Three names
1. _____
2. _____
3. _____

## Anti-names rejected
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three expressive names + anti-names in `notes/lab17-test-names.md`.

## Debug / design challenge

Rename testActivate() to encode Ravi PROSPECT→ACTIVE.

## Predict the Output / Behavior

Is @DisplayName a substitute for a clear method name in Surefire reports?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-test-names.md` |
| Using test1 | Rewrite with fixture + outcome |
| Only one name | Provide three |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-test-names.md`
- [ ] Pattern stated
- [ ] Three names
- [ ] Anti-names listed
