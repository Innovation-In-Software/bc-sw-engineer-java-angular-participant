# Lab 0: Development Environment Setup

> **Java & Angular Fullstack Bootcamp.** Shared services from Week 4 onward are **Oracle Database**, **Apache Kafka**, and **OpenShift** (not PostgreSQL / k3s). CI/CD is **GitHub Actions**. See [FINAL-SETUP-README.md](../../../FINAL-SETUP-README.md).

**Module:** Pre-course  
**Lab folder:** `labs/Week 1 - Java and JVM Foundations/module-00/lab0/`  
**Difficulty:** Beginner  
**Duration:** ~45 minutes (timed path with starter checklist) · Full path: 60–90 minutes (+ Docker Desktop Step 11 if not already installed)

**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code (if you already prefer it)

---

## 45-minute timed path (essential setup)

In class, use the starter checklist so the **essential** tools fit **~45 minutes**. The OS how-tos remain the full install path (optional VS Code, Docker Desktop Step 11, deeper troubleshooting).

1. Open [`starter/README.md`](starter/README.md).
2. Follow the checklist while working in [LAB-0-WINDOWS.md](LAB-0-WINDOWS.md) or [LAB-0-MACOS.md](LAB-0-MACOS.md) — JDK 21, Maven, IntelliJ, `java-bootcamp`, HelloJava smoke.
3. Skip optional VS Code unless you already use it. Skip **Docker Desktop (Step 11)** in class if the download would blow the 45 minutes — finish it as homework before Week 4.
4. Commit your work to your GitHub repo (no screenshots).
5. Continue remaining OS-guide steps on the **full path** if anything is incomplete.

| Path | Time | Scope |
| ---- | ---- | ----- |
| **Timed (default)** | ~45 min | Essential subset in [`starter/README.md`](starter/README.md) |
| **Full (extended)** | 60–90 min (+ Docker download) | Every Step in your OS how-to, including Docker Desktop Step 11 |

Policy: [`labs/_STARTER-PATH.md`](../../../_STARTER-PATH.md)

---

## Choose your operating system

| OS | Guide |
| -- | ----- |
| **Windows 10 / 11** | **[LAB-0-WINDOWS.md](LAB-0-WINDOWS.md)** |
| **macOS** | **[LAB-0-MACOS.md](LAB-0-MACOS.md)** |

Shared IDE habits after setup: [`../_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)  
Shared services (Week 4+): [`../../../FINAL-SETUP-README.md`](../../../FINAL-SETUP-README.md)

---

## What success looks like

- IntelliJ opens `java-bootcamp` with Project SDK **21**
- `java` / `javac` / `mvn` / `git` work in the IntelliJ terminal
- `Hello Java Bootcamp!` runs from the terminal **and** the IntelliJ green arrow
- Git identity is set (Lab 0 Step 10); your **personal** `java-bootcamp` GitHub repo is created later in **Lab 1 Step 0**
- (Optional) Same workspace opens in VS Code if you use it
- Docker Desktop (or Engine) is installed — Lab 0 Step 11; `docker version` shows **Server** before Week 4

**Do not start Lab 1 until your OS guide Before Lab 1 checklist passes.** Finish Docker before Week 4.

Next: [Lab 1](../../module-01/lab1/LAB-1-GUIDE.md) · [Lab 1 Windows](../../module-01/lab1/LAB-1-WINDOWS.md) · [Lab 1 macOS](../../module-01/lab1/LAB-1-MACOS.md) · [Module 1 pre-lab exercises](../../module-01/exercises/EXERCISES-INDEX.md)
