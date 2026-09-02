# Capstone CI/CD runbook — TODO (Lab 51)

## Stack

Angular + Spring Boot + PostgreSQL + GitHub Actions → OpenShift (`oc`).  
Not Bitbucket. Not k3s/`kubectl`.

## Secret names only

- `OC_SERVER` — TODO
- `OC_TOKEN` — TODO

Never paste cluster credentials into this file.

## PR gates

- Angular: TODO (`npm ci` / `npx ng build`)
- Maven: TODO (`mvn -B clean verify`)

## Promote

Digest from CI → `oc set image` — TODO env names (`crm-test` / `crm-staging` / `crm-prod`)

## Smoke

`CUS-1001` via Route + `lab-request-001` — TODO

## Rollback

`oc rollout undo` — TODO
