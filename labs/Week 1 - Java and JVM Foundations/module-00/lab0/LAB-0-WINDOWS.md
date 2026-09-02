# Lab 0: Development Environment Setup — Windows

**OS:** Windows 10 / 11  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code (if you already prefer it)  
**Lab folder:** `labs/Week 1 - Java and JVM Foundations/module-00/lab0/`  
**Also see:** [LAB-0-GUIDE.md](LAB-0-GUIDE.md) (overview) · [macOS guide](LAB-0-MACOS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

> Install tools on **your Windows laptop**. Shared cloud services are not needed until Week 4+.

---

## What you install

| Tool | Target |
| ---- | ------ |
| IntelliJ IDEA Community | Latest stable (primary) |
| VS Code (optional) | Latest stable + Extension Pack for Java |
| Temurin OpenJDK | **21** LTS |
| Maven | **3.9.x** |
| Git | 2.x |

**Verified reference layout:** Temurin 21 at `C:\Program Files\Eclipse Adoptium\jdk-21`; Maven at `C:\Program Files\Apache\maven\current`; workspace `%USERPROFILE%\java-bootcamp`.

---

## Steps

### Step 1 — Install IntelliJ IDEA Community (primary)

1. Download **Community Edition**: [jetbrains.com/idea/download](https://www.jetbrains.com/idea/download/) (Windows).
2. Run the installer. Prefer options that add a desktop/Start menu shortcut.
3. Launch IntelliJ once and finish the first-run wizard.

**Expected:** Welcome screen opens.

### Step 2 — Optional: Install VS Code

Only if you already prefer VS Code:

1. Install from [code.visualstudio.com](https://code.visualstudio.com/).
2. Extensions: **Extension Pack for Java** (`vscjava.vscode-java-pack`).

### Step 3 — Install Temurin JDK 21 and set `JAVA_HOME`

1. Download Temurin 21 **JDK** Windows x64 **MSI**: [Adoptium Temurin 21](https://adoptium.net/temurin/releases/?version=21&os=windows&arch=x64&package=jdk).
2. Run the MSI as Administrator. Typical path: `C:\Program Files\Eclipse Adoptium\jdk-21`.
3. Set **system** environment variables (Win + R → `sysdm.cpl` → Advanced → Environment Variables):
   - `JAVA_HOME` = that JDK folder
   - Prefixed Path entry: `%JAVA_HOME%\bin`
4. Remove other JDKs from Path if present.
5. Open a **new** PowerShell window.

```powershell
java -version
javac -version
echo $env:JAVA_HOME
```

**Expected:** Versions show `21.x.x` (Temurin / Eclipse Adoptium). Verified on authoring PC: Temurin `21.0.11`, `JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-21`.

**If it fails — “This environment variable is too large” (2047 chars):** the Windows GUI cannot edit a Path longer than 2047 characters. Click **Cancel** (do not OK). Prefer PowerShell as Administrator to trim duplicates / user-folder entries from the **System** Path, or move rarely used tools to the **User** Path. Do not use `setx` for Path (it truncates). Confirm with `java -version` and `echo $env:JAVA_HOME` in a **new** terminal after changes.

### Step 4 — Install Maven 3.9.x and Git

**Git:** install from [git-scm.com](https://git-scm.com/) if `git --version` fails.

**Maven:**

1. Download `apache-maven-3.9.x-bin.zip` from [Maven download](https://maven.apache.org/download.cgi) or [archive.apache.org](https://archive.apache.org/dist/maven/maven-3/).
2. Extract to `C:\Program Files\Apache\maven\apache-maven-3.9.x`.
3. Create junction `C:\Program Files\Apache\maven\current` → that folder (optional but recommended).
4. System env: `MAVEN_HOME` = `C:\Program Files\Apache\maven\current`; add `%MAVEN_HOME%\bin` to Path.
5. New PowerShell:

```powershell
mvn -version
git --version
```

**Expected:** Maven **3.9.x** reporting Java **21**.

### Step 5 — Create `java-bootcamp` workspace

**Where to run this:** Open a **new Windows PowerShell** window from the Start menu (or Win + X → **Windows Terminal** / **Terminal**). Do **not** use IntelliJ’s terminal yet — that comes in Step 6 after you open the folder. You can start from any directory; the commands create `%USERPROFILE%\java-bootcamp` under your user home (for example `C:\Users\<You>\java-bootcamp`).

This layout matches what you use in every later lab: hands-on code under `examples\`, Lab 0 evidence under `notes\`. (Do **not** create a top-level `labs\` here — course lab guides live in the bootcamp GitHub clone, not in this workspace.)

```powershell
$root = Join-Path $env:USERPROFILE 'java-bootcamp'
New-Item -ItemType Directory -Force -Path @(
  "$root\examples",
  "$root\notes"
) | Out-Null
cd $root
Get-ChildItem
Get-ChildItem notes
```

**Expected:**

```text
java-bootcamp\
  examples\            # HelloJava next; later labs: jvm-compilation-lab, Lab2-JavaSyntax, …, labN-crm, then customer-management-platform, …
  notes\
                       # commit practice work to GitHub (no screenshots)
```

### Step 6 — Open workspace in IntelliJ

1. **File → Open…** → `%USERPROFILE%\java-bootcamp`.
2. Trust the project if prompted.
3. **File → Project Structure → Project** → SDK **21**, language level **21**.
4. **View → Tool Windows → Terminal** → confirm `java -version`.

**Optional VS Code:** File → Open Folder… → same path; Terminal → New Terminal.

### Step 7 — HelloJava sources

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\HelloJava\src, examples\HelloJava\out | Out-Null
```

Create `examples\HelloJava\src\HelloJava.java`:

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java Bootcamp!");
    }
}
```

### Step 8 — Run from IntelliJ terminal

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\HelloJava
javac -d out src\HelloJava.java
java -cp out HelloJava
```

**Expected:**

```text
Hello Java Bootcamp!
```

### Step 9 — Run with IntelliJ green arrow

1. Open `HelloJava.java`.
2. Right-click `src` → **Mark Directory as → Sources Root** if needed.
3. Green ▶ beside `main` → **Run ‘HelloJava.main()’**.

### Step 10 — GitHub + git identity

1. Create or sign in at [github.com](https://github.com).
2. Set Git to your **display name** and your GitHub **noreply email** (recommended — avoids push errors if your personal email is private on GitHub).

**Find your noreply email:** GitHub → **Settings** → **Emails** → enable **Keep my email addresses private** → copy the address shown, e.g. `{id}+{username}@users.noreply.github.com`.

```powershell
git config --global user.name "Your Name"
git config --global user.email "12345678+yourusername@users.noreply.github.com"
git config --global --list
git --version
```

**Expected:** `user.name` and `user.email` appear in the list; `git --version` shows **2.x**.

**If push fails later with GH007 (“private email address”):** your commit used a personal `@gmail.com` (or similar) address. Re-run Step 10 with the **noreply** email from GitHub Settings → Emails, or disable “Block command line pushes that expose my email” on that same page.

**Personal workspace GitHub repo:** you create and first-commit `%USERPROFILE%\java-bootcamp` in **[Lab 1 Step 0](../../module-01/lab1/LAB-1-GUIDE.md)** — not in Lab 0. Lab 0 only prepares Git identity.

---

## Pass criteria (Windows)

```powershell
java -version
javac -version
mvn -version
git --version
echo $env:JAVA_HOME
cd $env:USERPROFILE\java-bootcamp
Get-Location
```

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Java / javac 21 (Temurin) | Pass / Fail |
| 2 | Maven 3.9.x on Java 21 | Pass / Fail |
| 3 | Git works; `user.name` / `user.email` set | Pass / Fail |
| 4 | `JAVA_HOME` points at Temurin 21 | Pass / Fail |
| 5 | Workspace `%USERPROFILE%\java-bootcamp` with `examples\` and `notes\` | Pass / Fail |
| 6 | HelloJava prints `Hello Java Bootcamp!` from terminal | Pass / Fail |
| 7 | HelloJava runs via IntelliJ green arrow | Pass / Fail |
| 8 | (Optional) VS Code opens the same folder | Pass / Fail |

**Do not start Lab 1 until every Pass criteria row is Pass — check yourself, do not write it down.**

Next: [Lab 1 Windows guide](../../module-01/lab1/LAB-1-WINDOWS.md) · [Lab 1 full guide](../../module-01/lab1/LAB-1-GUIDE.md)
