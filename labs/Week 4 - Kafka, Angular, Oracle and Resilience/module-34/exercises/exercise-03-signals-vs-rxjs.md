# Exercise 3 — Decide Signals versus RxJS

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 46–50) |
| **Deliverable** | `notes/lab34-signals-vs-rxjs.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · empty and error states |

### What you will learn

Choose between signals and RxJS per case with a stated reason, and write a team default.

### Enterprise context

Mixing both tools arbitrarily across a codebase costs more than choosing the slightly less elegant one consistently.

### Predict

You model the rendered customer list as an Observable. What bookkeeping did you just take on?

### Debug

An HTTP observable is assigned straight to a template field. Why is nothing displayed?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No reason given | State the deciding factor per case |
| RxJS for everything | Current values that drive the view are signals |
| No interop path | toSignal bridges an observable into a signal |

**Module 34** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-signals-vs-rxjs.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Decide Signals versus RxJS

## Three Cases

Customer list: signal. Search box: RxJS. Save button click: plain event handler updating a signal.

## Justify

The list is a current value the view renders; the search box needs debounce and cancellation; the click is a one-shot.

## Interop

toSignal(http.get<Customer[]>(url)) turns the response stream into a signal the template reads directly.

## Team Rule

Default to signals for state the view renders; reach for RxJS when time, cancellation, or retry is involved.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-signals-vs-rxjs.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Decide Signals versus RxJS

## Three Cases

_____

## Justify

_____

## Interop

_____

## Team Rule

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three justified tool choices, an interop path, and a team default in `notes/lab34-signals-vs-rxjs.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-signals-vs-rxjs.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-signals-vs-rxjs.md`
- [ ] Three cases each assigned a tool
- [ ] A reason per choice
- [ ] Interop path named
- [ ] Team default written
