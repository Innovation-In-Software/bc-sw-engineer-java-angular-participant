# Lab 44 — Rollback runbook

## Known-good identity

| Field | Value |
| ----- | ----- |
| Previous digest / checksum | TODO(lab44) |
| Previous version | TODO(lab44) |
| Verification check | TODO(lab44): readiness + get `CUS-1001` |

## Procedure (sketch)

1. Announce incident / change freeze as needed (Lab 47 templates).
2. Redeploy known-good digest (`oc set image` / CD job — per instructor; not k3s/`kubectl`).
3. TODO(lab44): Exact commands for your environment.
4. Verify readiness + CRM smoke.
5. Record outcome in release notes (no secrets).

## Rehearsal evidence

TODO(lab44): Link or path to staging rollback rehearsal screenshot.
