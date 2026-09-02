# Exercise 3 — Control Flow

**Module 1** · Pre-lab practice · Checkpoint C (after slides 17–24)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Control Flow with Decisions and Loops](../../../lab_diagrams/mod01-ex03-control-flow.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Implement `if`, `for`, `while`, and `switch` in one program; fix a broken variant |
| **Skills practiced** | Branching, loops, switch cases, reading compiler errors |
| **Expected outcome** | Exact console output below; debug challenge compiles and runs |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-01-exercises/ControlFlow.java` |

## What you will learn

- When to use `if`/`else`, counted `for`, condition `while`, and `switch`
- Why `break` matters in classic `switch`
- How an infinite loop looks when you forget to update the loop variable

**Enterprise context:** Loan eligibility (`if`), batch settlement retries (`while`), and status codes (`switch`) appear in banking workflows — same structures, larger scale.

## Worked example — expected output

```text
even
1
2
3
4
5
countdown 3
countdown 2
countdown 1
Tuesday
```

## Starter (fill in the TODOs)

Copy [`starter/ControlFlow.java`](starter/ControlFlow.java) or paste:

```java
public class ControlFlow {
    public static void main(String[] args) {
        int number = 4;

        // TODO: if / else — print "even" when number is even, "odd" otherwise
        _____

        // TODO: for loop — print 1 through 5 (one number per line)
        _____

        // TODO: while loop — countdown from 3 to 1 ("countdown " + count)
        int count = 3;
        _____

        // TODO: switch on day (value 2) — 1 Monday, 2 Tuesday, default Other day
        int day = 2;
        _____
    }
}
```

## Steps

1. Create `ControlFlow.java` with **New → File**.
2. Fill every `_____` / `// TODO`. Save.
3. Compile and run:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac ControlFlow.java
java ControlFlow
```

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac ControlFlow.java
java ControlFlow
```

**Success criteria:** Output matches the worked example exactly.

## Debug challenge (hands-on)

Copy [`starter/ControlFlowBug.java`](starter/ControlFlowBug.java) (or paste the skeleton below), then fix it (do not leave the infinite loop):

```java
public class ControlFlowBug {
    public static void main(String[] args) {
        int count = 3;
        // BUG: loop never decreases count — will hang if you run as-is
        while (count > 0) {
            System.out.println("countdown " + count);
            // TODO: fix — decrease count so the loop ends
        }
    }
}
```

**Predict:** What happens if you run before fixing? (Hang / flood of the same line.)  
**Fix:** add `count--;` inside the loop. Expected: three countdown lines, then exit.

## Troubleshooting

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace blanks with real Java |
| Infinite countdown | Decrease `count` inside `while` (`count--`) |
| Wrong day / fall-through | Add `break;` after each `case` |
| Always prints `odd` | Use `number % 2 == 0` for even |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `ControlFlow` output matches worked example | Pass / Fail |
| 2 | `ControlFlowBug` fixed and terminates | Pass / Fail |
