# Lab 42: Kubernetes and OpenShift Architecture — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code · OpenShift Console  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Docker image from Lab 41 · `oc` CLI · OpenShift · GitHub Actions context · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-42-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete
- Lab 41 image identity notes available
- `oc` on PATH (or Console-only path approved by instructor)
- IntelliJ with **Project SDK 21**

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab42-crm` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
cd examples\lab42-crm
```

### Commands this lab typically uses

Verified on this laptop (2026-08-28): **no local OpenShift** (course rule — instructor-hosted Project). `oc` is not on PATH. Docker Desktop `kubectl` points at a stopped API (`127.0.0.1:6550`). Solution manifests: kubeconform **4 valid** (Deployment/Service/ConfigMap/Secret), Route skipped as an OpenShift CRD (`-ignore-missing-schemas`). Timed-path Pass is client YAML validate + runbook; live `oc apply` is homework on the shared cluster. Do **not** substitute k3s/k3d/Ingress.

```powershell
oc version
oc apply -f openshift\ --dry-run=client
```

### If it fails

| Symptom | Fix |
| --- | --- |
| `oc` not recognized | Install OpenShift CLI as the instructor directs; or Console-only path |
| No cluster on the laptop | Expected — complete dry-run / conceptual pack |
| SSL / login errors | Use instructor API URL and token flow |
| YAML path issues | Prefer `openshift\` relative paths from project root |

## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace open; project under `examples\lab42-crm` | Pass / Fail |
| 2 | GUIDE deliverables / checkpoints complete | Pass / Fail |
