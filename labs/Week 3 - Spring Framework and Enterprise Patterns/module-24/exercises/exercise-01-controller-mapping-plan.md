# Exercise 1 — Plan the Controller Mappings

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 8–22) |
| **Deliverable** | `notes/lab24-mapping-plan.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · CUS-1003 create · CUS-9999 404 |

### What you will learn

Plan CustomerController's class and method mappings, and name the stages of the Spring MVC request path.

### Enterprise context

A controller whose paths are declared per-method drifts out of agreement the first time someone renames the resource.

### Predict

You put the full `/api/customers/{id}` on every method and then rename the resource. What breaks?

### Debug

A GET returns 404 but the method exists. Which stage of the request path failed?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Full path repeated per method | Put the shared prefix on the class |
| Only one handler planned | Cover list, get, create, and update |
| Request journey vague | Name mapping, binding, invoke, serialise |

**Module 24** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-mapping-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Plan the Controller Mappings

## Class Annotations

@RestController and @RequestMapping("/api/customers") on the class.

## Method Table

list @GetMapping; getOne @GetMapping("/{id}"); create @PostMapping; update @PutMapping("/{id}").

## Request Journey

DispatcherServlet → handler mapping → argument resolution → handler method → message converter.

## Scope

Plan only — no controller class written yet; Lab 24 Step 3 creates it.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-mapping-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Plan the Controller Mappings

## Class Annotations

_____

## Method Table

_____

## Request Journey

_____

## Scope

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Class and method mappings for CustomerController plus the named request stages in `notes/lab24-mapping-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-mapping-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-mapping-plan.md`
- [ ] Class-level annotations with base path
- [ ] Four handlers mapped
- [ ] Request path stages named
