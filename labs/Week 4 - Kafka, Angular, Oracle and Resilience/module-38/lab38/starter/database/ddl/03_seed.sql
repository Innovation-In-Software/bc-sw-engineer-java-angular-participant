INSERT INTO customer (public_id, full_name, email, status)
VALUES
  ('CUS-1001', 'Amina Khan', 'amina.khan@example.com', 'ACTIVE'),
  ('CUS-1002', 'Ravi Singh', 'ravi.singh@example.com', 'PROSPECT')
ON CONFLICT (public_id) DO NOTHING;

INSERT INTO account (customer_id, account_number, balance_cents)
SELECT customer_id, 'ACC-1001-01', 125000
FROM customer
WHERE public_id = 'CUS-1001'
  AND NOT EXISTS (
    SELECT 1 FROM account a WHERE a.account_number = 'ACC-1001-01'
  );
