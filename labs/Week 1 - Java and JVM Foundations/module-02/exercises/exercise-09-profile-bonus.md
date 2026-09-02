# Exercise 9 — Personal Profile (bonus)

**Module 2** · Pre-lab practice · Checkpoint F · core 1–7 then lab
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Formatted Output: Building a Console Table](../../../lab_diagrams/mod02-ex09-profile-bonus.png)

> **Optional:** practice aligned columns — same idea as Lab 2’s student list `printf` table.

## Activity card

| | |
| --- | --- |
| **Objective** | Print an aligned two-column printf table |
| **Skills practiced** | printf widths, table layout |
| **Expected outcome** | Aligned Field | Value table |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-02-exercises/PersonalProfile.java` |
| **Checkpoint** | F (bonus) |

## What you will learn

- Width/alignment in printf
- Same idea as Lab 2 student table
- Bonus only — after 1–7 Pass

**Enterprise context:** Ops consoles show columnar reports the same way.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Name: Aman
Age: 21
City: Toronto
Hobby: Coding

Field        | Value               
-------------|---------------
Name         | Aman                
Age          | 21                  
City         | Toronto             
Hobby        | Coding
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/PersonalProfile.java`](starter/PersonalProfile.java). Or paste:


Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        // TODO: read name
        String name = _____;

        System.out.print("Age: ");
        // TODO: read age as String (simple table demo — no parse required)
        String age = _____;

        System.out.print("City: ");
        // TODO: read city
        String city = _____;

        System.out.print("Hobby: ");
        // TODO: read hobby
        String hobby = _____;

        System.out.println();
        // TODO: print a two-column table with printf width specifiers
        //   header: Field | Value  using %-12s and %-20s
        //   separator line
        //   four rows: Name, Age, City, Hobby
        // System.out.printf("%-12s | %-20s%n", "Field", "Value");
        // ...

        scanner.close();
    }
}
```

| Format piece | Easy meaning |
| ------------ | ------------ |
| `%-12s` | String, **left**-aligned, width 12 |
| `%20s` | String, **right**-aligned, width 20 (optional style) |
| `\|` | Visual column separator (just a character you print) |

## Steps

### Step 1 — Create `PersonalProfile.java`

**Why:** Lab 2 display menu uses the same column-alignment trick for student rows.

1. **New → File** → `PersonalProfile.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

**Verified (Windows)** — sample:

```text
Name: Aman
Age: 21
City: Toronto
Hobby: Coding

Field        | Value               
-------------|---------------
Name         | Aman                
Age          | 21                  
City         | Toronto             
Hobby        | Coding              
```

## Expected result

A readable two-column profile table with aligned fields.

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Columns look ragged | Use the same width for every row (`%-12s`, `%-20s`) |
| Want numeric age | You may parse with `Integer.parseInt` — not required for this bonus |
| `illegal start of expression` near `_____` | Replace every blank with real Java |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Table prints with four fields aligned | Pass / Fail |
| 2 | You can explain what `%-12s` does in one sentence | Pass / Fail |
