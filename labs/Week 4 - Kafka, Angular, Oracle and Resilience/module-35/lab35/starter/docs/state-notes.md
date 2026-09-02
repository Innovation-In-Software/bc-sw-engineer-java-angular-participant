# Lab 35 — State notes

## Signals vs Observables vs HttpClient

- Keep Lab 34 Signals for the list UI.
- Replace seed `setTimeout` with `CustomerApiService.getAll()` (HttpClient Observable).
- Note how CORS or a stopped API should land in the `error` Signal — not a blank page.
