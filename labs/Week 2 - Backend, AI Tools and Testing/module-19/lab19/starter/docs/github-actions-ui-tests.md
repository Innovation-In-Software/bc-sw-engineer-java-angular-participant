# GitHub Actions — headless UI + API IT (TODO)

## Jobs

1. `api-it`: `mvn -B test -Dtest=CustomerApiIT`
2. `ui-it`: start Angular (or use built assets) → headless Chrome Selenium

## Headless flags (sketch)

- `--headless=new`
- Upload screenshots on failure as Actions artifacts

## Secrets / services

- PostgreSQL service container or `DATABASE_URL` secret
- **Not** Bitbucket Pipelines — this course uses **GitHub Actions**
