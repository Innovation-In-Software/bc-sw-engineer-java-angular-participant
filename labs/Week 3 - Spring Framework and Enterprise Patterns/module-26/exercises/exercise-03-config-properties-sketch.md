# Exercise 3 — ConfigurationProperties Sketch

**Module 26** · Checkpoint B · Exercises 1–6 Pass then Lab 26

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch NorthstarIntegrationProperties binding prefix and fields |
| **Skills practiced** | Typed configuration binding |
| **Expected outcome** | notes/northstar-props.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-26-exercises/` → notes/northstar-props.md |
| **Checkpoint** | B (after slides 126–128) |

## What you will learn

- @ConfigurationProperties prefix
- Prefer typed bean over scattered @Value
- Enable the properties class

**Enterprise context:** Typed properties catch typos at startup instead of shipping null API base URLs.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/northstar-props.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — ConfigurationProperties Sketch

Class: NorthstarIntegrationProperties
Prefix: northstar.integration (example)
Fields: apiBaseUrl, apiKey (apiKey from env in prod)
Enable: @EnableConfigurationProperties or @ConfigurationPropertiesScan

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/northstar-props.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — ConfigurationProperties Sketch

## Class name
_____

## Prefix
_____

## Fields
_____

## How enabled
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab26-001` / `lab-request-001`. Replace every `_____` before Pass. **Never write real passwords.**

## Expected result

ConfigProperties sketch in `notes/northstar-props.md`.

## Debug / design challenge

Why prefer @ConfigurationProperties over five unrelated @Value fields?

## Predict the Output / Behavior

If prefix mismatches YAML, what do you observe at runtime?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/northstar-props.md` |
| Hard-coding apiKey in class | Bind from config/env |
| No enable note | Mention EnableConfigurationProperties/scan |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/northstar-props.md`
- [ ] Prefix
- [ ] Fields
- [ ] Enable path
