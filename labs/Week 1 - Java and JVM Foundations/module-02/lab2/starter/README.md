# Lab 2 starter — 45-minute timed path

Fill every `// TODO`. Complete every TODO yourself. `Student.java` is mostly complete (**boilerplate getters/setters provided** — focus on manager logic).

## Activity card

| | |
| --- | --- |
| **Objective** | Complete StudentManager TODOs so the menu app runs end-to-end |
| **Skills practiced** | Array storage, menu switch, search/average, printf-style display |
| **Expected outcome** | Smoke-test path succeeds |
| **Estimated time** | ~45 minutes |
| **Files** | `Student.java` (mostly done), `StudentManager.java`, `Main.java` |

## Target copy path

`~/java-bootcamp/examples/Lab2-JavaSyntax/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-02\lab2\starter\Lab2-JavaSyntax"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab2-JavaSyntax"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-02/lab2/starter/Lab2-JavaSyntax"
DST="$HOME/java-bootcamp/examples/Lab2-JavaSyntax"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## Timed path (starter) — skip create Steps 1–5

Package layout, `Student`, `StudentManager` shell, and `Main` menu already exist. **Skip GUIDE create Steps 1–5.** Fill TODOs in `StudentManager` only (`add` / `display` / `search` / `average`). Use existing `printStudentTable` / `findStudentIndex` helpers. Menu shows **1–10** (bonus 6–10 optional) — timed path needs core **1–5** only.

## 45-minute checklist (ordered TODOs)

1. Skim `Student.java` (fields, getters, `display`, pass/fail) — do not rewrite getters.
2. Implement `StudentManager.addStudent`.
3. Implement `displayStudents`, `searchStudent`, `calculateAverage` (call `printStudentTable` where noted).
4. Confirm `Main` menu cases 1–5 work (bonus 6–10 optional).
5. Compile, run smoke test, commit your work to your GitHub repo (no screenshots).

## Smoke test

```powershell
javac -d out src\com\academy\student\Student.java src\com\academy\student\StudentManager.java src\com\academy\student\Main.java
java -cp out com.academy.student.Main
```

Interactive path: menu → add student `101` / `John` / `Java` / `91` → display → search `101` → average → exit `5`.

**Expected output snippet:**

```text
Student Added Successfully.
...
Average Marks : 91.00
Thank You
```

## Validation checkpoint

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Add / display / search / average / exit work | |

## Troubleshooting (quick)

| Error | Fix |
| ----- | --- |
| `UnsupportedOperationException: TODO` | Fill remaining TODOs in `StudentManager` |
| Skipped prompts | Prefer `nextLine` + parse |
| Main not found | `java -cp out com.academy.student.Main` |

> Full GUIDE steps (bonus menus, polish) remain for homework / extended work.
