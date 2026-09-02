-- Lab 37 schema scaffold — fill constraints / indexes per GUIDE
CREATE TABLE IF NOT EXISTS customer (
  customer_id           BIGSERIAL PRIMARY KEY,
  public_id             VARCHAR(32) NOT NULL,
  full_name             VARCHAR(200) NOT NULL,
  email                 VARCHAR(320) NOT NULL,
  status                VARCHAR(32) NOT NULL,
  created_at            TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at            TIMESTAMPTZ NOT NULL DEFAULT now()
  -- TODO: UNIQUE (public_id), UNIQUE (email)
  -- TODO: CHECK status IN ('PROSPECT','ACTIVE','CLOSED')
);

CREATE TABLE IF NOT EXISTS account (
  account_id            BIGSERIAL PRIMARY KEY,
  customer_id           BIGINT NOT NULL,
  account_number        VARCHAR(32) NOT NULL,
  balance_cents         BIGINT NOT NULL DEFAULT 0,
  opened_at             TIMESTAMPTZ NOT NULL DEFAULT now()
  -- TODO: FK customer_id → customer(customer_id)
  -- TODO: UNIQUE (account_number)
);

-- TODO: indexes supporting email lookup and status filters
-- TODO: GRANT DML on tables/sequences to crm_app

