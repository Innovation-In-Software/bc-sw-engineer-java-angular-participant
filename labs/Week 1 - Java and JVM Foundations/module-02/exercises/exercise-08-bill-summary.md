# Exercise 8 — Bill Summary (challenge)

**Module 2** · Pre-lab practice · Checkpoint F · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Bill Calculation: Total, Discount, and Final Amount](../../../lab_diagrams/mod02-ex08-bill-summary.png)

> **Combines Exercises 1, 6–7:** product input, arithmetic, money-style `printf`.

## Activity card

| | |
| --- | --- |
| **Objective** | Compute subtotal, 10% discount, final amount; printf money |
| **Skills practiced** | multi-step calc, %.2f |
| **Expected outcome** | Bill lines match worked example money format |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-02-exercises/BillSummary.java` |
| **Checkpoint** | F (challenge) |

## What you will learn

- Chain calculations without losing decimals
- Label money output consistently
- Challenge prep for Lab averages/tables

**Enterprise context:** Retail checkout: subtotal → discount → payable.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Product name: Laptop
Quantity: 3
Unit price: 59.99
--- Bill Summary ---
Product: Laptop
Quantity: 3
Unit price: 59.99
Total: 179.97
Discount (10%): 18.00
Final amount: 161.97
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/BillSummary.java`](starter/BillSummary.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class BillSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        // TODO: read name
        String name = _____;

        System.out.print("Quantity: ");
        // TODO: read qty (nextLine + Integer.parseInt)
        int qty = _____;

        System.out.print("Unit price: ");
        // TODO: read price (nextLine + Double.parseDouble)
        double price = _____;

        // TODO: compute total, 10% discount, and final amount
        double total = _____;           // qty * price
        double discount = _____;        // 10% of total
        double finalAmount = _____;     // total - discount

        System.out.println("--- Bill Summary ---");
        // TODO: print Product, Quantity, Unit price, Total, Discount (10%), Final amount
        // hints: %.2f for money; use 10%% in the format string to print a literal %

        scanner.close();
    }
}
```

| Formula | Meaning |
| ------- | ------- |
| `total = qty * price` | Line total before discount |
| `discount = total * 0.10` | 10% of total |
| `finalAmount = total - discount` | Amount to pay |
| `10%%` in `printf` | Prints `10%` (one `%` is special in format strings) |

## Steps

### Step 1 — Create `BillSummary.java`

**Why:** Multi-step calculation + clean money formatting — same habits as Lab 2 averages / tables.

1. **New → File** → `BillSummary.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO` (use the formulas table). Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac BillSummary.java
java BillSummary
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac BillSummary.java
java BillSummary
```

**Verified (Windows)** — `Laptop`, qty `3`, price `59.99`:

```text
Product name: Laptop
Quantity: 3
Unit price: 59.99
--- Bill Summary ---
Product: Laptop
Quantity: 3
Unit price: 59.99
Total: 179.97
Discount (10%): 18.00
Final amount: 161.97
```

Check: `3 × 59.99 = 179.97`, `10% = 17.997 → 18.00` displayed, final `161.97`.

## Expected result

Bill shows total, discount, and final amount with two decimal places.


## Predict the Output

Price 50 qty 2 discount 10% → final?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `Discount (10%)` looks wrong / missing `%` | Use `10%%` inside the format string |
| Final amount off | Confirm `discount = total * 0.10` then `total - discount` |
| `illegal start of expression` near `_____` | Replace every blank with real Java |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Sample `3 × 59.99` yields final **161.97** (or equivalent rounding) | Pass / Fail |
| 2 | You can explain total → discount → final in one sentence | Pass / Fail |
