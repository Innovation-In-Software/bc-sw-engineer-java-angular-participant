# PostgreSQL test strategy (TODO)

**Chosen option:** A Testcontainers / B dedicated test DB / C timed-path stub → full-path Postgres

## Connection notes

- JDBC URL pattern: `jdbc:postgresql://HOST:5432/DB`
- Credentials: env vars / GitHub Secrets only — never commit passwords
- Seeds: `CUS-1001` Amina ACTIVE, `CUS-1002` Ravi PROSPECT

## Why not H2-only / Oracle

Production and CI for this course target **PostgreSQL**. Document how timed-path stubs switch to Postgres for full path.
