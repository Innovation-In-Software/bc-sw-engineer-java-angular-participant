# Exercise 4 — application.yml Sketch

**Module 23** · Checkpoint C · Exercises 1–6 Pass then Lab 23

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch base YAML plus light dev/prod profile teasers |
| **Skills practiced** | Boot YAML sketching |
| **Expected outcome** | notes/lab23-application-yml-sketch.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-23-exercises/` → notes/lab23-application-yml-sketch.md |
| **Checkpoint** | C (after slides 53–59) |

## What you will learn

- server.port and spring.application.name
- Actuator exposure include health
- dev/prod teasers — no secret dumps

**Enterprise context:** Ops peers need a predictable port and health exposure before any cloud profile work.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab23-application-yml-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — application.yml Sketch

```yaml
spring:
  application:
    name: lab23-crm
server:
  port: 8080
management:
  endpoints:
    web:
      exposure:
        include: health
```

dev teaser: logging.level.root=DEBUG
prod teaser: logging.level.root=INFO (no secrets)

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/lab23-application-yml-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — application.yml Sketch

## Base keys
application name: _____
server.port: _____
management exposure: _____

## dev teaser
_____

## prod teaser
_____

## Scope
Pre-lab only. No real passwords.

```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

YAML sketch in `notes/lab23-application-yml-sketch.md`.

## Debug / design challenge

Should prod teaser include a hard-coded database password?

## Predict the Output / Behavior

What happens if exposure.include omits health?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab23-application-yml-sketch.md` |
| Putting secrets in notes | Teasers only — no passwords |
| Exposing env/beans casually | Include health for lab smoke |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab23-application-yml-sketch.md`
- [ ] Port + name
- [ ] Health exposure
- [ ] Profile teasers without secrets
