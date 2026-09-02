# Exercise 2 — Filter Employees by Salary

**Module 6** · Pre-lab practice · Checkpoint B · Exercises 1–7 Pass then Lab 6
**Folder:** `examples/module-06-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Streams: Filtering Employees by Salary](../../../lab_diagrams/mod06-ex02-filter-salary.png)

> **Builds on Exercise 1:** Reuse `Employee.java` and `EmployeeData.java`.

## Activity card

| | |
| --- | --- |
| **Objective** | Filter employees with salary > 60_000 using stream().filter(...).toList() |
| **Skills practiced** | Stream source, intermediate filter, terminal toList |
| **Expected outcome** | High earners listed; source list size unchanged |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-06-exercises/` → FilterSalaryDemo.java |
| **Checkpoint** | B (after slides 158–159) |

## What you will learn

- filter keeps elements that match a Predicate
- Intermediate ops are lazy until a terminal op runs
- Source collections are not mutated by a normal stream pipeline

**Enterprise context:** Payroll dashboards filter active / high-band employees without cloning HR master lists.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

Complete form of the idea (your file should look similar when TODOs are filled):

```java
import java.util.List;

public class FilterSalaryDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: stream pipeline — filter salary > 60_000, collect to List<Employee>
        List<Employee> highEarners = employees.stream()
                // TODO: .filter(...)
                // TODO: .toList()
                ;

        System.out.println("Employees above 60000:");
        highEarners.forEach(employee ->
                System.out.printf("%s - %.0f%n",
                        employee.name(), employee.salary()));

        System.out.println("Source size: " + employees.size());
        System.out.println("Filtered size: " + highEarners.size());
    }
}
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.List;

public class FilterSalaryDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: stream pipeline — filter salary > 60_000, collect to List<Employee>
        List<Employee> highEarners = employees.stream()
                // TODO: .filter(...)
                // TODO: .toList()
                ;

        System.out.println("Employees above 60000:");
        highEarners.forEach(employee ->
                System.out.printf("%s - %.0f%n",
                        employee.name(), employee.salary()));

        System.out.println("Source size: " + employees.size());
        System.out.println("Filtered size: " + highEarners.size());
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Source | `employees.stream()` reads the collection |
| Intermediate operation | `filter` — lazy until a terminal operation runs |
| Terminal operation | `toList()` executes the pipeline and returns a new list |
| Predicate | Boolean test such as `employee -> employee.salary() > 60_000` |

## Steps

### Step 1 — Predict the result

**Why:** A predicate is easier to debug when you evaluate the condition for
each input before running the code.

Write `keep` or `discard` beside:

- Alice — 72,000
- Bob — 65,000
- Charlie — 80,000
- Diana — 90,000
- Evan — 55,000

### Step 2 — Create `FilterSalaryDemo.java`

**Why:** `filter` is the first stream intermediate operation in this module.

1. **New → File** → `FilterSalaryDemo.java`.
2. Paste the starter.
3. Fill the stream chain `// TODO`s. Save.

### Step 3 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java FilterSalaryDemo.java
java FilterSalaryDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java FilterSalaryDemo.java
java FilterSalaryDemo
```

**Expected output:**

```text
Employees above 60000:
Alice - 72000
Bob - 65000
Charlie - 80000
Diana - 90000
Source size: 5
Filtered size: 4
```

### Step 4 — Test the boundary

Change the threshold to `65_000`.

- With `> 65_000`, Bob is excluded.
- With `>= 65_000`, Bob is included.

Restore `> 60_000` when finished.

## Expected result

The filtered list contains Alice, Bob, Charlie, and Diana. Evan is excluded,
and the original source list still contains five employees.


## Debug / design challenge

Accidentally call employees.removeIf(...) — restore stream filter and prove source size stays 5.

## Predict the Output / Behavior

For the sample data, how many employees have salary > 60_000?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| All five employees print | Confirm the condition is inside `.filter(...)` and uses `> 60_000` |
| Nothing happens | Add a terminal operation such as `.toList()`; intermediate operations are lazy |
| `toList()` is unknown | Confirm `java -version` and `javac -version` report JDK 21 |
| `EmployeeData` is missing | Complete Exercise 1 in the same folder |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

Self-check before marking Pass:

- [ ] Exactly four employees print at the 60,000 threshold
- [ ] Evan does not appear in the filtered output
- [ ] Source size remains 5 and filtered size is 4
- [ ] You can explain why `filter` is an intermediate operation

