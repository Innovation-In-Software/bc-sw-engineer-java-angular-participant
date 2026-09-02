# Lab 33 — Component notes

## Smart vs presentational

| Piece | Role |
| ----- | ---- |
| `CustomerListPageComponent` | Smart page — will own HTTP load + filter Signals |
| `CustomerListItemComponent` | Presentational — `input` customer, `output` select (id) |
| `CustomerApiService` | TODO: typed HttpClient boundary |
| `AppComponent` | Shell |

Keep HttpClient out of the list item.

## Folder map

```
src/app/
  app.config.ts
  core/correlation.interceptor.ts
  features/customers/
    customer.model.ts
    customer-api.service.ts
    customer-list-item.component.ts
    customer-list-page.component.ts
src/environments/environment.ts
```
