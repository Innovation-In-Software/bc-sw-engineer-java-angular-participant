# Lab 1 starter — 45-minute timed path

Fill the `// TODO` markers. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete four TODO programs that prove compile → run → allocate on the JVM |
| **Skills practiced** | Methods, constructors, loops, `javac`/`java` |
| **Expected outcome** | Smoke-test output snippet below |
| **Estimated time** | ~45 minutes |
| **Files** | `HelloWorld.java`, `Calculator.java`, `Employee.java`, `MemoryDemo.java` |

**Boilerplate reduced:** `Employee` already declares `id` / `name` fields — focus on constructor, `display()`, and `main`.

## Target copy path

`~/java-bootcamp/examples/jvm-compilation-lab/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-01\lab1\starter"
$dst = "$env:USERPROFILE\java-bootcamp\examples\jvm-compilation-lab"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*.java" $dst -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-01/lab1/starter"
DST="$HOME/java-bootcamp/examples/jvm-compilation-lab"
mkdir -p "$DST"
cp "$SRC"/*.java "$DST"/
cd "$DST"
```

## Timed path (starter) — skip recreate Steps

You already have all four `.java` files. **Do not** recreate `HelloWorld` / `Calculator` / `Employee` / `MemoryDemo` from the GUIDE create Steps. Fill TODOs + evidence only. **`HelloWorld` is already complete** — just confirm it prints `Hello, JVM!`.

## 45-minute checklist (ordered TODOs)

1. Confirm `HelloWorld.java` prints `Hello, JVM!` (already complete — no TODO).
2. Complete `Calculator.add` and its `main` print.
3. Complete `Employee` constructor, `display()`, and `main`.
4. Complete `MemoryDemo` loop + size print.
5. Compile and run all four classes (smoke test below).
6. Capture commit to GitHub (no screenshots).

## Smoke test

```powershell
javac HelloWorld.java Calculator.java Employee.java MemoryDemo.java
java HelloWorld
java Calculator
java Employee
java MemoryDemo
```

**Expected console output:**

```text
Hello, JVM!
Sum = 30
101 - Aman
Created 100000 employees
```

## Validation checkpoint

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | All four `.java` files compile | |
| 2 | Smoke-test output matches snippet above | |
| 3 | Evidence saved under `notes/lab-1/` | |

## Troubleshooting (quick)

| Error | Fix |
| ----- | --- |
| `UnsupportedOperationException: TODO` | You still have a TODO stub — fill it |
| `cannot find symbol: class Employee` | Compile `Employee.java` with `MemoryDemo.java` |
| Wrong folder | `cd` into `jvm-compilation-lab` before `javac` |

> Full GUIDE steps remain for homework / extended work (`javap`, verbose class load, GitHub push, written answers, etc.).
