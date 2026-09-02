# Lab 4: Memory Management and Garbage Collection — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven not required for Lab 4 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-4-GUIDE.md](LAB-4-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-4-MACOS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\Lab4-MemoryManagement` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: code under examples/; commit to your GitHub repo
cd examples\Lab4-MemoryManagement
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\Lab4-MemoryManagement
javac Person.java MemoryMonitor.java StackExample.java HeapExample.java ObjectLifecycle.java GarbageCollectionDemo.java MemoryLeakDemo.java WeakReferenceDemo.java PerformanceTest.java
java StackExample
java HeapExample
java ObjectLifecycle
java -Xms16m -Xmx64m -Xlog:gc GarbageCollectionDemo
java MemoryLeakDemo leak
# stop with Ctrl+C after a few progress lines if leak mode runs long
java MemoryLeakDemo fix
java -Xms128m -Xmx512m PerformanceTest
# Full-credit / homework: java WeakReferenceDemo
```


## Do the lab

Complete every step in **[LAB-4-GUIDE.md](LAB-4-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../_IDE-CONVENTIONS.md).

## Your GitHub repo

Commit this lab's work to your private `java-bootcamp` GitHub repo. Do not take screenshots. Nothing is submitted or graded.


## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab4-MemoryManagement` as in [LAB-4-GUIDE.md](LAB-4-GUIDE.md) | Pass / Fail |
| 3 | Timed smoke: GC + `MemoryLeakDemo leak`/`fix` + `PerformanceTest` | Pass / Fail |
| 4 | Full credit: `WeakReferenceDemo` (homework OK if timed class ends) | Pass / Fail |
