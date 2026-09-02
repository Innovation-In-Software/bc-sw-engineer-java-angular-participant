# Exercise 3 — Loops

**Module 2** · Pre-lab practice · Checkpoint C · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Loops: for, while, and do-while](../../../lab_diagrams/mod02-ex03-loops.png)

> **New for Module 2:** `for`, `while`, and `do-while` — Java's three ways to repeat.

## Activity card

| | |
| --- | --- |
| **Objective** | Practice for, while, and do-while with console-driven counts |
| **Skills practiced** | for, while, do-while, loop updates |
| **Expected outcome** | All three loop demos print as in the worked example |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-02-exercises/LoopsDemo.java` |
| **Checkpoint** | C |

## What you will learn

- Pick for (known count) vs while vs do-while (menu-style at least once)
- Always update the loop variable
- Avoid infinite loops

**Enterprise context:** Batch settlement retries (while) and menu loops (do-while) appear in operations tooling.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Multiplication table for 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
Countdown: 3
Countdown: 2
Countdown: 1
Type 'menu' to see it again, anything else to quit: menu
1) Add  2) Withdraw  3) Exit
Type 'menu' to see it again, anything else to quit: quit
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/LoopsDemo.java`](starter/LoopsDemo.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        // TODO: for loop — print multiplication table for 5 (5 x 1 = 5 … 5 x 5 = 25)
        System.out.println("Multiplication table for 5:");
        // for (_____) {
        //     System.out.println(...);
        // }

        // TODO: while loop — countdown from 3 to 1 (remember to change count each pass)
        int count = 3;
        // while (_____) {
        //     ...
        // }

        // TODO: do-while — prompt until the user types something other than "menu"
        Scanner scanner = new Scanner(System.in);
        String choice;
        // do {
        //     System.out.print("Type 'menu' to see it again, anything else to quit: ");
        //     choice = scanner.nextLine();
        //     if (choice.equals("menu")) {
        //         System.out.println("1) Add  2) Withdraw  3) Exit");
        //     }
        // } while (_____);

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `for` | Repeat a known number of times |
| `while` | Repeat while a condition stays true; may run zero times |
| `do-while` | Same as `while`, but the body always runs at least once |

## Steps

### Step 1 — Create `LoopsDemo.java`

**Why:** Lab 2's student menu repeats until the user chooses to exit — same idea as this `do-while` toy. The Lab 2 menu uses `while (true)` + Exit choice (either form is fine for “repeat until done”).

1. **New → File** → `LoopsDemo.java`.
2. Paste the starter.
3. Fill every `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac LoopsDemo.java
java LoopsDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac LoopsDemo.java
java LoopsDemo
```

**Verified (Windows)** — typing `menu` once, then `quit`:

```text
Multiplication table for 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
Countdown: 3
Countdown: 2
Countdown: 1
Type 'menu' to see it again, anything else to quit: menu
1) Add  2) Withdraw  3) Exit
Type 'menu' to see it again, anything else to quit: quit
```

## Expected result

Table prints 5x1 through 5x5, countdown prints 3 to 1, and the menu prompt appears again only after typing `menu`.


## Debug challenge

Broken `while` without `count--`; fix it so the loop ends.

## Predict the Output

If `while` count never decreases, what happens?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Countdown never ends | Confirm `count--` is inside the loop body, not after it |
| Menu never appears even once | That is `do-while`'s whole point — check the body runs before the condition test |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | All three loops produce the expected output | Pass / Fail |
| 2 | You can explain why `do-while` always runs its body once | Pass / Fail |
