# Exercise 5 — Bean Graph Skeleton (TODOs)

**Module 22** · Checkpoint E · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch constructor edges for the Northstar CRM bean graph |
| **Skills practiced** | Bean graph sketching |
| **Expected outcome** | notes/bean-graph-sketch.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/bean-graph-sketch.md |
| **Checkpoint** | E (after slides 29–31) |

## What you will learn

- Controller → CustomerService
- CustomerService → CustomerRepository + NotificationService
- Edges must match constructors for the lab doc

**Enterprise context:** Reviewers reject mystery wiring — dependency-graph.md must match real constructors.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/bean-graph-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Bean Graph Skeleton

CustomerController → CustomerService
CustomerService → CustomerRepository
CustomerService → NotificationService
(optional) CustomerService → CustomerMetrics if present from Lab 21

Unit test: construct CustomerService with fakes — no Spring required.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/bean-graph-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Bean Graph Skeleton

## Edges (fill TODOs)
CustomerController → _____
CustomerService → _____
CustomerService → _____
Optional metrics edge: _____

## Unit-test construction (one line)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Bean graph sketch in `notes/bean-graph-sketch.md`.

## Debug / design challenge

If NotificationService also depended on CustomerService, what problem appears?

## Predict the Output / Behavior

Does the graph include `new` edges inside CustomerService after IoC refactor?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/bean-graph-sketch.md` |
| Missing notifier edge | Service → NotificationService |
| Keeping new edges | Remove them after IoC |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/bean-graph-sketch.md`
- [ ] Controller→Service
- [ ] Service→Repo
- [ ] Service→Notifier
