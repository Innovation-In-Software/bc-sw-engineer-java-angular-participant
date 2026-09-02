# Exercise 5 — Rolling update and self-healing

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **C** |
| **Deliverable** | `notes/lab42-rolling-self-heal.md` |

### What you will learn

RollingUpdate vs a blue-green *idea*; what a liveness failure does.

### Predict

`replicas: 1` and maxUnavailable 0 — can a rolling update proceed?

### Debug

ImagePullBackOff after a bad tag — rollout never healthy.

**Module 42** · [setup + file names](EXERCISES-INDEX.md)

## Files to create (practice — commit to GitHub)

`examples/module-42-exercises/notes/lab42-rolling-self-heal.md`

## Worked example

```markdown
# Lab 42 — Rolling / self-heal

- RollingUpdate: new ReplicaSet, probes gate Ready.
- Blue-green: two Deployments + Route switch (concept; not required to implement).
- Self-heal: liveness fail → kubelet restarts the container; Deployment recreates missing Pods.
```

## Steps

1. Create the notes file.
2. One paragraph rolling vs blue-green (concept only).
3. One sentence on liveness vs a human restart.
4. Note Lab 42 uses `replicas: 1` unless the instructor raises it.
