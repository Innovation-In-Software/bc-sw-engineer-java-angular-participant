# Lab 42 starter — timed path (~45 minutes)

**Theme:** k3s namespace · Deployment/Service/Ingress · probes · ConfigMap/Secret overview

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Manifest TODOs · dry-run · probe paths · no secrets in Git |
| **Hard gate** | Pre-lab Pass · Lab 41 image notes · `kubectl` or Console access |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab42-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab42-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab42-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab42-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab42-crm
cp -R starter/. ~/java-bootcamp/examples/lab42-crm/
cd ~/java-bootcamp/examples/lab42-crm
```

## 45-minute checklist

- [ ] Complete TODOs in `k8s/*.yaml` (image tag, labels, probes)
- [ ] Add ConfigMap + Secret *example* files (empty secret values)
- [ ] Fill Project / Ingress hostname placeholders in `docs/deployment-runbook.md`
- [ ] `kubectl apply --dry-run=client` (or Console validate) for Deployment/Service/Ingress
- [ ] Capture redacted commit to GitHub (no screenshots)

## Smoke test

```bash
kubectl apply -f k8s/ --dry-run=client
# If the instructor Project is available:
# kubectl apply -f k8s/
# oc get pods,svc,route
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Deployment/Service/Ingress sketches complete | Pass / Fail |
| Readiness + liveness paths set | Pass / Fail |
| No real secrets/kubeconfig committed | Pass / Fail |
| Runbook Project + image identity filled | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Dry-run schema error | Fix apiVersion/kind; match k3s version notes |
| Forbidden apply | Use assigned Project; ask instructor |
| Probe 404 | Enable Actuator health probes in CRM image |
