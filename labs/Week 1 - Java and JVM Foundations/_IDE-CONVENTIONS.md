# Week 1 IDE conventions (IntelliJ + optional VS Code)

Use these paths and commands in every Week 1 lab. Everything in Week 1 runs on your **laptop**.

**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code (if you already prefer it)

**Never used IntelliJ or GitHub?** Read the plain-language **[IntelliJ + GitHub — beginner guide](../INTELLIJ-AND-GITHUB-BEGINNER-README.md)** first (open project → run Java → commit → push), then use this page as the Week 1 path/command cheat sheet.

Cohort shared services (**Oracle Database**, Kafka, OpenShift) are documented in [`../FINAL-SETUP-README.md`](../FINAL-SETUP-README.md) and are **not required until Week 4+**. CI/CD later in the course is **GitHub Actions**.

## Workspace

| OS | Path |
| -- | ---- |
| Windows | `%USERPROFILE%\java-bootcamp` (example: `C:\Users\<you>\java-bootcamp`) |
| macOS | `~/java-bootcamp` |

Hands-on projects live under: `java-bootcamp/examples/` (Lab 0 `HelloJava`, then `jvm-compilation-lab`, `Lab2-JavaSyntax`, …, `labN-crm`, then `customer-management-platform`).  
Evidence for every lab: `java-bootcamp/notes/lab-N/` (Lab 0 uses `notes/` at the workspace root). Do **not** create a top-level `labs/` folder inside `java-bootcamp`.

OS-specific Lab 0 setup:

- Windows → [`module-00/lab0/LAB-0-WINDOWS.md`](module-00/lab0/LAB-0-WINDOWS.md)
- macOS → [`module-00/lab0/LAB-0-MACOS.md`](module-00/lab0/LAB-0-MACOS.md)

## Choose an IDE

### IntelliJ IDEA Community (primary)

1. **File → Open…** → open `java-bootcamp` (Lab 0 workspace root — same folder every lab). Work inside `examples/<project>`.
2. Trust the project if prompted.
3. **File → Project Structure → Project** → SDK = **21** (Temurin / OpenJDK 21); Language level = **21**.
4. Mark `src` as **Sources Root** when the lab uses a `src/` tree (right-click `src` → **Mark Directory as → Sources Root**).
5. Right-click a class with `main` → **Run ‘ClassName.main()’**, or use the green gutter arrow next to `main`. Set **Working directory** to `examples/<project>` when the lab reads relative files.
6. Use the IntelliJ terminal (**View → Tool Windows → Terminal**) for `javac` / `java` / `mvn` when a lab asks for CLI proof (`cd` into `examples/<project>` first).

### VS Code (optional)

1. **File → Open Folder…** → select `java-bootcamp` (or the lab’s project folder).
2. Confirm **Extension Pack for Java** is installed.
3. Open the integrated terminal: **Terminal → New Terminal**.
4. Run `javac` / `java` from that terminal in the project directory.

## Compile and run (terminal — both IDEs)

**Windows PowerShell** and **macOS Terminal** use the same `javac` / `java` once you `cd` into the project folder.

```text
# Packaged labs (Lab 2+)
javac -d out src/com/academy/.../*.java
java -cp out com.academy....Main

# Flat labs (Lab 1 / Lab 4 demos)
javac MyClass.java
java MyClass
```

| | Windows PowerShell | macOS |
| - | ------------------ | ----- |
| Go home workspace | `cd $env:USERPROFILE\java-bootcamp` | `cd ~/java-bootcamp` |
| List files | `Get-ChildItem` / `dir` | `ls` |
| Classpath separator | `;` (rare) or keep `-cp out` | `:` if combining jars |

## Per-lab OS guides

Each Week 1 lab folder includes:

| File | Use when |
| ---- | -------- |
| `LAB-N-GUIDE.md` | Full lab content (platform-neutral steps) |
| `LAB-N-WINDOWS.md` | Windows + IntelliJ (primary) how-to for that lab |
| `LAB-N-MACOS.md` | macOS + IntelliJ (primary) how-to for that lab |

## Diagram legend used in lab guides

```mermaid
flowchart LR
  A[Write .java source] --> B[javac compiles to .class]
  B --> C[java runs on the JVM]
```

## After Week 1

When labs need the shared host (`100.22.136.97`), use credentials from the instructor pack and follow [FINAL-SETUP-README.md](../FINAL-SETUP-README.md).
