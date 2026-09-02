# Lab 6 starter — 45-minute timed path

`Employee` and `EmployeeData` are given. Fill **CORE** stream pipelines for menus **1–9**. Complete every TODO yourself.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete CORE filter/map/group/reduce TODOs + dashboard |
| **Skills practiced** | Stream pipelines, Collectors, Optional, menu wiring |
| **Expected outcome** | Menu 1 → 8 dashboard Average Salary **100680** → 9 Thank You |
| **Estimated time** | ~45 minutes |
| **Files** | Packaged suite under `Lab6-EmployeeAnalytics/src/com/academy/analytics/` |

**Boilerplate reduced:** Domain model + seed data + menu `Main` are given — focus on CORE service/report stream TODOs. Menus **10–21** are Bonus stubs (print message; do not crash).

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-6-GUIDE.md`](../LAB-6-GUIDE.md)

## Target copy path

`~/java-bootcamp/examples/Lab6-EmployeeAnalytics/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-06\lab6\starter\Lab6-EmployeeAnalytics"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab6-EmployeeAnalytics"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-06/lab6/starter/Lab6-EmployeeAnalytics"
DST="$HOME/java-bootcamp/examples/Lab6-EmployeeAnalytics"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## CORE methods for menus 1–9 (implement these)

| Menu | Feature | Methods to implement |
| ---- | ------- | -------------------- |
| 1 | Display Employees | `EmployeeService.displayAllEmployees` |
| 2 | Employees By Department | `displayGroupedEmployees` (via `ReportService.displayEmployeesByDepartment`) |
| 3 | Salary Report | `displayReductions` + `displaySummaryStatistics` + `displayPartitionedEmployees` |
| 4 | Top Performers | `getTopPerformers` + `ReportService.displayTopPerformers` |
| 5 | Highest Salary | `displayHighestPaidEmployeeOptional` |
| 6 | Department Statistics | `getDepartmentStatistics` + `ReportService.displayDepartmentStatistics` |
| 7 | Active Employees | `displayActiveEmployees` |
| 8 | Dashboard | `ReportService.displayDashboard` + deps: `findTopPerformer`, `findDepartmentWithHighestAverageSalary`, `getTopSalaries` |
| 9 | Exit | (given — no TODO) |

## 45-minute checklist (ordered)

1. **Classroom priority:** implement menu **1** (`displayAllEmployees`) + dashboard deps + `displayDashboard` (menu **8**).
2. Smoke `1` → `8` → `9` and confirm **Average Salary : 100680**.
3. Implement remaining CORE menus **2–7** (homework OK if timed class ends).
4. Do **not** spend timed time on menus 10–21 (Bonus stubs already print a message).
5. Commit your work to your GitHub repo (no screenshots).

## Smoke test

```powershell
javac -d out `
  src\com\academy\analytics\Employee.java `
  src\com\academy\analytics\EmployeeData.java `
  src\com\academy\analytics\EmployeeService.java `
  src\com\academy\analytics\ReportService.java `
  src\com\academy\analytics\Main.java
java -cp out com.academy.analytics.Main
```

Interactive path (timed classroom): `1` (list) → `8` (dashboard) → `9` (exit).

Exercise CORE menus 2–7 when ready (same run session or homework).

**Expected output snippet:**

```text
Total Employees : 25
...
=============================
Employee Analytics Dashboard
=============================
Employees : 25
Average Salary : 100680
Highest Salary : ...
Lowest Salary : ...
Departments : ...
Top Performer : ...
Highest Paid Department : ...
Top 5 Highest Salaries
...
Active Employees : ...
Inactive Employees : ...
Thank You
```

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Menu **1** + dashboard (**8**) produce expected stats (**Average Salary : 100680**) | |

## CORE homework Pass (menus 2–7)

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Menus 2–7 run without `UnsupportedOperationException` | |

> Full GUIDE steps (bonus menus 10–21) remain for homework / extended work.
