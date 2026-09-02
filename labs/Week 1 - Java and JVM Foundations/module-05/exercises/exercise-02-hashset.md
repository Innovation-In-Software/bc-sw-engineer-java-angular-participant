# Exercise 2 — Working with `HashSet`

**Module 5** · Pre-lab practice · Checkpoint B · all 7 then lab
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Collections: HashSet and TreeSet](../../../lab_diagrams/mod05-ex02-hashset.png)

## Activity card

| | |
| --- | --- |
| **Objective** | Enforce uniqueness with HashSet; contrast sorted TreeSet view |
| **Skills practiced** | Set, HashSet, TreeSet uniqueness/order |
| **Expected outcome** | Duplicates rejected; notes on order differences |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-05-exercises/SetDemo.java` |
| **Checkpoint** | B (after slides 137–139) |

## What you will learn

- Set rejects duplicates
- HashSet order is unspecified
- TreeSet sorts elements

**Enterprise context:** Registered ISBN/book IDs must be unique — Set fits.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Added Java first time: true
Added Java second time: false
Unique count: 3
Contains Testing: true
Sorted view: [Databases, Java, Testing]
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/`](starter/README.md). Or paste:


Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // TODO: create HashSet<String> categories
        Set<String> categories = _____;

        // TODO: add "Java" and print whether the set changed (add returns boolean)
        System.out.println(
                "Added Java first time: "
                + _____);

        // TODO: add "Testing" and "Databases"
        _____
        _____

        // TODO: try adding "Java" again — print whether the set changed
        System.out.println(
                "Added Java second time: "
                + _____);

        System.out.println(
                "Unique count: " + categories.size());
        System.out.println(
                "Contains Testing: "
                + _____);

        // TODO: print sorted view using new TreeSet<>(categories)
        System.out.println(
                "Sorted view: "
                + _____);
    }
}
```

## `HashSet` vs `TreeSet`

| Property | `HashSet` | `TreeSet` |
| -------- | --------- | --------- |
| Duplicate values | Rejected | Rejected |
| Iteration order | Unspecified | Natural sorted order |
| Typical membership lookup | Fast average-case | Tree-based, typically `O(log n)` |
| Use here | Unique category registry | Sorted category report |

`Set.add(value)` returns:

- `true` when the set changed;
- `false` when an equal value was already present.

## Steps

### Step 1 — Create `SetDemo.java`

**Why:** Lab 5 tracks unique book IDs and categories with `Set`.

1. **New → File** → `SetDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac SetDemo.java
java SetDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac SetDemo.java
java SetDemo
```

**Verified (Windows):**

```text
Added Java first time: true
Added Java second time: false
Unique count: 3
Contains Testing: true
Sorted view: [Databases, Java, Testing]
```

### Step 3 — Explain what is deterministic

These are deterministic:

- second `"Java"` add returns `false`;
- size is `3`;
- sorted view is alphabetical.

Raw `HashSet` iteration order is **not** a contract and may vary by JDK or run.

### Step 4 — Connect to custom objects

Add to `notes.md`:

> Sets determine duplicates using `equals` and `hashCode`. Strings already implement them. Lab 5 must define identity carefully when custom objects are stored in sets.

## Expected result

The set contains three unique categories; the duplicate add returns `false`; `TreeSet` prints them sorted.


## Predict the Output / Behavior

add('X'); add('X'); size is?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| Expected insertion order from `HashSet` | Use `LinkedHashSet` only when insertion order is required |
| Expected sorted `HashSet` | Create a `TreeSet` view |
| Duplicate count is `4` | Ensure both values are exactly `"Java"` |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | Duplicate add returns `false`; size remains `3` | Pass / Fail |
| 2 | Sorted view is `[Databases, Java, Testing]` | Pass / Fail |
| 3 | You do not rely on `HashSet` iteration order | Pass / Fail |
