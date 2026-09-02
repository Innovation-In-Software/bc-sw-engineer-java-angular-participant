# Exercise 3 — Config versus Secret

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 29) |
| **Deliverable** | `notes/lab42-config-vs-secret.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Classify each CRM setting correctly and state why base64 is not protection.

### Enterprise context

Kubernetes Secrets are base64-encoded, not encrypted — committing one to Git leaks it in plain terms.

### Predict

You commit a Secret manifest with real base64 values. How hard is it to read?

### Debug

Someone adds CUS-1001 as a ConfigMap key. What did they misunderstand?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Password in ConfigMap | Credentials belong in a Secret, created out-of-band |
| Real values committed | Only an example file with placeholders |
| Fixtures treated as config | CUS-1001 is app data, not cluster config |

**Module 42** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-config-vs-secret.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Config versus Secret

## Sort the List

ConfigMap: datasource URL host, Kafka bootstrap servers, JWT issuer URI, log level, feature flags. Secret: database password.

## Out-of-Band Rule

Secrets are created out-of-band against the cluster; Git holds only secret.example.yaml with placeholder values.

## Not Config

CUS-1001 and CUS-1002 are synthetic application fixtures, not Kubernetes configuration keys.

## Base64 Note

Base64 is an encoding anyone can reverse instantly — it provides no confidentiality at all.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-config-vs-secret.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Config versus Secret

## Sort the List

_____

## Out-of-Band Rule

_____

## Not Config

_____

## Base64 Note

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A sorted settings list, the out-of-band rule, the fixture clarification, and the base64 note in `notes/lab42-config-vs-secret.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-config-vs-secret.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-config-vs-secret.md`
- [ ] Every setting sorted correctly
- [ ] Out-of-band rule written
- [ ] Fixtures distinguished from config
- [ ] Base64 clarified
