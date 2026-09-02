# Exercise 6 — Runbook Outline

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **D** (after slides 58–60) |
| **Deliverable** | `notes/lab42-runbook-outline.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Outline a runbook complete enough that a peer could deploy, verify, and roll back without you.

### Enterprise context

A runbook only its author can follow is not a runbook — it is a personal memory aid.

### Predict

You are unavailable during a failed rollout. Can a peer roll back from your outline alone?

### Debug

Your apply order puts Deployment before ConfigMap. What does the pod do on start?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Apply order wrong | Config and Secret before the Deployment |
| No safety note | Stop before destructive actions |
| Outline reads as a full lab | Mark the scope explicitly |

**Module 42** · Pre-lab gate · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-runbook-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Runbook Outline

## Headings

Prereqs, apply order, verify probes, smoke CRM, rollback, and contacts.

## Apply Order

ConfigMap, then Secret created out-of-band, then Deployment, Service, and Route.

## Safety

Stop before any destructive action and get instructor approval first.

## Scope

This is an outline only — the real apply, smoke, and rollback happen in Lab 42.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-runbook-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Runbook Outline

## Headings

_____

## Apply Order

_____

## Safety

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Six runbook headings, a correct apply order, a safety note, and a scope marker in `notes/lab42-runbook-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-runbook-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-runbook-outline.md`
- [ ] Six sections listed
- [ ] Apply order correct
- [ ] Safety note included
- [ ] Scope marked as outline
