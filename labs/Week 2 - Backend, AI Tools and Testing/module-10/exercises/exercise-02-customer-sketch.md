# Exercise 2 — Customer Sketch for Amina

**Module 10** · Checkpoint B · Exercises 1–6 Pass then Lab 10

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch Customer fields for CUS-1001 Amina Khan without inventing Spring/JPA |
| **Skills practiced** | AI-assisted class/DTO planning, scope control |
| **Expected outcome** | notes/customer-sketch-notes.md with plain-Java field plan |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-10-exercises/` → notes/customer-sketch-notes.md |
| **Checkpoint** | B (after slides 66–69) |

## What you will learn

- Generation slides (class/DTO/service) share one habit: constrain then sketch
- Entity fields can differ from request/response DTO needs
- Documentation generation is optional — correctness first

**Enterprise context:** Onboarding demos use fixed fixtures (Amina ACTIVE) so reviews are comparable.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/customer-sketch-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Customer sketch

| customerId | fullName   | status   |
| ---------- | ---------- | -------- |
| CUS-1001   | Amina Khan | ACTIVE   |
| CUS-1002   | Ravi Singh | PROSPECT |

Correlation `lab-request-001`: logs/headers only — not a Customer field.

Boundary: sketch only — pre-lab.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

Create `notes/customer-sketch-notes.md`.

### Step 2 — Fields (Amina)

Record: `customerId`, `fullName`, `status` for Amina Khan ACTIVE (`CUS-1001`).

### Step 3 — Ravi row

Add a second row: `CUS-1002` Ravi Singh PROSPECT — same shape, different values.

### Step 4 — Correlation note

One line: request correlation `lab-request-001` belongs in logs/headers later, **not** as a Customer field.

### Step 5 — Prep boundary

Mark: *Sketch only — do not complete full Lab 10 AI generation path yet.*

Example shape:

```markdown
# Customer sketch

| customerId | fullName   | status   |
| ---------- | ---------- | -------- |
| CUS-1001   | Amina Khan | ACTIVE   |
| CUS-1002   | Ravi Singh | PROSPECT |

Correlation `lab-request-001`: logs/headers only — not a Customer field.

Boundary: sketch only — pre-lab.
```

## Expected result

Two fixture rows and a correlation placement note in `notes/customer-sketch-notes.md`.


## Debug / design challenge

AI adds @Entity — write the reject reason and a corrected prompt line.

## Predict the Output / Behavior

Should email live on every DTO even if the entity stores it?

## Troubleshooting

If Copilot is unavailable, complete the notes analysis manually — do not block on license issues for pre-lab Pass.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/customer-sketch-notes.md`
- [ ] Amina and Ravi rows correct
- [ ] Correlation not stored as a Customer field
- [ ] Explicit pre-lab boundary written

