# Lab 30: Event-Driven Architecture with Kafka — Northstar CRM Topics — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Node 22 (Angular labs later) · shared Kafka from Week 4 · IntelliJ  
**Full lab steps:** [LAB-30-GUIDE.md](LAB-30-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-30-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab30-crm` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\lab30-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab30-crm
docker compose
```

**Docker engine (verified 2026-08-11):** Docker Desktop UI/processes can start without the engine. If `docker version` says `open //./pipe/docker_engine` and `com.docker.service` is **Stopped**, `net start com.docker.service` needs an **elevated** PowerShell (error 5 Access is denied from a non-elevated shell). Starting `wsl -d docker-desktop` alone does **not** create the named pipe. After the service is Running, retry `docker compose up -d` from `examples/lab30-crm`.

**WSL drive missing (verified 2026-08-11):** Desktop dialog *“The Docker Desktop WSL data distro is registered with WSL, but its drive seems to be missing.”* Official recovery: `wsl --unregister docker-desktop-data`, then start Docker Desktop (recreates the data distro; **deletes existing containers/images/volumes**). After that, `wsl -l -v` showed both `docker-desktop` and `docker-desktop-data` **Running**, and `docker version` reported Engine **24.0.7**. Then `docker compose up -d` pulled `apache/kafka:3.9.1` and bound `0.0.0.0:9092->9092/tcp`.

**PowerShell Maven:** quote the exec property: `mvn -B -q exec:java "-Dexec.mainClass=com.northstar.crm.event.CustomerEventProducer"` — unquoted `-Dexec.mainClass=…` is parsed as a lifecycle phase.


## Do the lab

Complete every step in **[LAB-30-GUIDE.md](LAB-30-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab30-crm` as in [LAB-30-GUIDE.md](LAB-30-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
