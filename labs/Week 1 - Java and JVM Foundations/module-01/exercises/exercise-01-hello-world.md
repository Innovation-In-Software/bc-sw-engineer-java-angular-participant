# Exercise 1 — Hello World

**Module 1** · Pre-lab practice · Checkpoint A (after slides 1–9)  
**Folder:** `examples/module-01-exercises/` (see [EXERCISES-INDEX.md](EXERCISES-INDEX.md) setup)

![Understanding Your First Java Program](../../../lab_diagrams/mod01-ex01-hello-world.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Write, compile, and run a minimal program that prints `Hello, JVM!` |
| **Skills practiced** | Creating a `.java` file, `javac`, `java`, entry-point `main` |
| **Expected outcome** | Console prints `Hello, JVM!`; `Hello.class` exists beside the source |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-01-exercises/Hello.java` |

## What you will learn

- How source becomes bytecode (`javac`) and how the JVM runs it (`java`)
- Why the public class name must match the file name
- That the JVM starts at `public static void main(String[] args)`

**Enterprise context:** Every Spring Boot / banking microservice still bottoms out in a JVM that loads bytecode and finds a `main` (or container entry) — this is that foundation in miniature.

## Worked example (read first)

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, JVM!");
    }
}
```

Then follow **Steps** and fill the starter TODOs yourself (do not leave blanks).

## Starter (fill in the TODOs)

Optional: copy from [`starter/Hello.java`](starter/Hello.java). Or paste:

```java
public class Hello {
    // TODO: program entry point — JVM starts here when you run `java Hello`
    public static void main(String[] args) {
        // TODO: print one line of text: Hello, JVM! (hint: System.out.println)
        _____
    }
}
```

| Line idea | Why it matters |
| --------- | -------------- |
| `public class Hello` | Defines a class the JVM can load; file must be `Hello.java` |
| `main(String[] args)` | Special method the `java` launcher looks for |
| `System.out.println(...)` | Sends text to the terminal |

## Steps

### Step 1 — Confirm the exercises folder

**Why:** Keep Module 1 practice separate from Lab 0’s `HelloJava` and from Lab 1.

| OS | Confirm terminal cwd |
| -- | -------------------- |
| Windows | `C:\Users\<you>\java-bootcamp\examples\module-01-exercises` |
| macOS | `/Users/<you>/java-bootcamp/examples/module-01-exercises` |

### Step 2 — Create `Hello.java`

**Do this (IntelliJ):**

1. Right-click `module-01-exercises` → **New → File** (not **Java Class**).
2. Name it exactly `Hello.java`.
3. Paste the starter, fill every `_____` / `// TODO`. Save (**Ctrl+S** / **⌘S**).

**Or from Terminal:**

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
New-Item -ItemType File -Force -Path Hello.java | Out-Null
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
touch Hello.java
```

**Expected:** `Hello.java` under `module-01-exercises`; editor shows the `Hello` class.

### Step 3 — Compile and run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Hello.java
java Hello
```

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Hello.java
java Hello
```

**Expected console output:**

```text
Hello, JVM!
```

**Success criteria:** Output matches exactly (including punctuation); `Hello.class` appears next to `Hello.java`.

### Step 4 — Optional: inspect bytecode

```text
javap -c Hello
```

**Expected:** Disassembly includes `main` and a `println` call (`getstatic` / `ldc` / `invokevirtual` / `return`).

## Predict the Output (warm-up)

Before you run, what prints if you change the string to `"Hello, Bank!"`?  
After you run: confirm your prediction. (Change it back to `Hello, JVM!` for Pass criteria.)

## Troubleshooting

| Problem | Typical message | Fix |
| ------- | --------------- | --- |
| Left a blank in source | `illegal start of expression` near `_____` | Replace every blank with real Java |
| Class/file mismatch | `class Hello is public, should be declared in a file named…` | File must be `Hello.java` |
| Wrong launch | `Could not find or load main class Hello` | Run `java Hello` (not `Hello.java`); compile first |
| Wrong folder | `error: file not found: Hello.java` | `cd` to `module-01-exercises` |
| IDE yellow banner | *outside of the module source root* | Ignore; do **not** Move to source root |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

_Mark each row **Pass** or **Fail** in your lab notes._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `javac` + `java` produce `Hello, JVM!` | Pass / Fail |
| 2 | You can explain in one sentence: source → bytecode → JVM | Pass / Fail |
