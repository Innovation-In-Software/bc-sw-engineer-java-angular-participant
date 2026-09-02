# Exercise 4 — ConfigMap vs Secret

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** |
| **Deliverable** | `notes/lab42-configmap-secret.md` |

### What you will learn

Which CRM settings are ConfigMap vs Secret; how Secrets are created (`oc create secret`).

### Predict

Baking `CRM_DB_PASSWORD` into Deployment `env:` — which lab gate fails?

### Debug

CrashLoop with Flyway auth error — Secret key name mismatch with `application.yml`.

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-configmap-secret.md`

## Worked example

```markdown
# Lab 42 — ConfigMap / Secret

ConfigMap: `CRM_DB_HOST`, `CRM_DB_NAME`, `CRM_DB_USER`, probe flags.
Secret: `CRM_DB_PASSWORD` via `oc create secret generic` — empty example YAML only in Git.
```

## Steps

1. Create the notes file.
2. List at least four ConfigMap keys and one Secret key.
3. Write the `oc create secret` shape **without** a real password.
4. State you will never commit kubeconfig.
