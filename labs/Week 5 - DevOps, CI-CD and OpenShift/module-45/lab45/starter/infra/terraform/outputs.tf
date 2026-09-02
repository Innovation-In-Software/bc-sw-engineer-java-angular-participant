output "environment" {
  value = var.environment
}

output "region" {
  value = var.region
}

# TODO(lab45): Output non-secret endpoints only (no passwords). Sketch an OpenShift Route hostname, not localhost.
