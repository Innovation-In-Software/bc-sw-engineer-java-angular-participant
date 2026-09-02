# Lab 44: Continuous Delivery and Environment Promotion — Northstar Release Path — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · GitHub Actions CD · OpenShift `oc` · Lab 43 digest · IntelliJ  
**Full lab steps:** [LAB-44-GUIDE.md](LAB-44-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-44-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- Lab 43 package-once SHA-256 / digest notes available
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab44-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab44-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab44-crm
Get-Content artifact-manifest.json | ConvertFrom-Json | Out-Null
Select-String -Path .github\workflows\cd.yml -Pattern 'workflow_dispatch|artifact_digest|oc set image'
```

Verified on this laptop (2026-08-28): **no local OpenShift** (course rule — instructor-hosted Project). `oc` is not on PATH. Timed-path Pass is JSON + CD workflow lint + docs. Live `oc set image` / Route smoke is homework on the shared cluster. Do **not** rebuild with `mvn package` on the deploy agent. Do **not** substitute k3s/k3d/Ingress/`kubectl`.

Lab 43 JAR SHA-256 used in the answer-key manifest: `4B2E02E7E59C5A1648240A2C7672B2BE7E9177F338F6B2FD2A8E41168A8804DD`.

## Do the lab

Complete every step in **[LAB-44-GUIDE.md](LAB-44-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab44-crm` as in [LAB-44-GUIDE.md](LAB-44-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
