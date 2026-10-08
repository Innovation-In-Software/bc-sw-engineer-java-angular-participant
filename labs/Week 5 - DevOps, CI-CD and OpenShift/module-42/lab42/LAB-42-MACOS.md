# Lab 42: Kubernetes and k3s Architecture — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code · k3s Console  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Docker image from Lab 41 · `kubectl` CLI · k3s · GitHub Actions context · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-42-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete
- Lab 41 image identity notes available
- `kubectl` on PATH (or Console-only path approved by instructor)
- IntelliJ with **Project SDK 21**

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab42-crm` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
cd examples/lab42-crm
```

### Commands this lab typically uses

```bash
kubectl version
kubectl --server="$KUBE_API"
kubectl config view --minify
kubectl apply -f k8s/ --dry-run=client
kubectl apply -f k8s/
oc get pods,svc,route
curl -fsS "https://<route-host>/actuator/health/readiness"
```

## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open; project under `examples/lab42-crm` | Pass / Fail |
| 2 | GUIDE deliverables / checkpoints complete | Pass / Fail |
