# Exercise 6 — SOLID Spot-Check: SRP

**Module 3** · Pre-lab practice · Checkpoint E · all 8 then lab
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Single Responsibility Principle Refactoring](../../../lab_diagrams/mod03-ex06-solid-srp.svg)

> **Focused scope:** SOLID has five principles. This warm-up practices only **S — Single Responsibility Principle (SRP)** before Lab 3 separates model, service, and menu responsibilities.

## Activity card

| | |
| --- | --- |
| **Objective** | Spot an SRP violation and propose a split |
| **Skills practiced** | Single Responsibility Principle |
| **Expected outcome** | Written note + optional refactored demo showing one reason to change |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-03-exercises/SolidDemo.java / notes` |
| **Checkpoint** | E (after slides 102–103) |

## What you will learn

- One class → one reason to change
- God classes mix persistence, UI, and rules
- SRP prepares Lab 3 BankService boundaries

**Enterprise context:** Mixing ledger rules with console printing makes banking code untestable.

## Before — mixed responsibilities

```java
static void calculateAndPrintInterest(
        double balance, double ratePercent) {
    double interest = balance * ratePercent / 100.0;
    System.out.printf(
            "Interest earned: %.2f%n", interest);
}
```

This method has two reasons to change:

1. the bank changes its interest formula;
2. the UI changes how interest is displayed.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Interest earned: 500.00
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy matching files from [`starter/`](starter/README.md). Or paste:


Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished file.

```java
public class SolidDemo {
    // Business calculation: returns data; does not print.
    static double calculateInterest(
            double balance, double ratePercent) {
        // TODO: return balance * ratePercent / 100.0 (no System.out here)
        return _____;
    }

    // Presentation: formats a value; does not calculate it.
    static void printInterest(double interest) {
        // TODO: printf "Interest earned: %.2f%n"
        System.out.printf(_____, interest);
    }

    public static void main(String[] args) {
        // TODO: calculate interest for 10_000 at 5%, then print it
        double interest = _____;
        _____;
    }
}
```

| Method | One responsibility |
| ------ | ------------------ |
| `calculateInterest` | Apply the interest formula |
| `printInterest` | Format and display a result |
| `main` | Coordinate the small workflow |

## Steps

### Step 1 — Identify the two reasons to change

**Why:** SRP is about reasons to change, not merely making methods short.

In `notes.md`, add:

```markdown
## SRP spot-check

The original method could change because the formula changes or because
the output format changes. These are separate responsibilities.
```

### Step 2 — Create `SolidDemo.java`

**Why:** Returning the calculated value makes the business logic reusable and independently testable.

Create `SolidDemo.java`. Paste the starter. Fill every `_____` / `// TODO`. Save.

### Step 3 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**Verified (Windows):**

```text
Interest earned: 500.00
```

### Step 4 — Test calculation without console output

**Why:** Separation lets you check the formula without parsing printed text.

Temporarily add inside `main`:

```java
if (interest != 500.00) {
    throw new AssertionError(
            "Expected 500.00, got " + interest);
}
```

Recompile and run. No assertion error means the calculation passed.

### Step 5 — Connect SRP to Lab 3

Add one sentence to `notes.md`:

> `Main` should manage menu input, `BankService` should coordinate banking operations, and domain classes should protect their own state.

## Expected result

The program prints `500.00`; calculation has no `System.out`, and display code does not contain the interest formula.


## Debug / design challenge

Identify which method does not belong in a god AccountPrinterBankDb class.

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace blanks with formula, format string, and method calls |
| Interest prints `50000.00` | Divide percentage by `100.0` |
| Calculation still prints | Return `double`; print only in `printInterest` |
| `main` repeats the formula | Call `calculateInterest` instead |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] Output is `Interest earned: 500.00`
- [ ] Calculation and display are separate methods
- [ ] You can name both reasons the original method might change
- [ ] You can connect SRP to Main / BankService / domain classes

