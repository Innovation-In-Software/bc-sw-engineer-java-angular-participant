# Exercise 3 — Inheritance and Polymorphism

**Module 3** · Pre-lab practice · Checkpoint C · all 8 then lab
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Inheritance and Runtime Polymorphism](../../../lab_diagrams/mod03-ex03-inheritance-polymorphism.svg)

> **Builds on Exercise 2:** Keep `Account.java`. Add two specialized account types and call overridden behavior through `Account` references.

## Activity card

| | |
| --- | --- |
| **Objective** | Extend Account; override behavior; use base-type references |
| **Skills practiced** | extends, super, override, polymorphism |
| **Expected outcome** | Demo runs savings/current via Account references |
| **Estimated time** | 18–20 minutes |
| **File to create** | `examples/module-03-exercises/SavingsAccount.java / CurrentAccount.java (+ demo)` |
| **Checkpoint** | C (after slides 93–98) |

## What you will learn

- Inheritance shares common account state
- Override specializes withdraw/interest
- Base references enable polymorphic calls

**Enterprise context:** Savings vs current products share Account contracts but differ in overdraft/interest rules.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Savings balance: 80.00
Current balance: 78.00
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy matching files from [`starter/`](starter/README.md). Or paste:


Paste these skeletons, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished files.

### `SavingsAccount.java`

```java
public class SavingsAccount _____ Account {
    public SavingsAccount(double initialBalance) {
        // TODO: call parent constructor with initialBalance
        _____;
    }

    @Override
    public String getAccountType() {
        // TODO: return "Savings"
        return _____;
    }
}
```

### `CurrentAccount.java`

```java
public class CurrentAccount extends Account {
    private static final double WITHDRAWAL_FEE = 2.00;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO: reuse parent validation — withdraw amount + WITHDRAWAL_FEE
        return _____;
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
```

### `InheritanceDemo.java`

```java
public class InheritanceDemo {
    public static void main(String[] args) {
        // TODO: base-type array holding SavingsAccount(100) and CurrentAccount(100)
        Account[] accounts = {
            _____,
            _____
        };

        for (Account account : accounts) {
            // Runtime type chooses the overridden method.
            account.withdraw(20.00);
            System.out.printf("%s balance: %.2f%n",
                    account.getAccountType(),
                    account.getBalance());
        }
    }
}
```

| Keyword / idea | Easy meaning |
| -------------- | ------------ |
| `extends Account` | Subclass inherits accessible Account behavior |
| `super(initialBalance)` | Run the parent constructor |
| `@Override` | Ask the compiler to verify a parent method is replaced correctly |
| `super.withdraw(...)` | Reuse parent validation instead of duplicating it |
| `Account[]` | One base type stores different concrete account objects |
| Runtime polymorphism | Actual object type selects the override at runtime |

## Steps

### Step 1 — Confirm Exercise 2 files remain

**Why:** These subclasses depend on `Account.java`.

Your folder should already include:

```text
Account.java
EncapsulationDemo.java
```

If not, complete Exercise 2 first.

### Step 2 — Create the three new files

Create:

```text
SavingsAccount.java
CurrentAccount.java
InheritanceDemo.java
```

Paste the starter skeletons. Fill every `_____` / `// TODO`. Save.

### Step 3 — Compile

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
```

### Step 4 — Run

```text
java InheritanceDemo
```

**Verified (Windows):**

```text
Savings balance: 80.00
Current balance: 78.00
```

The current account loses `20.00 + 2.00 fee`; the savings account loses only `20.00`.

### Step 5 — Explain the polymorphic call

**Why:** The variable type and object type are not always the same.

For the second loop iteration:

```text
Reference type: Account
Object type:    CurrentAccount
Method chosen:  CurrentAccount.withdraw
```

## Expected result

One `Account[]` holds both subclasses. The same `withdraw(20)` call produces different balances because the current account override adds a fee.


## Debug / design challenge

Forget super(...) in subclass constructor — fix the compile error.

## Predict the Output / Behavior

Account a = new SavingsAccount(...); which withdraw runs?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace blanks with `extends`, `super(...)`, `super.withdraw(...)`, etc. |
| `constructor Account... cannot be applied` | Add `super(initialBalance)` |
| `method does not override` | Match parent name, parameters, and return type exactly |
| Both balances are `80.00` | Confirm `CurrentAccount` overrides `withdraw` |
| Cannot update private balance in subclass | Call `super.withdraw`; do not make balance public |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Savings prints `80.00`; Current prints `78.00` | Pass / Fail |
| 2 | Base-type array contains both subclass objects | Pass / Fail |
| 3 | You can explain `super` and runtime polymorphism | Pass / Fail |
