# Exercise 1 — Pod, Service, Deployment for CRM

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** |
| **Deliverable** | `notes/lab42-pod-service-deployment.md` |
| **Fixtures** | `CUS-1001` is app data — not a Kubernetes object |

### What you will learn

Name what restarts the CRM, what gives it a stable DNS name, and what is one running process.

### Enterprise context

“SSH into the Pod and edit files” is not how Ops runs Spring Boot.

### Predict

If you create two extra Pods by hand, who owns desired replica count?

### Debug

Service has no Endpoints — label mismatch with the Pod?

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-pod-service-deployment.md`

## Worked example

```markdown
# Lab 42 — Pod / Service / Deployment

| Object | CRM meaning |
| --- | --- |
| Pod | One `crm-api` container, UID 10001, port 8080 |
| Deployment | Desired replicas + rolling update for that Pod template |
| Service | ClusterIP DNS selecting `app: crm-api` |

Angular later uses the **Route**, which targets the Service — not `localhost`.
```

## Steps

1. Create the notes file under `examples/module-42-exercises/notes/`.
2. Fill the three-row table in your own words.
3. One sentence: Deployment vs raw Pod.
4. Scope line: pre-lab only — manifests are Lab 42.
