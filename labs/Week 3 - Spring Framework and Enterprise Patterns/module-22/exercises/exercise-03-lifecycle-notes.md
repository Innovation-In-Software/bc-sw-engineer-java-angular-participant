# Exercise 3 — Bean Lifecycle Callbacks

**Module 22** · Checkpoint C · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Note when @PostConstruct and @PreDestroy run on CustomerService |
| **Skills practiced** | Bean lifecycle awareness |
| **Expected outcome** | notes/lab22-lifecycle-notes.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/lab22-lifecycle-notes.md |
| **Checkpoint** | C (after slides 19–23) |

## What you will learn

- Order: create → inject → @PostConstruct → use → @PreDestroy
- Singleton: init once per context
- Do not put request logic in PostConstruct

**Enterprise context:** Lifecycle logs prove the container — not your main method — owns startup/shutdown of CRM services.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab22-lifecycle-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Bean Lifecycle Callbacks

Order: Create → Inject → @PostConstruct → Use → @PreDestroy.
CustomerService: log init once; log destroy on context close.
Do not create CUS-1001 inside @PostConstruct for every request.
Singleton scope: one shared service instance.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/lab22-lifecycle-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Bean Lifecycle Callbacks

## Lifecycle order
_____

## @PostConstruct purpose
_____

## @PreDestroy purpose
_____

## What not to do in init
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Lifecycle notes in `notes/lab22-lifecycle-notes.md`.

## Debug / design challenge

If @PostConstruct runs before constructor injection finishes, is that possible in Spring?

## Predict the Output / Behavior

How many @PostConstruct logs do you expect for a singleton CustomerService per SpringBootTest context?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab22-lifecycle-notes.md` |
| Wrong order | Inject before PostConstruct |
| Business logic in init | Keep init to one-time setup/logging |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab22-lifecycle-notes.md`
- [ ] Order stated
- [ ] Both callbacks
- [ ] Anti-pattern noted
