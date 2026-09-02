# Terraform checks

1. terraform fmt
2. terraform init (-backend=false if needed)
3. terraform validate
4. terraform plan (read before apply)
5. Never commit: *.tfstate, real tfvars, keys
