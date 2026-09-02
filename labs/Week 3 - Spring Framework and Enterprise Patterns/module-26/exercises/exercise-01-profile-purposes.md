# Exercise 1 — Profile Purposes

**Module 26** · Checkpoint A · Exercises 1–6 Pass then Lab 26

## Activity card

| | |
| --- | --- |
| **Objective** | Explain what each of dev / test / prod is for in Northstar CRM |
| **Skills practiced** | Profile purpose analysis |
| **Expected outcome** | notes/profiles.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-26-exercises/` → notes/profiles.md |
| **Checkpoint** | A (after slides 115–125) |

## What you will learn

- dev = local demos / H2-friendly
- test = isolated automated tests
- prod = strict + secrets from env

**Enterprise context:** Incidents happen when prod runs with dev verbosity and blank passwords in YAML.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/profiles.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Profile Purposes

| Profile | Purpose |
| --- | --- |
| dev | Local CRM smoke; relaxed logging; H2-friendly |
| test | Surefire / BootTest isolation |
| prod | Deployed settings; secrets via env; fail fast |

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/profiles.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Profile Purposes

| Profile | Purpose |
| --- | --- |
| dev | _____ |
| test | _____ |
| prod | _____ |

## One risk if prod uses dev YAML
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab26-001` / `lab-request-001`. Replace every `_____` before Pass. **Never write real passwords.**

## Expected result

Profile purposes in `notes/profiles.md`.

## Debug / design challenge

Should test profile point at a shared teammate’s laptop H2 file?

## Predict the Output / Behavior

Name one setting that must differ between dev and prod.

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/profiles.md` |
| Saying all profiles are identical | Call out differences |
| Putting real passwords in notes | Describe secrets as env-only |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/profiles.md`
- [ ] Three purposes
- [ ] Prod risk noted
