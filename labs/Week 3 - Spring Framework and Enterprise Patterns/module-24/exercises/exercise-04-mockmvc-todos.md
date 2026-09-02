# Exercise 4 — Fill MockMvc TODOs

**Module 24** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for a MockMvc GET of Amina.

## Steps

### Step 1 — Template

Create `notes/lab24-mockmvc-todos.md`:

```java
mockMvc.perform(get("/api/v1/customers/_____")
        .header("_____", "_____"))
    .andExpect(status().is_____())
    .andExpect(jsonPath("$.fullName").value("_____"));
```

### Step 2 — Fill

`CUS-1001`, correlation header + `lab-request-001`, `Ok`, `Amina Khan`.

### Step 3 — Second case

Note a 404 test for `CUS-9999` (fill status `NotFound`).

### Step 4 — Boundary

This is a sketch — Lab 24 starter has the real test class.

## Expected result

MockMvc TODOs filled for Amina and a 404 note.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | CUS-1001 GET filled | Pass / Fail |
| 2 | Correlation header filled | Pass / Fail |
| 3 | 404 case noted | Pass / Fail |
