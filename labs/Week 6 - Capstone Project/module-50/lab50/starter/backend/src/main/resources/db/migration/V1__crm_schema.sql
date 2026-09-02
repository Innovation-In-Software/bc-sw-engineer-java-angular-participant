-- TODO: confirm PostgreSQL types (UUID, TIMESTAMPTZ) — not Oracle NUMBER/VARCHAR2

CREATE TABLE customer (
  customer_id   BIGSERIAL PRIMARY KEY,
  public_id     VARCHAR(32) NOT NULL UNIQUE,
  full_name     VARCHAR(200) NOT NULL,
  status        VARCHAR(32) NOT NULL,
  created_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
  CONSTRAINT ck_customer_status CHECK (status IN ('PROSPECT', 'ACTIVE', 'CLOSED'))
);

CREATE TABLE customer_interaction (
  interaction_id    UUID PRIMARY KEY,
  customer_id       BIGINT NOT NULL REFERENCES customer (customer_id),
  interaction_type  VARCHAR(32) NOT NULL,
  summary           VARCHAR(1024) NOT NULL,
  correlation_id    VARCHAR(64) NOT NULL,
  created_at        TIMESTAMPTZ NOT NULL DEFAULT now(),
  CONSTRAINT ck_interaction_type CHECK (interaction_type IN ('CALL', 'EMAIL', 'NOTE', 'MEETING'))
);

CREATE INDEX ix_interaction_customer_created
  ON customer_interaction (customer_id, created_at DESC);

INSERT INTO customer (public_id, full_name, status)
VALUES
  ('CUS-1001', 'Amina Khan', 'ACTIVE'),
  ('CUS-1002', 'Ravi Singh', 'PROSPECT');
