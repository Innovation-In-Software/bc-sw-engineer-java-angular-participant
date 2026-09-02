# Module 48 — Pre-Lab Exercises

> **Start here for Module 48:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 48 — Capstone Planning and Architecture  
**Next:** [`../lab48/LAB-48-WINDOWS.md`](../lab48/LAB-48-WINDOWS.md) or [`../lab48/LAB-48-MACOS.md`](../lab48/LAB-48-MACOS.md) → [`../lab48/LAB-48-GUIDE.md`](../lab48/LAB-48-GUIDE.md)

> Complete these exercises after the slides and before Lab 48.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 48 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Outline context and container diagrams | Do not implement CAP-12 in this pre-lab (Lab 49) |
| Draft measurable NFR placeholders | Do not invent Bitbucket/k3s as the delivery path |
| Sketch vertical backlog stories | Do not skip measurable NFRs |
| List ADR topics including OpenShift + Actions | Do not commit cluster credentials |
| Prepare docs/ folder checklist | Do not treat React/SOAP/Oracle as the taught stack |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-48-exercises` | `~/java-bootcamp/examples/module-48-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-48-exercises | Out-Null
cd examples\module-48-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-48-exercises
cd examples/module-48-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Sketch Context Diagram | C4 context warmup | [`exercise-01-context-sketch.md`](exercise-01-context-sketch.md) |
| 2 | Draft Measurable NFRs | NFR measurability | [`exercise-02-nfr-placeholders.md`](exercise-02-nfr-placeholders.md) |
| 3 | Sketch Vertical Stories | Backlog slicing | [`exercise-03-backlog-slice.md`](exercise-03-backlog-slice.md) |
| 4 | Fill ADR Topic TODOs | Decision shortlist | [`exercise-04-adr-todos.md`](exercise-04-adr-todos.md) |
| 5 | Outline Risk Register | Risk ownership | [`exercise-05-risk-register.md`](exercise-05-risk-register.md) |
| 6 | Planning Docs Checklist | Evidence gate warmup | [`exercise-06-docs-checklist.md`](exercise-06-docs-checklist.md) |

Keep all work separate from `examples/lab48-crm` (or the lab’s named project folder); that project begins in the full lab.
