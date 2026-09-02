-- Least-privilege app role (lab default password matches .env.example)
DO $$
BEGIN
  IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'crm_app') THEN
    CREATE ROLE crm_app LOGIN PASSWORD 'change-me';
  END IF;
END
$$;

GRANT CONNECT ON DATABASE crm TO crm_app;
