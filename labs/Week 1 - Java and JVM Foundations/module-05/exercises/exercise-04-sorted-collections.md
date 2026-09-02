# Exercise 4 — Sorted Collections: `TreeMap`

**Module 5** · Pre-lab practice · Checkpoint C · all 7 then lab
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Collections: Sorting Map Keys with TreeMap](../../../lab_diagrams/mod05-ex04-sorted-collections.png)

> **Builds on Exercise 2:** You already used `new TreeSet<>(...)` to get a sorted view of a `Set`. `TreeMap` applies the same idea to key-value pairs.

## Activity card

| | |
| --- | --- |
| **Objective** | Use TreeMap sorted keys and firstKey/lastKey |
| **Skills practiced** | TreeMap, sorted key navigation |
| **Expected outcome** | Report keys print in sorted order |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-05-exercises/SortedMapDemo.java` |
| **Checkpoint** | C |

## What you will learn

- TreeMap sorts by key
- Useful for category reports
- Cost differs from HashMap

**Enterprise context:** Category → count reports often want alphabetical keys.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
HashMap order: [Dune, The Hobbit, Annihilation]
TreeMap order: [Annihilation, Dune, The Hobbit]
First title: Annihilation
Last title: The Hobbit
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Optional: copy from [`starter/`](starter/README.md). Or paste:


Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // TODO: declare Map<String, Double> prices as new HashMap<>()
        Map<String, Double> prices = _____;

        // TODO: put three title → price mappings
        //   "The Hobbit" -> 12.99, "Dune" -> 15.50, "Annihilation" -> 9.99
        _____
        _____
        _____

        // TODO: print HashMap key order (unspecified — may vary between runs)
        System.out.println("HashMap order: " + prices.keySet());

        // TODO: create TreeMap<String, Double> sortedPrices from prices
        Map<String, Double> sortedPrices = _____;
        System.out.println("TreeMap order: " + sortedPrices.keySet());

        // TODO: declare TreeMap<String, Double> tree from prices
        //   (TreeMap type needed for firstKey / lastKey)
        TreeMap<String, Double> tree = _____;
        System.out.println("First title: " + tree.firstKey());
        System.out.println("Last title: " + tree.lastKey());
    }
}
```

## `HashMap` vs `TreeMap`

| Property | `HashMap` | `TreeMap` |
| -------- | --------- | --------- |
| Key order | Unspecified | Natural sorted order (or a `Comparator`) |
| Lookup cost | Fast average-case | Tree-based, typically `O(log n)` |
| Extra methods | None beyond `Map` | `firstKey()`, `lastKey()`, `headMap()`, `tailMap()` |
| Use here | General-purpose lookup | A price list you want printed in order |

## Steps

### Step 1 — Create `SortedMapDemo.java`

**Why:** Lab 5 reports need sorted keys for readable output.

1. **New → File** → `SortedMapDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

**Verified (Windows):**

```text
HashMap order: [Dune, The Hobbit, Annihilation]
TreeMap order: [Annihilation, Dune, The Hobbit]
First title: Annihilation
Last title: The Hobbit
```

(Your `HashMap order` line may print the three titles in a different sequence — that is expected and is exactly the point of Step 3.)

### Step 3 — Explain what is deterministic

Add to `notes.md`:

> `TreeMap` keys always iterate in sorted order — that part is guaranteed. `HashMap` key order is not a contract; it may differ between runs or JDK versions, so never depend on it for display order.

## Expected result

`TreeMap` prints titles alphabetically and reports the correct first/last title; `HashMap` order is not relied upon anywhere in your notes.


## Predict the Output / Behavior

firstKey after putting B, A, C?

## Troubleshooting

### If it fails

| Problem | Fix |
| ------- | --- |
| `cannot find symbol firstKey` | Declare the variable as `TreeMap<String, Double>`, not the `Map` interface, to use `TreeMap`-only methods |
| Both maps print the same order | Not a bug — with only 3 short keys this can coincidentally happen; trust the guarantee, not one run's output |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

_Check **Pass** or **Fail** yourself. Do not write these marks anywhere — nothing is submitted or graded. Commit your work to your GitHub repo._

| # | Confirm | Self-check |
| - | ------- | ---------- |
| 1 | `TreeMap` prints titles in alphabetical order | Pass / Fail |
| 2 | `firstKey()` / `lastKey()` print the correct titles | Pass / Fail |
| 3 | You can explain why `HashMap` order should never be relied upon | Pass / Fail |
