# Lab 0 starter — 45-minute setup checklist

**Theme:** Laptop environment only (JDK, Maven, IntelliJ, `java-bootcamp`, smoke).  
**No large code project** — this folder is a timed checklist pointer, not an app scaffold.

Open your OS how-to and work through the **essential** subset below. Full install steps (optional VS Code, deep troubleshooting) stay in the OS guides.

| OS | Full how-to |
| -- | ----------- |
| **Windows 10 / 11** | [LAB-0-WINDOWS.md](../LAB-0-WINDOWS.md) |
| **macOS** | [LAB-0-MACOS.md](../LAB-0-MACOS.md) |

Overview: [LAB-0-GUIDE.md](../LAB-0-GUIDE.md) · Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

## Copy target (workspace only)

Lab 0 creates your personal tree — do **not** keep your only copy inside the course `labs/` clone.

**Windows (PowerShell):**

```powershell
# Created by OS guide Step 5 — confirm it exists:
Test-Path "$env:USERPROFILE\java-bootcamp\examples"
Test-Path "$env:USERPROFILE\java-bootcamp\notes"
```

**macOS / Linux:**

```bash
ls ~/java-bootcamp/examples
ls ~/java-bootcamp/notes
```

## 45-minute checklist (essential subset)

Follow the matching steps in your OS how-to; skip optional VS Code unless you already use it.

- [ ] **JDK 21** installed; `java -version` / `javac -version` show 21.x; `JAVA_HOME` set
- [ ] **Maven 3.9.x** + **Git** on PATH (`mvn -version`, `git --version`)
- [ ] **IntelliJ IDEA Community** installed and launched once
- [ ] **`java-bootcamp`** folder with `examples/` and `notes/`
- [ ] Workspace opened in IntelliJ with Project SDK **21**
- [ ] **HelloJava** smoke: terminal **and** IntelliJ green arrow print `Hello Java Bootcamp!`
- [ ] Git identity set (`user.name` / `user.email`) — personal GitHub repo comes in Lab 1 Step 0

## Smoke test

**Windows (PowerShell):**

```powershell
java -version
javac -version
mvn -version
git --version
echo $env:JAVA_HOME
cd $env:USERPROFILE\java-bootcamp
Get-Location
```

**macOS / Linux:**

```bash
java -version
javac -version
mvn -version
git --version
echo "$JAVA_HOME"
cd ~/java-bootcamp && pwd
```

Then run the HelloJava steps from your OS guide (terminal + green arrow).

Evidence under `~/java-bootcamp/notes/` (Windows: `%USERPROFILE%\java-bootcamp\notes\`). Redact secrets.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Java / javac 21 (Temurin) | Pass / Fail |
| Maven 3.9.x on Java 21 | Pass / Fail |
| `JAVA_HOME` points at JDK 21 | Pass / Fail |
| `java-bootcamp` with `examples/` + `notes/` | Pass / Fail |
| HelloJava prints `Hello Java Bootcamp!` from terminal | Pass / Fail |
| HelloJava runs via IntelliJ green arrow | Pass / Fail |
| Git identity set | Pass / Fail |

**Do not start Lab 1** until every row is Pass — check yourself, do not write it down.

Continue remaining OS-guide steps (optional VS Code, extra troubleshooting) on the **full path** if needed.
