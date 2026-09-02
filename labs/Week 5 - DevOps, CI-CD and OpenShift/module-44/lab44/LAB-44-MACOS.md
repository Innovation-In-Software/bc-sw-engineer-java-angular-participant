# Lab 44: Continuous Delivery and Environment Promotion — Northstar Release Path — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · GitHub Actions CD · OpenShift `oc` · Lab 43 digest · IntelliJ  
**Full lab steps:** [LAB-44-GUIDE.md](LAB-44-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-44-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- Lab 43 package-once SHA-256 / digest notes available
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab44-crm` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples/lab44-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab44-crm
python3 -c "import json; json.load(open('artifact-manifest.json'))"
grep -E 'workflow_dispatch|artifact_digest|oc set image' .github/workflows/cd.yml
```

No local OpenShift. Timed-path Pass is JSON + CD workflow lint + docs. Do **not** rebuild with `mvn package` on the deploy agent. Do **not** substitute k3s/`kubectl`. Live `oc` promote is homework on the instructor-hosted Project.

## Do the lab

Complete every step in **[LAB-44-GUIDE.md](LAB-44-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab44-crm` as in [LAB-44-GUIDE.md](LAB-44-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
