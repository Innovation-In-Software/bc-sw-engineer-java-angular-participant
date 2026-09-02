# Exercise 5 — Production IdP Checklist

**Module 28** · Checkpoint D · Exercises 1–6 Pass then Lab 28

## Activity card

| | |
| --- | --- |
| **Objective** | Outline production IdP / key-rotation checklist items (awareness) |
| **Skills practiced** | Production security planning |
| **Expected outcome** | notes/security-notes-outline.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-28-exercises/` → notes/security-notes-outline.md |
| **Checkpoint** | D (after slides 180–182) |

## What you will learn

- External IdP preferred in prod
- Rotate signing keys
- Short TTL + HTTPS

**Enterprise context:** Lab JWT is teaching mode — production still needs IdP ownership and rotation runbooks.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/security-notes-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — Production IdP Checklist

- Prefer enterprise IdP / OAuth2 in production (lab JWT is teaching)
- Store signing keys in a secret manager; rotate on schedule/incident
- Short token TTL; HTTPS only
- Audit failed logins; never log raw bearer tokens
- Least privilege roles; review admin grants

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/security-notes-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — Production IdP Checklist

## IdP note
_____

## Key rotation
_____

## Transport / TTL
_____

## Logging hygiene
_____

## Scope
Pre-lab only. No real secrets.

```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`, lab users `agent1`/`admin1`. Replace every `_____` before Pass. **Never write real JWT secrets.**

## Expected result

IdP checklist in `notes/security-notes-outline.md`.

## Debug / design challenge

Does Lab 28 require standing up Keycloak for Pass?

## Predict the Output / Behavior

What do you do if a JWT signing secret was committed?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/security-notes-outline.md` |
| Saying lab JWT is production-ready forever | Mark teaching mode |
| Planning to commit secrets | Forbidden |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/security-notes-outline.md`
- [ ] IdP note
- [ ] Rotation
- [ ] No secrets
