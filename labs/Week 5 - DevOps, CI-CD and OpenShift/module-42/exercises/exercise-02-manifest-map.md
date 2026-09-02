# Exercise 2 — Map the Manifests

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 23–28) |
| **Deliverable** | `notes/lab42-manifest-map.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · correlation lab-request-001 · digest-pinned image |

### What you will learn

Name every object the CRM deployment needs and what each must never contain.

### Enterprise context

A password that reaches a ConfigMap is stored in plain text and visible to anyone who can read the namespace.

### Predict

A datasource password is added to the ConfigMap. Who can now read it?

### Debug

Your Secret YAML has real base64 values and is committed. Is base64 encryption?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Secret values in Git | Only secret.example.yaml with no values |
| Objects missing | Include Project, ConfigMap, Secret, Deployment, Service, Route |
| Image not pinned | Digest from Lab 41 |

**Module 42** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-manifest-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Map the Manifests

## Object List

Project lab42-crm, ConfigMap, Secret (referenced, created out-of-band), Deployment, Service, and Route.

## Holds / Must Not Hold

ConfigMap holds non-secret URLs and flags, never passwords; Secret holds credentials created out-of-band, never values in Git.

## Labels

app=crm-api, lab=42, customer-fixture=synthetic.

## Image Source

The image comes from Lab 41, referenced by sha256 digest rather than a floating tag.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-manifest-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Map the Manifests

## Object List

_____

## Holds / Must Not Hold

_____

## Labels

_____

## Image Source

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A full object list with hold and must-not-hold rules, labels, and the image source in `notes/lab42-manifest-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-manifest-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-manifest-map.md`
- [ ] All six objects listed
- [ ] Holds and must-not-holds stated
- [ ] Labels proposed
- [ ] Digest-pinned image noted
