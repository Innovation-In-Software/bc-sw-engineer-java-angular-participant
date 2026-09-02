-- Paste/adapt Lab 37 schema here for a self-contained performance lab.
-- Do not silently rename columns Lab 39 will map.
-- Timed-path tables only. UNIQUE on email already creates an index (baseline email lookup).
-- Status list and account FK indexes are added in performance/03_indexes.sql after baseline.

CREATE TABLE IF NOT EXISTS customer (
  customer_id           BIGSERIAL NOT NULL,
  public_id             VARCHAR(32) NOT NULL,
  full_name             VARCHAR(200) NOT NULL,
  email                 VARCHAR(320) NOT NULL,
  status                VARCHAR(32) NOT NULL,
  created_at            TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at            TIMESTAMPTZ NOT NULL DEFAULT now(),
  CONSTRAINT pk_customer PRIMARY KEY (customer_id),
  CONSTRAINT uk_customer_public_id UNIQUE (public_id),
  CONSTRAINT uk_customer_email UNIQUE (email),
  CONSTRAINT ck_customer_status
    CHECK (status IN ('PROSPECT', 'ACTIVE', 'CLOSED'))
);

CREATE TABLE IF NOT EXISTS account (
  account_id            BIGSERIAL NOT NULL,
  customer_id           BIGINT NOT NULL,
  account_number        VARCHAR(32) NOT NULL,
  balance_cents         BIGINT NOT NULL DEFAULT 0,
  opened_at             TIMESTAMPTZ NOT NULL DEFAULT now(),
  CONSTRAINT pk_account PRIMARY KEY (account_id),
  CONSTRAINT fk_account_customer
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
  CONSTRAINT uk_account_number UNIQUE (account_number),
  CONSTRAINT ck_account_balance_nonneg CHECK (balance_cents >= 0)
);

GRANT USAGE ON SCHEMA public TO crm_app;
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO crm_app;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO crm_app;
