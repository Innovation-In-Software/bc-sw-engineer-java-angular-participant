# Exercise 4 — Plan .dockerignore and Env

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 50–54) |
| **Deliverable** | `notes/lab41-dockerignore-env.md` |
| **Fixtures** | Synthetic CUS-1001 smoke · no secrets in notes |

### What you will learn

List ignore rules and .env.example keys (no real secrets).

### Enterprise context

Huge contexts and leaked .env break enterprise builds.

### Predict

If .env is in the build context, where can the password appear?

### Debug

Ignoring nothing — why is build slow/huge?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Committing .env | Commit .env.example only |
| Ignoring the Dockerfile | Do not ignore Dockerfile itself |

**Module 41** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab41-dockerignore-env.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Plan .dockerignore and Env

## Step 1 — Ignore list

Draft `.dockerignore` candidates: `.git`, `target/`, `.env`, `*.tfstate`, `notes/`, IDE folders.

## Step 2 — Check the reference

Runtime config via env (DB URL, user, password)—never `ENV PASSWORD=...` in Dockerfile.

## Step 3 — .env.example

List keys only (no values): `SPRING_DATASOURCE_URL`, username, password placeholders, Java opts.

## Step 4 — Evidence path

Note where Lab 41 will store `docker images` / inspect commit to GitHub (no screenshots).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-dockerignore-env.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Plan .dockerignore and Env

## Step 1 — Ignore list

Draft `.dockerignore` candidates: `.git`, `target/`, `.env`, `*.tfstate`, `notes/`, IDE folders.

## Step 2 — Check the reference

Runtime config via env (DB URL, user, password)—never `ENV PASSWORD=...` in Dockerfile.

## Step 3 — .env.example

List keys only (no values): `SPRING_DATASOURCE_URL`, username, password placeholders, Java opts.

## Step 4 — Evidence path

Note where Lab 41 will store `docker images` / inspect commit to GitHub (no screenshots).

## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ignore list and .env.example key list without secrets in `notes/lab41-dockerignore-env.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-dockerignore-env.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-dockerignore-env.md`
- [ ] .dockerignore candidates listed
- [ ] No password baked into Dockerfile plan
- [ ] .env.example keys only

