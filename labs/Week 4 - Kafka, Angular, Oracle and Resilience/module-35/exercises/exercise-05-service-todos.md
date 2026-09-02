# Exercise 5 — Fill HttpClient TODOs

**Module 35** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete blanks for a GET-by-id method.

## Steps

### Step 1 — Template

Create `notes/lab35-service-todos.md`:

```ts
getById(id: string) {
  return this.http.get<Customer>(`_____/_____/${id}`, {
    headers: { '_____': '_____' },
  });
}
```

### Step 2 — Fill

Base URL + `customers`, correlation header `lab-request-001`.

### Step 3 — Type

`Customer` includes customerId, fullName, status.

### Step 4 — Token

Do not hardcode Bearer secrets — Lab 36 interceptor.

## Expected result

Service TODOs filled without hardcoded secrets.

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | URL blanks filled | Pass / Fail |
| 2 | Correlation filled | Pass / Fail |
| 3 | No Bearer secret | Pass / Fail |
