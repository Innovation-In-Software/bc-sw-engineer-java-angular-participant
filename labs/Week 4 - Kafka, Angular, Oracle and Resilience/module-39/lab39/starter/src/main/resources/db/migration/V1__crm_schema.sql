CREATE TABLE customer (
  customer_id   BIGSERIAL PRIMARY KEY,
  public_id     VARCHAR(32) NOT NULL UNIQUE,
  full_name     VARCHAR(200) NOT NULL,
  email         VARCHAR(320) NOT NULL UNIQUE,
  status        VARCHAR(32) NOT NULL,
  version       BIGINT NOT NULL DEFAULT 0,
  created_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
  CONSTRAINT ck_customer_status CHECK (status IN ('PROSPECT', 'ACTIVE', 'CLOSED'))
);

CREATE TABLE account (
  account_id      BIGSERIAL PRIMARY KEY,
  customer_id     BIGINT NOT NULL REFERENCES customer (customer_id),
  account_number  VARCHAR(32) NOT NULL UNIQUE,
  balance_cents   BIGINT NOT NULL DEFAULT 0,
  version         BIGINT NOT NULL DEFAULT 0,
  opened_at       TIMESTAMPTZ NOT NULL DEFAULT now()
);

-- TODO: add status/created_at index aligned with Lab 38 if justified
