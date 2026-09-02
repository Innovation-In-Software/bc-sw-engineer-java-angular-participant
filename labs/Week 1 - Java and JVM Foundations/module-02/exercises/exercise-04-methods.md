# Exercise 4 — Methods

**Module 2** · Pre-lab practice · Checkpoint D · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Methods: Return Values and Overloading](../../../lab_diagrams/mod02-ex04-methods.png)

> **New for Module 2:** declaring your own methods, passing parameters, returning a value, and overloading.

## Activity card

| | |
| --- | --- |
| **Objective** | Implement methods with params/returns and a simple overload |
| **Skills practiced** | method signatures, return, overloading |
| **Expected outcome** | Calls print expected results for `square(int)` / `square(double)` overloads |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-02-exercises/MethodsDemo.java` |
| **Checkpoint** | D (after slides 67–69) |

## What you will learn

- Parameters in / return out
- Overloading = same name, different parameter lists
- Return type alone cannot overload

**Enterprise context:** Fee calculators expose overload-friendly APIs (int cents vs double amount).

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
square(4) = 16
square(2.5) = 6.25
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/MethodsDemo.java`](starter/MethodsDemo.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class MethodsDemo {
    // TODO: method that takes an int and returns n * n
    public static int square(int n) {
        // return _____;
    }

    // TODO: overload — same name, double parameter, return n * n as double
    public static double square(double n) {
        // return _____;
    }

    public static void main(String[] args) {
        // TODO: call both overloads and print the results
        // int intResult = square(4);
        // double doubleResult = square(2.5);
        // System.out.println("square(4) = " + intResult);
        // System.out.println("square(2.5) = " + doubleResult);
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Parameter | Input value a method receives (`n`) |
| Return type | The type of value sent back (`int`, `double`) |
| Overloading | Same method name, different parameter types — the compiler picks which one to call |

## Steps

### Step 1 — Create `MethodsDemo.java`

**Why:** Lab 2's student menu app calls named methods for each menu option instead of one giant `main`.

1. **New → File** → `MethodsDemo.java`.
2. Paste the starter.
3. Fill every `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

**Verified (Windows):**

```text
square(4) = 16
square(2.5) = 6.25
```

## Expected result

Both calls print the correct square, and the program compiles even though two methods share the name `square`.


## Predict the Output

Which overload runs for `square(4)` vs `square(2.5)`?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `error: square(int) is already defined` | The two overloads must differ in parameter **type**, not just variable name |
| Wrong result for the `double` call | Confirm you called `square(2.5)`, not `square((int) 2.5)` |
| `missing return statement` | Each `square` method must `return` a value |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Both `square` calls print the correct result | Pass / Fail |
| 2 | You can explain how Java chooses which overload to call | Pass / Fail |
