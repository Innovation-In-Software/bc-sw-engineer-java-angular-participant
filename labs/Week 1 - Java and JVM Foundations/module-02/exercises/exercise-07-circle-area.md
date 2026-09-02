# Exercise 7 — Area of Circle

**Module 2** · Pre-lab practice · Checkpoint F · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Math: Calculating the Area of a Circle](../../../lab_diagrams/mod02-ex07-circle-area.png)

> **New for Module 2:** `Math.PI` and `printf` decimal formatting (Lab 2 uses `printf` for tables).

## Activity card

| | |
| --- | --- |
| **Objective** | Compute area with Math.PI and print with printf decimals |
| **Skills practiced** | Math.PI, double math, %.2f / %.4f |
| **Expected outcome** | Area printed with required decimal formatting |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-02-exercises/CircleArea.java` |
| **Checkpoint** | F |

## What you will learn

- Use library constants (Math.PI)
- Format floating results for humans
- Radius from Scanner

**Enterprise context:** Logistics coverage radius / geo fencing demos use the same formula.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Radius: 5
Area: 78.54
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/CircleArea.java`](starter/CircleArea.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        // TODO: read radius as a double (nextLine + Double.parseDouble)
        double r = _____;

        // TODO: area = π × r²  (use Math.PI)
        double area = _____;

        // TODO: print area with two decimal places (printf %.2f)
        // System.out.printf(...);

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Math.PI` | Built-in constant for π (≈ 3.14159…) |
| `r * r` | Radius squared |
| `%.2f` | Round/display with 2 digits after the decimal |

## Steps

### Step 1 — Create `CircleArea.java`

**Why:** Practice library constants + formatted output before Lab 2’s student table.

1. **New → File** → `CircleArea.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac CircleArea.java
java CircleArea
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac CircleArea.java
java CircleArea
```

**Verified (Windows)** — radius `5`:

```text
Radius: 5
Area: 78.54
```

(Exact display may vary slightly by rounding; ≈ `78.54` is expected.)

## Expected result

Area matches π × r × r and prints with two decimals.


## Predict the Output

Radius 2 → area ≈ ?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `cannot find symbol PI` | Use `Math.PI` (capital `PI`) — no import needed |
| Many decimal places | Use `printf` with `%.2f`, not bare `println(area)` |
| `illegal start of expression` near `_____` | Replace every blank with real Java |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Area prints with two decimals for your radius | Pass / Fail |
| 2 | You can write the formula `Math.PI * r * r` from memory | Pass / Fail |

---

## Next

Core Exercises **1–7** complete → open **one** OS how-to → [`../lab2/LAB-2-WINDOWS.md`](../lab2/LAB-2-WINDOWS.md) or [`../lab2/LAB-2-MACOS.md`](../lab2/LAB-2-MACOS.md) → then graded [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md) (builds on these exercises; separate folder `examples/Lab2-JavaSyntax/`).

Optional: continue to Exercises 8–9 (challenge/bonus) before or during Lab extended time.
