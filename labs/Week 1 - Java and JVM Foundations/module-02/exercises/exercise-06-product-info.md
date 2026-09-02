# Exercise 6 — Product Information

**Module 2** · Pre-lab practice · Checkpoint F · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Input Conversion: From Text to Numbers](../../../lab_diagrams/mod02-ex06-product-info.png)

> **Builds on Exercise 5:** same `Scanner` idea; prefer **`nextLine()` + parse** (Lab 2’s safer style) so leftover newlines do not bite you.

## Activity card

| | |
| --- | --- |
| **Objective** | Read String/int/double via nextLine+parse; print product summary |
| **Skills practiced** | parseInt/parseDouble, mixed types, labeled output |
| **Expected outcome** | Product name, qty, price printed clearly |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-02-exercises/ProductInfo.java` |
| **Checkpoint** | F |

## What you will learn

- Prefer nextLine+parse for Lab 2 consistency
- Choose types: String name, int qty, double price
- Validate parse errors conceptually

**Enterprise context:** Warehouse SKU entry: name + quantity + unit price.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Product name: Laptop
Quantity: 3
Price: 59.99
Product: Laptop | Qty: 3 | Price: 59.99
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/ProductInfo.java`](starter/ProductInfo.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        // TODO: read product name (may include spaces)
        String name = _____;

        System.out.print("Quantity: ");
        // TODO: read a full line, then parse to int (Integer.parseInt)
        int qty = _____;

        System.out.print("Price: ");
        // TODO: read a full line, then parse to double (Double.parseDouble)
        double price = _____;

        // TODO: print with printf — %s name, %d qty, %.2f price
        // System.out.printf("Product: %s | Qty: %d | Price: %.2f%n", _____, _____, _____);

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Integer.parseInt(...)` | Turn text `"3"` into `int` `3` |
| `Double.parseDouble(...)` | Turn text `"59.99"` into `double` `59.99` |
| Always `nextLine()` | One read style → no mixed `nextInt` / `nextLine` bugs |
| `%.2f` | Format a decimal with 2 places |

## Steps

### Step 1 — Create `ProductInfo.java`

**Why:** Lab 2 will ask for quantities and marks — same parse pattern.

1. **New → File** → `ProductInfo.java` under `module-02-exercises`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac ProductInfo.java
java ProductInfo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac ProductInfo.java
java ProductInfo
```

**Verified (Windows)** — sample session:

```text
Product name: Laptop
Quantity: 3
Price: 59.99
Product: Laptop | Qty: 3 | Price: 59.99
```

## Expected result

Product name, quantity, and price print correctly (price with two decimals).


## Predict the Output

Entering `abc` for quantity — what exception?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `NumberFormatException` | Quantity/price must be numeric (`3`, `59.99`) — no letters |
| Wrong price formatting | Use `%.2f` in `printf` |
| `illegal start of expression` near `_____` | Replace every blank with real Java |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Code compiles and runs; all three fields print | Pass / Fail |
| 2 | You can explain why `nextLine()` + parse is safer than mixing `nextInt` / `nextDouble` | Pass / Fail |
