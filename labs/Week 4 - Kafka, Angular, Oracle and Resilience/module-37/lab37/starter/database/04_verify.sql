SELECT public_id, full_name, status FROM customer ORDER BY public_id;
SELECT a.account_number, c.public_id
FROM account a
JOIN customer c ON c.customer_id = a.customer_id;

-- TODO: duplicate email must fail (UNIQUE / SQLSTATE 23505)
-- TODO: status 'SUSPENDED' must fail (CHECK / SQLSTATE 23514)
-- TODO: orphan account (unknown customer_id) must fail (FK / SQLSTATE 23503)

