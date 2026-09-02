# Lab 33 — Component notes

## Smart vs presentational

| Piece | Role |
| ----- | ---- |
| `CustomerListPageComponent` | Smart page — owns `SEED_CUSTOMERS` and `selectedId` |
| `CustomerListItemComponent` | Presentational — `input` customer, `output` select (id) |
| `AppComponent` | Shell — hosts the smart page and header |

The list item does **not** import seeds or HttpClient. Amina (`CUS-1001`) and Ravi (`CUS-1002`) live only in `customer.model.ts`.

## Folder map

```
src/app/
  app.component.ts          shell
  features/customers/
    customer.model.ts
    customer-list-item.component.ts
    customer-list-page.component.ts
```
