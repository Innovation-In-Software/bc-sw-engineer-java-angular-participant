# Exercise 1 — Freeze the Capstone Stack

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 4–14) |
| **Deliverable** | `notes/lab48-stack-freeze.md` |
| **Fixtures** | CUS-1001 Amina Khan · CUS-1002 Ravi Singh · CAP-12 interaction slice |

### What you will learn

Write the frozen capstone stack and two ADRs before any capstone code exists.

### Enterprise context

A capstone that changes its database or CI tool in week six loses days. Freezing the stack with named rejected alternatives is what stops that.

### Predict

If an ADR records the decision but no rejected alternative, what happens the first time someone proposes Oracle?

### Debug

A teammate sketches a React component in this warmup — in or out of scope?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Only one ADR written | Two minimum; each needs a rejected alternative |
| Non-goals list missing | Name Bitbucket, Oracle, React, and SOAP explicitly |
| Started drawing diagrams | Diagrams are Lab 48 Step 2 — prose only here |

**Module 48** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-stack-freeze.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Freeze the Capstone Stack

## Components

Angular SPA → REST API → Spring Boot services → PostgreSQL; Kafka carries CustomerCreated and InteractionRecorded.

## Two ADRs

ADR-1: PostgreSQL is the system of record (open, Flyway-friendly); rejected Oracle.
ADR-2: GitHub Actions runs CI/CD (already used in Lab 43); rejected Bitbucket Pipelines.

## Non-Goals

Not the taught path: Bitbucket Pipelines, Oracle, React, SOAP endpoints.

## Scope

Pre-lab only — no repo created, no diagrams rendered, no code written.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-stack-freeze.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Freeze the Capstone Stack

## Components

_____

## Two ADRs

_____

## Non-Goals

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A frozen stack list, two ADRs with rejected alternatives, and an explicit non-goals list in `notes/lab48-stack-freeze.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-stack-freeze.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-stack-freeze.md`
- [ ] Five stack layers listed
- [ ] Two ADRs, each with a rejected alternative
- [ ] Non-goals name Bitbucket, Oracle, React, SOAP
