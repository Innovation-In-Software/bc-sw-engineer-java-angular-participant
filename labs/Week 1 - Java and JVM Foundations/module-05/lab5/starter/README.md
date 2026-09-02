# Lab 5 starter — 45-minute timed path

Domain classes (`Book`, `Member`, `BorrowRecord`, `BookComparator`) and `Main` are mostly given. Fill `borrowBook` / `returnBook` / report TODOs. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete borrow/return Map invariants + report TODOs |
| **Skills practiced** | List catalog + Map loans + summary / popular category |
| **Expected outcome** | Smoke path prints Borrowed / Popular Category / Thank You |
| **Estimated time** | ~45 minutes |
| **Files** | Packaged suite under `Lab5-LibraryManagement/src/com/academy/library/` |

**Boilerplate reduced:** Domain models, menu `Main`, and add/register helpers are given — focus on loan Map logic and reports. Skip recreating those files.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-5-GUIDE.md`](../LAB-5-GUIDE.md)

## Target copy path

`~/java-bootcamp/examples/Lab5-LibraryManagement/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-05\lab5\starter\Lab5-LibraryManagement"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab5-LibraryManagement"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-05/lab5/starter/Lab5-LibraryManagement"
DST="$HOME/java-bootcamp/examples/Lab5-LibraryManagement"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## 45-minute checklist (ordered TODOs)

1. Skim domain models + given `addBook` / `registerMember` (do not recreate).
2. Implement `LibraryService.borrowBook` (**required**).
3. Implement `LibraryService.returnBook` (**required**).
4. Implement `ReportService.displaySummaryReport` + `findMostPopularCategory` (**required**).
5. **Bonus / optional:** `exportReportToFile`, performance comparison (menus 14 / 17) — starter prints a Bonus stub so the menu does not crash.
6. Smoke test. Commit your work to your GitHub repo (no screenshots).

## Smoke test

```powershell
javac -d out `
  src\com\academy\library\Book.java `
  src\com\academy\library\Member.java `
  src\com\academy\library\BorrowRecord.java `
  src\com\academy\library\BookComparator.java `
  src\com\academy\library\ReportService.java `
  src\com\academy\library\LibraryService.java `
  src\com\academy\library\Main.java
java -cp out com.academy.library.Main
```

Interactive path (prompts in order):

1. Menu `1` → Book ID `101`, Title `Java Basics`, Author `Aman`, Category `Programming`, **Price `55`**
2. Menu `2` → Member ID `1`, Name `Riya`, Email `riya@test.com`, Phone `9999999999`
3. Menu `6` → Book ID `101`, Member ID `1`
4. Menu `10` → Reports
5. Menu `7` → Book ID `101` (optional return)
6. Menu `11` → Exit

**Expected output snippet:**

```text
Book Added Successfully
Member Registered Successfully
Book Borrowed Successfully
Reports
Books : 1
Borrowed : 1
Available : 0
Members : 1
Most Popular Category : Programming
Thank You
```

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Borrow / return / summary reports work | |

> Full GUIDE steps (export, performance, history) remain for homework / extended work. Bonus menu items should print a stub message, not crash.
