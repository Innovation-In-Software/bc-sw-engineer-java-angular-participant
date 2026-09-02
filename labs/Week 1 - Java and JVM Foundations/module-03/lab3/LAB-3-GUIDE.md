# Lab 3: Object-Oriented Design — Banking Management System

> **Participants:** Module sequence is in [`../README.md`](../README.md). **Do not start this guide until** you have finished Module 3 [pre-lab exercises 1–8](../exercises/EXERCISES-INDEX.md) (Pass — check yourself, do not write it down). Exercises 1–2 were started on Day 2; finish 3–8 before this lab. Then open **one** OS how-to ([Windows](LAB-3-WINDOWS.md) · [macOS](LAB-3-MACOS.md)). In class, prefer the **45-minute timed path** with [`starter/`](starter/README.md); the **full path** is every Step below (homework / extended). This repo has no answer keys — complete the TODOs yourself. See [Which file do I open?](../../../_PARTICIPANT-FILE-GUIDE.md).

## Activity card

| | |
| --- | --- |
| **Objective** | Build a packaged banking system with abstract Account hierarchy, polymorphism, and BankService |
| **Skills practiced** | Encapsulation, inheritance, abstract types, interfaces, menu orchestration |
| **Expected outcome** | Create customer/accounts, deposit/withdraw, display (interest/charges), evidence saved |
| **Estimated time** | Timed path ~45 min · Full path 90–240 min |
| **Prerequisites** | Lab 0–2 · Exercises 1–8 Pass · JDK 21 |
| **Expected files** | `examples/Lab3-BankingSystem/src/com/academy/bank/*.java` (8 types) |
| **Validation checkpoints** | Starter smoke test · GUIDE Implementation Checkpoints |

**Module:** 3 — Object-Oriented Programming in Java  
**Duration:** ~45 minutes (timed path with starter) · Full path: 90–240 minutes (Day 3 core checkpoint ~90 min; finish remaining menu paths as extended work)  
**IDE conventions:** See [`../_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-3-WINDOWS.md](LAB-3-WINDOWS.md) |
| macOS | [LAB-3-MACOS.md](LAB-3-MACOS.md) |

> **Incremental build:** Extends Lab 2 package/`src`/`out` habits and Module 3 Exercises 2–5 banking types into `com.academy.bank` — not a brand-new domain from zero.

## 45-minute timed path (use starter)

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/Lab3-BankingSystem/` into your `java-bootcamp/examples/Lab3-BankingSystem/` target folder (commands in the starter README).
3. Fill every `// TODO` / `_____` — complete every TODO yourself.
4. Run the starter smoke test; commit your work to your GitHub repo (no screenshots).
5. Check the **timed-path Pass criteria** in the starter README yourself (do not write the marks down). Continue remaining GUIDE steps only if time allows (or as homework).

| Path | Time | Scope |
| ---- | ---- | ----- |
| **Timed (default)** | ~45 min | Starter TODOs + smoke test |
| **Full (extended)** | see Duration | Every Step in this GUIDE |

> **Timed path (starter):** If you copied `starter/Lab3-BankingSystem/`, **skip the create Steps** that scaffold packages and class shells — those eight types already exist. Fill TODOs only. Implement `SavingsAccount.calculateInterest` and `CurrentAccount.calculateCharges` **before** you rely on Display Accounts (menu `6`), because display prints interest/charges. Bonus menus **9–13** are optional on the timed path; core smoke uses create customer / savings / deposit / withdraw / display / exit.

**Verified participant layout (Windows IntelliJ + PowerShell; Temurin JDK 21.0.11):**

| Role | Path |
| ---- | ---- |
| IntelliJ opens | `%USERPROFILE%\java-bootcamp` (SDK / language level **21**) |
| Pre-lab exercises | `examples\module-03-exercises\` (flat files — must exist before lab work) |
| This lab project | `examples\Lab3-BankingSystem\` with `src\com\academy\bank\` |
| Compile / run (from `Lab3-BankingSystem`) | Named `javac -d out` on the eight sources → `java -cp out com.academy.bank.Main` |
| Smoke-test output | Menu → `C101` → savings `10001` → deposit `2000` → withdraw `3000` → display `9000` / interest `450` → `Thank You` |

**If it fails (Windows PowerShell):** Prefer naming each `.java` file in the `javac` line (as in [LAB-3-WINDOWS.md](LAB-3-WINDOWS.md)); do not rely on `*.java` globs. Mark `examples\Lab3-BankingSystem\src` as Sources Root — not `module-03-exercises`.

---

## What you'll complete (practice only)

Labs and exercises are **practice only**. Nothing is submitted or graded. Do not take screenshots. Check Pass/Fail yourself — do not write those marks anywhere. Commit your work to your private `java-bootcamp` GitHub repo.

Keep this checklist visible while you work.

| # | Deliverable | Where / what |
| - | ----------- | ------------ |
| 1 | Full source | `examples/Lab3-BankingSystem/src/com/academy/bank/` |
| 2 | GitHub commit | Sources in your private `java-bootcamp` repo — no screenshots, nothing to submit |
| 3 | UML class diagram | Mermaid or image covering your types + `BankService` / `Main` |
| 4 | Short design note | SOLID + inheritance/polymorphism in your own words |
| 5 | Compile/run commands | Documented `javac -d out` / `java -cp out com.academy.bank.Main` |

**Commit to your GitHub repo:** the items in the table above (sources + evidence + short notes).

**Do not commit:** `target/`, `node_modules/`, secrets, heap dumps, or a copied answer keys.

## Module 3 exercises you must already have completed

Lab 3 assumes you already practiced these design skills in `examples/module-03-exercises/`. Do **not** treat Steps 3–6 as your first time seeing encapsulation, inheritance, abstract classes, or interfaces.

| Exercise | You already did | Lab 3 builds on it |
| -------- | --------------- | ------------------ |
| 1 — Domain entities | Customer / Account / Transaction notes | Same nouns in the packaged model + Step 14 UML |
| 2 — Encapsulation | Private balance; validated deposit/withdraw | Steps 4–5 / 10 balance protection |
| 3 — Inheritance / polymorphism | Savings / Current + `Account[]` demo | Steps 5–6, 10 polymorphic display |
| 4 — Abstract classes | Separate `AbstractAccount` mini | Lab makes real `Account` abstract (Steps 4, 11) — same idea, lab names |
| 5 — Interface | `Printable` + `Customer` | Step 3; Lab also has Savings/Current implement `Printable` |
| 6 — SOLID SRP | Main vs service vs domain sentence | Steps 8–12 thin `Main` / `BankService` |
| 7 — SOLID OCP/LSP/ISP/DIP | Notes + `FrozenAccount` thought experiment | Step 13 checklist (FrozenAccount not required in Lab core) |
| 8 — Mini UML | Six-type Mermaid | Step 14 grows diagram to include `BankService` / `Main` |

**Intentional design deltas (extend — do not paste exercise code blindly):**

* Exercises were **flat** default-package files; Lab uses `package com.academy.bank` + `src` / `out`
* Exercise 3 may fee via `super.withdraw(amount + FEE)`; Lab prefers a `calculateCharges()` hook in base `withdraw`
* Exercise 4 used `AbstractAccount`; Lab’s graded base type is named `Account` (abstract)
* Exercise 2 may omit `setBalance`; Lab often uses `protected setBalance` for safe subtype updates

**Lab-only additions:** packaged banking console, `BankService` arrays + full menu, `Transaction` wiring, sample session C101 / savings / deposit / withdraw, GitHub commit of your sources.

If any of Exercises 1–8 is still **Fail**, finish that exercise first — then return here.

---

## Lab Overview

This Module 3 lab is the consolidation after Module 3 slides and [Exercises 1–8](../exercises/EXERCISES-INDEX.md). You already practiced domain modeling, encapsulation, inheritance, abstraction, interfaces, SOLID spot-checks, and mini UML in `module-03-exercises/`. Here you assemble those skills into a **menu-driven Banking Management System** with packages and a clear model / service / `Main` split.

## Learning Objectives

After completing this lab, you will be able to:

* Assemble a packaged banking domain from exercise entity notes (Customer, accounts, transactions)
* Apply encapsulation with `private` fields and protected balance updates on abstract `Account`
* Model inheritance: abstract `Account` → `SavingsAccount` / `CurrentAccount` (builds on Exercises 3–4)
* Define and implement `Printable` on Customer and account types (builds on Exercise 5)
* Use polymorphism: `Account[]` holding both account types; runtime `displayAccount()`

## Business Scenario

Bank staff need a console tool to:

* Create customers
* Open **Savings** (interest) or **Current** (transaction fee) accounts
* Deposit and withdraw
* Display accounts and customers
* Exit cleanly

You already practiced the OOP building blocks in Module 3 Exercises 1–8. Today’s practice pass consolidates those skills into one Banking Management menu (pedagogical bank types — not Spring/CRM).

Demo data matching the reference sample:

* Customer `C101`, Name `John Smith`, Email `john@gmail.com`, Phone `1234567890`
* Savings: initial balance `10000`, interest rate `5%`
* Deposit `2000`, then withdraw `3000`

---

## Architecture Context
### Layered console design

```mermaid
flowchart TB
  Main["Main<br/>menu loop / switch"] -->|uses| BS["BankService<br/>customers / accounts / txs"]
  Scan["Scanner System.in"] --> BS
  BS --> Cust["Customer[]"]
  BS --> Acc["Account[]<br/>Savings / Current"]
  Cust -->|owns| Acc
  Acc --> Tx["Transaction[]"]
  Tx --> Out["console output"]
```

### Inheritance and interface


### Menu flow


### Lab build order


### Compile → run


---

## Prerequisites

Complete **all** of the following before Step 1:

1. [Lab 0](../../module-00/lab0/LAB-0-GUIDE.md) and Lab 2 habits (packages, `Scanner`, menu loop) — [`../_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)
2. Module 3 [Exercises 1–8](../exercises/EXERCISES-INDEX.md) — all Pass rows marked **Pass**

| Check | Must be true |
| ----- | ------------ |
| JDK | `java` / `javac` show **21.x** |
| Workspace | `java-bootcamp/examples/` available |
| IDE | Desktop **VS Code** and/or **IntelliJ IDEA Community** |
| Prior lab | Comfortable with `javac -d out` / `java -cp out` (Lab 2) |
| Exercises | `examples/module-03-exercises/` has your Exercise 1–8 work |

Confirm exercise readiness (from your notes / `module-03-exercises/`):

| # | Exercise skill | Ready? |
| - | -------------- | ------ |
| 1 | Domain entity table for Customer / Account / Transaction | Pass / Fail |
| 2 | Encapsulated deposit/withdraw without exposing raw balance writes | Pass / Fail |
| 3 | Inheritance + polymorphic `Account[]` display | Pass / Fail |
| 4 | Abstract type that cannot be instantiated | Pass / Fail |
| 5 | Interface + `implements` + interface reference | Pass / Fail |
| 6–7 | SRP / OCP–DIP spot-check notes | Pass / Fail |
| 8 | Mini UML with inheritance + associations | Pass / Fail |

If any row is **Fail**, finish that exercise before continuing.

### Pre-flight

**Windows PowerShell**

```powershell
java -version
javac -version
cd $env:USERPROFILE\java-bootcamp
pwd
Get-ChildItem examples\module-03-exercises
```

**macOS / Linux**

```bash
java -version
javac -version
cd ~/java-bootcamp
pwd
ls examples/module-03-exercises
```

**Expected result:** JDK 21.x; current directory under `java-bootcamp`; exercise sources present.

**If it fails:** Stop and fix Lab 0 (`PATH` / `JAVA_HOME`). If exercises are missing, return to [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md).

---

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```
================================
Bank Management System
================================
1 Create Customer
...
Choice : 1
Customer ID : C101
Name : John Smith
Email : john@gmail.com
Phone : 1234567890
Customer Created Successfully.
----------------------------------
Choice : 2
Customer ID : C101
Initial Balance : 10000
Interest Rate (%) : 5
Savings Account Created.
Account Number : 10001
Balance : 10000
Interest Rate : 5%
----------------------------------
Choice : 4
Account Number : 10001
Deposit Amount : 2000
Balance Updated : 12000
----------------------------------
Choice : 5
Account Number : 10001
Withdraw : 3000
Balance Updated : 9000
----------------------------------
Choice : 6
Savings Account
Account Number : 10001
Customer : John Smith
Balance : 9000
Interest Rate : 5%
Interest : 450
----------------------------------
Choice : 8
// ... truncated — see full sample in the Steps
```

**What to notice:** Match names, IDs, and failure behavior from the scenario — instructors check these.

---

## Implementation Steps

Every step uses **Why:** / **Do this:** / **Expected result:** / **If it fails:**  
Prefer writing your own code. There is no answer-key folder in this repo.

---

### Step 1 — Create the project folders

**Why:** Package `com.academy.bank` must match folders under `src`.

**Builds on:** Exercises used a **flat** `module-03-exercises/` folder. This lab uses the packaged `src/` / `out/` layout from Lab 2.

**Do this:**

**Windows PowerShell**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\Lab3-BankingSystem\src\com\academy\bank | Out-Null
cd examples\Lab3-BankingSystem
Get-ChildItem -Recurse src
```

**macOS / Linux**

```bash
cd ~/java-bootcamp
mkdir -p examples/Lab3-BankingSystem/src/com/academy/bank
cd examples/Lab3-BankingSystem
find src -type d
```

**Expected result:** Empty package folder `src/com/academy/bank` exists.

**If it fails:** Confirm `java-bootcamp` from Lab 0; create under your user home, not a locked directory.

---

### Step 2 — Open the project in an IDE

**Why:** Dual-IDE support: VS Code (terminal-first) or IntelliJ (Sources Root + Run).

#### Option A — VS Code

**Do this:**

1. **File → Open Folder…** → `java-bootcamp/examples/Lab3-BankingSystem` (or open `java-bootcamp` and navigate).
2. **Terminal → New Terminal**.
3. `cd` into `Lab3-BankingSystem` if needed.

**Expected result:** Explorer shows `src/com/academy/bank`. Terminal is in the project root before you run `javac`.

**If it fails:** Wrong folder open → `cd` explicitly to `examples/Lab3-BankingSystem`.

#### Option B — IntelliJ IDEA Community

**Do this:**

1. **File → Open…** → select `Lab3-BankingSystem`.
2. Trust the project if asked.
3. **File → Project Structure → Project** → **SDK = 21**.
4. Right-click `src` → **Mark Directory as → Sources Root**.
5. After `Main` exists: Run gutter on `main`, or right-click `Main` → **Run ‘Main.main()’**.

**Expected result:** SDK 21; `src` marked as Sources Root; package `com.academy.bank` visible.

**If it fails:** SDK empty → install/assign JDK 21. Wrong root → mark `src`, not `src/com`.

---

### Step 3 — Create `Printable` and `Customer`

**Why:** Interfaces define a contract. Customers implement printable details for consistent display.

**Builds on Exercises 1 and 5:** Same Customer entity and `Printable` contract — now under `com.academy.bank` for the graded app.

**Do this:** Create `Printable.java`:

```java
package com.academy.bank;

public interface Printable {
    void printDetails();
}
```

Create `Customer.java` with private fields `customerId`, `name`, `email`, `phone`; a constructor; getters/setters; `display()`; and `printDetails()` that calls `display()`.

**Expected result:** Both files declare `package com.academy.bank;`. `Customer implements Printable`.

**If it fails:** Interface methods must be public in the implementing class. File names must match type names.

---

### Step 4 — Create abstract `Account`

**Why:** Shared deposit/withdraw logic lives once. Subclasses supply product-specific display and fees/interest.

**Builds on Exercises 2 and 4:** Encapsulation of balance + abstract contract. Exercise 4 may have used `AbstractAccount`; here the graded type is named `Account` (abstract). Prefer `protected setBalance` for safe updates.

**Do this:** Create abstract class `Account` with:

* Private fields: `accountNumber` (`String`), `balance` (`double`), `customer` (`Customer`)
* Protected constructor `(accountNumber, balance, customer)`
* Getters; `setBalance` should be **protected** (not public) so balance changes stay controlled
* `deposit(double amount)` — reject non-positive; else add to balance
* `withdraw(double amount)` — return `boolean`; deduct `amount + calculateCharges()` if funds allow
* Abstract `void displayAccount()`
* Default `calculateCharges()` → `0.0`, `calculateInterest()` → `0.0`, `getAccountType()` → `"Account"`

**Expected result:** You cannot write `new Account(...)` later without a compile error (verified in Step 10).

**If it fails:**

* Forgot `abstract` on class or `displayAccount` → subclasses break
* Public `setBalance` → tighten to `protected` for better encapsulation

---

### Step 5 — Create `SavingsAccount`

**Why:** Savings earns interest. Override display and interest calculation.

**Builds on Exercise 3:** Same Savings specialization — now packaged, implements `Printable`, and plugs into Lab’s `Account` base.

**Do this:** `SavingsAccount extends Account implements Printable`:

* Extra field `interestRate`
* Constructor calls `super(...)` then sets rate
* Override `calculateInterest()` → `getBalance() * interestRate / 100.0`
* Override `displayAccount()` to print type, number, customer name, balance, rate, interest
* `printDetails()` can call `displayAccount()`
* Override `getAccountType()` → `"Savings"`

**Expected result:** Creating a savings account (later via service) can show interest like `450` for balance `9000` at `5%`.

**If it fails:** Forgot `super(...)` as first constructor statement → compile error. Calling `balance` directly → use getters or protected setters from the base.

---

### Step 6 — Create `CurrentAccount`

**Why:** Current accounts charge a fee on withdrawal via `calculateCharges()`.

**Builds on Exercise 3:** Same Current specialization. Prefer the Lab fee hook (`calculateCharges()` in base `withdraw`) over pasting an exercise-only `super.withdraw(amount + FEE)` pattern unless you justify it.

**Do this:** `CurrentAccount extends Account implements Printable`:

* Field `transactionFee`
* Override `calculateCharges()` → return the fee
* Override `displayAccount()` for Current-specific fields
* `printDetails()` → `displayAccount()`
* `getAccountType()` → `"Current"`

**Expected result:** Withdraw path (in base `Account.withdraw`) automatically adds fee into the total deduction.

**If it fails:** Fee not applied → ensure `withdraw` uses `calculateCharges()`, and Current overrides it.

---

### Step 7 — Create `Transaction`

**Why:** Even without a database, recording activity teaches an audit trail mindset.

**Builds on Exercise 1:** Transaction was in your domain notes — now a real class wired by `BankService`.

**Do this:** Fields such as `transactionId`, `amount`, `type`, `date`, `accountNumber`; constructor; getters; a `display()` line (printf is fine).

**Expected result:** `BankService` can append transactions after successful deposit/withdraw.

**If it fails:** Keep it a simple data class—no need for inheritance here.

---

### Step 8 — Build `BankService` storage skeleton

**Why:** The service owns arrays and counts—same idea as Lab 2’s manager, richer domain.

**Builds on Exercise 6 (SRP) + Lab 2:** Orchestration lives in a service, not in `Main` or model classes.

**Do this:** Create `BankService` with:

```java
import java.util.Scanner;

private static final int MAX_CUSTOMERS = 50;
private static final int MAX_ACCOUNTS = 100;
private static final int MAX_TRANSACTIONS = 500;

private final Customer[] customers = new Customer[MAX_CUSTOMERS];
private final Account[] accounts = new Account[MAX_ACCOUNTS];
private final Transaction[] transactions = new Transaction[MAX_TRANSACTIONS];

private int customerCount = 0;
private int accountCount = 0;
private int transactionCount = 0;
private int nextAccountNumber = 10001;
private int nextTransactionNumber = 1;

private final Scanner scanner;

public BankService(Scanner scanner) {
    this.scanner = scanner;
}
```

Add empty/stub public methods matching menu actions until you implement them.

**Expected result:** One shared `Scanner` from `Main`. Account numbers will start at `10001`.

**If it fails:** Multiple `new Scanner(System.in)` across classes → inject the same scanner.

---

### Step 9 — Implement create customer & create accounts

**Why:** You need a customer before opening an account. Service looks up by ID.

**Builds on Exercises 1–2:** Same entities and validation mindset — now through `BankService` prompts.

**Do this:**

**Create customer:** prompt ID / name / email / phone; reject duplicate IDs; store in `customers[customerCount++]`; print `Customer Created Successfully.`

**Create savings:** find existing customer by ID; read initial balance and interest rate; allocate `String.valueOf(nextAccountNumber++)`; construct `SavingsAccount`; store in `accounts`; print confirmation including account number / balance / rate.

**Create current:** similar, with transaction fee instead of interest rate.

Helpers: `findCustomer(id)`, `readExistingCustomer()`, `readPositiveAmount(prompt)`.

**Expected result:** After creating `C101` and savings with balance `10000` / rate `5`:

```text
Customer Created Successfully.
...
Savings Account Created.
Account Number : 10001
Balance : 10000
Interest Rate : 5%
```

**If it fails:**

* Account without customer → `readExistingCustomer` returned null; stop early with a message
* Always account `10001` twice → forget to increment `nextAccountNumber`

---

### Step 10 — Implement deposit, withdraw, display

**Why:** Money movement exercises base `Account` methods; display proves polymorphism.

**Builds on Exercises 2–3:** Validated deposit/withdraw + polymorphic `Account[]` display from exercises — now in the graded menu paths.

**Do this:**

* **Deposit:** find account by number; read amount; `account.deposit(amount)`; record transaction; print `Balance Updated : ...`
* **Withdraw:** find account; `account.withdraw(amount)`; on success record transaction; for Current you may print fee and total deducted; print updated balance
* **Display accounts:** loop `0 .. accountCount-1` and call `accounts[i].displayAccount()`—do **not** cast unless necessary
* **Display customers:** loop and call `display()` / `printDetails()`

**Expected result:** Deposit `2000` then withdraw `3000` on the sample savings path ends near balance `9000`, matching the sample walkthrough below.

**If it fails:**

* Insufficient funds message → good; verify fee logic for Current
* All accounts print as base type → overrides missing on subclasses
* NPE → looped past `accountCount`

---

### Step 11 — Prove abstraction (compile-time)

**Why:** Abstract types prevent invalid objects.

**Builds on Exercise 4:** Same compiler proof you already saw — confirm graded `Account` is abstract.

**Do this:** Temporarily add (then delete) in any method:

```java
// Account a = new Account("X", 0, someCustomer); // must NOT compile
```

**Expected result:** Compiler rejects instantiating `Account`.

**If it fails:** If it compiles, `Account` is not `abstract`—fix it.

---

### Step 12 — Create menu-driven `Main`

**Why:** Entry point owns the loop only—same pattern as Lab 2.

**Builds on Exercise 6 + Lab 2:** Thin `Main` + `switch` menu; all banking ops stay in `BankService`.

**Do this:** `Main` creates `Scanner` + `BankService`, loops, reads choice with `nextLine()` + parse, switches:

| Choice | Action |
| ------ | ------ |
| 1 | `createCustomer` |
| 2 | `createSavingsAccount` |
| 3 | `createCurrentAccount` |
| 4 | `deposit` |
| 5 | `withdraw` |
| 6 | `displayAccounts` |
| 7 | `displayCustomers` |
| 8 | print `Thank You`, close scanner, return |

Print the menu headers exactly (or very close) to the sample so screenshots match.

**Expected result:** Invalid choices print a friendly message and return to the menu. Choice `8` exits.

**If it fails:** Arrow syntax errors → language level / JDK must be 21. Logic bloating `Main` → move code into `BankService`.

---

### Step 13 — Apply SOLID (design checklist)

**Why:** Mentors mark design thinking, not only “it runs.”

**Builds on Exercises 6–7:** Reuse your SRP / OCP–DIP spot-check notes against this packaged design (FrozenAccount demo not required in Lab core).

**Do this:** Self-review:

| Principle | Lab 3 evidence |
| --------- | -------------- |
| SRP | Models vs `BankService` vs thin `Main` |
| OCP | New account type via subclass, not editing every switch in models |
| LSP | Savings/Current usable wherever `Account` is expected |
| ISP | Small `Printable` with one method |
| DIP | Menu depends on `BankService` API, not raw arrays |

**Expected result:** You can explain each row aloud in under a minute.

**If it fails:** Giant `Main` with arrays → refactor toward service + models.

---

### Step 14 — Draw a UML class diagram

**Why:** Diagrams communicate inheritance and “uses” relationships for code reviews.

**Builds on Exercise 8:** Start from your mini UML of six types; grow it to include `BankService` and `Main`.

**Do this:** Sketch (paper, whiteboard, or Mermaid) showing:

* `Printable` ← `Customer`, `SavingsAccount`, `CurrentAccount`
* `Account` ← `SavingsAccount`, `CurrentAccount`
* `Account` → `Customer`
* `BankService` uses arrays of those types; `Main` uses `BankService`

**Expected result:** Diagram matches your actual files (not a fantasy architecture).

**If it fails:** Missing abstract marker or interface notation → update before submit.

---

### Step 15 — Compile and run

**Why:** Terminal compile/run remains the course truth; IDE Run is optional confirmation.

**Builds on Lab 2 + flat exercise `javac`:** Same `-d out` / `-cp out` story as Lab 2; do not compile exercise files into this project.

**Do this:** From `Lab3-BankingSystem`:

**Windows PowerShell** (name each source file — do not rely on `*.java` globs):

```powershell
Remove-Item -Recurse -Force out -ErrorAction SilentlyContinue
javac -d out `
  src\com\academy\bank\Printable.java `
  src\com\academy\bank\Customer.java `
  src\com\academy\bank\Account.java `
  src\com\academy\bank\SavingsAccount.java `
  src\com\academy\bank\CurrentAccount.java `
  src\com\academy\bank\Transaction.java `
  src\com\academy\bank\BankService.java `
  src\com\academy\bank\Main.java
java -cp out com.academy.bank.Main
```

**macOS / Linux:**

```bash
rm -rf out
javac -d out src/com/academy/bank/*.java
java -cp out com.academy.bank.Main
```

**IntelliJ:** Run `Main` after SDK 21 + Sources Root—then still run the terminal commands once.

**Expected result:** Menu:

```text
================================
Bank Management System
================================
1 Create Customer
2 Create Savings Account
3 Create Current Account
4 Deposit
5 Withdraw
6 Display Accounts
7 Display Customers
8 Exit
Choice :
```

**If it fails:**

| Symptom | Fix |
| ------- | --- |
| file not found / empty glob | On Windows PowerShell, name each `.java` file (see [LAB-3-WINDOWS.md](LAB-3-WINDOWS.md)); `cd` to project root containing `src` |
| cannot find symbol across classes | compile all eight sources together, not one file alone |
| main class not found | `java -cp out com.academy.bank.Main` |
| IntelliJ red packages | Mark `src` as Sources Root |

---

### Step 16 — Walk the sample session

**Why:** Matching the reference transcript proves prompts and polymorphic display.

**Do this:** Run and enter:

1. Choice `1` → `C101`, `John Smith`, `john@gmail.com`, `1234567890`
2. Choice `2` → customer `C101`, balance `10000`, interest `5`
3. Choice `4` → account `10001`, deposit `2000`
4. Choice `5` → withdraw `3000`
5. Choice `6` → view savings display (interest on new balance)
6. Choice `8` → exit

**Expected result:** Align with the reference sample:

```text
================================
Bank Management System
================================
1 Create Customer
...
Choice : 1
Customer ID : C101
Name : John Smith
Email : john@gmail.com
Phone : 1234567890
Customer Created Successfully.
----------------------------------
Choice : 2
Customer ID : C101
Initial Balance : 10000
Interest Rate (%) : 5
Savings Account Created.
Account Number : 10001
Balance : 10000
Interest Rate : 5%
----------------------------------
Choice : 4
Account Number : 10001
Deposit Amount : 2000
Balance Updated : 12000
----------------------------------
Choice : 5
Account Number : 10001
Withdraw : 3000
Balance Updated : 9000
----------------------------------
Choice : 6
Savings Account
Account Number : 10001
Customer : John Smith
Balance : 9000
Interest Rate : 5%
Interest : 450
----------------------------------
Choice : 8
Thank You
```

Also create a Current account in a second run to show fee behavior on withdraw.

**If it fails:** Compare prompt labels and order to this sample. Interest `450` assumes `5%` of `9000`.

---

## Implementation Checkpoints

| Checkpoint | You have… |
| ---------- | --------- |
| A — Model | Customer, abstract Account, Savings, Current, Printable, Transaction |
| B — Service + menu | `BankService` + `Main` compile |
| C — Operations | Create, deposit, withdraw, polymorphic display |
| D — Design | UML + SOLID checklist done |

---

## Reference Commands

```bash
# From Lab3-BankingSystem/
javac -d out src/com/academy/bank/*.java
java -cp out com.academy.bank.Main
```

### Polymorphism reminder

```java
Account a = new SavingsAccount(...); // OK
a.displayAccount();                  // runs SavingsAccount version at runtime
```

---

## Failure Experiments (optional)

1. Withdraw more than balance (+ fee for Current) → expect insufficient message.
2. Try `new Account(...)` → must fail to compile.
3. Cast every `Account` to `SavingsAccount` blindly → crash on Current; prefer overrides.
4. Loop to `accounts.length` → NullPointerException; use `accountCount`.
5. Compile a single file alone when others are needed → missing symbols; compile the package wildcard.

---

## Troubleshooting

### Common errors and fixes

| Problem | Likely cause | Typical message | Fix |
| ------- | ------------ | --------------- | --- |
| Abstract instantiation | `new Account(...)` | `Account is abstract; cannot be instantiated` | Construct Savings/Current only |
| Fee ignored | Charges not applied | Balance wrong after withdraw | Override/use `calculateCharges` on Current |
| Wrong display text | Missing override | Generic Account text only | `@Override displayAccount` in subclasses |
| Scanner skips | Mixed nextInt/nextLine | Empty prompts | All `nextLine` + parse |
| Main class missing | Bad `-cp` | `Could not find or load main class` | `java -cp out com.academy.bank.Main` |
| IntelliJ run fails | SDK / Sources Root | Run config errors | SDK 21; mark `src` as Sources Root |
| NPE in loops | Loop to array capacity | NullPointerException | Use `accountCount` / `customerCount` |
| Missing symbols | Compiled one file alone | `cannot find symbol` | Compile all eight sources together |

## Cleanup

Delete `out/` anytime; keep sources under `examples/Lab3-BankingSystem/` for evidence.

**Windows:** `Remove-Item -Recurse -Force out`  
**macOS / Linux:** `rm -rf out`


## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Why should `Account` be abstract rather than a concrete empty type?
2. Where does dynamic dispatch show up when you call `displayAccount()` on `Account[]`?
3. How does `Printable` differ from extending a base class?

---


