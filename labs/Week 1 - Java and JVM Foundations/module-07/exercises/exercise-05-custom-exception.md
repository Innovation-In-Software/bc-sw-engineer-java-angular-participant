# Exercise 5 — Custom Checked Exception

**Module 7** · Pre-lab practice · Checkpoint D · Exercises 1–8 Pass then Lab 7
**Folder:** `examples/module-07-exercises/` ([setup](EXERCISES-INDEX.md))

![Build a Custom Checked Exception](../../../lab_diagrams/mod07-ex05-custom-exception.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Create InsufficientFundsException with balance/requested context |
| **Skills practiced** | Custom checked exception, domain context fields |
| **Expected outcome** | Withdraw fails with structured message; balance unchanged |
| **Estimated time** | 15–18 minutes |
| **File to create** | `examples/module-07-exercises/` → InsufficientFundsException.java, Account.java, CustomExceptionDemo.java |
| **Checkpoint** | D (after slides 181–183) |

## What you will learn

- Domain exceptions carry fields callers can use (not only getMessage)
- Checked domain failures force callers to decide
- Preserve money invariants when rejecting withdraw

**Enterprise context:** Banking withdraw paths need typed insufficient-funds failures for UI and audit logs.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Insufficient funds: balance=100.00, requested=150.00
Short by: 50.00
Balance unchanged: 100.00
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste each skeleton, then replace every `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished files.

Create **three** files. The demo's `withdraw(150.00)` call is scaffolded — your job is the **exception class**, the **throw** in `Account`, and the **catch** in the demo.

### `InsufficientFundsException.java`

```java
public class InsufficientFundsException
        extends _____ { // TODO: extend Exception (checked)
    private final double balance;
    private final double requested;

    public InsufficientFundsException(
            double balance, double requested) {
        // TODO: call super with formatted message:
        //   "Insufficient funds: balance=%.2f, requested=%.2f"
        super(_____);
        this.balance = balance;
        this.requested = requested;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequested() {
        return requested;
    }
}
```

### `Account.java`

```java
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {
        // Validate before mutating state.
        if (amount > balance) {
            // TODO: throw new InsufficientFundsException(balance, amount)
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

### `CustomExceptionDemo.java`

```java
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        try {
            account.withdraw(150.00);
        } catch (_____ ex) { // TODO: catch InsufficientFundsException
            // TODO: print ex.getMessage()
            // TODO: print shortfall with printf — ex.getRequested() - ex.getBalance()
        }

        // Failed withdrawal must leave the original balance unchanged.
        System.out.printf("Balance unchanged: %.2f%n",
                account.getBalance());
    }
}
```

## Steps

### Step 1 — Create the three files

**Why:** Lab 7 uses custom checked exceptions for domain rules such as
insufficient funds and invalid PIN.

1. **New → File** → `InsufficientFundsException.java`, `Account.java`, `CustomExceptionDemo.java`.
2. Paste each starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Why:** The verified session proves both messaging and unchanged state.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-07-exercises
javac InsufficientFundsException.java Account.java CustomExceptionDemo.java
java CustomExceptionDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-07-exercises
javac InsufficientFundsException.java Account.java CustomExceptionDemo.java
java CustomExceptionDemo
```

**Verified:**

```text
Insufficient funds: balance=100.00, requested=150.00
Short by: 50.00
Balance unchanged: 100.00
```

### Step 3 — Prove the checked contract

**Why:** Extending `Exception` forces callers to catch or declare.

Temporarily remove the `try-catch` in the demo. Compilation should fail.
Restore it.

### Step 4 — Explain mutation order

**Why:** Domain methods must reject invalid work before changing state.

Validation happens before `balance -= amount`; therefore failure leaves state
unchanged.

## Expected result

The exception carries useful domain context, caller recovery is enforced, and
failed withdrawal does not mutate balance.


## Debug / design challenge

Extend RuntimeException by mistake — change to Exception and update callers.

## Predict the Output / Behavior

After a failed withdraw(150) on balance 100, what is balance?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Caller not forced to handle | Extend `Exception`, not `RuntimeException` |
| Balance becomes negative | Throw before subtracting |
| Message lacks useful context | Include balance and requested amount |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Output reports shortfall `50.00` | Pass / Fail |
| 2 | Balance remains `100.00` | Pass / Fail |
| 3 | Caller enforces catch-or-declare | Pass / Fail |
