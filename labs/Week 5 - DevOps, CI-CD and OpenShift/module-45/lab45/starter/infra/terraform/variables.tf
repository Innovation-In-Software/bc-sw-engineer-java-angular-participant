variable "environment" {
  type        = string
  description = "dev | staging | prod"
  # TODO(lab45): Add validation block for allowed values
}

variable "region" {
  type        = string
  description = "Cloud region"
  default     = "TODO(lab45)-region"
}

variable "db_password" {
  type        = string
  description = "Sensitive — supply via tfvars locally or secret store; never commit"
  sensitive   = true
  default     = ""
  # TODO(lab45): Remove default in real stacks; require input from secret manager
}
