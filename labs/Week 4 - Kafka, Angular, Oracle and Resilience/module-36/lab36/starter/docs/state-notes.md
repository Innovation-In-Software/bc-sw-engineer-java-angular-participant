# Lab 35 — State notes

## Signals vs Observables vs HttpClient

- **Signals** still hold the UI graph: `customers`, `loading`, `error`, `statusFilter`, `filteredCustomers`.
- **HttpClient** returns **Observables**. Map them into Signals in the smart page (`subscribe` + `catchError`).
- Form `valueChanges` remains an Observable piped with `takeUntilDestroyed`.

Do not treat Signals as “React hooks renamed.”
