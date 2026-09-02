# Exercise 3 — Package-Once Identity

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 107–110) |
| **Deliverable** | `notes/lab43-immutable-jar.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic only · no secrets in Git |

### What you will learn

Sketch package-once JAR + SHA-256 tied to commit for later promotion.

### Enterprise context

Lab 44 promotes this identity—do not rebuild silently in deploy.

### Predict

Deploy step runs mvn package again — what breaks?

### Debug

Empty checksum artifact — causes?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Rebuild in deploy | Pass CI artifacts only |
| Checksum not tied to commit | Record GITHUB_SHA with SHA-256 |

**Module 43** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab43-immutable-jar.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Package-Once Identity

## Step 1 — Steps

Outline: package once, write `SHA256SUMS`, record `GITHUB_SHA`, upload artifact.

## Step 2 — Check the reference

Lab 44 promotes this identity—rebuilding silently on the deploy agent breaks the chain.

## Step 3 — Example lines

Draft example checksum file lines (fake hashes OK) including commit id.

## Step 4 — Anti-pattern

Name one anti-pattern: packaging differently in deploy than in CI.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-immutable-jar.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Package-Once Identity

## Step 1 — Steps

Outline: package once, write `SHA256SUMS`, record `GITHUB_SHA`, upload artifact.

## Step 2 — Check the reference

Lab 44 promotes this identity—rebuilding silently on the deploy agent breaks the chain.

## Step 3 — Example lines

Draft example checksum file lines (fake hashes OK) including commit id.

## Step 4 — Anti-pattern

Name one anti-pattern: packaging differently in deploy than in CI.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Immutable JAR identity plan linked to Lab 44 in `notes/lab43-immutable-jar.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-immutable-jar.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-immutable-jar.md`
- [ ] Checksum + commit recorded
- [ ] Promotion link stated
- [ ] Anti-pattern named

