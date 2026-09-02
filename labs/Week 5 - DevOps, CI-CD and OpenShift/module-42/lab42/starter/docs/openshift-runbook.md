# OpenShift runbook — Lab 42 (TODO)

## Project
- Name:
- Login method (no token pasted here):

## Image identity (from Lab 41)
- Tag:
- Digest / Image Id:

## Apply / verify
```bash
oc project
oc apply -f openshift/
oc get pods,svc,route
```

## Probes
- Readiness path: `/actuator/health/readiness`
- Liveness path: `/actuator/health/liveness`

## ConfigMap / Secret
- ConfigMap keys (non-secret):
- Secret created via (Console / `oc create secret`) — values never in Git:
