# Module 0 — Pre-Lab Exercises

> **Start here for Module 0:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 0 — Development Environment Setup  
**Next:** [`../lab0/LAB-0-WINDOWS.md`](../lab0/LAB-0-WINDOWS.md) or [`../lab0/LAB-0-MACOS.md`](../lab0/LAB-0-MACOS.md) → [`../lab0/LAB-0-GUIDE.md`](../lab0/LAB-0-GUIDE.md)

> Complete these exercises after the slides and before Lab 0.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 0 builds the full graded deliverable.  

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Inventory JDK 21, Maven, Git, IntelliJ, optional Docker/Node | Do not start Lab 1 JVM exercises yet |
| Plan the `java-bootcamp` workspace folders | Do not install OpenShift/CRC/k3s on the laptop |
| Record Git identity without pasting tokens | Do not treat Oracle as the taught database |
| Plan IntelliJ SDK 21 + HelloJava smoke | Do not commit secrets or `.env` files |
| Name screenshot evidence folder for Lab 0 | Do not skip the HelloJava smoke in Lab 0 |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-00-exercises` | `~/java-bootcamp/examples/module-00-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-00-exercises | Out-Null
cd examples\module-00-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-00-exercises
cd examples/module-00-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Tool Inventory | Confirm laptop toolchain | [`exercise-01-tool-inventory.md`](exercise-01-tool-inventory.md) |
| 2 | Workspace Folder Plan | Separate guides from student work | [`exercise-02-workspace-plan.md`](exercise-02-workspace-plan.md) |
| 3 | JDK 21 Confirm Notes | Pin the runtime | [`exercise-03-jdk21-confirm.md`](exercise-03-jdk21-confirm.md) |
| 4 | Git and Maven Hygiene | Identity without secrets | [`exercise-04-git-maven-hygiene.md`](exercise-04-git-maven-hygiene.md) |
| 5 | HelloJava Smoke Plan | First compile/run | [`exercise-05-hellojava-plan.md`](exercise-05-hellojava-plan.md) |
| 6 | Lab 0 Readiness Checklist | Gate before Module 1 | [`exercise-06-lab0-readiness.md`](exercise-06-lab0-readiness.md) |

Keep all work separate from `examples/lab0-crm` (or the lab’s named project folder); that project begins in the full lab.
