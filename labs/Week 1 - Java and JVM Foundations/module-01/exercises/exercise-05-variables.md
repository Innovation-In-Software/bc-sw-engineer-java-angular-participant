# Exercise 5 — Variables and Data Types

**Module 1** · Pre-lab practice · Checkpoint D (after slides 25–30)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Variables, Primitive Values, and Reference Types](../../../lab_diagrams/mod01-ex05-variables.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Declare local primitives and one `String`; print each |
| **Skills practiced** | `int`/`long`/`double`/`boolean`/`char`/`String`, `L` suffix, quotes |
| **Expected outcome** | Six lines of output matching the worked example |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-01-exercises/Variables.java` |

## What you will learn

- Which literal forms go with which types
- That `String` is a reference type (object), not a primitive
- How type mistakes show up as compiler messages

**Enterprise context:** Product price (`double`), inventory count (`int`), and customer name (`String`) are the same ideas behind e-commerce order lines.

## Worked example — expected output

```text
21
8000000000
19.99
true
A
Aman
```

## Starter (fill in the TODOs)

Copy [`starter/Variables.java`](starter/Variables.java) or paste:

```java
public class Variables {
    public static void main(String[] args) {
        // Fields/types are scaffolded — fill the values and print them
        int age = _____;                       // try 21
        long population = _____;               // use L suffix, e.g. 8_000_000_000L
        double price = _____;                  // try 19.99
        boolean enrolled = _____;              // true or false
        char grade = _____;                    // single quotes — try 'A'
        String name = _____;                   // double quotes — try "Aman"

        // TODO: print each variable on its own line (six println calls)
        _____
    }
}
```

## Steps

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Variables.java
java Variables
```

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Variables.java
java Variables
```

**Success criteria:** Output matches the worked example.

## Predict the Output

If `char grade = "A";` (double quotes) — predict the compiler error before you try it.  
Then use single quotes `'A'`.

## Troubleshooting

| Problem | Typical message | Fix |
| ------- | --------------- | --- |
| Blank left in | `illegal start of expression` | Replace `_____` |
| Huge literal as `int` | `integer number too large` | Use `long` + `L` |
| Wrong quotes for char | `unclosed character literal` / incompatible types | `'A'` not `"A"` |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Six values print correctly | Pass / Fail |
| 2 | You can name one primitive vs `String` | Pass / Fail |
