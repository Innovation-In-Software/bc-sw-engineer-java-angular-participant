# Exercise 1 — Recognize Common Unchecked Exceptions

**Module 7** · Pre-lab practice · Checkpoint A · Exercises 1–8 Pass then Lab 7
**Folder:** `examples/module-07-exercises/` ([setup](EXERCISES-INDEX.md))

![Common Java Exceptions](../../../lab_diagrams/mod07-ex01-common-exceptions.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Catch ArithmeticException, NullPointerException, and ArrayIndexOutOfBoundsException specifically |
| **Skills practiced** | Unchecked exceptions, narrow catch, program continuation |
| **Expected outcome** | Three Caught: lines + Program continued. |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-07-exercises/` → CommonExceptionsDemo.java |
| **Checkpoint** | A (after slides 173–177) |

## What you will learn

- Catch the narrowest useful type, not Exception for everything
- Isolated try blocks keep later demos reachable
- Unchecked exceptions still deserve intentional handling at boundaries

**Enterprise context:** ATM/PIN handlers must fail one bad op without killing the whole session loop.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Caught: ArithmeticException
Caught: NullPointerException
Caught: ArrayIndexOutOfBoundsException
Program continued.
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

The risky statements that cause each exception are already in place — your job is the **specific catch** for each one.

```java
public class CommonExceptionsDemo {
    public static void main(String[] args) {
        // Isolate each failure so one catch cannot skip later demos.
        try {
            int divisor = 0; // variable form avoids some constant-expression warnings
            int result = 10 / divisor;
            System.out.println(result);
        } catch (_____ ex) { // TODO: catch ArithmeticException
            // TODO: print "Caught: " + ex.getClass().getSimpleName()
        }

        try {
            String value = null;
            // Dereferencing null throws NullPointerException.
            System.out.println(value.length());
        } catch (_____ ex) { // TODO: catch NullPointerException
            // TODO: print "Caught: " + ex.getClass().getSimpleName()
        }

        try {
            int[] values = {10, 20};
            // Valid indexes are only 0 and 1.
            System.out.println(values[5]);
        } catch (_____ ex) { // TODO: catch ArrayIndexOutOfBoundsException
            // TODO: print "Caught: " + ex.getClass().getSimpleName()
        }

        // Reaching this line proves recovery kept the process alive.
        System.out.println("Program continued.");
    }
}
```

| Exception | Trigger | Prevention |
| --------- | ------- | ---------- |
| `ArithmeticException` | Integer divide by zero | Validate divisor |
| `NullPointerException` | Dereference `null` | Validate references |
| `ArrayIndexOutOfBoundsException` | Invalid array index | Check `0 <= index < length` |

## Steps

### Step 1 — Create the file

**Why:** Lab 7 will intentionally create failure paths. Learning the common
unchecked exceptions first makes later ATM catches easier to recognize.

1. **New → File** → `CommonExceptionsDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Why:** Seeing three recovered failures in one run proves isolation works.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac CommonExceptionsDemo.java
java CommonExceptionsDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac CommonExceptionsDemo.java
java CommonExceptionsDemo
```

**Verified (Windows):**

```text
Caught: ArithmeticException
Caught: NullPointerException
Caught: ArrayIndexOutOfBoundsException
Program continued.
```

### Step 3 — Explain isolation

**Why:** A single large `try` would stop after the first exception and skip
later demos.

Each risky statement has its own `try`. After one catch finishes, execution
continues into the next block.

### Step 4 — Remove one catch temporarily

**Why:** An uncaught exception proves the cost of skipping recovery.

Remove the array catch, compile, and run. Observe the raw stack trace and that
`Program continued.` does not print. Restore the catch afterward.

## Expected result

All three exception types print, followed by `Program continued.`


## Debug / design challenge

Catch Exception once for all three — split into specific catches and re-run.

## Predict the Output / Behavior

If the NPE catch is missing, does the ArrayIndex demo still run?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Compiler complains about division by zero | Keep the divisor in a variable, as in the starter |
| Later demos do not run | Keep each trigger in its own `try-catch` |
| Catch never matches | Catch the exact listed exception type |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | All three specific exception names print | Pass / Fail |
| 2 | Final continuation line prints | Pass / Fail |
| 3 | You can name the prevention for each failure | Pass / Fail |
