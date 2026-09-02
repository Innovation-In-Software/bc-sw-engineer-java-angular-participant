# Exercise 5 — JDK 21 / Maven Habit

**Module 10** · Checkpoint D · Exercises 1–6 Pass then Lab 10

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm JDK 21 / Maven habits for the Lab 10 workspace |
| **Skills practiced** | Toolchain verification before AI coding |
| **Expected outcome** | notes/jdk-maven-checklist.md |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-10-exercises/` → notes/jdk-maven-checklist.md |
| **Checkpoint** | D (after slides 72–73) |

## What you will learn

- AI speed does not replace a working JDK/Maven PATH
- Record java -version and mvn -version evidence
- Wrong toolchain makes Copilot suggestions harder to validate

**Enterprise context:** CI and laptops must agree on JDK 21 before AI-generated code is trusted.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/jdk-maven-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# JDK 21 / Maven habit

- [ ] `java -version` shows 21.x
- [ ] `mvn -version` uses JDK 21
- PATH trap: ...
- Workspace: examples/module-10-exercises/notes/
- Boundary: do not run full Lab 10 Maven goals yet
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

Create `notes/jdk-maven-checklist.md`.

### Step 2 — Commands

Write checklist: `java -version` (21.x) and `mvn -version` (Java home = 21).

### Step 3 — PATH trap

Note one Windows PATH failure mode (wrong JDK first on PATH) and the fix habit.

### Step 4 — Workspace

Note target idea: bootcamp workspace + `notes\` for this module's prep files.

### Step 5 — Out of scope

Mark: *Do not run the full lab Maven goals until the timed Lab 10 session.*

Example shape:

```markdown
# JDK 21 / Maven habit

- [ ] `java -version` shows 21.x
- [ ] `mvn -version` uses JDK 21
- PATH trap: ...
- Workspace: examples/module-10-exercises/notes/
- Boundary: do not run full Lab 10 Maven goals yet
```

## Expected result

A short toolchain checklist in `notes/jdk-maven-checklist.md` with PATH awareness and pre-lab boundary.


## Debug / design challenge

java -version shows 17 — what do you fix before Lab 10?

## Predict the Output / Behavior

Can Copilot hide a wrong JAVA_HOME?

## Troubleshooting

If Copilot is unavailable, complete the notes analysis manually — do not block on license issues for pre-lab Pass.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/jdk-maven-checklist.md`
- [ ] java and mvn checks listed
- [ ] One PATH trap named
- [ ] No-full-lab note present

