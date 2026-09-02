# Exercise 2 — Request Mapping Matrix

**Module 24** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Map HTTP operations to Spring mapping annotations.

## Steps

### Step 1 — GET item

`@GetMapping("/{customerId}")` + `@PathVariable`.

### Step 2 — GET list

`@GetMapping` + optional `@RequestParam status`.

### Step 3 — POST

`@PostMapping` + `@RequestBody` DTO.

### Step 4 — Capture

Save `notes/lab24-mapping-matrix.md`.

## Expected result

Matrix covers path, query, and body bindings.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | PathVariable listed | Pass / Fail |
| 2 | RequestParam listed | Pass / Fail |
| 3 | RequestBody listed | Pass / Fail |
