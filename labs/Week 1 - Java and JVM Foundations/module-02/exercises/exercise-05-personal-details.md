# Exercise 5 — Personal Details

**Module 2** · Pre-lab practice · Checkpoint F · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Console Input with Scanner](../../../lab_diagrams/mod02-ex05-personal-details.png)

> **Not a repeat of Module 1:** Module 1 used hard-coded variables. Here you **read** name, age, and city from the console with `Scanner`.

## Activity card

| | |
| --- | --- |
| **Objective** | Read name/age/city with Scanner; handle leftover newline; printf greeting |
| **Skills practiced** | Scanner, nextInt+nextLine pitfall, printf %s/%d |
| **Expected outcome** | Greeting line matches worked example |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-02-exercises/PersonalDetails.java` |
| **Checkpoint** | F (after slides 73–76) |

## What you will learn

- Import java.util.Scanner
- nextInt leaves a newline — consume it before nextLine
- printf format specifiers

**Enterprise context:** HR onboarding forms and clinic intake consoles hit the same newline trap.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Enter your name: Aman
Enter your age: 21
Enter your city: Toronto
Hello, Aman! You are 21 years old and live in Toronto.
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/PersonalDetails.java`](starter/PersonalDetails.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;   // Scanner lives in java.util — must import it

public class PersonalDetails {
    public static void main(String[] args) {
        // TODO: create a Scanner reading from System.in
        Scanner scanner = _____;

        System.out.print("Enter your name: ");
        // TODO: read the whole line as a String
        String name = _____;

        System.out.print("Enter your age: ");
        // TODO: read an int with nextInt()
        int age = _____;
        // TODO: consume the leftover newline after nextInt() (critical!)
        // scanner._____;

        System.out.print("Enter your city: ");
        // TODO: read the city with nextLine()
        String city = _____;

        // TODO: print a greeting with printf — %s for strings, %d for age, %n for newline
        // System.out.printf("Hello, %s! You are %d years old and live in %s.%n",
        //         name, age, city);

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Scanner(System.in)` | Reads what you type in the terminal |
| `nextLine()` | Whole line as `String` (includes spaces) |
| `nextInt()` | Next integer token — **does not** consume the Enter key’s newline |
| Extra `nextLine()` after `nextInt()` | Clears the leftover newline so the next `nextLine()` works |
| `printf` + `%s` / `%d` | Insert values into a format string |

## Steps

### Step 1 — Create `PersonalDetails.java`

**Why:** Practice interactive input — Lab 2’s menu app uses the same `Scanner` idea.

1. Right-click `module-02-exercises` → **New → File** (not Java Class).
2. Name it exactly `PersonalDetails.java`.
3. Paste the starter, fill every `_____` / `// TODO`. Save (**Ctrl+S** / **⌘S**).

Ignore any yellow *outside of the module source root* banner.

### Step 2 — Compile and run

**Why:** Confirm prompts appear and the greeting uses your typed values.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

Type answers when prompted (example: `Aman`, `21`, `Toronto`).

**Verified (Windows)** — sample session:

```text
Enter your name: Aman
Enter your age: 21
Enter your city: Toronto
Hello, Aman! You are 21 years old and live in Toronto.
```

### Step 3 — See the leftover-newline bug (optional)

**Why:** Lab 2 warns about mixing `nextInt()` / `nextDouble()` with `nextLine()`.

Temporarily **delete** the extra `nextLine()` after `nextInt()`, recompile, and run again. After you enter age, the city prompt often appears to skip — the leftover `\n` is read as an empty city.

## Expected result

Program prompts for three values and greets with all three.


## Debug challenge

Reproduce empty city, then fix with `scanner.nextLine()`.

## Predict the Output

Skip the extra `nextLine` after `nextInt` — what does city become?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| City skipped / empty | Add `scanner.nextLine()` after `nextInt()` |
| `InputMismatchException` | Age must be a whole number (e.g. `21`, not `twenty`) |
| `cannot find symbol Scanner` | Add `import java.util.Scanner;` at the top |
| `illegal start of expression` near `_____` | Replace every blank with real Java |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Code compiles and runs; greeting shows name, age, city | Pass / Fail |
| 2 | You can explain why an extra `nextLine()` is needed after `nextInt()` | Pass / Fail |
