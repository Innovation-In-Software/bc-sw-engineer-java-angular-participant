# Lab 45 starter — timed path (~45 minutes)

**Theme:** Terraform + Ansible sketches — AI draft, human review, no secrets in Git

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | validate · no secrets · Ansible syntax · AI review ≥1 harden |
| **Hard gate** | Pre-lab Pass · no public DB |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab45-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab45-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab45-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab45-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab45-crm
cp -R starter/. ~/java-bootcamp/examples/lab45-crm/
cd ~/java-bootcamp/examples/lab45-crm
```

## 45-minute checklist

- [ ] Complete TODOs in `infra/terraform/*.tf` (pinned providers, no public DB)
- [ ] Fill `terraform.tfvars.example` (placeholders only)
- [ ] Draft idempotent `infra/ansible/site.yml` + `inventory.example.yml`
- [ ] Run `terraform fmt` / `validate` (or instructor `-backend=false` substitute)
- [ ] Record AI corrections in `docs/ai-iac-review.md`

## Smoke test

```bash
cd infra/terraform
terraform fmt -check -recursive || terraform fmt
terraform init -backend=false
terraform validate
# From lab root: ansible-playbook --syntax-check -i inventory.example.yml infra/ansible/site.yml
```

Evidence under `~/java-bootcamp/notes/lab-45/` (no state secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Providers pinned; `validate` succeeds | Pass / Fail |
| No secrets in `.tf` / tfvars.example | Pass / Fail |
| Ansible playbook syntax-check OK | Pass / Fail |
| AI review documents ≥1 rejection/hardening | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| validate fails | Fix HCL; pin providers; check required args |
| No cloud auth | `terraform init -backend=false` |
| AI public exposure | Reject; tighten contract; re-prompt |
| Accidental local state | Delete state; ensure gitignore |
