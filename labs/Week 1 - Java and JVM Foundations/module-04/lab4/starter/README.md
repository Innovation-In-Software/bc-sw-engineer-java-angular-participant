# Lab 4 starter — 45-minute timed path

Fill measurement / comparison `// TODO`s. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete GC / leak-fix / performance TODOs in the memory suite |
| **Skills practiced** | Allocation demos, retention clear, timing comparisons |
| **Expected outcome** | Smoke themes pass (GC + leak/fix + performance) |
| **Estimated time** | ~45 minutes |
| **Files** | Flat suite under `Lab4-MemoryManagement/` |

**Boilerplate reduced:** `Person`, `MemoryMonitor`, `StackExample`, `HeapExample`, and `ObjectLifecycle` are mostly given — focus on GC demo, leak/fix, and performance TODOs. Skip recreating GUIDE Steps 1–5.

## Target copy path

`~/java-bootcamp/examples/Lab4-MemoryManagement/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-04\lab4\starter\Lab4-MemoryManagement"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab4-MemoryManagement"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-04/lab4/starter/Lab4-MemoryManagement"
DST="$HOME/java-bootcamp/examples/Lab4-MemoryManagement"
mkdir -p "$DST"
cp "$SRC"/*.java "$DST"/
cd "$DST"
```

## 45-minute checklist (ordered TODOs)

1. Run given demos: `StackExample`, `HeapExample`, `ObjectLifecycle` (no rewrite needed).
2. Complete `GarbageCollectionDemo` allocation + GC measurement.
3. Complete `MemoryLeakDemo` `leak` and `fix` modes.
4. Complete `PerformanceTest.runAllocationTest` (core timed path).
5. **Full credit (homework OK):** complete `WeakReferenceDemo`.
6. Optional if time: `ListMemoryComparison`, `StringMemoryComparison`.
7. Evidence under `notes/lab-4/`.

> **Instructor / optional only:** `OutOfMemoryDemo` — do **not** run without a tiny `-Xmx` (for example `-Xms16m -Xmx32m`) **and** instructor OK. Never force OOM for fun.

## Smoke test

```powershell
javac StackExample.java HeapExample.java ObjectLifecycle.java Person.java MemoryMonitor.java GarbageCollectionDemo.java MemoryLeakDemo.java PerformanceTest.java
java StackExample
java HeapExample
java -Xms16m -Xmx64m -Xlog:gc GarbageCollectionDemo
java MemoryLeakDemo leak
# Ctrl+C after a few rising-memory progress lines if needed
java MemoryLeakDemo fix
java -Xms128m -Xmx512m PerformanceTest
```

Full-credit add-on (required for full Pass; optional during timed classroom):

```powershell
javac WeakReferenceDemo.java Person.java MemoryMonitor.java
java WeakReferenceDemo
```

**Expected themes:** nested stack frames; heap identity hashes; GC reclaim after null; G1/GC log lines; leak rise / fix drop; performance table rows.

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Core demos compile | |
| 2 | GC + `MemoryLeakDemo leak`/`fix` + `PerformanceTest` run | |

## Full-credit Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Timed-path criteria above | |
| 2 | `WeakReferenceDemo` run (strong stays / weak often `null` after GC) | |

## Troubleshooting (quick)

| Error | Fix |
| ----- | --- |
| Empty GC log | JDK 21 `-Xlog:gc` before class name |
| `UnsupportedOperationException: TODO` | Fill remaining timed-path TODOs |
| OOM on GC demo | Raise `-Xmx` slightly or reduce loop — do not force OOM for fun |
| `Usage: ... leak | fix` | Pass CLI arg: `java MemoryLeakDemo leak` or `fix` |

> Full GUIDE steps (extra tools/demos) remain for homework / extended work.
