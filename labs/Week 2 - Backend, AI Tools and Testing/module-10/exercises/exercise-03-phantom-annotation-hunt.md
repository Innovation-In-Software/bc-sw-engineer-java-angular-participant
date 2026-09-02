# Exercise 3 — Phantom Annotation Hunt

**Module 10** · Checkpoint C · Exercises 1–6 Pass then Lab 10

## Activity card

| | |
| --- | --- |
| **Objective** | Hunt phantom annotations and invented APIs in sample AI output |
| **Skills practiced** | AI risk detection, human review |
| **Expected outcome** | notes/phantom-annotation-notes.md listing rejects |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-10-exercises/` → notes/phantom-annotation-notes.md |
| **Checkpoint** | C (after slides 70–71) |

## What you will learn

- Phantom annotations compile only if you add the wrong dependencies
- Invented methods are a common Copilot failure mode
- Reject is a valid engineering action

**Enterprise context:** Security reviews treat unexplained framework imports as defects, not features.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/phantom-annotation-notes.md` |

## Reference

| Seen in suggestion | Likely real? | Prep action |
| --- | --- | --- |
| @Entity / @Table | JPA only | Defer — not Lab 10 scope |
| @Service / @Autowired | Spring | Defer — hosting labs later |
| @NotNull (Jakarta) | Validation lib | Name it; don't invent imports |
| public record Customer(...) | Java 16+ | OK on JDK 21 |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `notes/phantom-annotation-notes.md` and flag Copilot-style annotations that do not belong in a plain Java prep sketch.

**Done looks like:** A phantom-annotation checklist in `notes/phantom-annotation-notes.md` tied to JDK 21 / Maven honesty.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

Create `notes/phantom-annotation-notes.md` and recreate the reference table; add one row for an annotation you invent as a trap.

### Step 2 — Reject rule

Write: *Reject any import I cannot name from JDK 21 or an agreed Maven dependency.*

### Step 3 — Fixture check

Mark whether a suggestion hard-codes `CUS-1002` Ravi as ACTIVE (wrong — PROSPECT) as a review fail.

### Step 4 — Out of scope

Note: REST hosting (Labs 13/24) and Spring Boot are not in this pre-lab. Reject Copilot SOAP/WSDL suggestions — this course uses REST/OpenAPI.

## Expected result

A phantom-annotation checklist in `notes/phantom-annotation-notes.md` tied to JDK 21 / Maven honesty.


## Debug / design challenge

Find @Column or jakarta.persistence in a snippet — remove and restate constraints.

## Predict the Output / Behavior

Does accepting @Entity without JPA on the classpath break compile?

## Troubleshooting

If Copilot is unavailable, complete the notes analysis manually — do not block on license issues for pre-lab Pass.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/phantom-annotation-notes.md`
- [ ] Table copied with one trap row
- [ ] Reject-unknown-import rule written
- [ ] Ravi status PROSPECT called out

