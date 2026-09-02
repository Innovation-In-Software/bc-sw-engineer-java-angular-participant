# Exercise 4 — Fill Input/Output TODOs

**Module 33** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for CustomerCard inputs/outputs.

## Steps

### Step 1 — Template

Create `notes/lab33-input-output-todos.md`:

```ts
@Input() customerId = '_____';
@Input() fullName = '_____';
@Input() status: 'ACTIVE' | 'PROSPECT' = '_____';
@Output() select = new EventEmitter<string>();
```

### Step 2 — Fill

Amina: `CUS-1001`, `Amina Khan`, `ACTIVE`.

### Step 3 — Second row

Note Ravi `CUS-1002` / PROSPECT as a second card instance.

### Step 4 — Anti-pattern

Do not pass the entire application store as one mega-input.

## Expected result

Input/output TODOs filled for Amina plus Ravi note.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Amina fields filled | Pass / Fail |
| 2 | Ravi instance noted | Pass / Fail |
| 3 | Mega-input avoided | Pass / Fail |
