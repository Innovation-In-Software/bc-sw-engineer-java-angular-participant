```mermaid
erDiagram
  CUSTOMER ||--o{ ACCOUNT : owns
  CUSTOMER {
    bigint customer_id PK
    string public_id UK
    string email UK
    string status
  }
  ACCOUNT {
    bigint account_id PK
    bigint customer_id FK
    string account_number UK
  }
```
