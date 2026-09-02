# Exercise 5 — Fill ValidatorFactory TODOs

**Module 14** · Checkpoint D · Exercises 1–6 Pass then Lab 14

## Activity card

| | |
| --- | --- |
| **Objective** | Complete ValidatorFactory checklist (no Spring `@Valid`) |
| **Skills practiced** | Validation.buildDefaultValidatorFactory, programmatic validate |
| **Expected outcome** | notes/lab14-validatorfactory-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-14-exercises/` → notes/lab14-validatorfactory-todos.md |
| **Checkpoint** | D (after slides 144–147) |

## What you will learn

- Bootstrap ValidatorFactory → Validator
- Invalid payloads yield ConstraintViolation sets
- Spring `@Valid` is out of scope for Module 14 pre-lab/lab

**Enterprise context:** Plain Java services and batch jobs validate the same DTO annotations without an HTTP stack.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab14-validatorfactory-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Fill ValidatorFactory TODOs

## Step 1 — Copy TODOs
Bootstrap: ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
Validator validator = factory.getValidator();
Invalid blank name → expect ≥1 violations
Valid Amina ACTIVE sketch → expect 0 violations
Spring @Valid in this pre-lab? no

## Step 2 — Invalid cases list
blank fullName; unknown status; null customerId on activate

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-validatorfactory-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Fill ValidatorFactory TODOs

## Step 1 — Copy TODOs
Bootstrap: ValidatorFactory factory = _____;
Validator validator = _____;
Invalid blank name → expect _____ violations
Invalid status TYPO → expect _____
Valid Amina ACTIVE sketch → expect _____ violations
Spring @Valid in this pre-lab? _____

## Step 2 — Fill blanks
Use Validation.buildDefaultValidatorFactory(), factory.getValidator(), counts/messages, and `no` for Spring `@Valid`.

## Step 3 — Invalid cases list
1. _____
2. _____
3. _____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled ValidatorFactory TODOs plus invalid case bullets in `notes/lab14-validatorfactory-todos.md`.

## Debug / design challenge

`NoProviderFoundException` at runtime — which Maven deps are missing?

## Predict the Output / Behavior

Does calling `validator.validate(dto)` mutate the DTO?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-validatorfactory-todos.md` |
| Assuming @Valid works without Spring MVC | Use ValidatorFactory narrative for prep |
| Using javax.validation | Lab 14 is jakarta.validation.* |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-validatorfactory-todos.md`
- [ ] All _____ replaced
- [ ] Three invalid cases listed
- [ ] No Spring @Valid claimed
