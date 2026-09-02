# Exercise 5 — Interface Practice

**Module 3** · Pre-lab practice · Checkpoint D · all 8 then lab
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Printable Interface Implemented by Customer](../../../lab_diagrams/mod03-ex05-interface.png)

> **New design idea:** Inheritance says what an object **is**; an interface states a capability an object promises to provide.

## Activity card

| | |
| --- | --- |
| **Objective** | Define a Printable contract and implement it on domain types |
| **Skills practiced** | interface, implements, interface references |
| **Expected outcome** | printDetails works via Printable reference |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-03-exercises/Printable.java (+ implementors/demo)` |
| **Checkpoint** | D |

## What you will learn

- Interfaces define capability without inheritance tree
- Program to the interface
- One type can implement multiple contracts

**Enterprise context:** Statements, receipts, and audit exports often share a printable/reportable contract.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Customer C101: Aman Singh
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy matching files from [`starter/`](starter/README.md). Or paste:


Paste these skeletons, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished files.

### `Printable.java`

```java
public _____ Printable {
    // TODO: declare void printDetails() (public abstract by default in an interface)
    _____ void printDetails();
}
```

### `Customer.java`

```java
public class Customer _____ Printable {
    private final String id;
    private final String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDetails() {
        // TODO: printf "Customer %s: %s%n" with id and name
        System.out.printf(_____, id, name);
    }
}
```

### `InterfaceDemo.java`

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // TODO: Printable reference to new Customer("C101", "Aman Singh")
        Printable printable = _____;

        printable.printDetails();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `interface Printable` | Defines a contract, not customer state |
| `implements Printable` | Customer promises to supply every required method |
| `Printable printable` | Code depends on capability rather than concrete class |
| `@Override` | Compiler checks the implementation matches the contract |

## Steps

### Step 1 — Create the contract

**Why:** The caller should be able to request “print your details” without knowing whether the object is a customer or account.

Create `Printable.java`. Paste the starter. Fill every `_____` / `// TODO`. Save.

### Step 2 — Create the implementation

**Why:** An implementing class decides how its own details should be displayed.

Create `Customer.java`, add `implements Printable`, and implement `printDetails()`. Fill every blank. Save.

### Step 3 — Create and run the demo

Create `InterfaceDemo.java`. Fill the blank. Save.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Printable.java Customer.java InterfaceDemo.java
java InterfaceDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Printable.java Customer.java InterfaceDemo.java
java InterfaceDemo
```

**Verified (Windows):**

```text
Customer C101: Aman Singh
```

### Step 4 — Run a failure experiment

**Why:** The compiler enforces interface contracts.

Temporarily remove `printDetails()` from `Customer`, then compile. Expected message includes:

```text
Customer is not abstract and does not override abstract method printDetails()
```

Restore the method before continuing.

## Expected result

The customer’s implementation runs even though the variable is declared as `Printable`.


## Predict the Output / Behavior

Can an interface reference hold a SavingsAccount that implements Printable?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Use `interface`, `implements`, format string, and `new Customer(...)` |
| Interface method has weaker access | Implementation must be `public` |
| `cannot find symbol Printable` | Compile `Printable.java` with the other files |
| Method does not override | Match `void printDetails()` exactly |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Output prints `Customer C101: Aman Singh` | Pass / Fail |
| 2 | The reference type in the demo is `Printable` | Pass / Fail |
| 3 | You can distinguish `extends` from `implements` | Pass / Fail |
