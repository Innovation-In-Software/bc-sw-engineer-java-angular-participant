# Exercise 5 — Activation Command Drill

**Module 26** · Checkpoint C · Exercises 1–6 Pass then Lab 26

## Activity card

| | |
| --- | --- |
| **Objective** | Write -D and env activation commands for Windows and macOS |
| **Skills practiced** | Profile activation practice |
| **Expected outcome** | notes/activation-commands.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-26-exercises/` → notes/activation-commands.md |
| **Checkpoint** | C (after slides 129–132) |

## What you will learn

- -Dspring.profiles.active / spring-boot.run.profiles
- SPRING_PROFILES_ACTIVE env
- test profile for mvn test

**Enterprise context:** Peers must reproduce your environment — vague “I set the profile somehow” is not evidence.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/activation-commands.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Activation Command Drill

Maven run (dev):
mvn -B spring-boot:run -Dspring-boot.run.profiles=dev

Env (PowerShell example):
$env:SPRING_PROFILES_ACTIVE='dev'

Tests:
mvn -B test -Dspring.profiles.active=test

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/activation-commands.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Activation Command Drill

## -D / Maven run (dev)
_____

## Env activation (your OS)
_____

## Tests (test profile)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab26-001` / `lab-request-001`. Replace every `_____` before Pass. **Never write real passwords.**

## Expected result

Activation commands in `notes/activation-commands.md`.

## Debug / design challenge

If you export SPRING_PROFILES_ACTIVE in one terminal and run Maven in another, what happens?

## Predict the Output / Behavior

Which profile should Surefire use by default for this lab?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/activation-commands.md` |
| Only one activation style | Include -D and env |
| No test command | Include mvn test profile |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/activation-commands.md`
- [ ] -D command
- [ ] Env command
- [ ] Test command
