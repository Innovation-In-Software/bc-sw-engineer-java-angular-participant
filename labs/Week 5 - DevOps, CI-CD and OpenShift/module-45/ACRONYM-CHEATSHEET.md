# Module 45 — Acronym Cheatsheet

**Topic:** Infrastructure as Code with Terraform and Ansible  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **32** curriculum slide diagram title(s) plus slide text for this module._

---

## Config & IaC

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Ansible** | — | Agentless automation tool (playbooks) for config/deploy tasks. |
| **IaC** | Infrastructure as Code | Define servers/network/config in versioned files. |
| **Idempotence (Ansible)** | — | Re-running a playbook converges to the same desired state. |
| **Inventory** | Ansible Inventory | List of hosts/groups Ansible targets. |
| **Playbook** | Ansible Playbook | YAML steps Ansible runs against hosts. |
| **Remote State** | — | Terraform state stored centrally (e.g., object storage) for teams. |
| **State file** | Terraform State | Terraform’s record of what it created/manages. |
| **Terraform** | — | Declarative IaC tool to provision cloud/infra resources. |
| **YAML** | YAML Ain’t Markup Language | Human-friendly format for config and API docs. |
| **HCL** | HashiCorp Configuration Language | The declarative language `.tf` files are written in (the deck also calls it “Human-Readable Configuration Language”). |
| **CLI** | Command-Line Interface | The `terraform` command itself — runs init/plan/apply/destroy. |
| **JSON** | JavaScript Object Notation | The format `terraform.tfstate` is stored in. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Idempotent** | Idempotency | Doing the same operation twice has the same effect as once. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | How Terraform/Ansible talk to a cloud or SaaS platform on your behalf. |
| **VM** | Virtual Machine | A provisioned compute instance (e.g., an EC2 instance). |
| **DB** | Database | Shorthand used in the module's forbidden-list rules ("No public LoadBalancer/DB"). |
| **IP** | Internet Protocol (address) | Terraform outputs (instance IPs) that feed Ansible's dynamic inventory. |

---

## Cloud provider resources

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AWS** | Amazon Web Services | The cloud provider behind the module's example resource blocks (`aws_instance`, `aws_s3_bucket`). |
| **VPC** | Virtual Private Cloud | Isolated AWS network Terraform can provision. |
| **EC2** | Elastic Compute Cloud | AWS virtual server resource type (`aws_instance`). |
| **S3** | Simple Storage Service | AWS object storage; also a popular Terraform remote-state backend. |
| **IAM** | Identity and Access Management | AWS access control; least-privilege IAM policies protect state and resources. |
| **RBAC** | Role-Based Access Control | General access-control pattern paired with IAM to restrict who can touch state. |
| **RDS** | Relational Database Service | AWS managed database resource type. |
| **GKE** | Google Kubernetes Engine | Comparison-only managed Kubernetes (this course uses **OpenShift**). |
| **OpenShift** | — | Instructor-hosted cluster (Projects + Routes). IaC sketches a Project, not a laptop CRC/k3s install. |
| **Project** | OpenShift Project | Isolation boundary (a Kubernetes Namespace plus quota/RBAC). Lab 42/44 runtime. |
| **GCS** | Google Cloud Storage | Google Cloud's remote-state backend option. |
| **ARM** | Azure Resource Manager | Azure's native IaC/deployment model, named alongside Terraform/CloudFormation/Pulumi. |

---

## Security & networking

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SSH** | Secure Shell | Encrypted protocol Ansible uses to connect to Linux/Unix managed nodes (port 22). |
| **WinRM** | Windows Remote Management | Protocol Ansible uses to connect to Windows managed nodes (port 5985/5986). |
| **TLS** | Transport Layer Security | Encrypts state/data in transit; also secures WinRM's HTTPS port. |
| **SSE-KMS** | Server-Side Encryption with Key Management Service | Encrypts Terraform state at rest in a remote backend. |
| **ARN** | Amazon Resource Name | Sensitive resource identifier stored inside Terraform state — a reason to secure state files. |
| **INI** | (traditional key=value config format) | Format used for a static Ansible inventory file (`[webservers]` sections). |
| **HTTP / HTTPS** | Hypertext Transfer Protocol (Secure) | WinRM's two connection ports: 5985 (HTTP) or the more secure 5986 (HTTPS). |

---

## Business & delivery context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM — the case-study app this module's Terraform/Ansible sketches provision infrastructure for. |
| **PII** | Personally Identifiable Information | Customer fixture data (Amina/Ravi) that must never appear in Terraform variables, Ansible inventory, or state. |
| **CI/CD** | Continuous Integration and Continuous Delivery | Later pipelines that will deploy onto the non-production environments provisioned in this module. |
| **SRE** | Site Reliability Engineering | Team commonly responsible for configuration management (Ansible) work. |

---

## One-line memory aid

> Focus first on: **IaC** · **Ansible** · **Terraform** · **Playbook** · **Inventory**.

---

**Related:** [Module 45 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
