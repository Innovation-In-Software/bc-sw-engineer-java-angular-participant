# Exercise 3 — CrmApplication Stub (TODOs)

**Module 23** · Checkpoint B · Exercises 1–6 Pass then Lab 23

## Activity card

| | |
| --- | --- |
| **Objective** | Fill a @SpringBootApplication stub and a fake health smoke line |
| **Skills practiced** | Boot entry point sketching |
| **Expected outcome** | notes/health-sketch.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-23-exercises/` → notes/health-sketch.md |
| **Checkpoint** | B (after slides 47–52) |

## What you will learn

- @SpringBootApplication on CrmApplication
- SpringApplication.run(...)
- Health URL http://localhost:8080/actuator/health

**Enterprise context:** Every peer must know the main class and the first URL to hit after start.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/health-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — CrmApplication Stub (TODOs)

```java
@SpringBootApplication
public class CrmApplication {
  public static void main(String[] args) {
    SpringApplication.run(CrmApplication.class, args);
  }
}
```

Health smoke: GET http://localhost:8080/actuator/health → expect UP
Package root: com.northstar.crm

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/health-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — CrmApplication Stub (TODOs)

## Main class annotation
_____

## run(...) line
_____

## Health URL
_____

## Package root
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CrmApplication + health sketch in `notes/health-sketch.md`.

## Debug / design challenge

If CrmApplication sits in com.demo instead of com.northstar.crm, what fails?

## Predict the Output / Behavior

Does @SpringBootApplication replace the need for component stereotypes on services?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/health-sketch.md` |
| Wrong health path | Use /actuator/health |
| Missing run line | SpringApplication.run(CrmApplication.class, args) |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/health-sketch.md`
- [ ] Annotation noted
- [ ] run line noted
- [ ] Health URL noted
