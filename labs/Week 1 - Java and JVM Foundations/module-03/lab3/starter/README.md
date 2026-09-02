# Lab 3 starter — 45-minute timed path

Fill every `// TODO`. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete Account hierarchy + BankService TODOs for a working banking menu |
| **Skills practiced** | Abstract Account, subclass overrides, service orchestration |
| **Expected outcome** | Smoke-test path succeeds |
| **Estimated time** | ~45 minutes |
| **Files** | Eight types under `src/com/academy/bank/` |

**Boilerplate reduced:** `Account` / `Customer` getters-setters and shells for `Main`, `Printable`, `Transaction` are provided — focus on validation, subclass behavior, and `BankService` TODOs.

## Target copy path

`~/java-bootcamp/examples/Lab3-BankingSystem/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-03\lab3\starter\Lab3-BankingSystem"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab3-BankingSystem"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-03/lab3/starter/Lab3-BankingSystem"
DST="$HOME/java-bootcamp/examples/Lab3-BankingSystem"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## Timed path (starter) — skip create Steps

Package layout and all eight type shells already exist. **Skip GUIDE create Steps.** Fill TODOs only. Implement `calculateInterest` / `calculateCharges` **before** Display Accounts. Bonus menus **9–13** are optional.

## 45-minute checklist (ordered TODOs)

1. Implement `Account.deposit` and `Account.withdraw`.
2. Implement `SavingsAccount.calculateInterest` and `CurrentAccount.calculateCharges` (needed before Display Accounts).
3. Implement `BankService.createCustomer`, `createSavingsAccount`, `createCurrentAccount`.
4. Implement `deposit`, `withdraw`, `displayAccounts`.
5. Run smoke test (core menus 1–8; bonus 9–13 optional). Commit your work to your GitHub repo (no screenshots).

## Smoke test

```powershell
javac -d out `
  src\com\academy\bank\Printable.java `
  src\com\academy\bank\Customer.java `
  src\com\academy\bank\Transaction.java `
  src\com\academy\bank\Account.java `
  src\com\academy\bank\SavingsAccount.java `
  src\com\academy\bank\CurrentAccount.java `
  src\com\academy\bank\BankService.java `
  src\com\academy\bank\Main.java
java -cp out com.academy.bank.Main
```

Interactive path: create customer `C101` → savings account balance `10000` rate `5` → deposit `2000` → withdraw `3000` → display accounts → exit.

**Expected output snippet:**

```text
Customer Created Successfully.
Savings Account Created.
...
Balance : 9000
Interest : 450
Thank You
```

## Validation checkpoint

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Create / deposit / withdraw / display work | |

## Troubleshooting (quick)

| Error | Fix |
| ----- | --- |
| `Account is abstract` | Do not `new Account(...)` |
| `UnsupportedOperationException: TODO` | Fill remaining TODOs |
| Main not found | `java -cp out com.academy.bank.Main` |

> Full GUIDE steps (bonus transfer/history/reports) remain for homework / extended work.
