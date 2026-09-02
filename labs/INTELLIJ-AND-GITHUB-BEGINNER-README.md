# IntelliJ + GitHub — beginner guide

**Audience:** Total beginners who have never used IntelliJ or GitHub for school/work  
**Goal:** Write Java in **IntelliJ IDEA Community**, then **commit** and **push** your work to **your** private GitHub repo  
**Time:** ~30–45 minutes after Lab 0 tools are installed  

This page is a **plain-language map**. Detailed install steps stay in Lab 0; the first real GitHub push is Lab 1 Step 0.

| Related guide | Use it when… |
| ------------- | ------------ |
| **[Clone + own repo](CLONE-AND-OWN-REPO-GUIDE.md)** | **Authoritative** clone handouts + create/commit/push your private `java-bootcamp` |
| **[Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md)** ([Windows](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) · [macOS](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md)) | Install IntelliJ, JDK 21, Maven, Git, and set Git identity |
| **[Lab 1 Step 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md)** | Create the private `java-bootcamp` repo and first push |
| **[IDE conventions](Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)** | Paths, SDK 21, terminal habits for every Week 1 lab |
| **[Which file do I open?](_PARTICIPANT-FILE-GUIDE.md)** | Lab guide vs exercises vs your code folder |

---

## 1. Words you need (30 seconds)

| Word | Meaning |
| ---- | ------- |
| **IntelliJ** | The program where you open folders, edit `.java` files, and click the green ▶ to run |
| **Workspace** | Your personal folder `java-bootcamp` — **all** graded code lives here under `examples/` |
| **Git** | Software on your laptop that tracks file changes (history of your work) |
| **Commit** | A saved snapshot on your laptop (“save point” with a short message) |
| **Push** | Upload your commits from the laptop to GitHub |
| **GitHub** | Website that stores your remote copy so instructors / you can see it online |
| **Repository (repo)** | One project’s Git history — locally a folder, remotely a GitHub page |

You do **not** need to memorize Git theory. Learn the four commands at the end of this guide and reuse them every lab.

---

## 2. Two folders — do not mix them

**Full clone + own-repo guide:** **[CLONE-AND-OWN-REPO-GUIDE.md](CLONE-AND-OWN-REPO-GUIDE.md)**

| Folder | What it is | What you do there |
| ------ | ---------- | ----------------- |
| Course clone (`TBD-java-angular-fullstack-participant` or instructor clone) | Lab **guides** and slides | **Read** steps in a browser or second window |
| **`java-bootcamp`** on your laptop | **Your** code | Open in IntelliJ; write `.java`; commit and push |

```text
Your laptop
├── …/TBD-java-angular-fullstack-participant/   ← READ lab guides (do not put practice homework here)
└── java-bootcamp/                       ← WRITE + RUN + PUSH your code
    ├── examples/                        ← HelloJava, exercises, labs, CRM later
    ├── notes/               ← evidence (stay on laptop — do not push)
    └── .gitignore                       ← tells Git what to skip
```

**Golden rule:** IntelliJ stays pointed at `java-bootcamp`. Keep the course README/GUIDE open in a browser tab.

| OS | Your code folder |
| -- | ---------------- |
| Windows | `%USERPROFILE%\java-bootcamp` (example: `C:\Users\<You>\java-bootcamp`) |
| macOS | `~/java-bootcamp` |

Create that folder in **Lab 0**. Do not invent a different root path.

---

## 3. Program in IntelliJ (everyday loop)

Do this after Lab 0 has installed IntelliJ and JDK 21.

### Open your workspace (once per day)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → select `java-bootcamp` (the folder itself, not only a subfolder).
3. Trust the project if prompted.
4. **File → Project Structure → Project** → **SDK = 21**, **Language level = 21**.

### Create a Java file

1. In the left **Project** tree, go to the folder the lab names (example: `examples/HelloJava/src` or `examples/module-02-exercises`).
2. Right-click the folder → **New → File** (or **New → Java Class** when the folder is a real package).
3. Name it exactly as the lab says, including `.java` when using **New → File** (example: `HelloWorld.java`).
4. Type or paste the code from the lab guide.
5. Save (**Ctrl+S** / **Cmd+S**).

**Week 1 tip:** For flat exercise folders with hyphens (like `module-02-exercises`), prefer **New → File** and ignore the yellow “outside of the module source root” banner. Do **not** mark those hyphenated folders as Sources Root unless the lab says so.

### Run your program

**Option A — green arrow (preferred when the lab allows it)**

1. Open the `.java` file that has `public static void main`.
2. Click the green ▶ in the gutter next to `main`, or right-click the class → **Run ‘…main()’**.
3. Read the output in the **Run** tool window at the bottom.

**Option B — Terminal (labs often ask for this as proof)**

1. **View → Tool Windows → Terminal**.
2. `cd` into the project folder the lab names.
3. Run the lab’s `javac` / `java` (or later `mvn`) commands.

**Windows PowerShell example (Lab 0 HelloJava):**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\HelloJava
javac -d out src\HelloJava.java
java -cp out HelloJava
```

**macOS example:**

```bash
cd ~/java-bootcamp/examples/HelloJava
javac -d out src/HelloJava.java
java -cp out HelloJava
```

**Expected:** console prints what the lab lists (Lab 0: `Hello Java Bootcamp!`).

### If IntelliJ cannot find Java

- Confirm Lab 0: `java -version` and `javac -version` show **21.x** in the IntelliJ terminal.
- **File → Project Structure → Project** → add / select **JDK 21** (Temurin / OpenJDK).
- Close and reopen the project if the SDK list is empty.

---

## 4. GitHub account + Git identity (Lab 0)

Do this in **Lab 0 Step 10** before any push.

1. Create or sign in at [https://github.com](https://github.com).
2. GitHub → **Settings → Emails** → enable **Keep my email addresses private**.
3. Copy your **noreply** address (looks like `12345678+yourusername@users.noreply.github.com`).
4. In IntelliJ **Terminal** (any folder):

```text
git config --global user.name "Your Name"
git config --global user.email "12345678+yourusername@users.noreply.github.com"
git config --global --list
git --version
```

**Expected:** `user.name` and `user.email` appear; `git --version` shows **2.x**.

Lab 0 only sets identity. It does **not** create your private code repo yet.

---

## 5. First time: create repo + first push (Lab 1 Step 0)

Do this once, when Lab 1 says **Step 0** (after Lab 0 and Module 1 exercises). Full commands: [LAB-1-GUIDE Step 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md).

### A. Create an empty private repo on GitHub

1. GitHub → **+** → **New repository**.
2. Name: `java-bootcamp`.
3. Visibility: **Private**.
4. **Do not** check “Add a README”, “Add .gitignore”, or “Choose a license” (leave the repo **empty**).
5. Click **Create repository**.

### B. Connect your laptop folder and push

From the **workspace root** (`java-bootcamp`), not a nested lab folder:

1. Add a `.gitignore` so screenshots, `.class` files, and secrets stay off GitHub (Lab 1 Step 0 has the exact file).
2. Run:

```text
git init
git add .
git status
git commit -m "Initial java-bootcamp workspace (Lab 1 Step 0)"
git branch -M main
git remote add origin https://github.com/<your-github-username>/java-bootcamp.git
git push -u origin main
```

Replace `<your-github-username>` with your GitHub username.

**Expected:**

- Terminal finishes without error.
- On GitHub, the private `java-bootcamp` repo shows `examples/` and `.gitignore`.
- `notes/` is **not** uploaded.

### C. Sign-in when Git asks for a password

GitHub **no longer accepts your account password** for `git push`. Use one of:

| Method | Beginner path |
| ------ | ------------- |
| **Personal Access Token (PAT)** | GitHub → **Settings → Developer settings → Personal access tokens** → create a token with `repo` scope → paste it when the terminal asks for a password |
| **GitHub CLI** | Install `gh`, run `gh auth login`, then push again |
| **Optional shortcut** | After `git commit`, `gh repo create java-bootcamp --private --source=. --remote=origin --push` |

Never paste tokens into lab notes, chat, or screenshots.

---

## 6. Every lab after that: commit and push

When a lab or exercise set is done, from **`java-bootcamp` root**:

**Windows PowerShell:**

```powershell
cd $env:USERPROFILE\java-bootcamp
git status
git add .
git status
git commit -m "Complete Lab N — short description"
git push
```

**macOS:**

```bash
cd ~/java-bootcamp
git status
git add .
git status
git commit -m "Complete Lab N — short description"
git push
```

| Command | What it does |
| ------- | ------------ |
| `git status` | Shows what changed (always look before commit) |
| `git add .` | Stages files for the next snapshot |
| `git commit -m "…"` | Saves the snapshot locally with a message |
| `git push` | Uploads new commits to GitHub |

**Do not commit:**

- `notes/` (local evidence only)
- `*.class`, `out/`, `.idea/` (build / IDE junk — covered by `.gitignore`)
- `.env`, kubeconfig files, passwords, tokens

If `git commit` says “nothing to commit”, you either already committed or nothing changed — that is fine. Still `git push` if you have local commits not yet on GitHub (`git status` will say you are ahead of `origin/main`).

---

## 7. Commit from IntelliJ’s Git UI (optional)

Terminal commands above are enough for the whole bootcamp. If you prefer clicks:

1. **View → Tool Windows → Commit** (or the **Git** tool window).
2. Check the files you want (confirm screenshots / secrets are **not** listed).
3. Type a commit message → **Commit**.
4. **Git → Push…** (or the Push button) → confirm `origin` / `main`.

Same rules: commit messages should say **what lab** you finished; never include secrets in messages.

---

## 8. Quick checks — “Am I set up?”

| Check | Command / action | Pass looks like |
| ----- | ---------------- | --------------- |
| JDK | `java -version` | `21.x` |
| Git | `git --version` | `2.x` |
| Identity | `git config --global --list` | `user.name` + noreply `user.email` |
| IntelliJ SDK | Project Structure → Project | SDK **21** |
| Remote | `git remote -v` (inside `java-bootcamp`) | `origin` → your `…/java-bootcamp.git` |
| GitHub | Browser → your private `java-bootcamp` | Latest files under `examples/` |

---

## 9. If it fails

| Symptom | Fix |
| ------- | --- |
| IntelliJ has no JDK / red errors on `String` | Lab 0 JDK install; set Project SDK **21**; reopen folder |
| `git: command not found` | Install Git ([git-scm.com](https://git-scm.com/)); restart IntelliJ |
| Push asks for password and fails | Use a **PAT** or `gh auth login` — not your GitHub login password |
| **GH007** / private email blocked | Lab 0 Step 10 with **noreply** email; make a new commit after fixing |
| `remote origin already exists` | You already linked the repo — run `git remote -v`, then `git push` |
| Wrong folder committed | Always `cd` to `java-bootcamp` root before `git add` / `commit` / `push` |
| Screenshots appeared on GitHub | Add/fix `.gitignore` (Lab 1 Step 0); do not force-add ignored files |
| Writing code inside the course clone | Move work into `java-bootcamp/examples/…`; keep guides read-only |

---

## 10. How this fits the bootcamp calendar

```text
Lab 0          Install IntelliJ + JDK + Git · set Git identity · run HelloJava
Module exercises  Practice in IntelliJ under examples/module-NN-exercises/
Lab 1 Step 0   Create private java-bootcamp on GitHub · first commit · first push
Every lab      Code in IntelliJ → git add → git commit → git push
Week 5+        Same habit; GitHub Actions may build what you pushed
```

**Next steps**

1. Finish **[Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md)** if you have not.  
2. Use this page while you practice create / run / commit.  
3. When Lab 1 opens, do **Step 0** for the first push, then keep the Section 6 habit forever.
