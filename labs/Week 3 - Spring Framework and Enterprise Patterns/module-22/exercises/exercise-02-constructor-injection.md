# Exercise 2 — Constructor Injection Preference

**Module 22** · Checkpoint B · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Document why Lab 22 prefers constructor injection with final fields |
| **Skills practiced** | DI style selection |
| **Expected outcome** | notes/constructor-di.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/constructor-di.md |
| **Checkpoint** | B (after slides 14–18) |

## What you will learn

- Constructor + final = required deps, immutable after build
- Field @Autowired hides deps and blocks final
- Setter is for optional deps — not the CRM primary path

**Enterprise context:** On-call reviews fail when dependencies are invisible private fields — constructors are the public contract.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/constructor-di.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Constructor Injection Preference

Preferred: constructor with final CustomerRepository + NotificationService.
Why: required deps explicit; unit test = new CustomerService(fakeRepo, fakeNotifier).
Avoid: field @Autowired as primary pattern.
Setter: optional only — not Lab 22 primary wiring.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/constructor-di.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Constructor Injection Preference

## Preferred pattern
_____

## Why (testability)
_____

## Avoid
_____

## Setter role (one line)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Constructor DI preference in `notes/constructor-di.md`.

## Debug / design challenge

Can CustomerRepository be final if injected only via field @Autowired?

## Predict the Output / Behavior

What happens at startup if a constructor dependency bean is missing?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/constructor-di.md` |
| Preferring field injection | Mark constructor + final |
| No testability note | Show new Service(fake…) |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/constructor-di.md`
- [ ] Preferred pattern
- [ ] Avoid noted
- [ ] Testability noted
