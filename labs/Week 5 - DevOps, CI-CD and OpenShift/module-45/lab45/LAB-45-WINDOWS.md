# Lab 45: Infrastructure as Code with AI Assistance — Northstar CRM Stack Sketches — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Terraform · Ansible syntax-check · OpenShift Project (instructor-hosted) · IntelliJ  
**Full lab steps:** [LAB-45-GUIDE.md](LAB-45-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-45-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- Terraform 1.5+ (this laptop: `%USERPROFILE%\bin\terraform.exe` if not on PATH)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab45-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab45-crm
```

### Commands this lab typically uses

```powershell
$env:Path = "$env:USERPROFILE\bin;" + $env:Path
cd $env:USERPROFILE\java-bootcamp\examples\lab45-crm\infra\terraform
terraform fmt -recursive
terraform init -backend=false
terraform validate
```

Verified on this laptop (2026-08-28): Terraform **1.9.8** (`%USERPROFILE%\bin`; not on PATH by default). `init -backend=false` installed `hashicorp/null` **3.2.4**. **`terraform validate` → Success.** `validate` does not take `-var` (that flag is for `plan`/`apply`). `db_password` has no default on purpose. No cloud apply. Ansible syntax-check via Docker `cytopia/ansible` → `playbook: infra/ansible/site.yml`. Do **not** install OpenShift/CRC/k3s locally. Do **not** use `kubectl` as the lab path.

## Do the lab

Complete every step in **[LAB-45-GUIDE.md](LAB-45-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab45-crm` as in [LAB-45-GUIDE.md](LAB-45-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
