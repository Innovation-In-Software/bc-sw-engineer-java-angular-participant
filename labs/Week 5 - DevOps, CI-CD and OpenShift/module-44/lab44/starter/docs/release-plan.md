# Lab 44 — Release plan

## Immutable artifact

Promote **one** identity from Lab 43: JAR SHA-256 and/or image digest — never rebuild on the deploy agent as “the same” release.

| Field | Value |
| ----- | ----- |
| Version | TODO(lab44) |
| Commit | TODO(lab44) |
| Digest / checksum | TODO(lab44) |

## Promotion path

```text
CI package → test → staging (smoke) → [approval] → production
```

## Gates (objective)

| Env | Gate | Evidence |
| --- | ---- | -------- |
| test | verify green | Actions URL |
| staging | smoke `CUS-1001` / `CUS-1002` | TODO(lab44) |
| production | approval + digest match | TODO(lab44) |

## Config vs artifact

TODO(lab44): Env-specific ConfigMaps/Secrets stay outside the artifact.

## DB compatibility

TODO(lab44): Expand-before-contract note for schema changes (if any).
