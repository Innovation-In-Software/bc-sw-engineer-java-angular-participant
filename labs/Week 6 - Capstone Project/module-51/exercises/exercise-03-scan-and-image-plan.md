# Exercise 3 — Plan Scanning and Image Identity

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 14–22) |
| **Deliverable** | `notes/lab51-scan-image-plan.md` |
| **Fixtures** | CUS-1001 Amina Khan (post-deploy smoke) · lab-request-001 correlation |

### What you will learn

Set scanner thresholds, a residual-risk record, and digest-based image identity with the scan before the push.

### Enterprise context

Scanning after the push means the vulnerable image is already published and possibly already pulled.

### Predict

The image scan runs after `docker push`. What is already true by the time it fails?

### Debug

A High CVE is suppressed with no owner or expiry — when does anyone look at it again?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No fail threshold | Name the severity that fails each scanner |
| Suppression without expiry | Every accepted finding needs an owner and a date |
| Image referenced by :latest | Reference by digest so the artifact is immutable |

**Module 51** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-scan-image-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Plan Scanning and Image Identity

## Scanner Table

Dependency scan on libraries fails at High; SAST on our source fails at High; image scan on OS and layers fails at Critical.

## Residual Risk

Accepted findings go in docs/residual-risk.md with an owner, a reason, and an expiry date.

## Image Identity

The image is promoted and deployed by sha256 digest; :latest is never used to identify a release.

## Scan Before Push

The image scan runs after build and before push, and a failure stops the job so nothing vulnerable is published.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-scan-image-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Plan Scanning and Image Identity

## Scanner Table

_____

## Residual Risk

_____

## Image Identity

_____

## Scan Before Push

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A scanner table with thresholds, a residual-risk rule, digest identity, and scan-before-push in `notes/lab51-scan-image-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-scan-image-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-scan-image-plan.md`
- [ ] Each scanner has a fail severity
- [ ] Residual risk has owner and expiry
- [ ] Digest identity stated
- [ ] Scan runs before push
