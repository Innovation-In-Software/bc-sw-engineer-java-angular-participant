# Exercise 1 — Calculations

**Module 2** · Pre-lab practice · Checkpoint B · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Arithmetic: Building a Basic Calculator](../../../lab_diagrams/mod02-ex01-calculator.png)

> **Builds on Module 1 types:** operators you already know; numbers come from **input**, not literals.

## Activity card

| | |
| --- | --- |
| **Objective** | Read two doubles and print sum, difference, product, quotient with %.2f |
| **Skills practiced** | Scanner nextLine+parse, arithmetic, printf |
| **Expected outcome** | Labeled Sum/Difference/Product/Quotient lines |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-02-exercises/Calculator.java` |
| **Checkpoint** | B (after slides 53–60) |

## What you will learn

- Read numbers from the console (not hard-coded literals)
- Why double keeps decimal division results
- Format money-style output with %.2f

**Enterprise context:** POS / e-commerce line totals use the same arithmetic + formatted money display.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
First number: 12
Second number: 4
Sum: 16.00
Difference: 8.00
Product: 48.00
Quotient: 3.00
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/Calculator.java`](starter/Calculator.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        // TODO: read the first number as a double (hint: Double.parseDouble(scanner.nextLine()))
        double a = _____;

        System.out.print("Second number: ");
        // TODO: read the second number as a double
        double b = _____;

        // TODO: print Sum, Difference, Product, and Quotient using printf with %.2f
        // System.out.printf("Sum: %.2f%n", _____);
        // System.out.printf("Difference: %.2f%n", _____);
        // System.out.printf("Product: %.2f%n", _____);
        // System.out.printf("Quotient: %.2f%n", _____);

        scanner.close();
    }
}
```

| Operator | Meaning |
| -------- | ------- |
| `+` | Sum |
| `-` | Difference (`a` minus `b`) |
| `*` | Product |
| `/` | Quotient — with `double`, `12 / 4` → `3.00` (not integer truncation) |

## Steps

### Step 1 — Create `Calculator.java`

**Why:** Warm up arithmetic you will reuse in bill totals and Lab 2 averages.

1. **New → File** → `Calculator.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac Calculator.java
java Calculator
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac Calculator.java
java Calculator
```

**Verified (Windows)** — inputs `12` and `4`:

```text
First number: 12
Second number: 4
Sum: 16.00
Difference: 8.00
Product: 48.00
Quotient: 3.00
```

## Expected result

Four labeled results print for your two inputs.


## Predict the Output

What prints for `7 / 2` as int vs `7.0 / 2` as double?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Quotient is `0` or truncated | Use `double` (not `int`) for both numbers |
| Crash on second input empty | Type a number and press Enter each time |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Four results print correctly | Pass / Fail |
| 2 | You can explain why `double` is preferred for division here | Pass / Fail |
