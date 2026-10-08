# GitHub Actions plan — TODO (Lab 48)

| Trigger | Jobs | Evidence |
| ------- | ---- | -------- |
| pull_request | Angular `npm ci` / test / `ng build`; Maven verify | Actions logs |
| main | + checksum / package-once | artifacts |
| tag / env | k3s deploy with approval | Environment |

## Notes
- Package-once: deploy must not rebuild silently
- Angular frontend build is in scope for fullstack (see Lab 43 note)
