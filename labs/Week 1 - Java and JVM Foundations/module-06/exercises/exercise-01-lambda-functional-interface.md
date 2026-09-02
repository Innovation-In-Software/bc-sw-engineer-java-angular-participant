# Exercise 1 — Lambda and a Custom Functional Interface

**Module 6** · Pre-lab practice · Checkpoint A · Exercises 1–7 Pass then Lab 6
**Folder:** `examples/module-06-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Lambdas: From Anonymous Class to Functional Interface](../../../lab_diagrams/mod06-ex01-lambda-functional-interface.png)

> **Start here:** This exercise creates the shared `Employee` model and sample
> dataset used by Exercises 2–7.

## Activity card

| | |
| --- | --- |
| **Objective** | Compare anonymous class vs lambda for a custom SalaryCheck interface |
| **Skills practiced** | Functional interface, lambda, shared Employee dataset |
| **Expected outcome** | LambdaDemo prints matching true/true for Alice |
| **Estimated time** | 15–18 minutes |
| **File to create** | `examples/module-06-exercises/` → Employee.java, EmployeeData.java, SalaryCheck.java, LambdaDemo.java |
| **Checkpoint** | A (after slides 152–157) |

## What you will learn

- A functional interface has exactly one abstract method
- A lambda is a short implementation of that method
- Same dataset across exercises keeps answers comparable

**Enterprise context:** HR salary-band rules are often expressed as predicates reused by filters and reports.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

Complete form of the idea (your file should look similar when TODOs are filled):

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste each file below, then replace every `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished files.

Create `Employee.java` (complete scaffolding — copy as-is):

```java
public record Employee(
        int id,
        String name,
        String department,
        double salary) {
}
```

Create `EmployeeData.java` (complete scaffolding — copy as-is):

```java
import java.util.List;

public final class EmployeeData {
    private EmployeeData() {
    }

    public static List<Employee> sample() {
        return List.of(
                new Employee(1, "Alice", "HR", 72_000),
                new Employee(2, "Bob", "IT", 65_000),
                new Employee(3, "Charlie", "HR", 80_000),
                new Employee(4, "Diana", "Finance", 90_000),
                new Employee(5, "Evan", "IT", 55_000));
    }
}
```

Create `SalaryCheck.java`:

```java
@FunctionalInterface
public interface SalaryCheck {
    // TODO: declare one abstract method that takes an Employee and returns boolean
    _____
}
```

Create `LambdaDemo.java`:

```java
public class LambdaDemo {
    public static void main(String[] args) {
        Employee alice = EmployeeData.sample().get(0);

        // TODO: anonymous class implementing SalaryCheck — salary > 60_000
        SalaryCheck anonymous = new SalaryCheck() {
            @Override
            public boolean test(Employee employee) {
                return _____;
            }
        };

        // TODO: lambda with the same SalaryCheck contract and same result
        SalaryCheck lambda = _____;

        System.out.println("Employee: " + alice.name());
        System.out.println("Anonymous result: " + anonymous.test(alice));
        System.out.println("Lambda result: " + lambda.test(alice));
    }
}
```

| Term | Easy meaning |
| ---- | ------------ |
| Functional interface | An interface with exactly one abstract method |
| Lambda | A short implementation of that one method |
| Parameter | Input on the left side of `->` |
| Expression body | Value or action on the right side of `->` |
| Effectively final | A captured local value that is not reassigned |

## Steps

### Step 1 — Create the shared model and dataset

**Why:** Every later exercise should answer a new stream question against the
same known data instead of redefining inconsistent employees.

1. **New → File** → `Employee.java` and `EmployeeData.java`.
2. Paste the scaffolding exactly as shown. Save both files.

### Step 2 — Create the functional contract

**Why:** The lambda's target type tells Java the parameter and return types.

1. Create `SalaryCheck.java`.
2. Fill the `// TODO` — keep exactly one abstract method named `test`.

### Step 3 — Compare both implementations

**Why:** Reading the anonymous class first makes the lambda easier to recognize.

1. Create `LambdaDemo.java`.
2. Fill every `_____` / `// TODO`. Save.

### Step 4 — Compile and run

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java SalaryCheck.java LambdaDemo.java
java LambdaDemo
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java SalaryCheck.java LambdaDemo.java
java LambdaDemo
```

**Expected output:**

```text
Employee: Alice
Anonymous result: true
Lambda result: true
```

### Step 5 — Change the threshold

Change both checks from `60_000` to `75_000`, recompile, and rerun.

Expected: both results become `false`. Restore `60_000` before Exercise 2.

## Expected result

Four source files compile. The anonymous class and lambda produce identical
results for both tested thresholds.


## Debug / design challenge

Add a second abstract method to SalaryCheck — fix until the lambda compiles again.

## Predict the Output / Behavior

If threshold is 75_000, what do both implementations return for Alice (72_000)?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `cannot find symbol Employee` | Compile `Employee.java` with the other files and stay in the exercises folder |
| `SalaryCheck is not a functional interface` | Keep exactly one abstract method in `SalaryCheck` |
| Record access error such as `salary has private access` | Call `employee.salary()`, not `employee.salary` |
| Anonymous and lambda results differ | Use the same comparison and threshold in both implementations |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] All four files compile and `LambdaDemo` runs
- [ ] Both implementations return `true` at 60,000
- [ ] Both implementations return `false` at 75,000
- [ ] You can explain what `employee -> ...` means

