terraform {
  required_version = ">= 1.5.0"
  required_providers {
    # TODO(lab45): Pin exact versions; replace null with your cloud provider when authorized
    null = {
      source  = "hashicorp/null"
      version = "~> 3.2"
    }
  }
  # TODO(lab45): Document remote state backend narrative — never commit state files
  # backend "s3" { … }  # credentials via env / OIDC, not Git
}
