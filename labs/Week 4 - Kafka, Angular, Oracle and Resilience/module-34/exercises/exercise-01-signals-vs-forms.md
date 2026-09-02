# Exercise 1 — Signals vs Form Controls

**Module 34** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Choose where list state vs form fields live.

## Steps

### Step 1 — List

Customer list is a Signal (or service signal) — not a React `useState`.

### Step 2 — Form

Create/edit fields are reactive form controls.

### Step 3 — Why

One sentence: Signals for view state; forms for input validation.

### Step 4 — Capture

Save `notes/lab34-signals-vs-forms.md`.

## Expected result

Ownership split documented without React hooks.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | List as Signal | Pass / Fail |
| 2 | Fields as form controls | Pass / Fail |
| 3 | Hooks not used | Pass / Fail |
