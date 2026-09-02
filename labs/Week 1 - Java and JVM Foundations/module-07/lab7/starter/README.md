# Lab 7 starter — 45-minute timed path

Exception classes, `Account`, `Transaction`, `LoggerUtil`, and `Main` are mostly given. Fill `ATMService.login` / `deposit` / `withdraw`. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete ATM login + deposit/withdraw failure paths with domain exceptions |
| **Skills practiced** | Boundary catch, insufficient funds, invalid PIN/account, logging |
| **Expected outcome** | Smoke: login → failed withdraw → deposit → balance `12000` → mini statement → Thank You |
| **Estimated time** | ~45 minutes |
| **Files** | Packaged suite under `Lab7-ATMSystem/src/com/academy/atm/` |

**Boilerplate reduced:** Exception types, account model, logger, and menu are given — do **not** recreate exception classes. Focus on `ATMService` login/deposit/withdraw TODOs. Transfer and report menus are Bonus stubs.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-7-GUIDE.md`](../LAB-7-GUIDE.md)

**Security:** Do not log the PIN. Run `java` from the **project root** so `transactions.txt` / `logs/` resolve.

## Target copy path

`~/java-bootcamp/examples/Lab7-ATMSystem/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-07\lab7\starter\Lab7-ATMSystem"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab7-ATMSystem"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
New-Item -ItemType Directory -Force -Path "$dst\logs" | Out-Null
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-07/lab7/starter/Lab7-ATMSystem"
DST="$HOME/java-bootcamp/examples/Lab7-ATMSystem"
mkdir -p "$DST" "$DST/logs"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## 45-minute checklist (ordered TODOs)

1. Skim given exception types + `Account.deposit` / `withdraw` (do not recreate).
2. Implement `ATMService.login` (success + invalid PIN / missing account).
3. Implement `deposit` via `executeTransaction`.
4. Implement `withdraw` via `executeTransaction` (insufficient funds path).
5. Smoke test from **project root** including mini statement (menu 6). Commit your work to your GitHub repo (no screenshots).

## Smoke test

```powershell
javac -d out `
  src\com\academy\atm\AccountNotFoundException.java `
  src\com\academy\atm\InvalidPinException.java `
  src\com\academy\atm\InvalidAmountException.java `
  src\com\academy\atm\InsufficientFundsException.java `
  src\com\academy\atm\Account.java `
  src\com\academy\atm\Transaction.java `
  src\com\academy\atm\LoggerUtil.java `
  src\com\academy\atm\ATMService.java `
  src\com\academy\atm\Main.java
java -cp out com.academy.atm.Main
```

Interactive path: login `1001` / `1234` → withdraw `20000` → deposit `1000` → balance → **mini statement** → exit.

**Expected output snippet:**

```text
Login Successful
...
Insufficient Balance
Transaction Cancelled
...
Deposit Successful
Current Balance : 12000
...
Session Transactions:
...
Historical Transactions (from file):
...
Thank You
```

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles; run from Lab7 root | |
| 2 | Login + withdraw fail + deposit success + balance `12000` | |
| 3 | Mini statement shows session and/or file lines | |

> Full GUIDE steps (transfer, reports, unchecked demos) remain for homework / extended work. Bonus menus print a stub — they should not crash.
