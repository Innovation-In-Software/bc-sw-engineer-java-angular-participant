# Exercise 3 — CsvSource Table Design

**Module 17** · Checkpoint C · Exercises 1–6 Pass then Lab 17

## Activity card

| | |
| --- | --- |
| **Objective** | Design a CsvSource table for status validation inputs |
| **Skills practiced** | Parameterized test design |
| **Expected outcome** | notes/lab17-csvsource-table.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-17-exercises/` → notes/lab17-csvsource-table.md |
| **Checkpoint** | C (after slides 193) |

## What you will learn

- Valid ACTIVE/PROSPECT rows
- Invalid typo / blank rows
- JDK 21 + Surefire will run the table in Lab 17

**Enterprise context:** Table-driven cases catch status typos that copy-paste unit tests miss.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab17-csvsource-table.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — CsvSource Table Design

| inputStatus | valid? |
| --- | --- |
| ACTIVE | true |
| PROSPECT | true |
| ACTVE | false |
| (blank) | false |
| (extra invalid) | false |

Tests run with JDK 21 via Maven Surefire.
Mockito depth deferred to Lab 18.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-csvsource-table.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — CsvSource Table Design

| inputStatus | valid? |
| --- | --- |
| ACTIVE | _____ |
| PROSPECT | _____ |
| ACTVE | _____ |
| (blank) | _____ |
| (your extra invalid) | _____ |

## Runtime note
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CsvSource table with ≥1 extra invalid in `notes/lab17-csvsource-table.md`.

## Debug / design challenge

Add a row for lowercase `active` — should it be valid or invalid for your enum?

## Predict the Output / Behavior

Does @CsvSource replace @BeforeEach fixtures for activate demos?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-csvsource-table.md` |
| No invalid rows | Add ACTVE / blank / extra |
| Skipping JDK/Maven note | Note Surefire + JDK 21 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-csvsource-table.md`
- [ ] Valid rows present
- [ ] Invalid rows present
- [ ] Runtime note present
