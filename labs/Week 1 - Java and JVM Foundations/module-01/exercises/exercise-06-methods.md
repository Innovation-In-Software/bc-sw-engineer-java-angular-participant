# Exercise 6 — Methods and Parameters

**Module 1** · Pre-lab practice · Checkpoint D  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Method Calls, Parameters, and Return Values](../../../lab_diagrams/mod01-ex06-methods.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Implement two methods with parameters/returns; call them from `main` |
| **Skills practiced** | Method signatures, `return`, stack frames (concept) |
| **Expected outcome** | Prints `30` then `Hello, Aman!` |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-01-exercises/Methods.java` |

## What you will learn

- Parameters in, return value out
- Why each call gets its own stack frame
- Static methods callable from `static main` without an object

**Enterprise context:** Interest calculators and fee engines in banking are methods with clear inputs/outputs — same idea as `add` / `greet`, with stricter validation later.

## Worked example — expected output

```text
30
Hello, Aman!
```

## Starter (fill in the TODOs)

Signatures are provided (less boilerplate). Fill bodies and calls — copy [`starter/Methods.java`](starter/Methods.java) or paste:

```java
public class Methods {
    public static void main(String[] args) {
        // TODO: call add(10, 20); print the result (expect 30)
        int sum = _____;
        System.out.println(sum);

        // TODO: call greet("Aman"); print the result (expect Hello, Aman!)
        String message = _____;
        System.out.println(message);
    }

    // Scaffolded signature — implement the body only
    public static int add(int a, int b) {
        _____
    }

    public static String greet(String name) {
        _____
    }
}
```

## Steps

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Methods.java
java Methods
```

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Methods.java
java Methods
```

**Success criteria:** Output matches the worked example.

## Predict the Output

What does `add(5, 7)` return? Predict `12`, then temporarily change the call and verify.

## Troubleshooting

| Problem | Fix |
| ------- | --- |
| `missing return statement` | Non-void methods must `return` on every path |
| `cannot find symbol` on call | Method must be `static` (as in starter) or called on an instance |
| Wrong greeting | `"Hello, " + name + "!"` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Output is `30` then `Hello, Aman!` | Pass / Fail |
| 2 | You can say “each call gets a stack frame” in one sentence | Pass / Fail |
