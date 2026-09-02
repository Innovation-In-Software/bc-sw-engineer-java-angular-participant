# Exercise 6 — Lab 22 Readiness Checklist

**Module 22** · Checkpoint E · Exercises 1–6 Pass then Lab 22

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 22 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab22-readiness.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-22-exercises/` → notes/lab22-readiness.md |
| **Checkpoint** | E (after slides 29–31) |

## What you will learn

- Gate Lab 22 on Ex 1–5 notes
- Constructor DI + stereotypes clear
- No Boot Initializr / Security detour planned

**Enterprise context:** Teams that skip the graph sketch invent field injection mid-lab and fail the timed path.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab22-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 readiness checklist

| File | Present? |
| ---- | -------- |
| notes/ioc-vs-new.md | yes |
| notes/constructor-di.md | yes |
| notes/lab22-lifecycle-notes.md | yes |
| notes/stereotype-map.md | yes |
| notes/bean-graph-sketch.md | yes |

Primary DI style: constructor + final. Overall prep: Pass (self-check only)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/lab22-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 readiness checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/ioc-vs-new.md | _____ |
| notes/constructor-di.md | _____ |
| notes/lab22-lifecycle-notes.md | _____ |
| notes/stereotype-map.md | _____ |
| notes/bean-graph-sketch.md | _____ |

## Scope
Pre-lab only. Primary DI style for lab? _____

## Self-check (do not write this mark down)
Overall prep: Pass (self-check only) or Fail — check yourself only
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist in `notes/lab22-readiness.md`.

## Debug / design challenge

If constructor-di notes still prefer field @Autowired, which exercise do you reopen?

## Predict the Output / Behavior

Which package should CrmApplication live in so component scan finds CRM beans?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab22-readiness.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 22 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab22-readiness.md`
- [ ] Artifacts confirmed
- [ ] DI style noted
- [ ] Pass/Fail marked
