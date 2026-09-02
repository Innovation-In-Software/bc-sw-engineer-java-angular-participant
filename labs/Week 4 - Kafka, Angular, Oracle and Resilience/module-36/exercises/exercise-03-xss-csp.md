# Exercise 3 — XSS and CSP Notes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 17–22) |
| **Deliverable** | `notes/lab36-security.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT · fake token lab-token-001 |

### What you will learn

State the XSS-safe rendering rule and a test string that proves escaping works.

### Enterprise context

Angular escapes by default; the vulnerability arrives the moment someone bypasses that to render HTML.

### Predict

A customer name contains `<script>`. What does `bypassSecurityTrustHtml` do with it?

### Debug

The test string renders as bold Khan. What does that prove about your template?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No test string recorded | Use Amina <b>Khan</b> as the literal check |
| Bypass APIs allowed | Prefer default interpolation |
| CSP claimed as enforced | Document it unless the lab enforces it |

**Module 36** · Pre-lab exercise · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

This exercise is **practice only**. Commit the file(s) below to your GitHub repo. Nothing is submitted or graded.

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-security.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — XSS and CSP Notes

## Danger

A malicious customer name containing <script> rendered via bypassSecurityTrustHtml executes and can steal the token.

## Rule

Prefer plain interpolation and Angular's default escaping; avoid innerHTML and bypassSecurityTrust APIs on user data.

## CSP

A Content-Security-Policy header can reduce inline-script risk; this lab documents the policy rather than enforcing it.

## Test Idea

Test string Amina <b>Khan</b> must appear literally, including the tags, and never render as bold.
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — XSS and CSP Notes

## Danger

_____

## Rule

_____

## CSP

_____

## Test Idea

_____
## Scope
Pre-lab only — do not finish the full lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

The danger sentence, the escaping rule, a CSP note, and the paper test string in `notes/lab36-security.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-security.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-security.md`
- [ ] Danger sentence written
- [ ] Escaping rule stated
- [ ] CSP note written
- [ ] Test string recorded
