# Exercise 2 — SOLID Apply vs Defer

**Module 12** · Checkpoint A · Exercises 1–6 Pass then Lab 12

## Activity card

| | |
| --- | --- |
| **Objective** | Decide which SOLID ideas to apply now vs defer |
| **Skills practiced** | Scoped design judgment |
| **Expected outcome** | notes/lab12-solid-scope.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-12-exercises/` → notes/lab12-solid-scope.md |
| **Checkpoint** | A (after slides 94–99) |

## What you will learn

- Not every SOLID letter is mandatory in one lab
- Document deferred items so they are not forgotten
- SRP-style extract (validation helpers) is in scope

**Enterprise context:** Teams ship incremental cleanups with an explicit defer list.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab12-solid-scope.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — SOLID Apply vs Defer

## Step 1 — Apply now

Pick SRP: separate validation helper from persistence-shaped code in the sketch.

## Step 2 — Defer

Defer DIP wiring frameworks and ISP for large REST resource interfaces until Labs 13+.

## Step 3 — Why defer

One sentence: modules 10–12 stay before REST hosting; do not over-architect ports.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-solid-scope.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — SOLID Apply vs Defer

## Step 1 — Apply now

Pick SRP: separate validation helper from persistence-shaped code in the sketch.

## Step 2 — Defer

Defer DIP wiring frameworks and ISP for large REST resource interfaces until Labs 13+.

## Step 3 — Why defer

One sentence: modules 10–12 stay before REST hosting; do not over-architect ports.

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An apply/defer SOLID note with Week 2 honesty in `notes/lab12-solid-scope.md`.


## Debug / design challenge

If you marked all five SOLID letters as apply-now, trim to what Lab 12 can prove.

## Predict the Output / Behavior

Is introducing a full DI framework required for Module 12?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-solid-scope.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 12 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-solid-scope.md`
- [ ] One apply-now item
- [ ] Two defer items
- [ ] Before-REST hosting rationale written

