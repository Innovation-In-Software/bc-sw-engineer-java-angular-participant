# Exercise 2 — OpenShift Project and Route

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** |
| **Deliverable** | `notes/lab42-project-and-route.md` |

### What you will learn

Project isolation vs a Kubernetes namespace story; Route vs Ingress.

### Enterprise context

This course’s runtime is **instructor-hosted OpenShift**. Do not install k3s/k3d/CRC on the laptop.

### Predict

Route 503 while `oc get pods` shows Running — what else must be Ready?

### Debug

Confusing Route with Service → Service is cluster DNS; Route is external HTTP(S).

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-project-and-route.md`

## Worked example

```markdown
# Lab 42 — Project and Route

- Project: `lab42-crm` (or instructor `lab42-<id>`).
- Login: `oc login` — token never in Git.
- Route `crm-api` → Service `crm-api` port `http`.
- Ingress/Traefik/k3d is **not** the Lab 42 deliverable.
```

## Steps

1. Create the notes file.
2. Write Project name + who may `oc apply`.
3. One sentence: why a Route is not a Service.
4. Record that live apply waits for instructor access if you have none yet.
