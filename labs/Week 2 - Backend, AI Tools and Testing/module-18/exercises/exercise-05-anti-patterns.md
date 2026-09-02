# Exercise 5 — Mockito Anti-Patterns

**Module 18** · Checkpoint D · Exercises 1–6 Pass then Lab 18

## Activity card

| | |
| --- | --- |
| **Objective** | List anti-patterns Copilot might suggest for CRM tests |
| **Skills practiced** | AI review, mocking hygiene |
| **Expected outcome** | notes/lab18-anti-patterns.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-18-exercises/` → notes/lab18-anti-patterns.md |
| **Checkpoint** | D (after slides 214–215) |

## What you will learn

- Never mock the SUT
- Avoid unnecessary stubbing
- verifyNoMoreInteractions only when surface is critical

**Enterprise context:** AI often mocks CustomerService while “testing” CustomerService — that tests nothing.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab18-anti-patterns.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Mockito Anti-Patterns

| Anti-pattern | Better |
| --- | --- |
| Mock the SUT | Mock collaborators only |
| Unnecessary stubbing | Stub what is used |
| verifyNoMoreInteractions always | Use when interaction surface is critical |

Reject suggestions that mock CustomerService while testing CustomerService.
Fixtures: Ravi/Amina/CUS-9999 as appropriate.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-anti-patterns.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Mockito Anti-Patterns

| Anti-pattern | Better |
| --- | --- |
| Mock the SUT | _____ |
| Unnecessary stubbing | _____ |
| verifyNoMoreInteractions always | _____ |

## AI reject rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Anti-patterns table + AI reject rule in `notes/lab18-anti-patterns.md`.

## Debug / design challenge

Rewrite: @Mock DefaultCustomerService sut — what should be mocked instead?

## Predict the Output / Behavior

Does sleeping Thread.sleep(500) belong in a Mockito unit test?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-anti-patterns.md` |
| Empty better column | Fill collaborator-only guidance |
| Accepting SUT mocks | Write explicit reject rule |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-anti-patterns.md`
- [ ] Three anti-patterns
- [ ] Better column filled
- [ ] AI reject rule present
