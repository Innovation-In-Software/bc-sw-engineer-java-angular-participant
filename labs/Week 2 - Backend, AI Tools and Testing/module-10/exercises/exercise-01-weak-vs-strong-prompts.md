# Exercise 1 — Weak vs Strong Prompts

**Module 10** · Checkpoint A · Exercises 1–6 Pass then Lab 10

## Activity card

| | |
| --- | --- |
| **Objective** | Contrast a weak Copilot prompt with a strong Northstar-scoped prompt |
| **Skills practiced** | Prompt engineering, constraint writing |
| **Expected outcome** | notes/lab10-prelab-prompts.md with weak/strong + constraints |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-10-exercises/` → notes/lab10-prelab-prompts.md |
| **Checkpoint** | A (after slides 58–65) |

## What you will learn

- Vague prompts invite wrong packages, JDK APIs, and phantom frameworks
- Strong prompts name package, JDK, and explicit exclusions (no Spring/JPA)
- Constraints belong in the prompt, not only in your head

**Enterprise context:** Banking CRM prompts must keep AI inside approved stack boundaries.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab10-prelab-prompts.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 10 pre-lab prompts

## Weak
Write a customer class.
Why weak: ...

## Strong
...

## Three constraints
1. ...
2. ...
3. ...
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-10-exercises/`, create `notes/lab10-prelab-prompts.md` (create the `notes/` folder if it does not exist).

### Step 2 — Weak prompt

Write the weak prompt: *Write a customer class.* Note why it invites wrong package, wrong JDK APIs, or invented annotations.

### Step 3 — Strong prompt

Rewrite: plain Java 21 record/class for Northstar CRM customer `CUS-1001` Amina Khan status ACTIVE; fields id, fullName, status; no Spring, no JPA; correlation note `lab-request-001` in comments only.

### Step 4 — Diff the asks

List three constraints the strong prompt adds (JDK, domain fixtures, no-framework).

### Step 5 — Save

Save both prompts and the three constraints in `notes/lab10-prelab-prompts.md`. Pre-lab only — do not finish Lab 10.

Example shape:

```markdown
# Lab 10 pre-lab prompts

## Weak
Write a customer class.
Why weak: ...

## Strong
...

## Three constraints
1. ...
2. ...
3. ...
```

## Expected result

Paired weak/strong prompts with three explicit constraints in `notes/lab10-prelab-prompts.md`.


## Debug / design challenge

Strengthen: 'make a service' into a Northstar CustomerService prompt with three constraints.

## Predict the Output / Behavior

What wrong annotation might appear if you omit 'no JPA'?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| Accepting first suggestion blindly | Require fixtures + JDK 21 + no phantom deps in the prompt |
| Putting secrets in chat | Use fake CRM ids only (CUS-1001 / CUS-1002) |
| Wrong file name | Must be `notes/lab10-prelab-prompts.md` (not a random notes title) |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab10-prelab-prompts.md` | Pass / Fail |
| 2 | Weak and strong prompts written | Pass / Fail |
| 3 | Three constraints listed | Pass / Fail |
