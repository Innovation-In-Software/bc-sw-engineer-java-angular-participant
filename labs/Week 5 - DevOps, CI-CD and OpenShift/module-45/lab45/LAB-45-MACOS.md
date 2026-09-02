# Lab 45: Infrastructure as Code with AI Assistance — Northstar CRM Stack Sketches — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Terraform · Ansible syntax-check · OpenShift Project (instructor-hosted) · IntelliJ  
**Full lab steps:** [LAB-45-GUIDE.md](LAB-45-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-45-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- Terraform 1.5+
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab45-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab45-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab45-crm/infra/terraform
terraform fmt -check -recursive
terraform init -backend=false
terraform validate
cd ../..
ansible-playbook --syntax-check -i inventory.example.yml infra/ansible/site.yml
```

No cloud apply. Do **not** install OpenShift/CRC/k3s locally. Do **not** use `kubectl` as the lab path. If `ansible-playbook` is missing, document syntax-check as residual risk (timed path still requires Terraform validate).

## Do the lab

Complete every step in **[LAB-45-GUIDE.md](LAB-45-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab45-crm` as in [LAB-45-GUIDE.md](LAB-45-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
