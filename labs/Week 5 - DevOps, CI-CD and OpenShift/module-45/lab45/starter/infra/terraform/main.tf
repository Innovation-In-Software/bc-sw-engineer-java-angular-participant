# Lab 45 — CRM infra sketch (safe local validate without cloud apply)
# TODO(lab45): Replace null resources with VPC/DB/OpenShift Project when sandbox allows.
# FORBIDDEN: publicly reachable database, hardcoded passwords, open 0.0.0.0/0 SSH.
# Do not install CRC/k3s on the laptop.

locals {
  tags = {
    application = "crm"
    environment = var.environment
    managed_by  = "terraform"
    # TODO(lab45): cost-center / student id tags per instructor
  }
}

resource "null_resource" "crm_stack_sketch" {
  triggers = {
    environment = var.environment
    region      = var.region
  }
  # TODO(lab45): Add provisioner-free documentation that real DB must be private subnet only
}

output "sketch_note" {
  value = "TODO(lab45): Replace null_resource with real modules after human threat review"
}
