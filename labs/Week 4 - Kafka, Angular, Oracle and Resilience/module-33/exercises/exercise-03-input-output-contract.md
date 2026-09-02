# Exercise 3 — Design the Input/Output Contract

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 41–48) |
| **Deliverable** | `notes/lab33-io-contract.md` |
| **Fixtures** | CUS-1001 Amina Khan ACTIVE · CUS-1002 Ravi Singh PROSPECT |

### What you will learn

Design a typed input and an event output for a row component, and state the data-down/events-up rule.

### Enterprise context

A child that mutates its parent's object creates changes with no traceable origin — the hardest class of UI bug.

### Predict

The row component edits `customer.status` directly. Who else sees that change, and when?

### Debug

`(selected)="onSelect($event)"` never fires. Name two things to check.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Input untyped | Give it a real interface type |
| Output payload unclear | Say what the EventEmitter carries |
| Child mutates the input | Emit an event; let the parent decide |

**Module 33** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-io-contract.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Design the Input/Output Contract

## Child Inputs

@Input() customer!: Customer — the row receives one customer object.

## Child Outputs

@Output() selected = new EventEmitter<Customer>() — emits the customer that was clicked.

## Parent Template

<app-customer-row [customer]="c" (selected)="onSelect($event)" />

## No Reach-Around

The child never writes to the object it was given; it emits, and the parent owns the change.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-io-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Design the Input/Output Contract

## Child Inputs

_____

## Child Outputs

_____

## Parent Template

_____

## No Reach-Around

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A typed input, a defined output payload, the parent wiring, and the one-way-flow rule in `notes/lab33-io-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-io-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-io-contract.md`
- [ ] Input named and typed
- [ ] Output payload defined
- [ ] Parent template wiring written
- [ ] Data-down/events-up rule stated
