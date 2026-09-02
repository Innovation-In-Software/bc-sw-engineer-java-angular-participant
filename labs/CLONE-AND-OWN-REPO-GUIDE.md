# Clone the course repo · Commit in your own repo

**Audience:** Every participant  
**Goal:** Keep **handouts** and **your practice code** in two separate places — clone the course once, then commit and push only to **your** private GitHub repo  
**Time:** ~20 minutes the first time (after Lab 0 Git identity); ~1 minute every lab after that  

| Related guide | Use it when… |
| ------------- | ------------ |
| **[Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md)** | Install Git, JDK 21, IntelliJ; set `user.name` / noreply email |
| **[Lab 1 Step 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md)** | First create of private `java-bootcamp` + first push (full `.gitignore`) |
| **[IntelliJ + GitHub — beginner guide](INTELLIJ-AND-GITHUB-BEGINNER-README.md)** | IDE open / run / Commit UI details |
| **[Which file do I open?](_PARTICIPANT-FILE-GUIDE.md)** | GUIDE vs exercises vs starter sequence |

---

> **Golden rule (read once):** Course clone = READ. Your `java-bootcamp` GitHub repo = WRITE / COMMIT. Nothing is submitted or graded. Do not take screenshots.

```text
Course clone  = READ guides and slides   →  do NOT put practice homework here
java-bootcamp = WRITE / RUN / COMMIT     →  YOUR private GitHub repo only
```

| Folder on your laptop | Remote on GitHub | You… |
| --------------------- | ---------------- | ---- |
| `TBD-java-angular-fullstack-participant` | [Innovation-In-Software/TBD-java-angular-fullstack-participant](https://github.com/Innovation-In-Software/TBD-java-angular-fullstack-participant) | **Clone** once · **pull** when instructors publish updates · **never** push homework here |
| `java-bootcamp` | `https://github.com/<you>/java-bootcamp` (**private**, you create it) | **Write** all exercises + labs · **commit** · **push** every time you finish work |

Keep your practice work in **your** `java-bootcamp` repo — not the course handouts clone. Nothing is submitted or graded.

---

## Part A — Clone the participant course repo (handouts)

Do this once on Day 1 (or whenever you join).

### 1. Prerequisites

- Git installed (`git --version` → 2.x) — Lab 0  
- GitHub account signed in in the browser  

### 2. Clone

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE
git clone https://github.com/Innovation-In-Software/TBD-java-angular-fullstack-participant.git
cd TBD-java-angular-fullstack-participant
```

**macOS / Linux:**

```bash
cd ~
git clone https://github.com/Innovation-In-Software/TBD-java-angular-fullstack-participant.git
cd TBD-java-angular-fullstack-participant
```

**Expected:** Folder contains `README.md`, `labs/`, and `slides/`.

### 3. How to use this clone

1. Open `labs/` guides in a **browser** (GitHub) **or** a second editor window.  
2. Keep IntelliJ pointed at **`java-bootcamp`** (Part B) — not at this clone.  
3. When the instructor says materials updated:

```text
cd TBD-java-angular-fullstack-participant
git pull
```

**Do not:**

- Run `git commit` / `git push` in this folder for lab homework  
- Create `HelloWorld.java` or CRM projects under `labs/`  
- Fork this repo as your homework repo (use your own `java-bootcamp` instead)

---

## Part B — Your own repo (`java-bootcamp`)

### 1. Create the laptop folder (Lab 0)

| OS | Path |
| -- | ---- |
| Windows | `%USERPROFILE%\java-bootcamp` (example: `C:\Users\<You>\java-bootcamp`) |
| macOS / Linux | `~/java-bootcamp` |

Typical layout after Lab 0 / early labs:

```text
java-bootcamp/
├── examples/                 ← all exercises + labs (your code)
├── notes/        ← evidence — stays local (gitignored)
└── .gitignore                ← added in Lab 1 Step 0
```

Open **`java-bootcamp`** in IntelliJ (**File → Open…** → the folder itself). Project SDK = **21**.

### 2. Create the private GitHub repo (once — Lab 1 Step 0)

Full commands and `.gitignore` body: **[LAB-1-GUIDE Step 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md)**. Short path:

1. GitHub → **+** → **New repository**  
2. Name: **`java-bootcamp`** · Visibility: **Private**  
3. **Do not** add README, `.gitignore`, or license (leave it **empty**)  
4. From the **workspace root** (`java-bootcamp`), not a nested lab folder:

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
# Add .gitignore from LAB-1-GUIDE Step 0, then:
git init
git add .
git status
git commit -m "Initial java-bootcamp workspace (Lab 1 Step 0)"
git branch -M main
git remote add origin https://github.com/<your-github-username>/java-bootcamp.git
git push -u origin main
```

**macOS / Linux:**

```bash
cd ~/java-bootcamp
# Add .gitignore from LAB-1-GUIDE Step 0, then:
git init
git add .
git status
git commit -m "Initial java-bootcamp workspace (Lab 1 Step 0)"
git branch -M main
git remote add origin https://github.com/<your-github-username>/java-bootcamp.git
git push -u origin main
```

Replace `<your-github-username>` with your GitHub username.

**Expected:** GitHub shows private `java-bootcamp` with `examples/` (and `.gitignore`). `notes/` is **not** on GitHub.

### 3. Sign-in when Git asks for a password

GitHub rejects account passwords for `git push`. Use a **Personal Access Token (PAT)** with `repo` scope, or `gh auth login`. Never paste tokens into notes or screenshots.

---

## Part C — Commit after every exercise pack and every lab

Always run Git from the **`java-bootcamp` root**.

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
git status
git add .
git status
git commit -m "Complete Lab N — short description"
git push
```

**macOS / Linux:**

```bash
cd ~/java-bootcamp
git status
git add .
git status
git commit -m "Complete Lab N — short description"
git push
```

| When | Example commit message |
| ---- | ---------------------- |
| Module 1 exercises done | `Complete Module 1 exercises` |
| Lab 1 finished | `Complete Lab 1 — JVM compilation lab` |
| Later CRM lab | `Complete Lab 31 — Spring Kafka producer/consumer` |

**Never commit:** `notes/`, `*.class`, `out/`, `.idea/`, `.env`, kubeconfigs, passwords, tokens.

If `git commit` says “nothing to commit”, that is fine — run `git status`; if you are ahead of `origin/main`, still `git push`.

---

## Quick checklist

| # | Check | Pass looks like |
| - | ----- | --------------- |
| 1 | Course clone exists | `TBD-java-angular-fullstack-participant` with `labs/` |
| 2 | Code workspace open in IntelliJ | `java-bootcamp`, SDK **21** |
| 3 | Own remote | `git remote -v` inside `java-bootcamp` → your `…/java-bootcamp.git` |
| 4 | Latest work on GitHub | Browser → private repo → files under `examples/` |
| 5 | Handouts updated | `git pull` inside the **course** clone only |

---

## If it fails

| Symptom | Fix |
| ------- | --- |
| Wrote code inside the course clone | Move sources into `java-bootcamp/examples/…`; keep guides read-only |
| `remote origin already exists` | `git remote -v` then `git push` (already linked) |
| Push password rejected | Use a **PAT** or `gh auth login` |
| Screenshots appeared on GitHub | Fix `.gitignore` (Lab 1 Step 0); do not force-add ignored files |
| Wrong folder committed | Always `cd` to `java-bootcamp` **root** before `add` / `commit` / `push` |
| Confused which file to open | [\_PARTICIPANT-FILE-GUIDE.md](_PARTICIPANT-FILE-GUIDE.md) |

---

## How this fits the calendar

```text
Lab 0            Clone habit starts · create java-bootcamp folder · Git identity
Day 1            Clone participant handouts repo (Part A)
Exercises        Code under examples/module-NN-exercises/ · commit when pack is Pass
Lab 1 Step 0     Create private java-bootcamp on GitHub · first push (Part B)
Every lab        Code → git add → git commit → git push (Part C)
Week 5+          Same habit; Actions may build what you pushed
```

**Next:** Finish Lab 0 if needed → clone handouts (Part A) → when Lab 1 opens, do Step 0 (Part B) → reuse Part C for the rest of the bootcamp.
