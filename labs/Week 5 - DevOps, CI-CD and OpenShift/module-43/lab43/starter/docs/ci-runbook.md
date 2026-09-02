# Lab 43 — CI runbook

## Pipeline policy

| Trigger | Jobs | Notes |
| ------- | ---- | ----- |
| Pull request | verify | Fast feedback |
| `main` push | verify + package | Immutable JAR + checksum |
| Tag `v*` | verify + package | Release candidate identity |

## Secrets / variables

TODO(lab43): List which GitHub Secrets / Variables exist (names only). Never paste values.

## Re-run failed verify

1. Open Actions → failed run
2. TODO(lab43): Document when to re-run vs fix locally
3. Confirm Surefire artifact uploaded (`if: always()`)

## Failure experiment (safe)

TODO(lab43): Force one failing test → observe red check → restore → green.

## Artifact identity for Lab 44

- JAR + `SHA256SUMS` + `GITHUB_SHA`
- TODO(lab43): Where peers download the artifact
