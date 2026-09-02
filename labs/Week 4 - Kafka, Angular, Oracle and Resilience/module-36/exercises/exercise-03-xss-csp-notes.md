# Exercise 3 — XSS and CSP Notes

**Module 36** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

State how Angular templates help and what still goes wrong.

## Steps

### Step 1 — Interpolation

Angular escaping helps against HTML injection in templates.

### Step 2 — Bypass

Avoid `innerHTML` / bypassing sanitizer for customer notes.

### Step 3 — CSP

CSP is defense-in-depth — not a substitute for encoding.

### Step 4 — Capture

Save `notes/lab36-xss-csp.md`.

## Expected result

XSS notes warn against sanitizer bypass.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Interpolation help | Pass / Fail |
| 2 | innerHTML avoided | Pass / Fail |
| 3 | CSP named | Pass / Fail |
