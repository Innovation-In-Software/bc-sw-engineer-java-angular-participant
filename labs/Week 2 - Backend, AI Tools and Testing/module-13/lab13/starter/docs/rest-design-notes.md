# Lab 13 — REST design notes (TODO)

## URI table

| Resource | Method | URI | Success status |
| -------- | ------ | --- | -------------- |
| Collection list | GET | `/api/v1/customers` | 200 |
| Create | POST | `/api/v1/customers` | 201 |
| Item | GET | `/api/v1/customers/{customerId}` | 200 |
| Replace | PUT | TODO | TODO |
| Delete | DELETE | TODO | TODO |
| Patch status | PATCH | TODO | TODO |

## Error contract

- Header: `X-Correlation-Id` (example `lab-request-001`)
- Body fields: timestamp, status, error, message, path, correlationId
- TODO: paste one 404 example for `CUS-9999`

## Pagination / filter / sort

- `page`, `size` (max ?), `status`, `sort`
- Example list URL: TODO
- Page wrapper fields: content, page, size, totalElements

## Fixtures

- `CUS-1001` Amina Khan ACTIVE
- `CUS-1002` Ravi Singh PROSPECT

## Stack reminder

REST / OpenAPI · Angular client later · PostgreSQL later · GitHub Actions later — not SOAP/Oracle as the taught path.
