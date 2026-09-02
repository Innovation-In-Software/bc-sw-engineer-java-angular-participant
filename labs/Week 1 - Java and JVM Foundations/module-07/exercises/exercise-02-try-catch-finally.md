# Exercise 2 — `try-catch-finally`

**Module 7** · Pre-lab practice · Checkpoint B · Exercises 1–8 Pass then Lab 7
**Folder:** `examples/module-07-exercises/` ([setup](EXERCISES-INDEX.md))

![finally Runs on Both Paths](../../../lab_diagrams/mod07-ex02-try-catch-finally.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Prove finally runs on both success and failure paths |
| **Skills practiced** | try / catch / finally cleanup |
| **Expected outcome** | Success and failure demos both print finally |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-07-exercises/` → FinallyDemo.java |
| **Checkpoint** | B (after slides 178–179) |

## What you will learn

- finally runs whether or not an exception was thrown
- Cleanup belongs in finally (or better: try-with-resources)
- Catch recovers; finally releases

**Enterprise context:** Closing files/sockets after a failed withdraw attempt still matters for ops hygiene.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Transfer started.
Transfer completed.
Cleanup: release transfer session.
---
Transfer started.
Handled: Transfer service unavailable
Cleanup: release transfer session.
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

The `throw` that simulates failure is already in the `try` block — your job is the **catch** and **finally** cleanup.

```java
public class FinallyDemo {
    static void transfer(boolean fail) {
        System.out.println("Transfer started.");

        try {
            if (fail) {
                // Simulate a recoverable service failure.
                throw new IllegalStateException(
                        "Transfer service unavailable");
            }
            System.out.println("Transfer completed.");
        } catch (_____ ex) { // TODO: catch IllegalStateException
            // TODO: print "Handled: " + ex.getMessage()
        } finally {
            // TODO: print "Cleanup: release transfer session."
        }
    }

    public static void main(String[] args) {
        transfer(false); // success path
        System.out.println("---");
        transfer(true);  // failure path
    }
}
```

## Control flow

```mermaid
flowchart TD
    T["try"] -->|success| S["normal statements"]
    T -->|exception| C["matching catch"]
    S --> F["finally"]
    C --> F
    F --> N["continue"]
```

`finally` normally runs whether the `try` succeeds or a matching catch handles
an exception. It is not an absolute guarantee if the JVM or process is forcibly
terminated.

## Steps

### Step 1 — Create the file

**Why:** ATM menu operations need cleanup and recovery after both success and
failure.

1. **New → File** → `FinallyDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Why:** Two consecutive transfer calls make the cleanup guarantee visible.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac FinallyDemo.java
java FinallyDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac FinallyDemo.java
java FinallyDemo
```

**Verified:**

```text
Transfer started.
Transfer completed.
Cleanup: release transfer session.
---
Transfer started.
Handled: Transfer service unavailable
Cleanup: release transfer session.
```

### Step 3 — Trace both paths

**Why:** Writing the paths prevents confusing `finally` with “runs only on
error.”

Add to `notes.md`:

```text
Success: try → finally → return
Failure: try throws → catch → finally → return
```

### Step 4 — Know when not to use `finally`

**Why:** Files, readers, and streams close more safely with try-with-resources.

For AutoCloseable resources, prefer Exercise 3. It closes the resource and
preserves suppressed exceptions.

## Expected result

The cleanup line appears exactly twice—once after each path.


## Debug / design challenge

Return inside try before finally — observe that finally still runs.

## Predict the Output / Behavior

Does finally run when catch rethrows?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Cleanup appears only on success | Put it in `finally`, not at the end of `try` |
| Program terminates on failure | Catch `IllegalStateException` |
| Empty catch block | Print or recover with meaningful context |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Success and failure paths both execute | Pass / Fail |
| 2 | Cleanup prints twice | Pass / Fail |
| 3 | You can explain the normal finally guarantee and limitation | Pass / Fail |
