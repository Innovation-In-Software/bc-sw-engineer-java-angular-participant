# Exercise 2 — Angular Locator Policy

**Module 19** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Choose locators that survive CSS restyles.

## Steps

### Step 1 — Prefer

`data-testid` on search, row, and submit controls.

### Step 2 — Avoid

Absolute XPath and nth-child CSS as primary strategy.

### Step 3 — Example

e.g. `[data-testid=customer-row-CUS-1001]` for Amina.

### Step 4 — Capture

Save `notes/lab19-locator-policy.md`.

## Expected result

Locator policy prefers data-testid for CUS-1001.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | data-testid preferred | Pass / Fail |
| 2 | XPath deprioritized | Pass / Fail |
| 3 | Fixture example present | Pass / Fail |
