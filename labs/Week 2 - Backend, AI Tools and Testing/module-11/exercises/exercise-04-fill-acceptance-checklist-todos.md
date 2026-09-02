# Exercise 4 — Fill Acceptance Checklist TODOs

**Module 11** · Checkpoint C · Exercises 1–6 Pass then Lab 11

## Activity card

| | |
| --- | --- |
| **Objective** | Fill acceptance checklist TODOs before accepting AI tests/refactors |
| **Skills practiced** | Acceptance gates, human review |
| **Expected outcome** | notes/lab11-acceptance-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-11-exercises/` → notes/lab11-acceptance-todos.md |
| **Checkpoint** | C (after slides 88) |

## What you will learn

- Acceptance checklists catch JUnit 4 syntax and Spring Test phantoms
- Suite must stay focused on CRM behavior
- Notes lab11-001–004 will mirror this discipline in the lab

**Enterprise context:** Teams accept AI hunks only when checklist gates pass.

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file (starter) | `notes/lab11-acceptance-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 11 acceptance checklist TODOs

Imagine Copilot just generated a CustomerServiceTest. Score it below.

AAA structure present? (your note here)
Asserts use Amina/Ravi values (CUS-1001 ACTIVE / CUS-1002 PROSPECT)? (your note here)
Trivial assertNotNull-only / assertTrue(true) rejected? (your note here)
Correlation mention lab-request-001 (notes/comments OK)? (your note here)
Coverage gap noted for Labs 17–18? (your note here)
Accept / Reject / Edit: (your note here)

## Gap sentence (Labs 17–18)
(your note here)

## One reason for Accept / Reject / Edit
(your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Copy template

Create `notes/lab11-acceptance-todos.md` and paste:

```markdown
# Lab 11 acceptance checklist TODOs

Imagine Copilot just generated a CustomerServiceTest. Score it below.

AAA structure present? _____
Asserts use Amina/Ravi values (CUS-1001 ACTIVE / CUS-1002 PROSPECT)? _____
Trivial assertNotNull-only / assertTrue(true) rejected? _____
Correlation mention lab-request-001 (notes/comments OK)? _____
Coverage gap noted for Labs 17–18? _____
Accept / Reject / Edit: _____

## Gap sentence (Labs 17–18)
_____

## One reason for Accept / Reject / Edit
_____
```

### Step 2 — Fill every blank

Replace each `_____` with concrete values. Example (you may use your own honest scores):

| Blank | Example fill |
| ----- | ------------ |
| AAA structure present? | yes |
| Asserts use Amina/Ravi values? | yes |
| Trivial asserts rejected? | yes |
| Correlation mention? | yes (in notes) |
| Coverage gap noted? | yes |
| Accept / Reject / Edit | Edit |
| Gap sentence | Deep Mockito verify waits for Lab 18; JaCoCo / parameterized depth waits for Lab 17. |
| One reason | Keep domain asserts; replace assertNotNull-only methods before Accept. |

### Step 3 — Self-check

- Every `_____` is gone.
- Gap sentence names **both** Lab 17 and Lab 18.
- Decision is one of: Accept / Reject / Edit.

## Expected result

A filled acceptance TODO sheet at `notes/lab11-acceptance-todos.md` with an honest Labs 17–18 boundary.


## Debug / design challenge

Checklist skips 'real asserts' — add it before Pass.

## Predict the Output / Behavior

Should you accept a generated @SpringBootTest in Module 11?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| Leaving blanks empty | Fill every `_____` before claiming prep done |
| Treating Copilot coverage as final | Write the Labs 17–18 gap sentence |
| Keeping assertTrue(true) as Accept | Choose Reject or Edit; require ACTIVE/PROSPECT asserts |
| Wrong file name | Must be `notes/lab11-acceptance-todos.md` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab11-acceptance-todos.md`
- [ ] All `_____` replaced
- [ ] Labs 17–18 gap sentence present
- [ ] Accept / Reject / Edit recorded

